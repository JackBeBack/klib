package io.github.jackbeback.klib.UI.button

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.jackbeback.klib.UI.text.DefaultText

/**
 * Generalized Floating Action Button (FAB).
 *
 * @param modifier Modifier to be applied to the FAB.
 * @param shape Shape of the FAB; defaults to circular.
 * @param enabled Whether the FAB is clickable/enabled, defaults to `true`.
 * @param containerColor Background color of the FAB when enabled.
 * @param contentColor Content (icon) color of the FAB when enabled.
 * @param disabledContainerColor Background color when the FAB is disabled.
 * @param disabledContentColor Content (icon) color when the FAB is disabled.
 * @param elevation Elevation of the FAB.
 * @param iconPainter Icon to be displayed inside the FAB.
 * @param iconSize Size of the icon painter inside the FAB.
 * @param onClick Click callback for the FAB.
 */
@Composable
fun CustomFloatingActionButton(
    modifier: Modifier = Modifier,
    shape: Shape = CircleShape,
    enabled: Boolean = true,
    containerColor: Color = MaterialTheme.colorScheme.primary,
    contentColor: Color = MaterialTheme.colorScheme.onPrimary,
    disabledContainerColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f),
    disabledContentColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
    elevation: FloatingActionButtonElevation = FloatingActionButtonDefaults.elevation(),
    icon: ImageVector,
    iconSize: Dp = 24.dp,
    onClick: () -> Unit
) {
    if (enabled) {
        FloatingActionButton(
            onClick = onClick,
            modifier = modifier,
            shape = shape,
            containerColor = containerColor,
            contentColor = contentColor,
            elevation = elevation
        ) {
            Icon(
                icon,
                contentDescription = null,
                modifier = Modifier.size(iconSize),
                tint = contentColor
            )
        }
    } else {
        Box(
            modifier = modifier
                .clip(shape)
                .background(disabledContainerColor),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                icon,
                contentDescription = null,
                modifier = Modifier.size(iconSize),
                tint = disabledContentColor
            )
        }
    }
}

@Composable
fun SmallFloatingActionButton(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    containerColor: Color = MaterialTheme.colorScheme.secondary,
    contentColor: Color = MaterialTheme.colorScheme.onSecondary,
    disabledContainerColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f),
    disabledContentColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
    elevation: FloatingActionButtonElevation = FloatingActionButtonDefaults.elevation(),
    icon: ImageVector,
    iconSize: Dp = 20.dp,
    onClick: () -> Unit
) {
    CustomFloatingActionButton(
        modifier = modifier.size(40.dp),
        shape = CircleShape,
        enabled = enabled,
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor,
        elevation = elevation,
        icon = icon,
        iconSize = iconSize,
        onClick = onClick
    )
}

@Composable
fun LargeFloatingActionButton(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    containerColor: Color = MaterialTheme.colorScheme.primary,
    contentColor: Color = MaterialTheme.colorScheme.onPrimary,
    disabledContainerColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f),
    disabledContentColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
    elevation: FloatingActionButtonElevation = FloatingActionButtonDefaults.elevation(),
    icon: ImageVector,
    iconSize: Dp = 28.dp,
    onClick: () -> Unit
) {
    CustomFloatingActionButton(
        modifier = modifier.size(56.dp),
        shape = CircleShape,
        enabled = enabled,
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor,
        elevation = elevation,
        icon = icon,
        iconSize = iconSize,
        onClick = onClick
    )
}

@Composable
fun ExpandableFloatingActionButton(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    containerColor: Color = MaterialTheme.colorScheme.primary,
    contentColor: Color = MaterialTheme.colorScheme.onPrimary,
    disabledContainerColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f),
    disabledContentColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
    elevation: FloatingActionButtonElevation = FloatingActionButtonDefaults.elevation(),
    collapsedIcon: ImageVector,
    expandedIcon: ImageVector,
    iconSize: Dp = 24.dp,
    onClick: () -> Unit,
    expandedContent: @Composable ColumnScope.() -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    Box(modifier.animateContentSize()) {
        if (!expanded) {
            SmallFloatingActionButton(
                modifier = Modifier,
                onClick = {
                    onClick()
                    expanded = true
                }
            ){
                Icon(collapsedIcon, contentDescription = null)
            }
        } else {
            Column(
                modifier = Modifier,
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.End
            ) {
                expandedContent()
                SmallFloatingActionButton(
                    onClick = { expanded = false  },
                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                ){
                    Icon(imageVector = Icons.AutoMirrored.Default.ArrowBack, contentDescription = null)
                }
            }
        }
    }
}


@Composable
fun ActionButtonsSample(
    modifier: Modifier = Modifier
) {
    var isExtended by remember { mutableStateOf(false) }

    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .wrapContentSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Small Floating Action Button
            SmallFloatingActionButton(
                icon = Icons.Default.Done, // Placeholder icon
                onClick = { /* Handle click for small FAB */ }
            )

            // Large Floating Action Button
            LargeFloatingActionButton(
                icon = Icons.Default.Person, // Placeholder icon
                onClick = { /* Handle click for large FAB */ }
            )
        }

        // Expandable FAB
        ExpandableFloatingActionButton(
            modifier = Modifier.align(Alignment.BottomEnd).padding(bottom = 32.dp),
            collapsedIcon = Icons.Default.Add, // Placeholder icon
            expandedIcon = Icons.Default.Person, // Placeholder icon
            onClick = { isExtended = !isExtended },
            expandedContent = {
                SmallFloatingActionButton(onClick = {}){
                     Icon(imageVector = Icons.Default.Add, contentDescription = null)
                }
                SmallFloatingActionButton(onClick = {}){
                    Icon(imageVector = Icons.Default.Person, contentDescription = null)
                }
                SmallFloatingActionButton(onClick = {}){
                    Icon(imageVector = Icons.Default.Phone, contentDescription = null)
                }
            }
        )
    }
}