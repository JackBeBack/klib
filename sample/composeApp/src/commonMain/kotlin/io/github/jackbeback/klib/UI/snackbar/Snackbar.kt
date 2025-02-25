package io.github.jackbeback.klib.UI.snackbar

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.jackbeback.klib.UI.text.DefaultText
import kotlinx.coroutines.launch

// A utility function to display a snackbar with options for action and dismissal buttons
@Composable
fun CustomSnackbar(
    snackbarData: SnackbarData,
    modifier: Modifier = Modifier,
    buttonBelow: Boolean = false,
) {
    // Using Material3 Snackbar with options for dismiss and action buttons
    Snackbar(
        modifier = modifier
            .widthIn(max = 550.dp) // Limit the snackbar width for better UX
            .padding(12.dp), // Add padding around the snackbar
        actionOnNewLine = buttonBelow, // Determines whether buttons are on a new line or inline
        containerColor = MaterialTheme.colorScheme.surface, // Custom container color
        action = if (snackbarData.visuals.actionLabel != null) {
            {
                SnackbarActionButton(snackbarData)
            }
        } else null,
        dismissAction = if (snackbarData.visuals.withDismissAction) {
            {
                SnackbarDismissButton {
                    snackbarData.dismiss()
                }
            }
        } else null
    ) {
        SnackbarText(snackbarData, buttonBelow)
    }
}

// Handles the text message inside the snackbar
@Composable
private fun SnackbarText(snackbarData: SnackbarData, buttonBelow: Boolean) {
    DefaultText(
        text = snackbarData.visuals.message, // Message within the snackbar
        maxLines = if (buttonBelow) 3 else 2, // Max lines vary based on `buttonBelow`
        overflow = TextOverflow.Ellipsis // Ensure text that overflows is truncated
    )
}

// A button for the action inside the snackbar
@Composable
private fun SnackbarActionButton(snackbarData: SnackbarData) {
    TextButton(
        onClick = { snackbarData.performAction() } // Perform the snackbar action
    ) {
        Text(text = snackbarData.visuals.actionLabel ?: "") // Display the action label
    }
}

// A dismiss button for the snackbar
@Composable
private fun SnackbarDismissButton(dismiss: () -> Unit) {
    IconButton(onClick = dismiss) { // On click, call the provided dismiss function
        Icon(Icons.Default.Delete, contentDescription = "Dismiss") // Replace with a generic icon
    }
}


@Composable
fun CustomSnackbarSample() {
    // Local state variables for toggling different snackbar behaviors
    var withDismissAction by rememberSaveable { mutableStateOf(false) }
    var withAction by rememberSaveable { mutableStateOf(false) }
    var buttonBelow by rememberSaveable { mutableStateOf(false) }
    var textToShow by rememberSaveable { mutableStateOf("No action yet") }

    val scope = rememberCoroutineScope()
    val snackbarHostState = SnackbarHostState()

    Scaffold(
        snackbarHost = {
            SnackbarHost(snackbarHostState) { snackbarData ->
                CustomSnackbar(snackbarData, Modifier, buttonBelow)
            }
        },
        modifier = Modifier.fillMaxSize() // Fill the screen
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState()) // Enable vertical scrolling
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom, // Position content at the bottom
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = textToShow, // Current action status
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(vertical = 50.dp),
                style = MaterialTheme.typography.headlineMedium
            )

            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(onClick = {
                    scope.launch {
                        val result = snackbarHostState.showSnackbar(
                            message = "This is a short snackbar message",
                            actionLabel = if (withAction) "Action" else null,
                            duration = SnackbarDuration.Short, // Short duration
                            withDismissAction = withDismissAction
                        )
                        textToShow = when (result) {
                            SnackbarResult.ActionPerformed -> "Action Performed"
                            SnackbarResult.Dismissed -> "Dismissed"
                        }
                    }
                }) {
                    DefaultText("Short Snackbar")
                }

                Button(onClick = {
                    scope.launch {
                        val result = snackbarHostState.showSnackbar(
                            message = "This is a very long snackbar message that might need extra space to be fully displayed. " +
                                    "Let's ensure it's properly truncated after reaching its limit.",
                            actionLabel = if (withAction) "Action" else null,
                            duration = SnackbarDuration.Long, // Long duration
                            withDismissAction = withDismissAction
                        )
                        textToShow = when (result) {
                            SnackbarResult.ActionPerformed -> "Action Performed"
                            SnackbarResult.Dismissed -> "Dismissed"
                        }
                    }
                }) {
                    DefaultText("Long Snackbar")
                }
            }

            Column(modifier = Modifier.width(200.dp)) {
                // Toggle button for "Action" functionality
                SettingRow("With action:", withAction) { withAction = it }
                // Toggle button for "Dismiss action"
                SettingRow("With dismiss action:", withDismissAction) { withDismissAction = it }
                // Toggle button for showing buttons below the message
                SettingRow("Buttons below:", buttonBelow) { buttonBelow = it }
            }
        }
    }
}

// A row with a toggle switch for settings
@Composable
fun SettingRow(label: String, checked: Boolean, onCheckedChange: (Boolean) -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        DefaultText(text = label)
        Switch(checked = checked, onCheckedChange = onCheckedChange)
    }
}