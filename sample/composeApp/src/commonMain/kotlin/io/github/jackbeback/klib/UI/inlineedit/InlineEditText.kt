package io.github.jackbeback.klib.UI.inlineedit

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.jackbeback.klib.UI.text.TextProperties
import io.github.jackbeback.klib.composeapp.generated.resources.Res
import io.github.jackbeback.klib.composeapp.generated.resources.ic_light_mode
import org.jetbrains.compose.resources.painterResource

/**
 * Contains the default values used by [InlineEditText].
 */
object InlineEditTextDefaults {
    val MinWidth = 120.dp
    val MinHeight = 56.dp
    val ButtonContentPaddingHorizontalSize = 3.dp
    val ButtonsSpaceSize = 5.dp
    const val CollapsedMaxLine = 3

    @Composable
    fun getPlaceHolderTextProperties(
        text: String,
        textStyle: TextStyle = TextStyle(), // Use default TextStyle
        textColor: Color = Color.Gray, // Neutral color
        disabledTextColor: Color = Color.LightGray
    ) = TextProperties(
        text = text ?: "",
        textStyle = textStyle,
        isEnabled = true,
        overflow = TextOverflow.Ellipsis,
        maxLines = 1,
        iconColor = Color.Red
    )

    @Composable
    fun getInnerSupportingTextProperties(
        text: String? = null,
        textStyle: TextStyle = TextStyle(), // Default TextStyle
    ) = TextProperties(
        text = text ?: "",
        textStyle = textStyle,
        isEnabled = true,
        overflow = TextOverflow.Ellipsis,
        maxLines = 4,
        iconColor = Color.Red
    )

    @Composable
    fun getSupportingTextProperties(
        text: String? = null,
        textStyle: TextStyle = TextStyle(), // Default TextStyle
        textColor: Color = Color.Gray,
        disabledTextColor: Color = Color.LightGray
    ) = TextProperties(
        text = text ?: "",
        textStyle = textStyle,
        isEnabled = true,
        overflow = TextOverflow.Ellipsis,
        maxLines = 1,
        iconColor = Color.Red
    )

    @Composable
    fun getErrorTextProperties(
        text: String? = null,
        textStyle: TextStyle = TextStyle(), // Default style for small text
        textColor: Color = Color.Red, // Error color
        disabledTextColor: Color = Color.LightGray
    ) = TextProperties(
        text = text ?: "",
        textStyle = textStyle,
        isEnabled = true,
        overflow = TextOverflow.Ellipsis,
        maxLines = 1,
        iconColor = Color.Red
    )

    @Composable
    fun getErrorIconProperties(
        onIconClick: (() -> Unit)? = null,
        iconPainter: Painter = painterResource(Res.drawable.ic_light_mode), // Use your app drawable
        iconColor: Color = Color.Red,
        disabledIconColor: Color = Color.LightGray
    ) = IconProperties(
        onIconClick = onIconClick,
        iconPainter = iconPainter,
        iconColor = iconColor,
        disabledIconColor = disabledIconColor
    )

    @Composable
    fun getEditTextIconProperties(
        iconPainter: Painter = painterResource(Res.drawable.ic_light_mode), // Use generic edit icon
        iconColor: Color = Color.Gray,
        disabledIconColor: Color = Color.LightGray
    ) = IconProperties(
        iconPainter = iconPainter,
        iconColor = iconColor,
        disabledIconColor = disabledIconColor
    )

    @Composable
    fun getDeleteTextIconProperties(
        iconPainter: Painter = painterResource(Res.drawable.ic_light_mode), // Use generic cancel icon
        iconColor: Color = Color.Gray,
        disabledIconColor: Color = Color.LightGray
    ) = IconProperties(
        iconPainter = iconPainter,
        iconColor = iconColor,
        disabledIconColor = disabledIconColor
    )

