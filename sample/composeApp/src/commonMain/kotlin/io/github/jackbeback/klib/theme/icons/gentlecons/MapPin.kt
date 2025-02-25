package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.MapPin: ImageVector
    get() {
        if (_MapPin != null) {
            return _MapPin!!
        }
        _MapPin = ImageVector.Builder(
            name = "MapPin",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.995f, 9.901f)
                curveTo(15.28f, 9.44f, 17f, 7.421f, 17f, 5f)
                curveTo(17f, 2.239f, 14.761f, 0f, 12f, 0f)
                curveTo(9.239f, 0f, 7f, 2.239f, 7f, 5f)
                curveTo(7f, 7.421f, 8.72f, 9.44f, 11.005f, 9.901f)
                curveTo(11.002f, 9.934f, 11f, 9.967f, 11f, 10f)
                verticalLineTo(19f)
                curveTo(11f, 19.552f, 11.448f, 20f, 12f, 20f)
                curveTo(12.552f, 20f, 13f, 19.552f, 13f, 19f)
                verticalLineTo(10f)
                curveTo(13f, 9.967f, 12.998f, 9.934f, 12.995f, 9.901f)
                close()
                moveTo(12f, 8.007f)
                curveTo(10.34f, 8.007f, 8.993f, 6.66f, 8.993f, 5f)
                curveTo(8.993f, 3.34f, 10.34f, 1.993f, 12f, 1.993f)
                curveTo(13.66f, 1.993f, 15.007f, 3.34f, 15.007f, 5f)
                curveTo(15.007f, 6.66f, 13.66f, 8.007f, 12f, 8.007f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.784f, 16.299f)
                curveTo(5.626f, 15.656f, 6.732f, 15.212f, 8.002f, 15.059f)
                curveTo(8.55f, 14.993f, 9f, 15.448f, 9f, 16f)
                curveTo(9f, 16.552f, 8.549f, 16.99f, 8.004f, 17.078f)
                curveTo(7.161f, 17.215f, 6.482f, 17.519f, 5.998f, 17.889f)
                curveTo(5.326f, 18.401f, 5.09f, 18.979f, 5.122f, 19.429f)
                curveTo(5.153f, 19.854f, 5.446f, 20.468f, 6.507f, 21.018f)
                curveTo(7.578f, 21.574f, 9.339f, 22f, 12f, 22f)
                curveTo(14.661f, 22f, 16.422f, 21.574f, 17.493f, 21.018f)
                curveTo(18.554f, 20.468f, 18.847f, 19.854f, 18.878f, 19.429f)
                curveTo(18.91f, 18.979f, 18.674f, 18.401f, 18.002f, 17.889f)
                curveTo(17.518f, 17.519f, 16.838f, 17.215f, 15.996f, 17.078f)
                curveTo(15.451f, 16.99f, 15f, 16.552f, 15f, 16f)
                curveTo(15f, 15.448f, 15.45f, 14.993f, 15.998f, 15.059f)
                curveTo(17.268f, 15.212f, 18.374f, 15.656f, 19.216f, 16.299f)
                curveTo(20.264f, 17.099f, 20.965f, 18.271f, 20.872f, 19.571f)
                curveTo(20.778f, 20.896f, 19.884f, 22.032f, 18.413f, 22.794f)
                curveTo(16.953f, 23.551f, 14.839f, 24f, 12f, 24f)
                curveTo(9.161f, 24f, 7.047f, 23.551f, 5.586f, 22.794f)
                curveTo(4.116f, 22.032f, 3.222f, 20.896f, 3.127f, 19.571f)
                curveTo(3.035f, 18.271f, 3.736f, 17.099f, 4.784f, 16.299f)
                close()
            }
        }.build()

        return _MapPin!!
    }

@Suppress("ObjectPropertyName")
private var _MapPin: ImageVector? = null
