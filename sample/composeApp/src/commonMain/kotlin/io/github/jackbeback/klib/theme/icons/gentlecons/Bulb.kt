package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Bulb: ImageVector
    get() {
        if (_Bulb != null) {
            return _Bulb!!
        }
        _Bulb = ImageVector.Builder(
            name = "Bulb",
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
                curveTo(8.206f, 1f, 6.151f, 3.029f, 5.103f, 5.037f)
                curveTo(4.591f, 6.019f, 4.318f, 6.989f, 4.172f, 7.707f)
                curveTo(4.099f, 8.068f, 4.057f, 8.371f, 4.032f, 8.588f)
                curveTo(4.017f, 8.724f, 4f, 8.863f, 4f, 9f)
                curveTo(4f, 11.722f, 5.232f, 13.314f, 6.294f, 14.153f)
                curveTo(6.823f, 14.571f, 7.117f, 14.999f, 7.164f, 15.375f)
                lineTo(7.789f, 20.372f)
                curveTo(7.976f, 21.873f, 9.253f, 23f, 10.766f, 23f)
                horizontalLineTo(13.234f)
                curveTo(14.747f, 23f, 16.024f, 21.873f, 16.211f, 20.372f)
                lineTo(16.836f, 15.375f)
                curveTo(16.883f, 14.999f, 17.177f, 14.571f, 17.705f, 14.153f)
                curveTo(18.768f, 13.314f, 20f, 11.722f, 20f, 9f)
                curveTo(20f, 8.863f, 19.983f, 8.724f, 19.968f, 8.588f)
                curveTo(19.943f, 8.371f, 19.901f, 8.068f, 19.827f, 7.707f)
                curveTo(19.682f, 6.989f, 19.409f, 6.019f, 18.897f, 5.037f)
                curveTo(17.848f, 3.029f, 15.794f, 1f, 12f, 1f)
                close()
                moveTo(7.535f, 12.585f)
                curveTo(6.438f, 11.718f, 5.865f, 10.193f, 6.02f, 8.811f)
                curveTo(6.039f, 8.644f, 6.072f, 8.4f, 6.132f, 8.105f)
                curveTo(6.253f, 7.511f, 6.475f, 6.731f, 6.876f, 5.963f)
                curveTo(7.655f, 4.471f, 9.1f, 3f, 12f, 3f)
                curveTo(14.9f, 3f, 16.345f, 4.471f, 17.124f, 5.963f)
                curveTo(17.525f, 6.731f, 17.747f, 7.511f, 17.868f, 8.105f)
                curveTo(17.927f, 8.4f, 17.961f, 8.644f, 17.98f, 8.811f)
                curveTo(18.135f, 10.193f, 17.562f, 11.718f, 16.465f, 12.585f)
                curveTo(15.785f, 13.122f, 14.995f, 13.974f, 14.851f, 15.127f)
                lineTo(14.617f, 17f)
                horizontalLineTo(9.383f)
                lineTo(9.149f, 15.127f)
                curveTo(9.005f, 13.974f, 8.215f, 13.122f, 7.535f, 12.585f)
                close()
                moveTo(9.633f, 19f)
                lineTo(9.773f, 20.124f)
                curveTo(9.836f, 20.625f, 10.261f, 21f, 10.766f, 21f)
                horizontalLineTo(13.234f)
                curveTo(13.739f, 21f, 14.164f, 20.625f, 14.227f, 20.124f)
                lineTo(14.367f, 19f)
                horizontalLineTo(9.633f)
                close()
            }
        }.build()

        return _Bulb!!
    }

@Suppress("ObjectPropertyName")
private var _Bulb: ImageVector? = null