    @Composable
    fun getTextFieldProperties(
        isError: Boolean = false,
        textStyle: TextStyle = TextStyle(), // Default TextStyle
        minWidth: Dp = MinWidth,
        minHeight: Dp = MinHeight,
        readOnly: Boolean = false,
        visualTransformation: VisualTransformation = VisualTransformation.None,
        keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        singleLine: Boolean = false,
        maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
        minLines: Int = 1,
        shape: Shape = androidx.compose.foundation.shape.CircleShape, // Example shape
        textColor: Color = Color.Black,
        disabledTextColor: Color = Color.LightGray,
        cursorColor: Color = Color.Blue,
        errorCursorColor: Color = Color.Red,
        focusedBorderColor: Color = Color.Blue,
        unfocusedBorderColor: Color = Color.Gray,
        disabledBorderColor: Color = Color.LightGray,
        errorBorderColor: Color = Color.Red
    ) = TextFieldProperties(
        isError = isError,
        textStyle = textStyle,
        minWidth = minWidth,
        minHeight = minHeight,
        readOnly = readOnly,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        singleLine = singleLine,
        maxLines = maxLines,
        minLines = minLines,
        shape = shape,
        textColor = textColor,
        disabledTextColor = disabledTextColor,
        cursorColor = cursorColor,
        errorCursorColor = errorCursorColor,
        focusedBorderColor = focusedBorderColor,
        unfocusedBorderColor = unfocusedBorderColor,
        disabledBorderColor = disabledBorderColor,
        errorBorderColor = errorBorderColor,
        backgroundColor = Color.Transparent,
        maxWidth = 10.dp,
        maxHeight = 10.dp,
    )
}

/**
 * Inline edit component for in-place text editing.
 *
 * @param modifier the [Modifier] to be applied to this [InlineEditText].
 * @param enabled whether this component is enabled.
 * @param text the text shown in this component.
 * @param... (other generic parameters for text, error, cancel/save handling)
 */
@Composable
fun InlineEditText(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    text: String = "",
    collapsedMaxLine: Int = InlineEditTextDefaults.CollapsedMaxLine,
    onSaveButtonClick: (String) -> Unit
) {
    var isEditMode by rememberSaveable { mutableStateOf(false) }
    var newText by rememberSaveable { mutableStateOf(text) }

    Column(modifier = modifier.padding(8.dp)) {
        if (isEditMode) {
            OutlinedTextField(
                value = newText,
                onValueChange = { newText = it },
                modifier = Modifier.padding(8.dp),
                enabled = enabled,
                maxLines = collapsedMaxLine,
                trailingIcon = {
                    Icon(Icons.Default.Done, "", modifier = Modifier.clickable {
                        isEditMode = false
                        onSaveButtonClick(newText)
                    })
                },
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
                keyboardActions = KeyboardActions(onDone = {
                    isEditMode = false
                    onSaveButtonClick(newText)
                })
            )
        } else {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = if (text.isEmpty()) "Click to edit" else text,
                    modifier = Modifier.padding(8.dp).clickable { isEditMode = true },
                )
                Icon(Icons.Default.Edit, "", modifier = Modifier.clickable {
                    isEditMode = true
                })
            }
        }
    }
}

@Immutable
class TextFieldProperties(
    var isError: Boolean = false,
    var textStyle: TextStyle,
    var minWidth: Dp,
    var minHeight: Dp,
    var maxWidth: Dp,
    var maxHeight: Dp,
    var readOnly: Boolean,
    var visualTransformation: VisualTransformation,
    var keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    var keyboardActions: KeyboardActions = KeyboardActions.Default,
    var singleLine: Boolean = false,
    var maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    var minLines: Int = 1,
    var shape: Shape = CircleShape,
    var textColor: Color,
    var disabledTextColor: Color,
    var cursorColor: Color,
    var errorCursorColor: Color,
    var focusedBorderColor: Color,
    var unfocusedBorderColor: Color,
    var disabledBorderColor: Color,
    var errorBorderColor: Color,
    var backgroundColor: Color
)


@Immutable
class IconProperties(
    val onIconClick: (() -> Unit)? = null,
    val iconPainter: Painter,
    val iconColor: Color,
    val disabledIconColor: Color,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IconProperties) return false

        if (onIconClick != other.onIconClick) return false
        if (iconPainter != other.iconPainter) return false
        if (iconColor != other.iconColor) return false
        return disabledIconColor == other.disabledIconColor
    }

    override fun hashCode(): Int {
        var result = onIconClick.hashCode()
        result = 31 * result + iconPainter.hashCode()
        result = 31 * result + iconColor.hashCode()
        result = 31 * result + disabledIconColor.hashCode()
        return result
    }
}

@Composable
fun InlineEditTextSample() {
    var text by rememberSaveable { mutableStateOf("") }
    InlineEditText(
        modifier = Modifier,
        enabled = true,
        text = text,
        collapsedMaxLine = InlineEditTextDefaults.CollapsedMaxLine,
        onSaveButtonClick = { text = it }
    )
}