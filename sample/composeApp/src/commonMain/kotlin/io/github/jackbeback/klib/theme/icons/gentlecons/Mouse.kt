package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Mouse: ImageVector
    get() {
        if (_Mouse != null) {
            return _Mouse!!
        }
        _Mouse = ImageVector.Builder(
            name = "Mouse",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 1f)
                curveTo(8.661f, 1f, 6.83f, 2.424f, 5.893f, 3.986f)
                curveTo(5.443f, 4.734f, 5.223f, 5.475f, 5.113f, 6.023f)
                curveTo(5.049f, 6.343f, 5.001f, 6.67f, 5f, 6.997f)
                lineTo(5f, 17.001f)
                curveTo(5.001f, 17.328f, 5.049f, 17.658f, 5.113f, 17.977f)
                curveTo(5.223f, 18.525f, 5.443f, 19.266f, 5.893f, 20.014f)
                curveTo(6.83f, 21.576f, 8.661f, 23f, 12f, 23f)
                curveTo(15.339f, 23f, 17.17f, 21.576f, 18.108f, 20.014f)
                curveTo(18.557f, 19.266f, 18.777f, 18.525f, 18.887f, 17.977f)
                curveTo(18.951f, 17.656f, 19f, 17.323f, 19f, 16.995f)
                lineTo(19f, 6.994f)
                curveTo(18.998f, 6.668f, 18.951f, 6.342f, 18.887f, 6.023f)
                curveTo(18.777f, 5.475f, 18.557f, 4.734f, 18.108f, 3.986f)
                curveTo(17.17f, 2.424f, 15.339f, 1f, 12f, 1f)
                close()
                moveTo(7f, 9f)
                verticalLineTo(7.005f)
                curveTo(7.006f, 6.807f, 7.036f, 6.609f, 7.074f, 6.415f)
                curveTo(7.152f, 6.025f, 7.307f, 5.516f, 7.607f, 5.015f)
                curveTo(8.094f, 4.203f, 9.034f, 3.289f, 11f, 3.056f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                close()
                moveTo(7f, 11f)
                verticalLineTo(16.995f)
                curveTo(7.006f, 17.193f, 7.036f, 17.391f, 7.074f, 17.585f)
                curveTo(7.152f, 17.975f, 7.307f, 18.484f, 7.607f, 18.986f)
                curveTo(8.17f, 19.924f, 9.339f, 21f, 12f, 21f)
                curveTo(14.661f, 21f, 15.83f, 19.924f, 16.392f, 18.986f)
                curveTo(16.693f, 18.484f, 16.848f, 17.975f, 16.926f, 17.585f)
                curveTo(16.965f, 17.391f, 16.994f, 17.193f, 17f, 16.995f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                close()
                moveTo(17f, 9f)
                verticalLineTo(7.005f)
                curveTo(16.994f, 6.807f, 16.965f, 6.609f, 16.926f, 6.415f)
                curveTo(16.848f, 6.025f, 16.693f, 5.516f, 16.392f, 5.015f)
                curveTo(15.906f, 4.203f, 14.966f, 3.289f, 13f, 3.056f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _Mouse!!
    }

@Suppress("ObjectPropertyName")
private var _Mouse: ImageVector? = null
