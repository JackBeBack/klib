package io.github.jackbeback.klib.UI.button

import androidx.compose.ui.graphics.vector.ImageVector

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.clickable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Contains default values for generic Icon Buttons.
 */
object IconButtonDefaults {

    @Composable
    fun getIconButtonProperties(
        enabled: Boolean = true,
        icon: ImageVector,
        iconColor: Color = MaterialTheme.colorScheme.onSurfaceVariant,
        iconContainerColor: Color = Color.Transparent,
        disabledIconColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
        disabledIconContainerColor: Color = Color.Transparent,
        iconSize: Dp = 24.dp,
        isTextVisible: Boolean = true,
        text: String = "",
        textColor: Color = MaterialTheme.colorScheme.onBackground,
        disabledTextColor: Color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.38f),
        onClick: () -> Unit
    ) = IconButtonProperties(
        enabled = enabled,
        icon = icon,
        iconColor = iconColor,
        iconContainerColor = iconContainerColor,
        disabledIconColor = disabledIconColor,
        disabledIconContainerColor = disabledIconContainerColor,
        iconSize = iconSize,
        isTextVisible = isTextVisible,
        text = text,
        textColor = textColor,
        disabledTextColor = disabledTextColor,
        onClick = onClick
    )
}

/**
 * Represents the properties for Icon Buttons, allowing customization.
 */
class IconButtonProperties(
    val enabled: Boolean,
    val icon: ImageVector,
    val iconColor: Color,
    val iconContainerColor: Color,
    val disabledIconColor: Color,
    val disabledIconContainerColor: Color,
    val iconSize: Dp,
    val isTextVisible: Boolean,
    val text: String,
    val textColor: Color,
    val disabledTextColor: Color,
    val onClick: () -> Unit
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IconButtonProperties) return false

        if (enabled != other.enabled) return false
        if (icon != other.icon) return false
        if (iconColor != other.iconColor) return false
        if (iconContainerColor != other.iconContainerColor) return false
        if (disabledIconColor != other.disabledIconColor) return false
        if (disabledIconContainerColor != other.disabledIconContainerColor) return false
        if (iconSize != other.iconSize) return false
        if (isTextVisible != other.isTextVisible) return false
        if (text != other.text) return false
        if (textColor != other.textColor) return false
        if (disabledTextColor != other.disabledTextColor) return false
        if (onClick != other.onClick) return false
        return true
    }

    override fun hashCode(): Int {
        var result = enabled.hashCode()
        result = 31 * result + icon.hashCode()
        result = 31 * result + iconColor.hashCode()
        result = 31 * result + iconContainerColor.hashCode()
        result = 31 * result + disabledIconColor.hashCode()
        result = 31 * result + disabledIconContainerColor.hashCode()
        result = 31 * result + iconSize.hashCode()
        result = 31 * result + isTextVisible.hashCode()
        result = 31 * result + text.hashCode()
        result = 31 * result + textColor.hashCode()
        result = 31 * result + disabledTextColor.hashCode()
        result = 31 * result + onClick.hashCode()
        return result
    }
}

/**
 * Generic Icon Button composable, supporting text and icons.
 *
 * @param modifier the [Modifier] to be applied.
 * @param properties the configuration [IconButtonProperties].
 */
@Composable
fun IconButton(
    modifier: Modifier = Modifier,
    properties: IconButtonProperties
) {
    IconButton(
        modifier = modifier,
        enabled = properties.enabled,
        icon = Icons.Default.Done,
        iconColor = properties.iconColor,
        iconContainerColor = properties.iconContainerColor,
        disabledIconColor = properties.disabledIconColor,
        disabledIconContainerColor = properties.disabledIconContainerColor,
        iconSize = properties.iconSize,
        isTextVisible = properties.isTextVisible,
        text = properties.text,
        textColor = properties.textColor,
        disabledTextColor = properties.disabledTextColor,
        onClick = properties.onClick
    )
}

/**
 * Generic Icon Button composable function.
 *
 * @param modifier the [Modifier] for customization.
 * @param enabled Controls the enabled state of this button.
 * @param iconPainter The icon to display.
 * @param iconColor Color of the icon when enabled.
 * @param iconContainerColor Background color of the icon container.
 * @param disabledIconColor Color of the icon when disabled.
 * @param disabledIconContainerColor Background color of the icon container when disabled.
 * @param iconSize Size of the icon.
 * @param isTextVisible Whether a label is displayed with the icon.
 * @param text The label text displayed if [isTextVisible] is true.
 * @param textColor Color of the text when enabled.
 * @param disabledTextColor Color of the text when disabled.
 * @param onClick Action to execute on a click.
 */
@Composable
fun IconButton(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    icon: ImageVector? = null,
    iconColor: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    iconContainerColor: Color = Color.Transparent,
    disabledIconColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
    disabledIconContainerColor: Color = Color.Transparent,
    iconSize: Dp = 24.dp,
    containerSize: Dp = 48.dp,
    isTextVisible: Boolean = true,
    text: String = "",
    textColor: Color = MaterialTheme.colorScheme.onBackground,
    disabledTextColor: Color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.38f),
    onClick: () -> Unit
) {
    Column(
        modifier = modifier.clickable(enabled = enabled, onClick = onClick).width(containerSize),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Surface(
            modifier = Modifier.size(iconSize),
            shape = MaterialTheme.shapes.small,
            color = if (enabled) iconContainerColor else disabledIconContainerColor,
            contentColor = if (enabled) iconColor else disabledIconColor
        ) {
            if (icon != null) {
                Icon(
                    icon,
                    contentDescription = null,
                    modifier = Modifier
                        .size(iconSize)
                        .padding(4.dp)
                )
            }
        }
        if (isTextVisible && text.isNotEmpty()) {
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = text,
                color = if (enabled) textColor else disabledTextColor,
                style = MaterialTheme.typography.labelSmall,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1
            )
        }
    }
}

/**
 * Error Icon Button: A specialized version used for error indicators.
 *
 * @param modifier the [Modifier] to be applied.
 * @param iconSize Size of the error icon.
 * @param errorIconPainter The error icon to display.
 * @param errorIconColor Color of the error icon.
 * @param onErrorIconClick Optional click action for the icon.
 */
@Composable
fun ErrorIconButton(
    modifier: Modifier = Modifier,
    iconSize: Dp,
    errorIcon: ImageVector = Icons.Default.Close,
    errorIconColor: Color = Color.Red,
    onErrorIconClick: (() -> Unit)? = null
) {
    if (onErrorIconClick != null) {
        IconButton(
            modifier = modifier.size(iconSize),
            properties = IconButtonDefaults.getIconButtonProperties(
                icon = errorIcon,
                iconColor = errorIconColor,
                iconSize = iconSize,
                onClick = onErrorIconClick
            )
        )
    } else {
        Icon(
            errorIcon,
            contentDescription = null,
            modifier = modifier.size(iconSize),
            tint = errorIconColor
        )
    }
}

/**
 * Example usage for testing Icon Button customization.
 */
@Composable
fun SampleIconButton() {
    IconButton(
        icon = Icons.Default.Add,
        text = "Icon Button",
        textColor = MaterialTheme.colorScheme.primary,
        onClick = { /* Handle click */ }
    )
}