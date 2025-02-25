package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.MapTagUser: ImageVector
    get() {
        if (_MapTagUser != null) {
            return _MapTagUser!!
        }
        _MapTagUser = ImageVector.Builder(
            name = "MapTagUser",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(14.5f, 7.45f)
                curveTo(14.5f, 8.831f, 13.381f, 9.95f, 12f, 9.95f)
                curveTo(10.619f, 9.95f, 9.5f, 8.831f, 9.5f, 7.45f)
                curveTo(9.5f, 6.069f, 10.619f, 4.95f, 12f, 4.95f)
                curveTo(13.381f, 4.95f, 14.5f, 6.069f, 14.5f, 7.45f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(8.141f, 13.134f)
                curveTo(7.506f, 14.037f, 8.395f, 15f, 9.5f, 15f)
                horizontalLineTo(14.5f)
                curveTo(15.605f, 15f, 16.494f, 14.037f, 15.859f, 13.134f)
                curveTo(15.273f, 12.299f, 14.15f, 11.5f, 12f, 11.5f)
                curveTo(9.85f, 11.5f, 8.727f, 12.299f, 8.141f, 13.134f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 0.004f)
                curveTo(18.005f, 0.004f, 22.565f, 5.788f, 21.272f, 11.582f)
                curveTo(20.275f, 16.282f, 16.243f, 20.846f, 13.836f, 23.227f)
                curveTo(12.806f, 24.246f, 11.194f, 24.246f, 10.164f, 23.227f)
                curveTo(7.757f, 20.847f, 3.725f, 16.282f, 2.728f, 11.583f)
                curveTo(1.436f, 5.796f, 5.996f, 0.004f, 12f, 0.004f)
                close()
                moveTo(19.32f, 11.146f)
                curveTo(20.337f, 6.59f, 16.712f, 2.004f, 12f, 2.004f)
                curveTo(7.29f, 2.004f, 3.664f, 6.597f, 4.68f, 11.147f)
                curveTo(5.169f, 13.336f, 6.264f, 15.302f, 7.55f, 17.119f)
                curveTo(8.894f, 19.019f, 10.417f, 20.664f, 11.57f, 21.805f)
                curveTo(11.821f, 22.054f, 12.179f, 22.054f, 12.43f, 21.805f)
                curveTo(13.583f, 20.664f, 15.106f, 19.018f, 16.45f, 17.119f)
                curveTo(17.736f, 15.302f, 18.832f, 13.335f, 19.32f, 11.146f)
                close()
            }
        }.build()

        return _MapTagUser!!
    }

@Suppress("ObjectPropertyName")
private var _MapTagUser: ImageVector? = null
