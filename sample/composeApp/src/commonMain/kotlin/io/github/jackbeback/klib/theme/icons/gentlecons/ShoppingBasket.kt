package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ShoppingBasket: ImageVector
    get() {
        if (_ShoppingBasket != null) {
            return _ShoppingBasket!!
        }
        _ShoppingBasket = ImageVector.Builder(
            name = "ShoppingBasket",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(9f, 15f)
                curveTo(9f, 14.448f, 9.448f, 14f, 10f, 14f)
                curveTo(10.552f, 14f, 11f, 14.448f, 11f, 15f)
                verticalLineTo(18f)
                curveTo(11f, 18.552f, 10.552f, 19f, 10f, 19f)
                curveTo(9.448f, 19f, 9f, 18.552f, 9f, 18f)
                verticalLineTo(15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(14f, 14f)
                curveTo(13.448f, 14f, 13f, 14.448f, 13f, 15f)
                verticalLineTo(18f)
                curveTo(13f, 18.552f, 13.448f, 19f, 14f, 19f)
                curveTo(14.552f, 19f, 15f, 18.552f, 15f, 18f)
                verticalLineTo(15f)
                curveTo(15f, 14.448f, 14.552f, 14f, 14f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 2.525f)
                curveTo(14.724f, 2.047f, 14.888f, 1.435f, 15.366f, 1.159f)
                curveTo(15.844f, 0.883f, 16.456f, 1.047f, 16.732f, 1.525f)
                lineTo(19.315f, 5.999f)
                lineTo(20.002f, 6f)
                curveTo(20.046f, 6f, 20.089f, 6.002f, 20.157f, 6.006f)
                curveTo(20.239f, 6.012f, 20.348f, 6.023f, 20.477f, 6.045f)
                curveTo(20.73f, 6.087f, 21.083f, 6.173f, 21.447f, 6.356f)
                curveTo(21.816f, 6.54f, 22.215f, 6.832f, 22.52f, 7.289f)
                curveTo(22.828f, 7.752f, 23f, 8.325f, 23f, 9f)
                curveTo(23f, 9.675f, 22.828f, 10.248f, 22.52f, 10.711f)
                curveTo(22.215f, 11.168f, 21.816f, 11.46f, 21.447f, 11.644f)
                curveTo(21.267f, 11.734f, 21.09f, 11.801f, 20.927f, 11.85f)
                lineTo(20.161f, 20.272f)
                curveTo(20.021f, 21.817f, 18.725f, 23f, 17.174f, 23f)
                horizontalLineTo(6.826f)
                curveTo(5.275f, 23f, 3.979f, 21.817f, 3.839f, 20.272f)
                lineTo(3.073f, 11.85f)
                curveTo(2.91f, 11.801f, 2.733f, 11.734f, 2.553f, 11.644f)
                curveTo(2.184f, 11.46f, 1.785f, 11.168f, 1.48f, 10.711f)
                curveTo(1.172f, 10.248f, 1f, 9.675f, 1f, 9f)
                curveTo(1f, 8.325f, 1.172f, 7.752f, 1.48f, 7.289f)
                curveTo(1.785f, 6.832f, 2.184f, 6.54f, 2.553f, 6.356f)
                curveTo(2.918f, 6.173f, 3.27f, 6.087f, 3.523f, 6.045f)
                curveTo(3.652f, 6.023f, 3.762f, 6.012f, 3.843f, 6.006f)
                curveTo(3.912f, 6.002f, 3.954f, 6f, 3.999f, 6f)
                lineTo(4.684f, 6f)
                lineTo(7.268f, 1.525f)
                curveTo(7.544f, 1.047f, 8.156f, 0.883f, 8.634f, 1.159f)
                curveTo(9.112f, 1.435f, 9.276f, 2.047f, 9f, 2.525f)
                lineTo(6.995f, 5.998f)
                curveTo(10.331f, 5.996f, 13.668f, 5.995f, 17.004f, 5.997f)
                lineTo(15f, 2.525f)
                close()
                moveTo(3.852f, 8.018f)
                curveTo(3.935f, 8.004f, 3.995f, 8.001f, 4.009f, 8f)
                horizontalLineTo(19.991f)
                curveTo(20.005f, 8.001f, 20.065f, 8.004f, 20.148f, 8.018f)
                curveTo(20.27f, 8.038f, 20.417f, 8.077f, 20.553f, 8.144f)
                curveTo(20.684f, 8.21f, 20.785f, 8.293f, 20.855f, 8.398f)
                curveTo(20.922f, 8.498f, 21f, 8.675f, 21f, 9f)
                curveTo(21f, 9.325f, 20.922f, 9.502f, 20.855f, 9.602f)
                curveTo(20.785f, 9.707f, 20.684f, 9.79f, 20.553f, 9.856f)
                curveTo(20.417f, 9.923f, 20.27f, 9.962f, 20.148f, 9.982f)
                curveTo(20.065f, 9.996f, 20.005f, 9.999f, 19.991f, 10f)
                horizontalLineTo(4.009f)
                curveTo(3.995f, 9.999f, 3.935f, 9.996f, 3.852f, 9.982f)
                curveTo(3.73f, 9.962f, 3.582f, 9.923f, 3.447f, 9.856f)
                curveTo(3.316f, 9.79f, 3.215f, 9.707f, 3.145f, 9.602f)
                curveTo(3.078f, 9.502f, 3f, 9.325f, 3f, 9f)
                curveTo(3f, 8.675f, 3.078f, 8.498f, 3.145f, 8.398f)
                curveTo(3.215f, 8.293f, 3.316f, 8.21f, 3.447f, 8.144f)
                curveTo(3.582f, 8.077f, 3.73f, 8.038f, 3.852f, 8.018f)
                close()
                moveTo(5.831f, 20.09f)
                lineTo(5.095f, 12f)
                horizontalLineTo(18.905f)
                lineTo(18.17f, 20.09f)
                curveTo(18.123f, 20.606f, 17.691f, 21f, 17.174f, 21f)
                horizontalLineTo(6.826f)
                curveTo(6.309f, 21f, 5.877f, 20.606f, 5.831f, 20.09f)
                close()
            }
        }.build()

        return _ShoppingBasket!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingBasket: ImageVector? = null
