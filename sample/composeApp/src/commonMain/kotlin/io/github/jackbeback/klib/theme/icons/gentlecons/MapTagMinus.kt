package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.MapTagMinus: ImageVector
    get() {
        if (_MapTagMinus != null) {
            return _MapTagMinus!!
        }
        _MapTagMinus = ImageVector.Builder(
            name = "MapTagMinus",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(9f, 9f)
                curveTo(8.448f, 9f, 8f, 9.448f, 8f, 10f)
                curveTo(8f, 10.552f, 8.448f, 11f, 9f, 11f)
                horizontalLineTo(15f)
                curveTo(15.552f, 11f, 16f, 10.552f, 16f, 10f)
                curveTo(16f, 9.448f, 15.552f, 9f, 15f, 9f)
                horizontalLineTo(9f)
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

        return _MapTagMinus!!
    }

@Suppress("ObjectPropertyName")
private var _MapTagMinus: ImageVector? = null
