package io.github.jackbeback.klib.UI.button

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.TextStyle
import io.github.jackbeback.klib.UI.text.DefaultText

/**
 * Contains default values for configuring the segmented control.
 */
object SegmentedControlDefaults {
    val MediumSize = 40.dp
    val MediumElementHeight = 36.dp
    val BorderSize = 1.dp
    val ElementPadding = 4.dp
}

/**
 * A generic Segmented Control composable function.
 * It renders a row of selectable segments and allows for custom content per segment.
 *
 * @param modifier The [Modifier] to be applied to the Row containing the segmentation.
 * @param states A List of state strings which represent the segments.
 * @param content A lambda function defining the content per segment (text, icon, etc.).
 */
@Composable
fun SegmentedControl(
    modifier: Modifier = Modifier,
    states: List<String>,
    content: @Composable (index: Int, text: String) -> Unit
) {
    val size = SegmentedControlDefaults.MediumSize
    val borderSize = SegmentedControlDefaults.BorderSize
    val elementPadding = SegmentedControlDefaults.ElementPadding

    Row(
        modifier = modifier
            .height(size)
            .border(
                width = borderSize,
                color = MaterialTheme.colorScheme.surfaceVariant,
                shape = RoundedCornerShape(size / 2)
            )
            .background(MaterialTheme.colorScheme.surfaceVariant, RoundedCornerShape(size / 2)),
        horizontalArrangement = Arrangement.spacedBy(elementPadding),
        verticalAlignment = Alignment.CenterVertically
    ) {
        states.forEachIndexed { index, text ->
            content(index, text)
        }
    }
}

/**
 * Represents an individual segment (item) within the segmented control.
 * It can be rendered as selected or deselected based on the `isActive` parameter.
 *
 * @param index The index of the segment in the list of segments.
 * @param text The label text for the segment.
 * @param isActive Controls whether the segment is actively selected.
 * @param isDisabled Controls whether the segment is interactive. Disabled segments appear grayed out.
 * @param onSelectionChange A callback executed when the segment is clicked.
 */
@Composable
fun SegmentedControlItem(
    index: Int,
    text: String,
    isActive: Boolean,
    isDisabled: Boolean = false,
    onSelectionChange: (index: Int) -> Unit
) {
    val height = SegmentedControlDefaults.MediumElementHeight

    Box(
        modifier = Modifier
            .height(height)
            .background(
                color = when {
                    isActive && isDisabled -> MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f)
                    isActive -> MaterialTheme.colorScheme.primary
                    else -> Color.Transparent
                },
                shape = RoundedCornerShape(height / 2)
            )
            .clickableWithoutRipple {
                if (!isDisabled) {
                    onSelectionChange(index)
                }
            },
        contentAlignment = Center
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            if (isActive) {
                Icon(
                    modifier = Modifier.size(18.dp),
                    imageVector = Icons.Filled.Check,
                    contentDescription = null,
                    tint = when {
                        isDisabled -> MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)
                        else -> MaterialTheme.colorScheme.onPrimary
                    }
                )
            }
            Text(
                text = text,
                color = when {
                    isDisabled -> MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)
                    isActive -> MaterialTheme.colorScheme.onPrimary
                    else -> MaterialTheme.colorScheme.onSurface
                },
                style = when {
                    isActive -> TextStyle(fontSize = 14.sp, color = MaterialTheme.colorScheme.onPrimary)
                    else -> TextStyle(fontSize = 12.sp, color = MaterialTheme.colorScheme.onSurface)
                }
            )
        }
    }
}

/**
 * A clickable modifier without ripple effects.
 */
@Composable
fun Modifier.clickableWithoutRipple(onClick: () -> Unit): Modifier =
    this.then(clickable(
        onClick = onClick,
        indication = null,
        interactionSource = remember { MutableInteractionSource() }
    ))

/**
 * A preview of a Segmented Control with multiple states and variations.
 */

@Composable
fun SegmentedControlSample() {
    val moreStates = listOf("One", "Two", "Three", "Four")
    val lessStates = listOf("Basic", "Expert")

    var activeState by remember { mutableStateOf(0) }

    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        SegmentedControl(states = moreStates) { index, text ->
            SegmentedControlItem(
                index = index,
                text = text,
                isActive = index == activeState // Third item active
            ) {
                activeState = it
            }
        }

        SegmentedControl(states = lessStates) { index, text ->
            SegmentedControlItem(
                index = index,
                text = text,
                isActive = index == activeState // Second item active
            ) {
                activeState = it
            }
        }

        SegmentedControl(states = moreStates) { index, text ->
            SegmentedControlItem(
                index = index,
                text = text,
                isActive = index == activeState,
                isDisabled = true // Entire segmented control disabled
            ) {}
        }

        SegmentedControl(states = lessStates) { index, text ->
            SegmentedControlItem(
                index = index,
                text = text,
                isActive = index == activeState,
                isDisabled = true
            ) {
                activeState = it
            }
        }
    }
}