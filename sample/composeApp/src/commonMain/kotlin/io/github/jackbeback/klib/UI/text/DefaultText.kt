package io.github.jackbeback.klib.UI.text

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.jackbeback.klib.Utility.log


object ColorSchemeDefault {
    const val DISABLED_COLOR_OPACITY: Float = 0.38f
}

@Composable
fun Color.addOpacityIf(predicate: () -> Boolean): Color {
    return if (predicate()) {
        this.addOpacity()
    } else {
        this
    }
}

@Composable
fun Color.addOpacity(opacity: Float = ColorSchemeDefault.DISABLED_COLOR_OPACITY) = this.copy(alpha = opacity)

@Composable
fun Dp.dpToPx() = with(LocalDensity.current) { this@dpToPx.toPx() }

@Composable
fun TextStyle.lineHeightToDp() = with(LocalDensity.current) { this@lineHeightToDp.lineHeight.toDp() }

@Composable
fun TextStyle.fontSizeToDp() = with(LocalDensity.current) { this@fontSizeToDp.fontSize.toDp() }

/**
 * AppText displays text with an optional icon and clickable link support.
 *
 * @param text The text to be displayed.
 * @param modifier Modifier to be applied.
 * @param isEnabled When false, the text appears disabled.
 * @param overflow How to handle text overflow.
 * @param isSoftWrap Determines if the text should wrap.
 * @param maxLines Maximum number of text lines.
 * @param onTextLayout Callback when a new text layout is calculated.
 * @param textStyle Style for the text.
 * @param iconPainter Optional icon to display alongside text.
 * @param iconColor Color for the icon.
 * @param isLinkEnabled Enables clickable links in the text.
 * @param onClick Invoked when the text (or non-link area) is clicked.
 */
@Composable
fun DefaultText(
    text: String,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    overflow: TextOverflow = TextOverflow.Clip,
    isSoftWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: ((TextLayoutResult) -> Unit)? = null,
    textStyle: TextStyle = typography.bodyMedium,
    iconPainter: Painter? = null,
    iconColor: Color = colorScheme.onSurface,
    isLinkEnabled: Boolean = false,
    onClick: (() -> Unit)? = null
) {
    // Merge text style with disabled opacity if needed.
    val style = textStyle.merge(color = colorScheme.onSurface.addOpacityIf { !isEnabled })

    // Arrange text and optional icon using our custom layout.
    AppTextLayout(
        modifier = modifier,
        onClick = onClick,
        isEnabled = isEnabled,
        textContent = {
            if (isLinkEnabled) {
                AppClickableText(
                    text = AnnotatedString(text),
                    overflow = overflow,
                    isSoftWrap = isSoftWrap,
                    maxLines = maxLines,
                    onTextLayout = onTextLayout,
                    textStyle = style,
                    onClick = if (isEnabled) onClick else null
                )
            } else {
                BasicText(
                    text = text,
                    overflow = overflow,
                    softWrap = isSoftWrap,
                    maxLines = maxLines,
                    style = style,
                    onTextLayout = onTextLayout
                )
            }
        },
        iconContent = {
            if (iconPainter != null) {
                Box(
                    modifier = Modifier.height(textStyle.lineHeightToDp()),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        modifier = Modifier.size(textStyle.fontSizeToDp()),
                        painter = iconPainter,
                        contentDescription = null,
                        tint = iconColor.addOpacityIf { !isEnabled }
                    )
                }
            }
        }
    )
}

/**
 * A clickable text that handles tap gestures and URL link detection.
 */
