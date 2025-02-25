package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CursorAlt: ImageVector
    get() {
        if (_CursorAlt != null) {
            return _CursorAlt!!
        }
        _CursorAlt = ImageVector.Builder(
            name = "CursorAlt",
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
                moveTo(17.261f, 12.401f)
                curveTo(19.377f, 11.263f, 20.436f, 10.693f, 20.704f, 10.008f)
                curveTo(20.936f, 9.414f, 20.871f, 8.744f, 20.528f, 8.206f)
                curveTo(20.132f, 7.586f, 18.984f, 7.232f, 16.687f, 6.524f)
                lineTo(8.006f, 3.85f)
                curveTo(6.068f, 3.253f, 5.099f, 2.955f, 4.458f, 3.197f)
                curveTo(3.901f, 3.407f, 3.466f, 3.856f, 3.273f, 4.42f)
                curveTo(3.051f, 5.068f, 3.38f, 6.027f, 4.037f, 7.945f)
                lineTo(6.948f, 16.443f)
                curveTo(7.756f, 18.802f, 8.161f, 19.982f, 8.805f, 20.357f)
                curveTo(9.364f, 20.683f, 10.046f, 20.717f, 10.635f, 20.451f)
                curveTo(11.315f, 20.143f, 11.837f, 19.011f, 12.881f, 16.745f)
                lineTo(13.653f, 15.072f)
                curveTo(13.819f, 14.711f, 13.902f, 14.531f, 14.016f, 14.374f)
                curveTo(14.117f, 14.234f, 14.235f, 14.108f, 14.369f, 13.998f)
                curveTo(14.519f, 13.875f, 14.694f, 13.781f, 15.043f, 13.593f)
                lineTo(17.261f, 12.401f)
                close()
            }
        }.build()

        return _CursorAlt!!
    }

@Suppress("ObjectPropertyName")
private var _CursorAlt: ImageVector? = null
