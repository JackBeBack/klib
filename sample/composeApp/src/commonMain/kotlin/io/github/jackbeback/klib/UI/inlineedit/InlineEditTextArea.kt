package io.github.jackbeback.klib.UI.inlineedit

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.focus.focusRequester

/**
 * A generic Inline Edit Text Area for in-place text editing.
 *
 * @param modifier The [Modifier] to be applied to this [InlineEditTextArea].
 * @param enabled Controls whether interaction with the component is possible.
 * @param text The input text to display in the text area.
 * @param maxTextLength Maximum length of the input text (optional).
 * @param editTextAreaDialogTitle The dialog title for the editor.
 * @param collapsedMaxLine Maximum lines before text area collapses.
 * @param onDeleteTextIconClick Called when the delete text option/icon is clicked.
 * @param placeHolderText Placeholder text when the input is empty.
 * @param supportingText Supporting/help text displayed below the text field.
 * @param errorText Error text to display when validation fails.
 * @param isError Indicates if the current value has errors.
 * @param onExpandableTextClicked Callback when the expandable text is clicked.
 * @param onExpandStateChange Callback when the expand state changes.
 * @param onCancelButtonClick Called when the cancel action is triggered.
 * @param onSaveButtonClick Called when the save action is triggered.
 * @param enableLinks Enables clickable links in the text area.
 */
@Composable
fun InlineEditTextArea(
    modifier: Modifier = Modifier,
    text: String = "",
    maxTextLength: Int? = null,
    editTextAreaDialogTitle: String,
    collapsedMaxLine: Int = 3,
    onDeleteTextIconClick: (() -> Unit)? = null,
    placeHolderText: String? = null,
    supportingText: String? = null,
    errorText: String? = null,
    isError: Boolean = false,
    readOnly: Boolean = false,
    enabled: Boolean = true,
    onExpandableTextClicked: (() -> Unit)? = null,
    onExpandStateChange: ((isExpanded: Boolean) -> Unit)? = null,
    onCancelButtonClick: (newText: String) -> Unit,
    onSaveButtonClick: (newText: String) -> Unit,
    enableLinks: Boolean = false
) {
    var oldText by rememberSaveable { mutableStateOf(text) }
    var newText by rememberSaveable { mutableStateOf(text) }
    var isEditMode by rememberSaveable { mutableStateOf(false) }

    Column(modifier = modifier) {
        if (isEditMode || isError) {
            val focusRequester = remember { FocusRequester() }
            var enableAutoSave by remember { mutableStateOf(false) }

            OutlinedTextField(
                value = newText,
                onValueChange = { newText = it },
                enabled = enabled,
                modifier = Modifier.padding(8.dp).focusRequester(focusRequester),
                singleLine = false,
                maxLines = collapsedMaxLine,
                placeholder = { Text(placeHolderText ?: "") },
                supportingText = {
                    if (!isError) Text(supportingText ?: "", style = TextStyle(color = Color.Gray))
                },
                isError = isError,
                trailingIcon = {
                    if (isError) Text(errorText ?: "", style = TextStyle(color = Color.Red))
                }
            )

            LaunchedEffect(Unit) { focusRequester.requestFocus() }

            Row(
                modifier = Modifier
                    .height(30.dp)
                    .wrapContentWidth()
            ) {
                Button(
                    onClick = {
                        isEditMode = false
                        newText = oldText
                        onCancelButtonClick(newText)
                    },
                    colors = ButtonDefaults.buttonColors(contentColor = Color.Gray)
                ) {
                    Text("Cancel")
                }

                Spacer(modifier = Modifier.width(8.dp))

                Button(
                    onClick = {
                        isEditMode = false
                        onSaveButtonClick(newText)
                    },
                    colors = ButtonDefaults.buttonColors(contentColor = Color.Blue)
                ) {
                    Text("Save")
                }
            }

            LaunchedEffect(Unit) {
                enableAutoSave = true
            }
        } else {
            val showPlaceholder = text.isEmpty()
            Text(
                text = if (showPlaceholder) placeHolderText.orEmpty() else text,
                modifier = Modifier.padding(8.dp).clickable { isEditMode = true },
                color = if (showPlaceholder) Color.Gray else Color.Black
            )
        }
    }
}

@Composable
fun InlineEditTextAreaSample() {
    var text by rememberSaveable { mutableStateOf("Sample Text") }
    var isError by rememberSaveable { mutableStateOf(false) }

    Column(Modifier.padding(16.dp)) {
        InlineEditTextArea(
            text = text,
            editTextAreaDialogTitle = "Edit Text",
            placeHolderText = "Enter your text here",
            errorText = if (isError) "Error: Invalid input" else null,
            isError = isError,
            onCancelButtonClick = { /* Logic for cancel */ },
            onSaveButtonClick = {
                if (it.contains("?")) {
                    isError = true
                } else {
                    isError = false
                    text = it
                }
            },
        )
    }
}