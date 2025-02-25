package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SendAlt1: ImageVector
    get() {
        if (_SendAlt1 != null) {
            return _SendAlt1!!
        }
        _SendAlt1 = ImageVector.Builder(
            name = "SendAlt1",
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
                moveTo(11.5f, 12f)
                horizontalLineTo(5.419f)
                moveTo(5.246f, 12.797f)
                lineTo(4.242f, 15.799f)
                curveTo(3.691f, 17.442f, 3.416f, 18.264f, 3.614f, 18.77f)
                curveTo(3.785f, 19.21f, 4.153f, 19.543f, 4.608f, 19.67f)
                curveTo(5.131f, 19.816f, 5.922f, 19.46f, 7.502f, 18.749f)
                lineTo(17.637f, 14.189f)
                curveTo(19.18f, 13.494f, 19.951f, 13.147f, 20.19f, 12.665f)
                curveTo(20.397f, 12.246f, 20.397f, 11.754f, 20.19f, 11.335f)
                curveTo(19.951f, 10.853f, 19.18f, 10.506f, 17.637f, 9.811f)
                lineTo(7.485f, 5.243f)
                curveTo(5.909f, 4.534f, 5.121f, 4.179f, 4.598f, 4.325f)
                curveTo(4.144f, 4.451f, 3.776f, 4.783f, 3.604f, 5.222f)
                curveTo(3.406f, 5.727f, 3.678f, 6.547f, 4.222f, 8.188f)
                lineTo(5.248f, 11.279f)
                curveTo(5.342f, 11.561f, 5.389f, 11.702f, 5.407f, 11.846f)
                curveTo(5.423f, 11.974f, 5.423f, 12.103f, 5.407f, 12.231f)
                curveTo(5.388f, 12.375f, 5.341f, 12.516f, 5.246f, 12.797f)
                close()
            }
        }.build()

        return _SendAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _SendAlt1: ImageVector? = null
