package io.github.jackbeback.klib.UI.chips

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.jackbeback.klib.UI.badge.PillBadge
import io.github.jackbeback.klib.UI.text.DefaultText
import io.github.jackbeback.klib.theme.icons.dazzleline.AddressBook
import io.github.jackbeback.klib.theme.icons.dazzleline.DazzleLine
import io.github.jackbeback.klib.theme.icons.dazzleline.FaceFrown
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.launch

@Composable
fun Chip(
    label: String,
    modifier: Modifier = Modifier,
    maxWidth: Dp = 250.dp,
    defaults: ChipDefaults = mediumInputChipDefaults,
    selected: Boolean = false,
    enabled: Boolean = true,
    startEllipsize: Boolean = false,
    onChipClick: (() -> Unit)? = null,
    trailingIcon: ImageVector? = null,
    onTrailingItemClicked: (() -> Unit)? = null,
    leadingIcon: ImageVector? = null,
    showPillBadge: Boolean = false,
    pillBadgeText: String = "",
    showInfoIcon: Boolean = false,
    onInfoIconClick: (() -> Unit)? = null,
    showErrorIcon: Boolean = false,
    onErrorIconClick: (() -> Unit)? = null,
    infoMessage: String? = null,
) {
    val scope = rememberCoroutineScope()

    val backgroundColor = if (showErrorIcon){
        MaterialTheme.colorScheme.errorContainer
    }else{
        MaterialTheme.colorScheme.surface
    }

    val leadingIconColor = MaterialTheme.colorScheme.onSurface

    val textColor = MaterialTheme.colorScheme.onSurface

    Card(
        modifier = modifier
            .clip(RoundedCornerShape(100.dp))
            .clickable(enabled = onChipClick != null && enabled, onClick = { onChipClick?.invoke() }),
        shape = RoundedCornerShape(100.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.onSurface)
    ) {
        Row(
            modifier = Modifier
                .widthIn(0.dp, maxWidth)
                .padding(defaults.padding),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (leadingIcon != null) {
                Icon(
                    modifier = Modifier.size(defaults.iconSize),
                    imageVector = leadingIcon,
                    contentDescription = null,
                    tint = leadingIconColor
                )
                Spacer(modifier = Modifier.size(defaults.spacerSize))
            }

            if (startEllipsize) {
                DefaultText(
                    text = label,
                    modifier = Modifier.weight(1f, false),
                    isEnabled = enabled,
                    maxLines = 1
                )
            } else {
                DefaultText(
                    text = label,
                    modifier = Modifier.weight(1f, false),
                    isEnabled = enabled,
                    maxLines = 1
                )
            }

            Spacer(modifier = Modifier.size(defaults.spacerSize))

            if (showPillBadge) {
                val pillBadgeBackgroundColor = if (enabled) {
                    MaterialTheme.colorScheme.error
                } else {
                    MaterialTheme.colorScheme.errorContainer
                }

                val pillBadgeContentColor = if (enabled) {
                    MaterialTheme.colorScheme.onError
                } else {
                    MaterialTheme.colorScheme.onErrorContainer
                }

                PillBadge(
                    backgroundColor = pillBadgeBackgroundColor,
                    contentColor = pillBadgeContentColor,
                    text = pillBadgeText
                )
                Spacer(modifier = Modifier.size(defaults.spacerSize))
            }

            if (showInfoIcon) {
                Icon(Icons.Default.Info, contentDescription = null, tint = textColor, modifier = Modifier.clickable {
                    onInfoIconClick?.invoke()
                })
                Spacer(modifier = Modifier.size(defaults.spacerSize))
            }

            if (showErrorIcon) {
                Icon(DazzleLine.FaceFrown, contentDescription = null, tint = textColor, modifier = Modifier.clickable {
                    if (onErrorIconClick != null) {
                        onErrorIconClick()
                    }
                }.size(defaults.iconSize))
                Spacer(modifier = Modifier.size(defaults.spacerSize))
            }

            if (trailingIcon != null) {
                Icon(trailingIcon, contentDescription = "", modifier = Modifier.clickable {
                    if (onTrailingItemClicked != null) {
                        onTrailingItemClicked()
                    }
                }.size(defaults.iconSize))
            }
        }
    }
}

@Composable
fun ChipSample() {
    Column {
        Chip("hello", trailingIcon = DazzleLine.AddressBook)
        Chip("asdfasd", showErrorIcon = true)
        Chip("asdfasdo", showInfoIcon = true, infoMessage = "This is a sample Info Message.")
        Chip("hsdfsfslo", showPillBadge = true, pillBadgeText = "10")
    }
}