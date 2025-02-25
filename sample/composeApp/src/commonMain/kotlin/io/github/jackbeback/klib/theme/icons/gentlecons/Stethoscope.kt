package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Stethoscope: ImageVector
    get() {
        if (_Stethoscope != null) {
            return _Stethoscope!!
        }
        _Stethoscope = ImageVector.Builder(
            name = "Stethoscope",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 3f)
                curveTo(8f, 4.105f, 7.105f, 5f, 6f, 5f)
                curveTo(5.365f, 5f, 4.799f, 4.704f, 4.433f, 4.243f)
                lineTo(3.684f, 4.493f)
                curveTo(3.264f, 4.633f, 3.044f, 4.994f, 3.077f, 5.343f)
                curveTo(3.212f, 6.791f, 3.573f, 9.034f, 4.507f, 10.885f)
                curveTo(5.426f, 12.708f, 6.805f, 14f, 9f, 14f)
                curveTo(11.194f, 14f, 12.574f, 12.708f, 13.493f, 10.885f)
                curveTo(14.427f, 9.034f, 14.788f, 6.791f, 14.923f, 5.343f)
                curveTo(14.956f, 4.994f, 14.736f, 4.633f, 14.316f, 4.493f)
                lineTo(13.567f, 4.243f)
                curveTo(13.2f, 4.704f, 12.635f, 5f, 12f, 5f)
                curveTo(10.895f, 5f, 10f, 4.105f, 10f, 3f)
                curveTo(10f, 1.895f, 10.895f, 1f, 12f, 1f)
                curveTo(12.831f, 1f, 13.543f, 1.507f, 13.845f, 2.228f)
                lineTo(14.949f, 2.595f)
                curveTo(16.162f, 3f, 17.042f, 4.163f, 16.914f, 5.528f)
                curveTo(16.772f, 7.06f, 16.382f, 9.6f, 15.279f, 11.786f)
                curveTo(14.28f, 13.767f, 12.62f, 15.577f, 9.974f, 15.936f)
                curveTo(10.014f, 16.492f, 10.103f, 17.115f, 10.275f, 17.729f)
                curveTo(10.525f, 18.619f, 10.935f, 19.429f, 11.573f, 20.012f)
                curveTo(12.191f, 20.576f, 13.099f, 21f, 14.5f, 21f)
                curveTo(15.901f, 21f, 16.809f, 20.576f, 17.427f, 20.012f)
                curveTo(18.065f, 19.429f, 18.475f, 18.619f, 18.725f, 17.729f)
                curveTo(19.025f, 16.663f, 19.069f, 15.556f, 19.052f, 14.847f)
                curveTo(17.86f, 14.45f, 17f, 13.326f, 17f, 12f)
                curveTo(17f, 10.343f, 18.343f, 9f, 20f, 9f)
                curveTo(21.657f, 9f, 23f, 10.343f, 23f, 12f)
                curveTo(23f, 13.287f, 22.19f, 14.384f, 21.052f, 14.81f)
                curveTo(21.071f, 15.637f, 21.026f, 16.934f, 20.65f, 18.271f)
                curveTo(20.338f, 19.381f, 19.779f, 20.571f, 18.776f, 21.488f)
                curveTo(17.753f, 22.423f, 16.349f, 23f, 14.5f, 23f)
                curveTo(12.651f, 23f, 11.247f, 22.423f, 10.224f, 21.488f)
                curveTo(9.221f, 20.571f, 8.662f, 19.381f, 8.35f, 18.271f)
                curveTo(8.117f, 17.442f, 8.011f, 16.623f, 7.969f, 15.928f)
                curveTo(5.356f, 15.551f, 3.713f, 13.753f, 2.721f, 11.786f)
                curveTo(1.618f, 9.6f, 1.228f, 7.06f, 1.085f, 5.528f)
                curveTo(0.958f, 4.163f, 1.838f, 3f, 3.051f, 2.595f)
                lineTo(4.155f, 2.228f)
                curveTo(4.457f, 1.507f, 5.169f, 1f, 6f, 1f)
                curveTo(7.105f, 1f, 8f, 1.895f, 8f, 3f)
                close()
                moveTo(20f, 13.028f)
                curveTo(19.432f, 13.028f, 18.972f, 12.568f, 18.972f, 12f)
                curveTo(18.972f, 11.432f, 19.432f, 10.972f, 20f, 10.972f)
                curveTo(20.568f, 10.972f, 21.028f, 11.432f, 21.028f, 12f)
                curveTo(21.028f, 12.568f, 20.568f, 13.028f, 20f, 13.028f)
                close()
            }
        }.build()

        return _Stethoscope!!
    }

@Suppress("ObjectPropertyName")
private var _Stethoscope: ImageVector? = null
