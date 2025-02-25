package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.MapTag: ImageVector
    get() {
        if (_MapTag != null) {
            return _MapTag!!
        }
        _MapTag = ImageVector.Builder(
            name = "MapTag",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.004f, 14.003f)
                curveTo(14.489f, 14.003f, 16.504f, 11.989f, 16.504f, 9.503f)
                curveTo(16.504f, 7.018f, 14.489f, 5.003f, 12.004f, 5.003f)
                curveTo(9.518f, 5.003f, 7.504f, 7.018f, 7.504f, 9.503f)
                curveTo(7.504f, 11.989f, 9.518f, 14.003f, 12.004f, 14.003f)
                close()
                moveTo(12.004f, 12.007f)
                curveTo(10.621f, 12.007f, 9.5f, 10.886f, 9.5f, 9.503f)
                curveTo(9.5f, 8.121f, 10.621f, 7f, 12.004f, 7f)
                curveTo(13.386f, 7f, 14.507f, 8.121f, 14.507f, 9.503f)
                curveTo(14.507f, 10.886f, 13.386f, 12.007f, 12.004f, 12.007f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.272f, 11.582f)
                curveTo(22.565f, 5.788f, 18.005f, 0.004f, 12f, 0.004f)
                curveTo(5.996f, 0.004f, 1.436f, 5.796f, 2.728f, 11.583f)
                curveTo(3.725f, 16.282f, 7.757f, 20.847f, 10.164f, 23.227f)
                curveTo(11.194f, 24.246f, 12.806f, 24.246f, 13.836f, 23.227f)
                curveTo(16.243f, 20.846f, 20.275f, 16.282f, 21.272f, 11.582f)
                close()
                moveTo(12f, 2.004f)
                curveTo(16.712f, 2.004f, 20.337f, 6.59f, 19.32f, 11.146f)
                curveTo(18.832f, 13.335f, 17.736f, 15.302f, 16.45f, 17.119f)
                curveTo(15.106f, 19.018f, 13.583f, 20.664f, 12.43f, 21.805f)
                curveTo(12.179f, 22.054f, 11.821f, 22.054f, 11.57f, 21.805f)
                curveTo(10.417f, 20.664f, 8.894f, 19.019f, 7.55f, 17.119f)
                curveTo(6.264f, 15.302f, 5.169f, 13.336f, 4.68f, 11.147f)
                curveTo(3.664f, 6.597f, 7.29f, 2.004f, 12f, 2.004f)
                close()
            }
        }.build()

        return _MapTag!!
    }

@Suppress("ObjectPropertyName")
private var _MapTag: ImageVector? = null
