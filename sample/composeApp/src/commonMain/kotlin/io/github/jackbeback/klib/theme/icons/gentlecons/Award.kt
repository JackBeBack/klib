package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Award: ImageVector
    get() {
        if (_Award != null) {
            return _Award!!
        }
        _Award = ImageVector.Builder(
            name = "Award",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.628f, 13.481f)
                curveTo(19.494f, 12.202f, 20f, 10.66f, 20f, 9f)
                curveTo(20f, 4.582f, 16.418f, 1f, 12f, 1f)
                curveTo(7.582f, 1f, 4f, 4.582f, 4f, 9f)
                curveTo(4f, 10.554f, 4.443f, 12.005f, 5.211f, 13.233f)
                lineTo(2.057f, 18.696f)
                curveTo(1.884f, 18.996f, 1.878f, 19.364f, 2.042f, 19.67f)
                curveTo(2.206f, 19.975f, 2.517f, 20.173f, 2.863f, 20.194f)
                lineTo(5.86f, 20.374f)
                lineTo(7.514f, 22.879f)
                curveTo(7.705f, 23.168f, 8.032f, 23.338f, 8.378f, 23.327f)
                curveTo(8.724f, 23.317f, 9.041f, 23.128f, 9.214f, 22.828f)
                lineTo(12.001f, 18.001f)
                lineTo(14.634f, 22.562f)
                curveTo(14.807f, 22.862f, 15.124f, 23.051f, 15.47f, 23.062f)
                curveTo(15.816f, 23.072f, 16.144f, 22.902f, 16.334f, 22.613f)
                lineTo(17.907f, 20.231f)
                lineTo(20.756f, 20.06f)
                curveTo(21.102f, 20.04f, 21.413f, 19.841f, 21.577f, 19.536f)
                curveTo(21.741f, 19.231f, 21.736f, 18.862f, 21.562f, 18.562f)
                lineTo(18.628f, 13.481f)
                close()
                moveTo(12f, 15f)
                curveTo(15.314f, 15f, 18f, 12.314f, 18f, 9f)
                curveTo(18f, 5.686f, 15.314f, 3f, 12f, 3f)
                curveTo(8.686f, 3f, 6f, 5.686f, 6f, 9f)
                curveTo(6f, 12.314f, 8.686f, 15f, 12f, 15f)
                close()
                moveTo(13.635f, 16.833f)
                lineTo(15.557f, 20.161f)
                lineTo(16.514f, 18.712f)
                curveTo(16.687f, 18.449f, 16.974f, 18.284f, 17.288f, 18.265f)
                lineTo(19.021f, 18.161f)
                lineTo(17.228f, 15.055f)
                curveTo(16.219f, 15.927f, 14.99f, 16.551f, 13.635f, 16.833f)
                close()
                moveTo(4.598f, 18.294f)
                lineTo(6.571f, 14.876f)
                curveTo(7.616f, 15.842f, 8.92f, 16.533f, 10.366f, 16.833f)
                lineTo(8.291f, 20.427f)
                lineTo(7.253f, 18.854f)
                curveTo(7.08f, 18.592f, 6.793f, 18.426f, 6.478f, 18.407f)
                lineTo(4.598f, 18.294f)
                close()
            }
        }.build()

        return _Award!!
    }

@Suppress("ObjectPropertyName")
private var _Award: ImageVector? = null
