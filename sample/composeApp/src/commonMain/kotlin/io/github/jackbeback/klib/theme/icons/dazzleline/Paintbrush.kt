package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Paintbrush: ImageVector
    get() {
        if (_Paintbrush != null) {
            return _Paintbrush!!
        }
        _Paintbrush = ImageVector.Builder(
            name = "Paintbrush",
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
                moveTo(11.793f, 10.793f)
                lineTo(20.46f, 3.457f)
                curveTo(20.765f, 3.199f, 21.217f, 3.217f, 21.5f, 3.5f)
                curveTo(21.783f, 3.783f, 21.801f, 4.235f, 21.543f, 4.54f)
                lineTo(14.207f, 13.206f)
                moveTo(11.793f, 10.793f)
                lineTo(9.588f, 12.66f)
                curveTo(8.716f, 13.398f, 8.661f, 14.724f, 9.469f, 15.531f)
                curveTo(10.276f, 16.339f, 11.601f, 16.284f, 12.339f, 15.412f)
                lineTo(14.207f, 13.206f)
                moveTo(11.793f, 10.793f)
                lineTo(14.207f, 13.206f)
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

        return _Paintbrush!!
    }

@Suppress("ObjectPropertyName")
private var _Paintbrush: ImageVector? = null
