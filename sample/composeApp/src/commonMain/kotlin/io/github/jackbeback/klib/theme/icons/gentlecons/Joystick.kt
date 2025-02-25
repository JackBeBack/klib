package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Joystick: ImageVector
    get() {
        if (_Joystick != null) {
            return _Joystick!!
        }
        _Joystick = ImageVector.Builder(
            name = "Joystick",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 4f)
                curveTo(16f, 5.867f, 14.722f, 7.435f, 12.992f, 7.876f)
                curveTo(12.997f, 7.917f, 13f, 7.958f, 13f, 8f)
                verticalLineTo(9.797f)
                curveTo(13.005f, 9.799f, 13.011f, 9.801f, 13.016f, 9.803f)
                lineTo(20.16f, 12.375f)
                curveTo(21.457f, 12.842f, 22.07f, 14.029f, 22f, 15.177f)
                verticalLineTo(18.559f)
                curveTo(22f, 19.85f, 21.174f, 20.996f, 19.949f, 21.404f)
                lineTo(12.949f, 23.738f)
                curveTo(12.333f, 23.943f, 11.667f, 23.943f, 11.051f, 23.738f)
                lineTo(4.051f, 21.404f)
                curveTo(2.826f, 20.996f, 2f, 19.85f, 2f, 18.559f)
                verticalLineTo(15.177f)
                curveTo(1.93f, 14.029f, 2.543f, 12.842f, 3.84f, 12.375f)
                lineTo(10.984f, 9.803f)
                curveTo(10.989f, 9.801f, 10.995f, 9.799f, 11f, 9.797f)
                verticalLineTo(8f)
                curveTo(11f, 7.958f, 11.003f, 7.917f, 11.008f, 7.876f)
                curveTo(9.279f, 7.435f, 8f, 5.867f, 8f, 4f)
                curveTo(8f, 1.791f, 9.791f, 0f, 12f, 0f)
                curveTo(14.209f, 0f, 16f, 1.791f, 16f, 4f)
                close()
                moveTo(11f, 11.923f)
                lineTo(4.517f, 14.257f)
                curveTo(4.169f, 14.382f, 3.995f, 14.691f, 3.995f, 15f)
                horizontalLineTo(4f)
                curveTo(4f, 15.334f, 4.197f, 15.628f, 4.517f, 15.743f)
                lineTo(11.661f, 18.315f)
                curveTo(11.88f, 18.394f, 12.12f, 18.394f, 12.339f, 18.315f)
                lineTo(19.483f, 15.743f)
                curveTo(19.803f, 15.628f, 20f, 15.334f, 20f, 15f)
                horizontalLineTo(20.005f)
                curveTo(20.005f, 14.691f, 19.831f, 14.382f, 19.483f, 14.257f)
                lineTo(13f, 11.923f)
                verticalLineTo(15f)
                curveTo(13f, 15.552f, 12.552f, 16f, 12f, 16f)
                curveTo(11.448f, 16f, 11f, 15.552f, 11f, 15f)
                verticalLineTo(11.923f)
                close()
                moveTo(9.98f, 4f)
                curveTo(9.98f, 5.116f, 10.884f, 6.02f, 12f, 6.02f)
                curveTo(13.116f, 6.02f, 14.02f, 5.116f, 14.02f, 4f)
                curveTo(14.02f, 2.884f, 13.116f, 1.98f, 12f, 1.98f)
                curveTo(10.884f, 1.98f, 9.98f, 2.884f, 9.98f, 4f)
                close()
                moveTo(4f, 18.559f)
                verticalLineTo(17.683f)
                lineTo(10.984f, 20.197f)
                curveTo(11.641f, 20.434f, 12.359f, 20.434f, 13.016f, 20.197f)
                lineTo(20f, 17.683f)
                verticalLineTo(18.559f)
                curveTo(20f, 18.989f, 19.725f, 19.371f, 19.316f, 19.507f)
                lineTo(12.316f, 21.84f)
                curveTo(12.111f, 21.909f, 11.889f, 21.909f, 11.684f, 21.84f)
                lineTo(4.684f, 19.507f)
                curveTo(4.275f, 19.371f, 4f, 18.989f, 4f, 18.559f)
                close()
            }
        }.build()

        return _Joystick!!
    }

@Suppress("ObjectPropertyName")
private var _Joystick: ImageVector? = null
