package io.github.jackbeback.klib.UI.sheet

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.detectVerticalDragGestures
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.jackbeback.klib.UI.text.DefaultText
import kotlinx.coroutines.launch

// Bottom sheet states
enum class BottomSheetState { Hidden, Collapsed, Expanded }

/**
 * A reusable and customizable Bottom Sheet component.
 *
 * @param currentState The current state of the bottom sheet (hidden, collapsed, or expanded).
 * @param onStateChange Callback when the bottom sheet state changes.
 * @param content The content to display inside the bottom sheet.
 * @param peekHeight The height of the bottom sheet when collapsed (default 80.dp).
 * @param expandedHeightFraction The fraction of the screen height to occupy when expanded (default 0.8).
 * @param backgroundColor The background color of the bottom sheet (default MaterialTheme color).
 */
@Composable
fun BottomSheet(
    currentState: BottomSheetState,
    onStateChange: (BottomSheetState) -> Unit,
    content: @Composable () -> Unit,
    peekHeight: Dp = 60.dp,
    collapsedInfoText: String = "Tap to expand",
    showCloseButton: Boolean = true,
    screenHeight: Dp,
    expandedHeightFraction: Float = 0.8f,
    backgroundColor: Color = MaterialTheme.colorScheme.surface
) {
    val coroutineScope = rememberCoroutineScope()

    // Collapsed and Expanded Heights
    val collapsedHeight = peekHeight
    val expandedHeight = screenHeight * expandedHeightFraction
    val handleHeight = 4.dp

    // Animated Offset based on current state
    val sheetOffset by animateDpAsState(
        targetValue = when (currentState) {
            BottomSheetState.Hidden -> screenHeight // Sheet moves off-screen
            BottomSheetState.Collapsed -> screenHeight - collapsedHeight
            BottomSheetState.Expanded -> screenHeight - expandedHeight
        }
    )

    Box(modifier = Modifier.fillMaxSize()) {
        // Backdrop
        if (currentState == BottomSheetState.Expanded) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.5f))
                    .pointerInput(Unit) {
                        detectTapGestures {
                            // Hide the sheet on a backdrop tap
                            onStateChange(BottomSheetState.Hidden)
                        }
                    }
            )
        }

        // Bottom Sheet Container
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = sheetOffset) // Correct placement of the sheet
                .background(backgroundColor, RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                .pointerInput(Unit) {
                    detectVerticalDragGestures { _, dragAmount ->
                        coroutineScope.launch {
                            val dragThreshold = 50.dp.toPx() // Drag threshold to decide state change
                            when {
                                dragAmount > dragThreshold && currentState == BottomSheetState.Expanded -> {
                                    onStateChange(BottomSheetState.Collapsed)
                                }

                                dragAmount < -dragThreshold && currentState == BottomSheetState.Collapsed -> {
                                    onStateChange(BottomSheetState.Expanded)
                                }

                                dragAmount > dragThreshold * 2 -> {
                                    onStateChange(BottomSheetState.Hidden)
                                }
                            }
                        }
                    }
                }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .then(
                        if (currentState == BottomSheetState.Collapsed) Modifier.clickable(
                        indication = null, // Removes ripple effect
                        interactionSource = remember { MutableInteractionSource() }, // Avoids interaction state management
                        onClick = { onStateChange(BottomSheetState.Expanded) }
                    ) else Modifier)
            ) {
                // Handle Bar
                Box(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .width(40.dp)
                        .height(handleHeight)
                        .background(Color.Gray, RoundedCornerShape(2.dp))
                )

                Spacer(modifier = Modifier.height(8.dp))
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    if (showCloseButton) {
                        Icon(Icons.Default.Close, "", modifier = Modifier.align(Alignment.TopStart).offset(y = (-8).dp).clickable { onStateChange(BottomSheetState.Hidden) })
                    }
                    if (currentState == BottomSheetState.Collapsed) {
                        DefaultText(text = collapsedInfoText, modifier = Modifier.align(Alignment.TopCenter))
                    } else {
                        // Bottom Sheet Content
                        content()
                    }
                }
            }
        }
    }
}

@Composable
fun BottomSheetSample() {
    var currentState by remember { mutableStateOf(BottomSheetState.Expanded) }

    Scaffold(
        content = { paddingValues ->
            BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
                Row(
                    modifier = Modifier
                        .padding(paddingValues)
                        .align(Alignment.Center)
                        .padding(16.dp)
                ) {
                    Button(
                        onClick = { currentState = BottomSheetState.Expanded },
                        modifier = Modifier
                    ) {
                        Text("Open")
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = { currentState = BottomSheetState.Hidden },
                        modifier = Modifier
                    ) {
                        Text("Close")
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = { currentState = BottomSheetState.Collapsed },
                        modifier = Modifier
                    ) {
                        Text("Collapse")
                    }
                }

                BottomSheet(
                    currentState = currentState,
                    onStateChange = { newState -> currentState = newState },
                    screenHeight = this.maxHeight,
                    content = {
                        DefaultText(text = "Bottom Sheet Content")
                    }
                )
            }
        }
    )
}
