package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PaperclipSlash: ImageVector
    get() {
        if (_PaperclipSlash != null) {
            return _PaperclipSlash!!
        }
        _PaperclipSlash = ImageVector.Builder(
            name = "PaperclipSlash",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.29f, 5.64f)
                lineTo(12.472f, 4.458f)
                curveTo(13.773f, 3.156f, 15.884f, 3.156f, 17.186f, 4.458f)
                curveTo(18.487f, 5.759f, 18.487f, 7.87f, 17.186f, 9.172f)
                lineTo(16.004f, 10.354f)
                moveTo(13.647f, 7.997f)
                lineTo(14.226f, 7.418f)
                moveTo(19.828f, 11.244f)
                lineTo(18.361f, 12.711f)
                moveTo(8.465f, 8.465f)
                lineTo(5.636f, 11.293f)
                curveTo(3.684f, 13.246f, 3.684f, 16.411f, 5.636f, 18.364f)
                curveTo(7.589f, 20.317f, 10.755f, 20.317f, 12.707f, 18.364f)
                lineTo(15.536f, 15.536f)
                moveTo(10.822f, 10.822f)
                lineTo(8.004f, 13.639f)
                curveTo(7.353f, 14.29f, 7.353f, 15.345f, 8.004f, 15.996f)
                curveTo(8.655f, 16.647f, 9.71f, 16.647f, 10.361f, 15.996f)
                lineTo(13.179f, 13.179f)
                moveTo(3f, 3f)
                lineTo(21f, 21f)
            }
        }.build()

        return _PaperclipSlash!!
    }

@Suppress("ObjectPropertyName")
private var _PaperclipSlash: ImageVector? = null
