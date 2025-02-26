package io.github.jackbeback.klib.UI.badge

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Badge
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * A general-purpose pill badge component that adheres to your design system.
 *
 * @param modifier - the modifier to be applied to this badge.
 * @param defaults - contains layout defaults, including padding, textStyle, and icon size.
 * @param backgroundColor - the background color for the badge.
 * @param contentColor - the color for the content inside the badge (text and icons).
 * @param icon - the icon to display inside the badge.
 * @param showIcon - determines if the icon should be shown (default: true).
 * @param text - the text to display inside the badge (default: "").
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PillBadge(
    modifier: Modifier = Modifier,
    defaults: PillBadgeDefaults = mediumAppPillBadgeDefaults(),
    backgroundColor: Color = MaterialTheme.colorScheme.error,
    contentColor: Color = MaterialTheme.colorScheme.onPrimary,
    icon: ImageVector = Icons.Default.Add,
    showIcon: Boolean = false,
    text: String = ""
) {
    val isCircular = (text.length == 1 && !showIcon) || (text.isEmpty() && showIcon)

    Badge(
        modifier = modifier
            .defaultMinSize(minWidth = defaults.minWidth)
            .drawBehind {
                if (isCircular) {
                    drawCircle(
                        color = backgroundColor,
                        radius = this.size.maxDimension / 2
                    )
                }
            },
        containerColor = backgroundColor
    ) {
        Row(
            modifier = Modifier.padding(defaults.paddingValues),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (showIcon) {
                Icon(
                    modifier = Modifier.size(defaults.iconSize),
                    imageVector = icon,
                    contentDescription = null,
                    tint = contentColor
                )
                Spacer(modifier = Modifier.size(2.dp))
            }

            Text(
                text = text,
                color = contentColor,
                style = defaults.textStyle
            )
        }
    }
}

/**
 * A sample usage of AppPillBadge showcasing different sizes and configurations.
 */
@Composable
fun AppPillBadgeSample(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(5.dp)) {
        PillBadge(
            modifier = Modifier,
            defaults = smallAppPillBadgeDefaults(),
            backgroundColor = MaterialTheme.colorScheme.secondary,
            contentColor = MaterialTheme.colorScheme.onSecondary,
            text = "123"
        )

        Spacer(modifier = Modifier.size(10.dp))

        PillBadge(
            defaults = mediumAppPillBadgeDefaults(),
            backgroundColor = MaterialTheme.colorScheme.secondary,
            contentColor = MaterialTheme.colorScheme.onSecondary,
            text = "ABC"
        )

        Spacer(modifier = Modifier.size(10.dp))

        PillBadge(
            defaults = largeAppPillBadgeDefaults(),
            backgroundColor = MaterialTheme.colorScheme.tertiary,
            contentColor = MaterialTheme.colorScheme.onTertiary,
            text = "XYZ"
        )
    }
}