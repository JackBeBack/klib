package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PaintbrushAlt: ImageVector
    get() {
        if (_PaintbrushAlt != null) {
            return _PaintbrushAlt!!
        }
        _PaintbrushAlt = ImageVector.Builder(
            name = "PaintbrushAlt",
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
                moveTo(11.5f, 10.5f)
                lineTo(14.5f, 13.5f)
                moveTo(21.5f, 6.5f)
                lineTo(12.469f, 15.531f)
                curveTo(11.64f, 16.36f, 10.297f, 16.36f, 9.469f, 15.531f)
                curveTo(8.64f, 14.703f, 8.64f, 13.36f, 9.469f, 12.531f)
                lineTo(18.5f, 3.5f)
                curveTo(19.328f, 2.672f, 20.671f, 2.672f, 21.5f, 3.5f)
                curveTo(22.328f, 4.328f, 22.328f, 5.672f, 21.5f, 6.5f)
                close()
                moveTo(10.34f, 17.75f)
                curveTo(10.34f, 19.545f, 8.885f, 21f, 7.09f, 21f)
                horizontalLineTo(2.5f)
                lineTo(2.71f, 20.895f)
                curveTo(3.746f, 20.377f, 4.263f, 19.191f, 3.937f, 18.08f)
                curveTo(3.872f, 17.861f, 3.834f, 17.633f, 3.858f, 17.407f)
                curveTo(4.029f, 15.773f, 5.411f, 14.5f, 7.09f, 14.5f)
                curveTo(8.885f, 14.5f, 10.34f, 15.955f, 10.34f, 17.75f)
                close()
            }
        }.build()

        return _PaintbrushAlt!!
    }

@Suppress("ObjectPropertyName")
private var _PaintbrushAlt: ImageVector? = null
