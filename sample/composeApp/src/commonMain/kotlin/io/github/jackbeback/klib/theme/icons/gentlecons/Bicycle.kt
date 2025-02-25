package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Bicycle: ImageVector
    get() {
        if (_Bicycle != null) {
            return _Bicycle!!
        }
        _Bicycle = ImageVector.Builder(
            name = "Bicycle",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 3f)
                curveTo(11.448f, 3f, 11f, 3.448f, 11f, 4f)
                curveTo(11f, 4.552f, 11.448f, 5f, 12f, 5f)
                horizontalLineTo(13.559f)
                curveTo(13.989f, 5f, 14.371f, 5.275f, 14.507f, 5.684f)
                lineTo(15.279f, 8f)
                horizontalLineTo(8.75f)
                lineTo(8f, 7f)
                curveTo(8.552f, 7f, 9f, 6.552f, 9f, 6f)
                curveTo(9f, 5.448f, 8.552f, 5f, 8f, 5f)
                horizontalLineTo(5f)
                curveTo(4.448f, 5f, 4f, 5.448f, 4f, 6f)
                curveTo(4f, 6.552f, 4.448f, 7f, 5f, 7f)
                horizontalLineTo(5.5f)
                lineTo(6.96f, 8.946f)
                curveTo(6.907f, 9.03f, 6.861f, 9.119f, 6.821f, 9.212f)
                lineTo(6.011f, 11.102f)
                curveTo(5.685f, 11.035f, 5.346f, 11f, 5f, 11f)
                curveTo(2.239f, 11f, 0f, 13.239f, 0f, 16f)
                curveTo(0f, 18.761f, 2.239f, 21f, 5f, 21f)
                curveTo(7.761f, 21f, 10f, 18.761f, 10f, 16f)
                curveTo(10f, 15.871f, 9.995f, 15.742f, 9.985f, 15.616f)
                lineTo(11.968f, 15.049f)
                curveTo(12.367f, 14.935f, 12.721f, 14.7f, 12.98f, 14.375f)
                lineTo(16.103f, 10.472f)
                lineTo(16.502f, 11.668f)
                curveTo(15.006f, 12.532f, 14f, 14.149f, 14f, 16f)
                curveTo(14f, 18.761f, 16.239f, 21f, 19f, 21f)
                curveTo(21.761f, 21f, 24f, 18.761f, 24f, 16f)
                curveTo(24f, 13.239f, 21.761f, 11f, 19f, 11f)
                curveTo(18.797f, 11f, 18.596f, 11.012f, 18.399f, 11.036f)
                lineTo(16.404f, 5.051f)
                curveTo(15.996f, 3.826f, 14.85f, 3f, 13.559f, 3f)
                horizontalLineTo(12f)
                close()
                moveTo(17.146f, 13.6f)
                lineTo(18.051f, 16.316f)
                curveTo(18.226f, 16.84f, 18.792f, 17.123f, 19.316f, 16.949f)
                curveTo(19.84f, 16.774f, 20.123f, 16.208f, 19.949f, 15.684f)
                lineTo(19.043f, 12.967f)
                curveTo(20.698f, 12.991f, 22.033f, 14.339f, 22.033f, 16f)
                curveTo(22.033f, 17.675f, 20.675f, 19.033f, 19f, 19.033f)
                curveTo(17.325f, 19.033f, 15.967f, 17.675f, 15.967f, 16f)
                curveTo(15.967f, 15.023f, 16.429f, 14.155f, 17.146f, 13.6f)
                close()
                moveTo(7.849f, 11.891f)
                lineTo(8.329f, 10.771f)
                lineTo(10.328f, 13.438f)
                lineTo(9.437f, 13.692f)
                curveTo(9.061f, 12.971f, 8.513f, 12.352f, 7.849f, 11.891f)
                close()
                moveTo(10.25f, 10f)
                lineTo(12.026f, 12.367f)
                lineTo(13.919f, 10f)
                lineTo(10.25f, 10f)
                close()
                moveTo(7.458f, 14.258f)
                curveTo(7.335f, 14.085f, 7.194f, 13.925f, 7.039f, 13.782f)
                lineTo(6.748f, 14.461f)
                lineTo(7.458f, 14.258f)
                close()
                moveTo(5.287f, 16.958f)
                curveTo(5.07f, 17.023f, 4.83f, 17.015f, 4.606f, 16.919f)
                curveTo(4.098f, 16.702f, 3.863f, 16.114f, 4.081f, 15.606f)
                lineTo(5.2f, 12.994f)
                curveTo(5.134f, 12.99f, 5.067f, 12.987f, 5f, 12.987f)
                curveTo(3.336f, 12.987f, 1.987f, 14.336f, 1.987f, 16f)
                curveTo(1.987f, 17.664f, 3.336f, 19.013f, 5f, 19.013f)
                curveTo(6.603f, 19.013f, 7.914f, 17.76f, 8.007f, 16.181f)
                lineTo(5.287f, 16.958f)
                close()
            }
        }.build()

        return _Bicycle!!
    }

@Suppress("ObjectPropertyName")
private var _Bicycle: ImageVector? = null
