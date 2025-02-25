package io.github.jackbeback.klib.UI.button

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.ButtonDefaults.buttonElevation
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material3.ButtonDefaults.elevatedButtonElevation
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Contains the default values used by [FilledButtonDefaults].
 */
object FilledButtonDefaults {

    @Composable
    fun getFilledButtonProperties(
        enabled: Boolean = true,
        containerColor: Color = MaterialTheme.colorScheme.primary,
        contentColor: Color = MaterialTheme.colorScheme.onPrimary,
        disabledContainerColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f),
        disabledContentColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
        elevation: ButtonElevation? = elevatedButtonElevation(),
        contentPadding: PaddingValues = PaddingValues(horizontal = 16.dp),
        text: String,
        textStyle: TextStyle = MaterialTheme.typography.bodyLarge,
        textHorizontalPadding: Dp = 8.dp,
        leftIconPainter: Painter? = null,
        rightIconPainter: Painter? = null,
        iconSize: Dp = 24.dp,
        onClick: () -> Unit
    ) = FilledButtonProperties(
        enabled = enabled,
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor,
        elevation = elevation,
        contentPadding = contentPadding,
        text = text,
        textStyle = textStyle,
        textHorizontalPadding = textHorizontalPadding,
        leftIconPainter = leftIconPainter,
        rightIconPainter = rightIconPainter,
        iconSize = iconSize,
        onClick = onClick
    )
}

/**
 * A reusable filled button for high-emphasis actions.
 *
 * @param modifier Modifier for custom styling.
 * @param enabled Whether the button is enabled or disabled.
 * @param containerColor Background color for the button when enabled.
 * @param contentColor Color for the content (text/icons) when enabled.
 * @param disabledContainerColor Background color for the button when disabled.
 * @param disabledContentColor Color for the content (text/icons) when disabled.
 * @param elevation Elevation state of the button.
 * @param contentPadding Padding for the content inside the button.
 * @param text Button's display text.
 * @param textStyle Typography style for button text.
 * @param textHorizontalPadding Horizontal padding around the text.
 * @param leftIconPainter Left-side icon for the button.
 * @param rightIconPainter Right-side icon for the button.
 * @param iconSize Size of the icons used in the button.
 * @param onClick Action to perform when the button is clicked.
 */
@Composable
fun FilledButton(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    containerColor: Color = MaterialTheme.colorScheme.primary,
    contentColor: Color = MaterialTheme.colorScheme.onPrimary,
    disabledContainerColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f),
    disabledContentColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
    elevation: ButtonElevation? = buttonElevation(),
    contentPadding: PaddingValues = PaddingValues(horizontal = 16.dp),
    text: String,
    textStyle: TextStyle = MaterialTheme.typography.bodyLarge,
    textHorizontalPadding: Dp = 8.dp,
    leftIcon: ImageVector? = null,
    rightIcon: ImageVector? = null,
    iconSize: Dp = 24.dp,
    onClick: () -> Unit
) {
    ElevatedButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = androidx.compose.material3.ButtonDefaults.elevatedButtonColors().copy(
            containerColor = containerColor,
            contentColor = contentColor,
            disabledContainerColor = disabledContainerColor,
            disabledContentColor = disabledContentColor
        ),
        contentPadding = contentPadding,
        elevation = elevation
    ) {
        ButtonContent(
            modifier = Modifier
                .wrapContentSize(align = Alignment.Center)
                .align(Alignment.CenterVertically),
            enabled = enabled,
            contentColor = contentColor,
            disabledContentColor = disabledContentColor,
            text = text,
            textStyle = textStyle,
            textHorizontalPadding = textHorizontalPadding,
            leftIcon = leftIcon,
            rightIcon = rightIcon,
            iconSize = iconSize
        )
    }
}

/**
 * Represents the properties of the filled button defined for reuse.
 */
class FilledButtonProperties(
    val enabled: Boolean,
    val containerColor: Color,
    val contentColor: Color,
    val disabledContainerColor: Color,
    val disabledContentColor: Color,
    val elevation: ButtonElevation?,
    val contentPadding: PaddingValues,
    val text: String,
    val textStyle: TextStyle,
    val textHorizontalPadding: Dp,
    val leftIconPainter: Painter? = null,
    val rightIconPainter: Painter? = null,
    val iconSize: Dp,
    val onClick: () -> Unit
)

/**
 * A reusable composable for loading button content including icons and text.
 */
@Composable
private fun ButtonContent(
    modifier: Modifier,
    enabled: Boolean,
    contentColor: Color,
    disabledContentColor: Color,
    text: String,
    textStyle: TextStyle,
    textHorizontalPadding: Dp,
    leftIcon: ImageVector?,
    rightIcon: ImageVector?,
    iconSize: Dp
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        leftIcon?.let {
            Icon(
                it,
                contentDescription = null,
                modifier = Modifier.size(iconSize),
                tint = if (enabled) contentColor else disabledContentColor
            )
        }

        Spacer(modifier = Modifier.width(textHorizontalPadding))

        Text(
            text = text,
            style = textStyle,
            color = if (enabled) contentColor else disabledContentColor
        )

        rightIcon?.let {
            Spacer(modifier = Modifier.width(textHorizontalPadding))
            Icon(
                it,
                contentDescription = null,
                modifier = Modifier.size(iconSize),
                tint = if (enabled) contentColor else disabledContentColor
            )
        }
    }
}

/**
 * A sample preview showcasing the variation of the filled button.
 */
@Composable
fun FilledButtonSample() {
    MaterialTheme {
        FilledButton(
            text = "Filled Button",
            leftIcon = Icons.Default.Add, // Replace with your icon
            rightIcon = Icons.Default.Done, // Replace with your icon
            onClick = {}
        )
    }
}