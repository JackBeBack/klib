package io.github.jackbeback.klib.UI.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.material3.ButtonDefaults.buttonElevation
import androidx.compose.material3.ButtonDefaults.outlinedButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Contains default values for generic outlined button styling.
 */
object OutlinedButtonDefaults {
    val ContentPadding = PaddingValues(horizontal = 12.dp, vertical = 8.dp)
    val TextHorizontalPadding = 8.dp
    val IconSize = 24.dp
    const val DisabledContainerOpacity = 0.38f
}

/**
 * A generic version of the OutlinedButton that provides customization for text, icons, and borders.
 *
 * @param modifier The [Modifier] to be applied to this button.
 * @param enabled Controls whether this button is enabled. A disabled button won't accept user input.
 * @param contentColor The content color for the button when enabled.
 * @param disabledContentColor The content color for the button when it is disabled.
 * @param elevation Optional [ButtonElevation] to change the elevation of the button.
 * @param contentPadding Internal spacing between the container and the content.
 * @param borderColor Border color when the button is enabled.
 * @param disabledBorderColor Border color when the button is disabled.
 * @param borderSize The thickness of the border around the button.
 * @param text The text to be displayed on the button.
 * @param textHorizontalPadding Horizontal padding between the text and the icon (if present).
 * @param leftIconPainter Icon to display on the left side of the button (optional).
 * @param rightIconPainter Icon to display on the right side of the button (optional).
 * @param iconSize Size of the icons displayed on the button (if any).
 * @param onClick The action executed when the button is clicked.
 */
@Composable
fun OutlinedButtonWithIcon(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    contentColor: Color = MaterialTheme.colorScheme.primary,
    disabledContentColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = OutlinedButtonDefaults.DisabledContainerOpacity),
    elevation: ButtonElevation? = buttonElevation(),
    contentPadding: PaddingValues = OutlinedButtonDefaults.ContentPadding,
    borderColor: Color = MaterialTheme.colorScheme.primary,
    disabledBorderColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = OutlinedButtonDefaults.DisabledContainerOpacity),
    borderSize: Dp = 1.dp,
    text: String,
    textHorizontalPadding: Dp = OutlinedButtonDefaults.TextHorizontalPadding,
    leftIcon: ImageVector? = null,
    rightIcon: ImageVector? = null,
    iconSize: Dp = OutlinedButtonDefaults.IconSize,
    onClick: () -> Unit
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = outlinedButtonColors(
            contentColor = contentColor,
            disabledContentColor = disabledContentColor
        ),
        contentPadding = contentPadding,
        elevation = elevation,
        border = BorderStroke(borderSize, if (enabled) borderColor else disabledBorderColor)
    ) {
        ButtonContent(
            modifier = Modifier
                .wrapContentSize(align = Alignment.Center)
                .align(Alignment.CenterVertically),
            enabled = enabled,
            contentColor = contentColor,
            disabledContentColor = disabledContentColor,
            text = text,
            textHorizontalPadding = textHorizontalPadding,
            leftIcon = leftIcon,
            rightIcon = rightIcon,
            iconSize = iconSize
        )
    }
}

/**
 * A composable to structure the content within an outlined button. It handles the text, left, and right icons.
 *
 * @param modifier The [Modifier] to be applied.
 * @param enabled Whether the button is enabled.
 * @param contentColor The content color of the button.
 * @param disabledContentColor The content color when the button is disabled.
 * @param text The text to display inside the button.
 * @param textHorizontalPadding Horizontal padding between the text and icons (if present).
 * @param leftIconPainter The icon to display on the left side (if any).
 * @param rightIconPainter The icon to display on the right side (if any).
 * @param iconSize The size of the icons inside the button.
 */
@Composable
fun ButtonContent(
    modifier: Modifier = Modifier,
    enabled: Boolean,
    contentColor: Color,
    disabledContentColor: Color,
    text: String,
    textHorizontalPadding: Dp,
    leftIcon: ImageVector? = null,
    rightIcon: ImageVector? = null,
    iconSize: Dp = OutlinedButtonDefaults.IconSize,
) {
    Row(
        modifier = modifier.wrapContentSize(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (leftIcon != null) {
            Icon(
                leftIcon,
                contentDescription = null,
                modifier = Modifier
                    .size(iconSize)
                    .padding(end = textHorizontalPadding),
                tint = if (enabled) contentColor else disabledContentColor
            )
        }

        Text(
            text = text,
            modifier = Modifier.align(Alignment.CenterVertically),
            color = if (enabled) contentColor else disabledContentColor,
            style = MaterialTheme.typography.labelLarge,
        )

        if (rightIcon != null) {
            Icon(
                rightIcon,
                contentDescription = null,
                modifier = Modifier
                    .size(iconSize)
                    .padding(start = textHorizontalPadding),
                tint = if (enabled) contentColor else disabledContentColor
            )
        }
    }
}

/**
 * Sample usage of the `OutlinedButtonWithIcon` component with variations.
 */
@Composable
fun OutlinedButtonWithIconSample(
    modifier: Modifier = Modifier,
    isBtnEnabled: Boolean = true,
    buttonText: String = "Outlined Icon Button",
    leftIcon: ImageVector = Icons.Default.Add,
    rightIcon: ImageVector = Icons.Default.Person,
) {
    Box(modifier) {
        Row(
            modifier = Modifier
                .wrapContentSize()
                .align(Alignment.Center)
        ) {
            Spacer(modifier = Modifier.padding(vertical = 10.dp))

            OutlinedButtonWithIcon(
                modifier = Modifier
                    .align(Alignment.CenterVertically),
                enabled = isBtnEnabled,
                text = buttonText,
                leftIcon = leftIcon,
                rightIcon = rightIcon,
                onClick = {}
            )

            Spacer(modifier = Modifier.padding(vertical = 10.dp))

            OutlinedButtonWithIcon(
                modifier = Modifier
                    .align(Alignment.CenterVertically),
                enabled = isBtnEnabled,
                text = "Medium Button",
                onClick = {}
            )

            Spacer(modifier = Modifier.padding(vertical = 10.dp))

            OutlinedButtonWithIcon(
                modifier = Modifier
                    .align(Alignment.CenterVertically),
                enabled = isBtnEnabled,
                text = "Small Button",
                leftIcon = null,
                rightIcon = rightIcon,
                onClick = {}
            )

            Spacer(modifier = Modifier.padding(vertical = 10.dp))
        }
    }
}

/**
 * Preview the generic Outlined Button with sample data.
 */

@Composable
fun PreviewOutlinedButtonWithIcon() {
    MaterialTheme {
        OutlinedButtonWithIconSample()
    }
}