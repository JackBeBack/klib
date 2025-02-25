package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Thunderstorm: ImageVector
    get() {
        if (_Thunderstorm != null) {
            return _Thunderstorm!!
        }
        _Thunderstorm = ImageVector.Builder(
            name = "Thunderstorm",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.414f, 1.09f)
                curveTo(13.917f, 1.318f, 14.139f, 1.911f, 13.91f, 2.414f)
                lineTo(9.768f, 11.527f)
                lineTo(15.757f, 10.03f)
                curveTo(16.13f, 9.937f, 16.523f, 10.065f, 16.768f, 10.36f)
                curveTo(17.014f, 10.655f, 17.069f, 11.064f, 16.91f, 11.414f)
                lineTo(11.91f, 22.414f)
                curveTo(11.682f, 22.917f, 11.089f, 23.139f, 10.586f, 22.91f)
                curveTo(10.083f, 22.682f, 9.861f, 22.089f, 10.09f, 21.586f)
                lineTo(14.232f, 12.473f)
                lineTo(8.243f, 13.97f)
                curveTo(7.87f, 14.063f, 7.477f, 13.935f, 7.232f, 13.64f)
                curveTo(6.986f, 13.345f, 6.931f, 12.936f, 7.09f, 12.586f)
                lineTo(12.09f, 1.586f)
                curveTo(12.318f, 1.083f, 12.911f, 0.861f, 13.414f, 1.09f)
                close()
            }
        }.build()

        return _Thunderstorm!!
    }

@Suppress("ObjectPropertyName")
private var _Thunderstorm: ImageVector? = null
