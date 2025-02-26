package io.github.jackbeback.klib.UI.textfield

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.relocation.BringIntoViewRequester
import androidx.compose.foundation.relocation.bringIntoViewRequester
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusEvent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.jackbeback.klib.theme.icons.Visibility
import io.github.jackbeback.klib.theme.icons.VisibilityOff
import io.github.jackbeback.klib.theme.icons.dazzleline.AddressBook
import io.github.jackbeback.klib.theme.icons.dazzleline.ClipboardText
import io.github.jackbeback.klib.theme.icons.dazzleline.ClockLines
import io.github.jackbeback.klib.theme.icons.dazzleline.DazzleLine
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * A customizable text field for user input with Material Design styling.
 *
 * @param value The current text in the text field.
 * @param onValueChange Callback when the value changes.
 * @param modifier Modifier to style this text field.
 * @param enabled Sets whether the text field is enabled or not.
 * @param placeholder Text to be displayed when text field is empty.
 * @param isError Indicates whether the text field is in an error state.
 * @param singleLine Limits input to a single line if true.
 * @param readOnly Makes the text field non-editable while still selectable and focusable.
 * @param leadingIcon An optional leading icon.
 * @param trailingIcon An optional trailing icon.
 * @param errorText Optional error message displayed when `isError` is true.
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    placeholder: String? = null,
    isError: Boolean = false,
    singleLine: Boolean = true,
    readOnly: Boolean = false,
    leadingIcon: ImageVector? = null,
    leadIconOnClick: (() -> Unit)? = null,
    trailingIcon: ImageVector? = null,
    trailingIconOnClick: (() -> Unit)? = null,
    errorText: String? = null,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    focusRequester: FocusRequester = remember { FocusRequester() }
) {
    val bringIntoViewRequester = remember { BringIntoViewRequester() }
    val coroutineScope = rememberCoroutineScope()

    // Handles the decoration box behavior, including leading/trailing icons.
    BasicTextField(
        value = value,
        onValueChange = { onValueChange(it) },
        modifier = modifier
            .bringIntoViewRequester(bringIntoViewRequester)
            .focusRequester(focusRequester)
            .onFocusEvent {
                if (it.isFocused) {
                    coroutineScope.launch {
                        delay(200)
                        bringIntoViewRequester.bringIntoView()
                    }
                }
            }
            .padding(horizontal = 12.dp, vertical = 8.dp),
        enabled = enabled,
        readOnly = readOnly,
        singleLine = singleLine,
        visualTransformation = visualTransformation,
        textStyle = LocalTextStyle.current.copy(color = MaterialTheme.colorScheme.onSurface),
        cursorBrush = SolidColor(
            if (isError) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.primary
        ),
        decorationBox = { innerTextField ->
            OutlinedTextFieldContainer(
                innerTextField = innerTextField,
                isError = isError,
                placeholder = placeholder,
                leadingIcon = leadingIcon,
                leadingIconOnClick = leadIconOnClick,
                trailingIcon = trailingIcon,
                trailingIconOnClick = trailingIconOnClick,
                errorText = errorText
            )
        }
    )
}

@Composable
private fun OutlinedTextFieldContainer(
    innerTextField: @Composable () -> Unit,
    isError: Boolean,
    placeholder: String?,
    cornerRadius: Dp = 8.dp,
    borderThickness: Dp = 1.dp,
    leadingIcon: ImageVector?,
    leadingIconOnClick: (() -> Unit)?,
    trailingIcon: ImageVector?,
    trailingIconOnClick: (() -> Unit)?,
    errorText: String?
) {
    val borderColor = if (isError) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.outline
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(cornerRadius))
                .border(borderThickness, borderColor, RoundedCornerShape(cornerRadius))
                .background(MaterialTheme.colorScheme.surface)
                .padding(horizontal = 8.dp, vertical = 8.dp)
        ) {
            // Leading Icon (if available)
            if (leadingIcon != null) {
                Box(Modifier.padding(end = 8.dp)) {
                    Icon(
                        leadingIcon,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier.size(18.dp).clickable { leadingIconOnClick?.invoke() }
                    )
                }
            }
            // Placeholder or text input
            Box(modifier = Modifier.weight(1f)) {
                if (placeholder != null) {
                    Text(
                        text = placeholder,
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f),
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
                innerTextField()
            }
            // Trailing Icon (if available)
            if (trailingIcon != null) {
                Box(Modifier.padding(start = 8.dp)) {
                    Icon(
                        trailingIcon,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier.size(18.dp).clickable { trailingIconOnClick?.invoke() }
                    )
                }
            }
        }

        // Error Text (if in error state)
        if (isError && !errorText.isNullOrEmpty()) {
            Text(
                text = errorText,
                color = MaterialTheme.colorScheme.error,
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(top = 4.dp, start = 12.dp)
            )
        }
    }
}

@Composable
fun PasswordOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    placeholder: String? = null,
    isError: Boolean = false,
    singleLine: Boolean = true,
    readOnly: Boolean = false,
    leadingIcon: ImageVector? = null,
    errorText: String? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    focusRequester: FocusRequester = remember { FocusRequester() }
) {
    var passwordVisible by rememberSaveable { mutableStateOf(false) }

    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        placeholder = placeholder,
        isError = isError,
        singleLine = singleLine,
        readOnly = readOnly,
        leadingIcon = leadingIcon,
        trailingIcon = if (passwordVisible) Visibility else VisibilityOff,
        trailingIconOnClick = { passwordVisible = !passwordVisible },
        errorText = errorText,
        interactionSource = interactionSource,
        focusRequester = focusRequester,
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation()
    )
}


@Composable
fun OutlinedTextFieldSample() {
    var text1 by rememberSaveable { mutableStateOf("") }
    var text2 by rememberSaveable { mutableStateOf("") }

    var isError by rememberSaveable { mutableStateOf(false) }

    val maxTextLength = 10

    Column(verticalArrangement = Arrangement.spacedBy(20.dp)) {
        OutlinedTextField(
            value = text1,
            onValueChange = { value ->
                //This is for Error Testing: The error will be shown when Text is longer than 10
                isError = value.length > maxTextLength
                text1 = value
            },
            trailingIcon = DazzleLine.AddressBook,
            leadingIcon = null,
            singleLine = false,
            modifier = Modifier,
            errorText = "Error Testing: Error Mark will be shown when Text is longer than $maxTextLength",
            isError = isError,
            enabled = true,
        )

        PasswordOutlinedTextField(
            value = text2,
            onValueChange = { value ->
                //This is for Error Testing: The error will be shown when Text is longer than 10
                isError = value.length > maxTextLength
                text2 = value
            },
            singleLine = false,
            modifier = Modifier,
            errorText = "Error Testing: Error Mark will be shown when Text is longer than $maxTextLength",
            isError = isError,
            enabled = true,
        )
    }

}