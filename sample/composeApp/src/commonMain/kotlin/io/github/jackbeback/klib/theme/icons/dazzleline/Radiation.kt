package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Radiation: ImageVector
    get() {
        if (_Radiation != null) {
            return _Radiation!!
        }
        _Radiation = ImageVector.Builder(
            name = "Radiation",
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
                moveTo(17.144f, 2.803f)
                curveTo(20.052f, 4.552f, 22f, 7.735f, 22f, 11.376f)
                horizontalLineTo(16f)
                curveTo(16f, 9.92f, 15.218f, 8.65f, 14.055f, 7.95f)
                lineTo(17.144f, 2.802f)
                moveTo(2f, 11.376f)
                curveTo(4.344f, 11.38f, 5.657f, 11.381f, 8f, 11.376f)
                curveTo(8f, 9.921f, 8.778f, 8.647f, 9.94f, 7.947f)
                lineTo(6.855f, 2.803f)
                curveTo(3.947f, 4.552f, 2f, 7.736f, 2f, 11.376f)
                close()
                moveTo(13f, 11.376f)
                curveTo(13f, 11.929f, 12.552f, 12.376f, 12f, 12.376f)
                curveTo(11.448f, 12.376f, 11f, 11.929f, 11f, 11.376f)
                curveTo(11f, 10.824f, 11.448f, 10.376f, 12f, 10.376f)
                curveTo(12.552f, 10.376f, 13f, 10.824f, 13f, 11.376f)
                close()
                moveTo(17.145f, 19.953f)
                curveTo(15.642f, 20.857f, 13.882f, 21.376f, 12f, 21.376f)
                curveTo(10.119f, 21.376f, 8.359f, 20.857f, 6.855f, 19.953f)
                lineTo(9.941f, 14.811f)
                curveTo(10.542f, 15.172f, 11.247f, 15.376f, 11.999f, 15.376f)
                curveTo(12.753f, 15.376f, 13.458f, 15.168f, 14.06f, 14.805f)
                lineTo(17.145f, 19.953f)
                close()
            }
        }.build()

        return _Radiation!!
    }

@Suppress("ObjectPropertyName")
private var _Radiation: ImageVector? = null
