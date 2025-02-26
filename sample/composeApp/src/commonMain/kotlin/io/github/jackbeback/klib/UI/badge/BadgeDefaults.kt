package io.github.jackbeback.klib.UI.badge

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

/**
 * Defaults configuration for badges in your app.
 *
 * @param minWidth The minimum width of a badge.
 * @param iconSize The size of the icon within the badge.
 * @param paddingValues The padding around the badge content.
 * @param textStyle The text style applied to the badge's text.
 */
data class PillBadgeDefaults(
    val minWidth: Dp,
    val iconSize: Dp,
    val paddingValues: PaddingValues,
    val textStyle: TextStyle
)

/** Small default configuration for `AppPillBadge`. */
@Composable
fun smallAppPillBadgeDefaults() = PillBadgeDefaults(
    minWidth = 24.dp,
    iconSize = 16.dp,
    paddingValues = PaddingValues(horizontal = 4.dp, vertical = 2.dp),
    textStyle = MaterialTheme.typography.labelSmall
)

/** Medium default configuration for `AppPillBadge`. */
@Composable
fun mediumAppPillBadgeDefaults() = PillBadgeDefaults(
    minWidth = 32.dp,
    iconSize = 20.dp,
    paddingValues = PaddingValues(horizontal = 6.dp, vertical = 4.dp),
    textStyle = MaterialTheme.typography.labelMedium
)

/** Large default configuration for `AppPillBadge`. */
@Composable
fun largeAppPillBadgeDefaults() = PillBadgeDefaults(
    minWidth = 40.dp,
    iconSize = 24.dp,
    paddingValues = PaddingValues(horizontal = 8.dp, vertical = 6.dp),
    textStyle = MaterialTheme.typography.bodySmall
)