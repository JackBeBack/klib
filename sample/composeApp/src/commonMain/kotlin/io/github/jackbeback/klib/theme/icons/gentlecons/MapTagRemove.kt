package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.MapTagRemove: ImageVector
    get() {
        if (_MapTagRemove != null) {
            return _MapTagRemove!!
        }
        _MapTagRemove = ImageVector.Builder(
            name = "MapTagRemove",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(8.709f, 13.291f)
                curveTo(8.319f, 12.901f, 8.319f, 12.267f, 8.709f, 11.877f)
                lineTo(10.586f, 10f)
                lineTo(8.71f, 8.124f)
                curveTo(8.319f, 7.733f, 8.319f, 7.1f, 8.71f, 6.71f)
                curveTo(9.1f, 6.319f, 9.734f, 6.319f, 10.124f, 6.71f)
                lineTo(12f, 8.586f)
                lineTo(13.882f, 6.704f)
                curveTo(14.272f, 6.314f, 14.905f, 6.314f, 15.296f, 6.704f)
                curveTo(15.686f, 7.095f, 15.686f, 7.728f, 15.296f, 8.119f)
                lineTo(13.414f, 10f)
                lineTo(15.295f, 11.881f)
                curveTo(15.686f, 12.271f, 15.686f, 12.904f, 15.295f, 13.295f)
                curveTo(14.904f, 13.685f, 14.271f, 13.685f, 13.881f, 13.295f)
                lineTo(12f, 11.414f)
                lineTo(10.123f, 13.291f)
                curveTo(9.733f, 13.682f, 9.1f, 13.682f, 8.709f, 13.291f)
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

        return _MapTagRemove!!
    }

@Suppress("ObjectPropertyName")
private var _MapTagRemove: ImageVector? = null
