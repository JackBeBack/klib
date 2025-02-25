package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.MapTagAdd: ImageVector
    get() {
        if (_MapTagAdd != null) {
            return _MapTagAdd!!
        }
        _MapTagAdd = ImageVector.Builder(
            name = "MapTagAdd",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(8f, 10f)
                curveTo(8f, 9.448f, 8.448f, 9f, 9f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                curveTo(11f, 6.448f, 11.448f, 6f, 12f, 6f)
                curveTo(12.552f, 6f, 13f, 6.448f, 13f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                curveTo(15.552f, 9f, 16f, 9.448f, 16f, 10f)
                curveTo(16f, 10.552f, 15.552f, 11f, 15f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                curveTo(13f, 13.552f, 12.552f, 14f, 12f, 14f)
                curveTo(11.448f, 14f, 11f, 13.552f, 11f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                curveTo(8.448f, 11f, 8f, 10.552f, 8f, 10f)
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

        return _MapTagAdd!!
    }

@Suppress("ObjectPropertyName")
private var _MapTagAdd: ImageVector? = null
