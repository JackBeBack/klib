package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.WiFi: ImageVector
    get() {
        if (_WiFi != null) {
            return _WiFi!!
        }
        _WiFi = ImageVector.Builder(
            name = "WiFi",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(9.279f, 18.635f)
                lineTo(11.262f, 20.684f)
                curveTo(11.67f, 21.105f, 12.33f, 21.105f, 12.738f, 20.684f)
                lineTo(14.721f, 18.635f)
                curveTo(14.983f, 18.366f, 15.091f, 17.969f, 14.912f, 17.634f)
                curveTo(14.564f, 16.982f, 13.749f, 16f, 12f, 16f)
                curveTo(10.251f, 16f, 9.436f, 16.982f, 9.088f, 17.634f)
                curveTo(8.909f, 17.969f, 9.017f, 18.366f, 9.279f, 18.635f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(5f, 13.5f)
                curveTo(5f, 13.5f, 6.5f, 9.5f, 12f, 9.5f)
                curveTo(17.5f, 9.5f, 19f, 13.5f, 19f, 13.5f)
                curveTo(19.5f, 15f, 18f, 15.5f, 17.5f, 14.5f)
                curveTo(17.5f, 14.5f, 16f, 11.5f, 12f, 11.5f)
                curveTo(8f, 11.5f, 6.5f, 14.5f, 6.5f, 14.5f)
                curveTo(6f, 15.5f, 4.5f, 15f, 5f, 13.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(1f, 9f)
                curveTo(1f, 9f, 4f, 3f, 12f, 3f)
                curveTo(20f, 3f, 23f, 9f, 23f, 9f)
                curveTo(23.5f, 10f, 22.5f, 11.5f, 21.5f, 10f)
                curveTo(21.5f, 10f, 18.5f, 5f, 12f, 5f)
                curveTo(5.5f, 5f, 2.5f, 10f, 2.5f, 10f)
                curveTo(1.5f, 11.5f, 0.5f, 10f, 1f, 9f)
                close()
            }
        }.build()

        return _WiFi!!
    }

@Suppress("ObjectPropertyName")
private var _WiFi: ImageVector? = null
