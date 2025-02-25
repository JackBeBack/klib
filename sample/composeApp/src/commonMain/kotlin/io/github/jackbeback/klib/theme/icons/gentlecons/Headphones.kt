package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Headphones: ImageVector
    get() {
        if (_Headphones != null) {
            return _Headphones!!
        }
        _Headphones = ImageVector.Builder(
            name = "Headphones",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.984f, 12.916f)
                curveTo(2.976f, 12.833f, 2.966f, 12.727f, 2.957f, 12.602f)
                curveTo(2.933f, 12.278f, 2.91f, 11.821f, 2.914f, 11.274f)
                curveTo(2.922f, 10.186f, 3.037f, 8.711f, 3.478f, 7.217f)
                curveTo(3.92f, 5.722f, 4.705f, 4.156f, 6.089f, 2.962f)
                curveTo(7.489f, 1.753f, 9.418f, 1f, 12f, 1f)
                curveTo(14.582f, 1f, 16.511f, 1.753f, 17.911f, 2.962f)
                curveTo(19.295f, 4.156f, 20.08f, 5.722f, 20.521f, 7.217f)
                curveTo(20.963f, 8.711f, 21.078f, 10.186f, 21.086f, 11.274f)
                curveTo(21.09f, 11.821f, 21.067f, 12.278f, 21.043f, 12.602f)
                curveTo(21.034f, 12.727f, 21.024f, 12.833f, 21.016f, 12.916f)
                lineTo(21.021f, 12.919f)
                curveTo(22.032f, 13.466f, 23f, 14.435f, 23f, 16f)
                verticalLineTo(19f)
                curveTo(23f, 20.565f, 22.032f, 21.534f, 21.021f, 22.081f)
                curveTo(20.037f, 22.613f, 18.889f, 22.829f, 18.116f, 22.922f)
                curveTo(16.904f, 23.068f, 16f, 22.081f, 16f, 21f)
                verticalLineTo(14f)
                curveTo(16f, 12.919f, 16.904f, 11.932f, 18.116f, 12.078f)
                curveTo(18.392f, 12.111f, 18.716f, 12.16f, 19.063f, 12.233f)
                curveTo(19.078f, 11.979f, 19.089f, 11.658f, 19.086f, 11.289f)
                curveTo(19.079f, 10.314f, 18.975f, 9.039f, 18.604f, 7.783f)
                curveTo(18.233f, 6.528f, 17.611f, 5.344f, 16.605f, 4.476f)
                curveTo(15.614f, 3.622f, 14.168f, 3f, 12f, 3f)
                curveTo(9.832f, 3f, 8.386f, 3.622f, 7.395f, 4.476f)
                curveTo(6.389f, 5.344f, 5.767f, 6.528f, 5.397f, 7.783f)
                curveTo(5.026f, 9.039f, 4.921f, 10.314f, 4.914f, 11.289f)
                curveTo(4.911f, 11.658f, 4.922f, 11.979f, 4.937f, 12.233f)
                curveTo(5.284f, 12.16f, 5.608f, 12.111f, 5.884f, 12.078f)
                curveTo(7.096f, 11.932f, 8f, 12.919f, 8f, 14f)
                verticalLineTo(21f)
                curveTo(8f, 22.081f, 7.096f, 23.068f, 5.884f, 22.922f)
                curveTo(5.111f, 22.829f, 3.963f, 22.613f, 2.979f, 22.081f)
                curveTo(1.968f, 21.534f, 1f, 20.565f, 1f, 19f)
                verticalLineTo(16f)
                curveTo(1f, 14.435f, 1.968f, 13.466f, 2.979f, 12.919f)
                lineTo(2.984f, 12.916f)
                close()
                moveTo(18f, 20.921f)
                curveTo(18.663f, 20.832f, 19.454f, 20.655f, 20.069f, 20.322f)
                curveTo(20.695f, 19.983f, 21f, 19.575f, 21f, 19f)
                verticalLineTo(16f)
                curveTo(21f, 15.425f, 20.695f, 15.017f, 20.069f, 14.678f)
                curveTo(19.454f, 14.345f, 18.663f, 14.168f, 18f, 14.079f)
                verticalLineTo(20.921f)
                close()
                moveTo(6f, 14.079f)
                curveTo(5.337f, 14.168f, 4.546f, 14.345f, 3.931f, 14.678f)
                curveTo(3.305f, 15.017f, 3f, 15.425f, 3f, 16f)
                lineTo(3f, 19f)
                curveTo(3f, 19.575f, 3.305f, 19.983f, 3.931f, 20.322f)
                curveTo(4.546f, 20.655f, 5.337f, 20.832f, 6f, 20.921f)
                verticalLineTo(14.079f)
                close()
            }
        }.build()

        return _Headphones!!
    }

@Suppress("ObjectPropertyName")
private var _Headphones: ImageVector? = null
