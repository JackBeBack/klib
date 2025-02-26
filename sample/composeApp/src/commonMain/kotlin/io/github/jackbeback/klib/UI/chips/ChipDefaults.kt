package io.github.jackbeback.klib.UI.chips

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Default configurations for chips.
 *
 * @param padding Defines the padding for the chip's content.
 * @param textStyle Defines the text style of text in the chip.
 * @param spacerSize Defines the size of the spacer between the text and any trailing icon.
 * @param iconSize Defines the size of icons (e.g., in leading or trailing parts) in the chip.
 */
class ChipDefaults(
    val padding: PaddingValues,
    val textStyle: TextStyle,
    val spacerSize: Dp,
    val iconSize: Dp
)

/**
 * Defines color properties for chips in different states: enabled, selected, disabled.
 *
 * @param enabledColor Default color when the chip is enabled.
 * @param enabledSelectedColor Color when the chip is selected and enabled.
 * @param disabledColor Default color when the chip is disabled.
 * @param disabledSelectedColor Color when the chip is selected and disabled.
 */
class ChipColorProperties(
    val enabledColor: Color,
    val enabledSelectedColor: Color,
    val disabledColor: Color,
    val disabledSelectedColor: Color
)

/**
 * Provides color properties for input chip backgrounds.
 */
@Composable
fun getInputChipBackgroundColorProperties() = ChipColorProperties(
    enabledColor = MaterialTheme.colorScheme.surface,
    enabledSelectedColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.12f),
    disabledColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.38f),
    disabledSelectedColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.12f)
)

/**
 * Provides color properties for input chip borders.
 */
@Composable
fun getInputChipBorderColorProperties() = ChipColorProperties(
    enabledColor = MaterialTheme.colorScheme.outline,
    enabledSelectedColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f),
    disabledColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.38f),
    disabledSelectedColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.12f)
)

/**
 * Provides color properties for input chip trailing icons.
 */
@Composable
fun getInputChipTrailingIconColorProperties() = ChipColorProperties(
    enabledColor = MaterialTheme.colorScheme.onSurfaceVariant,
    enabledSelectedColor = MaterialTheme.colorScheme.primary,
    disabledColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
    disabledSelectedColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)
)

/**
 * Provides color properties for input chip text.
 */
@Composable
fun getInputChipTextColorProperties() = ChipColorProperties(
    enabledColor = MaterialTheme.colorScheme.onSurface,
    enabledSelectedColor = MaterialTheme.colorScheme.primary,
    disabledColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
    disabledSelectedColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)
)

/**
 * Provides color properties for filter chip backgrounds.
 */
@Composable
fun getFilterChipBackgroundColorProperties() = ChipColorProperties(
    enabledColor = MaterialTheme.colorScheme.surface,
    enabledSelectedColor = MaterialTheme.colorScheme.secondaryContainer,
    disabledColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.12f),
    disabledSelectedColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.24f)
)

/**
 * Provides color properties for filter chip borders.
 */
@Composable
fun getFilterChipBorderColorProperties() = ChipColorProperties(
    enabledColor = MaterialTheme.colorScheme.outline,
    enabledSelectedColor = MaterialTheme.colorScheme.secondary,
    disabledColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.38f),
    disabledSelectedColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.12f)
)

/**
 * Provides color properties for filter chip trailing icons.
 */
@Composable
fun getFilterChipTrailingIconColorProperties() = ChipColorProperties(
    enabledColor = MaterialTheme.colorScheme.onSurfaceVariant,
    enabledSelectedColor = MaterialTheme.colorScheme.secondary,
    disabledColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
    disabledSelectedColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)
)

/**
 * Provides color properties for filter chip text.
 */
@Composable
fun getFilterChipTextColorProperties() = ChipColorProperties(
    enabledColor = MaterialTheme.colorScheme.onSurfaceVariant,
    enabledSelectedColor = MaterialTheme.colorScheme.secondary,
    disabledColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
    disabledSelectedColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)
)

/**
 * Provides color properties for filter chip badges' background.
 */
@Composable
fun getFilterChipPillBadgeBackgroundColorProperties() = ChipColorProperties(
    enabledColor = MaterialTheme.colorScheme.secondary,
    enabledSelectedColor = MaterialTheme.colorScheme.secondary,
    disabledColor = MaterialTheme.colorScheme.secondary.copy(alpha = 0.38f),
    disabledSelectedColor = MaterialTheme.colorScheme.secondary.copy(alpha = 0.38f)
)

/**
 * Provides color properties for filter chip badges' content color.
 */
@Composable
fun getFilterChipPillBadgeContentColorProperties() = ChipColorProperties(
    enabledColor = MaterialTheme.colorScheme.onSecondary,
    enabledSelectedColor = MaterialTheme.colorScheme.onSecondary,
    disabledColor = MaterialTheme.colorScheme.onSecondary.copy(alpha = 0.38f),
    disabledSelectedColor = MaterialTheme.colorScheme.onSecondary.copy(alpha = 0.38f)
)

/**
 * Provides color properties for boolean chip backgrounds.
 */
@Composable
fun getBooleanChipBackgroundColorProperties() = ChipColorProperties(
    enabledColor = MaterialTheme.colorScheme.surface,
    enabledSelectedColor = MaterialTheme.colorScheme.secondaryContainer,
    disabledColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.12f),
    disabledSelectedColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.12f)
)

/**
 * Provides color properties for boolean chip borders.
 */
@Composable
fun getBooleanChipBorderColorProperties() = ChipColorProperties(
    enabledColor = MaterialTheme.colorScheme.outline,
    enabledSelectedColor = MaterialTheme.colorScheme.secondary,
    disabledColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.38f),
    disabledSelectedColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.12f)
)

/**
 * Provides color properties for boolean chip icons.
 */
@Composable
fun getBooleanChipLeadingIconColorProperties() = ChipColorProperties(
    enabledColor = MaterialTheme.colorScheme.onSurfaceVariant,
    enabledSelectedColor = MaterialTheme.colorScheme.secondary,
    disabledColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
    disabledSelectedColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)
)

/**
 * Provides color properties for boolean chip text.
 */
@Composable
fun getBooleanChipTextColorProperties() = ChipColorProperties(
    enabledColor = MaterialTheme.colorScheme.onSurface,
    enabledSelectedColor = MaterialTheme.colorScheme.secondary,
    disabledColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
    disabledSelectedColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)
)

/**
 * Default paddings for avatar input chips.
 */
val smallAvatarInputChipPadding = PaddingValues(start = 2.dp, top = 2.dp, bottom = 2.dp, end = 8.dp)
val mediumAvatarInputChipPadding = PaddingValues(start = 4.dp, top = 4.dp, bottom = 4.dp, end = 8.dp)

/**
 * Default paddings for input chips (small and medium sizes).
 */
val smallInputChipPadding = PaddingValues(start = 10.dp, top = 4.dp, end = 8.dp, bottom = 4.dp)
val mediumInputChipPadding = PaddingValues(start = 12.dp, top = 8.dp, end = 8.dp, bottom = 8.dp)

/**
 * Configurations for small input chips (padding, styles, sizes).
 */
val smallInputChipDefaults = ChipDefaults(
    padding = smallInputChipPadding,
    textStyle = TextStyle(fontSize = 12.sp),
    spacerSize = 4.dp,
    iconSize = 20.dp
)

/**
 * Configurations for medium input chips (padding, styles, sizes).
 */
val mediumInputChipDefaults = ChipDefaults(
    padding = mediumInputChipPadding,
    textStyle = TextStyle(fontSize = 14.sp),
    spacerSize = 6.dp,
    iconSize = 20.dp
)