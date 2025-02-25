package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.BellAlarm: ImageVector
    get() {
        if (_BellAlarm != null) {
            return _BellAlarm!!
        }
        _BellAlarm = ImageVector.Builder(
            name = "BellAlarm",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(9f, 11f)
                curveTo(9.552f, 11f, 10f, 10.552f, 10f, 10f)
                curveTo(10f, 9.448f, 9.552f, 9f, 9f, 9f)
                curveTo(8.448f, 9f, 8f, 9.448f, 8f, 10f)
                curveTo(8f, 10.552f, 8.448f, 11f, 9f, 11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17f, 10f)
                curveTo(17f, 11.66f, 16.494f, 13.202f, 15.629f, 14.48f)
                curveTo(16.359f, 14.953f, 16.87f, 15.734f, 16.979f, 16.639f)
                curveTo(18.653f, 16.009f, 19.307f, 15.278f, 19.631f, 14.448f)
                curveTo(19.852f, 13.883f, 19.955f, 13.186f, 19.993f, 12.264f)
                curveTo(20.024f, 11.513f, 20.01f, 10.696f, 20.003f, 9.734f)
                curveTo(19.403f, 9.389f, 19f, 8.741f, 19f, 8f)
                curveTo(19f, 6.895f, 19.895f, 6f, 21f, 6f)
                curveTo(22.105f, 6f, 23f, 6.895f, 23f, 8f)
                curveTo(23f, 8.739f, 22.599f, 9.384f, 22.003f, 9.731f)
                curveTo(22.01f, 10.602f, 22.027f, 11.474f, 21.991f, 12.345f)
                curveTo(21.951f, 13.345f, 21.835f, 14.304f, 21.494f, 15.177f)
                curveTo(20.829f, 16.877f, 19.426f, 17.971f, 17f, 18.747f)
                verticalLineTo(19f)
                curveTo(17f, 20.657f, 15.657f, 22f, 14f, 22f)
                horizontalLineTo(4f)
                curveTo(2.343f, 22f, 1f, 20.657f, 1f, 19f)
                verticalLineTo(17f)
                curveTo(1f, 15.944f, 1.546f, 15.015f, 2.371f, 14.48f)
                curveTo(1.506f, 13.202f, 1f, 11.66f, 1f, 10f)
                curveTo(1f, 5.582f, 4.582f, 2f, 9f, 2f)
                curveTo(13.418f, 2f, 17f, 5.582f, 17f, 10f)
                close()
                moveTo(9f, 16f)
                curveTo(12.314f, 16f, 15f, 13.314f, 15f, 10f)
                curveTo(15f, 6.686f, 12.314f, 4f, 9f, 4f)
                curveTo(5.686f, 4f, 3f, 6.686f, 3f, 10f)
                curveTo(3f, 13.314f, 5.686f, 16f, 9f, 16f)
                close()
                moveTo(9f, 18f)
                curveTo(11.011f, 18f, 12.849f, 17.258f, 14.254f, 16.033f)
                curveTo(14.684f, 16.145f, 15f, 16.536f, 15f, 17f)
                verticalLineTo(19f)
                curveTo(15f, 19.552f, 14.552f, 20f, 14f, 20f)
                horizontalLineTo(4f)
                curveTo(3.448f, 20f, 3f, 19.552f, 3f, 19f)
                verticalLineTo(17f)
                curveTo(3f, 16.536f, 3.317f, 16.145f, 3.746f, 16.033f)
                curveTo(5.151f, 17.258f, 6.989f, 18f, 9f, 18f)
                close()
            }
        }.build()

        return _BellAlarm!!
    }

@Suppress("ObjectPropertyName")
private var _BellAlarm: ImageVector? = null