@Composable
private fun AppClickableText(
    text: AnnotatedString,
    overflow: TextOverflow,
    isSoftWrap: Boolean,
    maxLines: Int,
    onTextLayout: ((TextLayoutResult) -> Unit)?,
    textStyle: TextStyle,
    onClick: (() -> Unit)?
) {
    val uriHandler = LocalUriHandler.current
    val layoutResult = remember { mutableStateOf<TextLayoutResult?>(null) }

    // Modifier to detect taps and handle URL clicks.
    val pressIndicateModifier = Modifier.pointerInput(onClick) {
        detectTapGestures { pos ->
            layoutResult.value?.let { layout ->
                val position = layout.getOffsetForPosition(pos)
                // Retrieve URL annotation at the tap position.
                val url = text
                    .getStringAnnotations("URL", position, position)
                    .firstOrNull()?.item

                if (url != null) {
                    val webUrl = if (!url.startsWith("http://") && !url.startsWith("https://"))
                        "https://$url"
                    else
                        url

                    try {
                        uriHandler.openUri(webUrl)
                    } catch (e: Exception) {
                        log.e(e.message.orEmpty())
                    }
                } else {
                    onClick?.invoke()
                }
            }
        }
    }

    BasicText(
        modifier = pressIndicateModifier,
        text = text,
        overflow = overflow,
        softWrap = isSoftWrap,
        maxLines = maxLines,
        style = textStyle,
        onTextLayout = {
            layoutResult.value = it
            onTextLayout?.invoke(it)
        }
    )
}

@Immutable
data class TextProperties(
    val text: String,
    val isEnabled: Boolean,
    val overflow: TextOverflow,
    val isSoftWrap: Boolean = true,
    val maxLines: Int,
    val onTextLayout: ((TextLayoutResult) -> Unit)? = null,
    val textStyle: TextStyle,
    val iconPainter: Painter? = null,
    val iconColor: Color,
    val onClick: (() -> Unit)? = null,
    val isLinkEnabled: Boolean = false
)

object TextDefaults {
    val TextAndIconGap = 7.dp

    @Composable
    fun getTextProperties(
        text: String,
        isEnabled: Boolean = true,
        overflow: TextOverflow = TextOverflow.Clip,
        maxLines: Int = Int.MAX_VALUE,
        textStyle: TextStyle = MaterialTheme.typography.bodyMedium
    ): TextProperties {
        val contentColor = if (textStyle.color == Color.Unspecified) {
            MaterialTheme.colorScheme.onSurface
        } else {
            textStyle.color
        }
        return TextProperties(
            text = text,
            isEnabled = isEnabled,
            overflow = overflow,
            maxLines = maxLines,
            textStyle = textStyle.merge(color = contentColor),
            iconColor = contentColor
        )
    }
}



/**
 * Layout composable that arranges text content and an optional icon in a row.
 */
@Composable
private fun AppTextLayout(
    modifier: Modifier,
    onClick: (() -> Unit)?,
    isEnabled: Boolean,
    textContent: @Composable () -> Unit,
    iconContent: @Composable () -> Unit
) {
    Row(
        modifier = if (onClick != null)
            modifier.clickable(onClick = onClick, enabled = isEnabled)
        else
            modifier,
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.spacedBy(TextDefaults.TextAndIconGap)
    ) {
        Box(
            modifier = Modifier
                .weight(1f, fill = false)
                .align(Alignment.CenterVertically)
        ) {
            textContent()
        }
        iconContent()
    }
}

@Composable
fun TextSample() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorScheme.background)
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        // Short text
        DefaultText(text = "Short text", textStyle = typography.titleLarge)

        // Long text
        DefaultText(text = "Long text ".repeat(40))

        // Text limited to 3 lines
        DefaultText(
            text = "Max 3 lines text. ".repeat(40),
            overflow = TextOverflow.Ellipsis,
            textStyle = typography.titleLarge,
            maxLines = 3
        )

        // Linked text with clickable URL
        DefaultText(
            text = "Linked Text: https://www.google.com",
            isLinkEnabled = true,
            onClick = { log.i("AppText Click - Linked Text") }
        )

        // Linked text without explicit https
        DefaultText(
            text = "Linked Text without https: www.google.com",
            isLinkEnabled = true,
            onClick = { log.i("AppText Click - Linked Text without https") }
        )

        // Disabled linked text
        DefaultText(
            text = "Disabled linked Text: www.google.com",
            isEnabled = false,
            isLinkEnabled = true,
            onClick = { log.i("AppText Click - Disabled linked Text") }
        )
    }
}
