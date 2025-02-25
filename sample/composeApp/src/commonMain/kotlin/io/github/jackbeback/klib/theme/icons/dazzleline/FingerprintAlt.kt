package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FingerprintAlt: ImageVector
    get() {
        if (_FingerprintAlt != null) {
            return _FingerprintAlt!!
        }
        _FingerprintAlt = ImageVector.Builder(
            name = "FingerprintAlt",
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
                moveTo(13.143f, 21f)
                curveTo(10.808f, 19.544f, 9.253f, 16.952f, 9.253f, 13.997f)
                curveTo(9.253f, 12.478f, 10.483f, 11.248f, 12.001f, 11.248f)
                curveTo(13.518f, 11.248f, 14.749f, 12.478f, 14.749f, 13.997f)
                curveTo(14.749f, 15.515f, 15.98f, 16.746f, 17.497f, 16.746f)
                curveTo(19.015f, 16.746f, 20.246f, 15.515f, 20.246f, 13.997f)
                curveTo(20.246f, 9.441f, 16.554f, 5.749f, 12.002f, 5.749f)
                curveTo(7.449f, 5.749f, 3.758f, 9.441f, 3.758f, 13.997f)
                curveTo(3.758f, 15.012f, 3.871f, 16.001f, 4.08f, 16.954f)
                moveTo(8.49f, 20.299f)
                curveTo(7.239f, 18.514f, 6.504f, 16.342f, 6.504f, 13.997f)
                curveTo(6.504f, 10.96f, 8.964f, 8.498f, 11.999f, 8.498f)
                curveTo(15.034f, 8.498f, 17.495f, 10.96f, 17.495f, 13.997f)
                moveTo(17.793f, 19.481f)
                curveTo(17.694f, 19.486f, 17.597f, 19.495f, 17.497f, 19.495f)
                curveTo(14.462f, 19.495f, 12.001f, 17.034f, 12.001f, 13.997f)
                moveTo(19.673f, 6.477f)
                curveTo(17.799f, 4.348f, 15.059f, 3f, 12f, 3f)
                curveTo(8.941f, 3f, 6.201f, 4.348f, 4.327f, 6.477f)
            }
        }.build()

        return _FingerprintAlt!!
    }

@Suppress("ObjectPropertyName")
private var _FingerprintAlt: ImageVector? = null
