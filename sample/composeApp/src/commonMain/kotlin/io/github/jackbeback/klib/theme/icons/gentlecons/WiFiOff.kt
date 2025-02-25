package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.WiFiOff: ImageVector
    get() {
        if (_WiFiOff != null) {
            return _WiFiOff!!
        }
        _WiFiOff = ImageVector.Builder(
            name = "WiFiOff",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(3.263f, 6.208f)
                curveTo(1.682f, 7.636f, 1f, 9f, 1f, 9f)
                curveTo(0.5f, 10f, 1.5f, 11.5f, 2.5f, 10f)
                curveTo(2.5f, 10f, 3.204f, 8.826f, 4.67f, 7.616f)
                lineTo(3.263f, 6.208f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7.646f, 10.592f)
                curveTo(5.646f, 11.776f, 5f, 13.5f, 5f, 13.5f)
                curveTo(4.5f, 15f, 6f, 15.5f, 6.5f, 14.5f)
                curveTo(6.5f, 14.5f, 7.263f, 12.973f, 9.153f, 12.098f)
                lineTo(7.646f, 10.592f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(15.422f, 12.403f)
                lineTo(12.532f, 9.513f)
                curveTo(17.597f, 9.76f, 19f, 13.5f, 19f, 13.5f)
                curveTo(19.382f, 14.645f, 18.598f, 15.207f, 17.984f, 14.965f)
                lineTo(17.478f, 14.459f)
                curveTo(17.359f, 14.241f, 16.734f, 13.19f, 15.422f, 12.403f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(13.255f, 16.2f)
                lineTo(14.999f, 17.944f)
                curveTo(15.013f, 18.194f, 14.905f, 18.446f, 14.721f, 18.635f)
                lineTo(12.738f, 20.684f)
                curveTo(12.33f, 21.105f, 11.67f, 21.105f, 11.262f, 20.684f)
                lineTo(9.279f, 18.635f)
                curveTo(9.017f, 18.366f, 8.909f, 17.969f, 9.088f, 17.634f)
                curveTo(9.436f, 16.982f, 10.251f, 16f, 12f, 16f)
                curveTo(12.488f, 16f, 12.903f, 16.076f, 13.255f, 16.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(8.534f, 5.515f)
                lineTo(6.942f, 3.923f)
                curveTo(8.341f, 3.369f, 10.017f, 3f, 12f, 3f)
                curveTo(20f, 3f, 23f, 9f, 23f, 9f)
                curveTo(23.5f, 10f, 22.5f, 11.5f, 21.5f, 10f)
                curveTo(21.5f, 10f, 18.5f, 5f, 12f, 5f)
                curveTo(10.707f, 5f, 9.553f, 5.198f, 8.534f, 5.515f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(2.008f, 3.422f)
                curveTo(1.617f, 3.032f, 1.617f, 2.398f, 2.008f, 2.008f)
                curveTo(2.398f, 1.617f, 3.032f, 1.617f, 3.422f, 2.008f)
                lineTo(22f, 20.586f)
                curveTo(22.391f, 20.977f, 22.391f, 21.61f, 22f, 22f)
                curveTo(21.61f, 22.391f, 20.977f, 22.391f, 20.586f, 22f)
                lineTo(2.008f, 3.422f)
                close()
            }
        }.build()

        return _WiFiOff!!
    }

@Suppress("ObjectPropertyName")
private var _WiFiOff: ImageVector? = null
