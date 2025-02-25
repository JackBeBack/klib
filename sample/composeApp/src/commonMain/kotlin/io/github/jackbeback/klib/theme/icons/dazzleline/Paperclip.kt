package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Paperclip: ImageVector
    get() {
        if (_Paperclip != null) {
            return _Paperclip!!
        }
        _Paperclip = ImageVector.Builder(
            name = "Paperclip",
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
                moveTo(19.828f, 11.244f)
                lineTo(12.707f, 18.364f)
                curveTo(10.755f, 20.317f, 7.589f, 20.317f, 5.636f, 18.364f)
                curveTo(3.684f, 16.411f, 3.684f, 13.246f, 5.636f, 11.293f)
                lineTo(12.472f, 4.458f)
                curveTo(13.774f, 3.156f, 15.884f, 3.156f, 17.186f, 4.458f)
                curveTo(18.487f, 5.759f, 18.487f, 7.87f, 17.186f, 9.172f)
                lineTo(10.361f, 15.996f)
                curveTo(9.71f, 16.647f, 8.655f, 16.647f, 8.004f, 15.996f)
                curveTo(7.353f, 15.345f, 7.353f, 14.29f, 8.004f, 13.639f)
                lineTo(14.226f, 7.418f)
            }
        }.build()

        return _Paperclip!!
    }

@Suppress("ObjectPropertyName")
private var _Paperclip: ImageVector? = null
