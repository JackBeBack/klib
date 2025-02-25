package io.github.jackbeback.klib.UI.sample

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog

/**
 * Options for the toggle switches in the settings panel.
 *
 * @property label The label for the option.
 */
enum class SettingsPanelOption(val label: String) {
    DARK_MODE("Dark mode"),
    ENABLED("Enabled"),
    IS_OWN_USER("Is own user"),
    SHOW_TRAILING_ICON("Show trailing icon"),
    SHOW_LEADING_ICON("Show leading icon"),
    SHOW_PILL_BADGE("Show pill badge"),
    FULL_SCREEN_MODE("Full Screen Mode"),
    ALLOW_DECIMAL("Allow Decimal"),
    EXPANDED("Expanded"),
    SELECTED("Selected"),
    SIDE_BY_SIDE("Side by Side"),
    LARGE_MODE("Large Mode"),
    LINK_CLICKED("Link clicked")
}

/**
 * A horizontal scrollable panel of switches.
 *
 * @param switches A map defining the labels and their default states.
 * Default values:
 * - [SettingsPanelOption.DARK_MODE] -> false
 * - [SettingsPanelOption.ENABLED] -> true
 * @param onSwitchChange Callback invoked when a switch's state is toggled.
 */
@Composable
fun SettingsPanel(
    switches: Map<SettingsPanelOption, Boolean> = mapOf(
        SettingsPanelOption.DARK_MODE to false,
        SettingsPanelOption.ENABLED to true
    ),
    onSwitchChange: (SettingsPanelOption) -> Unit
) {
    Surface(
        modifier = Modifier.padding(5.dp),
        shadowElevation = 3.dp
    ) {
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.background)
        ) {
            itemsIndexed(switches.toList()) { _, item ->
                ToggleSwitch(
                    text = item.first.label,
                    checked = item.second,
                    onCheckedChange = { onSwitchChange(item.first) }
                )
                Spacer(modifier = Modifier.size(5.dp))
            }
        }
    }
}


/**
 * Simple toggle button with text and a switch to represent actions.
 *
 * @param text The text to be displayed beside the switch.
 * @param checked Whether the toggle is currently enabled.
 * @param onCheckedChange Callback invoked when the toggle switch is clicked.
 */
@Composable
fun ToggleSwitch(
    text: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Row(
        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.weight(1f)
        )
        Switch(
            checked = checked,
            onCheckedChange = onCheckedChange
        )
    }
}

/**
 * Composable to manage dark mode state using CompositionLocal.
 */
val LocalDarkMode = compositionLocalOf { false }

/**
 * Extensions to make common checks simpler for switch states.
 */
fun Map<SettingsPanelOption, Boolean>.isEnabled() = this[SettingsPanelOption.ENABLED] ?: true
fun Map<SettingsPanelOption, Boolean>.isDarkMode() = this[SettingsPanelOption.DARK_MODE] ?: false
fun Map<SettingsPanelOption, Boolean>.isFullScreenMode() = this[SettingsPanelOption.FULL_SCREEN_MODE] ?: false
fun Map<SettingsPanelOption, Boolean>.isSideBySide() = this[SettingsPanelOption.SIDE_BY_SIDE] ?: false
fun Map<SettingsPanelOption, Boolean>.isLargeMode() = this[SettingsPanelOption.LARGE_MODE] ?: false



/**
 * Color variants for badges.
 */
enum class BadgeColors(val displayName: String) {
    SUBTLE_RED("Subtle Red"),
    SUBTLE_ORANGE("Subtle Orange"),
    SUBTLE_GREEN("Subtle Green"),
    SUBTLE_BLUE("Subtle Blue"),
    SUBTLE_PURPLE("Subtle Purple"),
    SUBTLE_GRAY("Subtle Gray"),

    PROMINENT_RED("Prominent Red"),
    PROMINENT_ORANGE("Prominent Orange"),
    PROMINENT_GREEN("Prominent Green"),
    PROMINENT_BLUE("Prominent Blue"),
    PROMINENT_PURPLE("Prominent Purple"),
    PROMINENT_GRAY("Prominent Gray")
}

/**
 * Displays the customized badge based on the selected properties.
 */
@Composable
fun CustomBadgeComposable(
    badgeColor: BadgeColors,
    badgeText: String,
    isBadgeEnabled: Boolean,
    isLeftIconEnabled: Boolean,
    isRightIconEnabled: Boolean,
    leftIconResId: Int,
    rightIconResId: Int
) {
    // Badge implementation can be updated with your specifics.
    Text(
        modifier = Modifier,
        text = "Badge: $badgeText, Color: ${badgeColor.displayName}",
        style = MaterialTheme.typography.titleMedium,
        color = if (isBadgeEnabled) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface
    )
}

/**
 * Allows for editing badge configurations like text, icons, and toggles.
 */
@Composable
fun OptionsEditor(
    badgeColor: BadgeColors,
    badgeText: String,
    isLeftIconEnabled: Boolean,
    isRightIconEnabled: Boolean,
    isBadgeEnabled: Boolean,
    showBadgeColorDialog: () -> Unit,
    showLeftIconDialog: () -> Unit,
    showRightIconDialog: () -> Unit,
    onBadgeTextChange: (String) -> Unit,
    onLeftIconToggle: (Boolean) -> Unit,
    onRightIconToggle: (Boolean) -> Unit,
    onBadgeToggle: (Boolean) -> Unit
) {
    LazyColumn(modifier = Modifier.padding(10.dp)) {
        item {
            // Badge color selector
            Text(
                text = "Badge Color: ${badgeColor.displayName}",
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { showBadgeColorDialog() }
                    .padding(10.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }
        item {
            // Badge text editor
            Row(modifier = Modifier.fillMaxWidth()) {
                TextField(
                    value = badgeText,
                    onValueChange = onBadgeTextChange,
                    modifier = Modifier.weight(1f),
                    label = { Text("Badge Text") }
                )
                Switch(checked = isBadgeEnabled, onCheckedChange = onBadgeToggle)
            }
        }
        item {
            // Left icon editor
            Row(modifier = Modifier.fillMaxWidth()) {
                Button(onClick = showLeftIconDialog) { Text("Edit Left Icon") }
                Switch(checked = isLeftIconEnabled, onCheckedChange = onLeftIconToggle)
            }
        }
        item {
            // Right icon editor
            Row(modifier = Modifier.fillMaxWidth()) {
                Button(onClick = showRightIconDialog) { Text("Edit Right Icon") }
                Switch(checked = isRightIconEnabled, onCheckedChange = onRightIconToggle)
            }
        }
    }
}

/**
 * Dialog for selecting badge colors.
 */
@Composable
fun BadgeColorSelectorDialog(
    currentColor: BadgeColors,
    onDismiss: () -> Unit,
    onColorSelected: (BadgeColors) -> Unit
) {
    Dialog(onDismissRequest = onDismiss) {
        Card(modifier = Modifier.fillMaxWidth()) {
            LazyColumn {
                BadgeColors.values().forEach { color ->
                    item {
                        Text(
                            text = color.displayName,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { onColorSelected(color) }
                                .padding(10.dp),
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                }
            }
        }
    }
}