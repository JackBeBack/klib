package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Usb: ImageVector
    get() {
        if (_Usb != null) {
            return _Usb!!
        }
        _Usb = ImageVector.Builder(
            name = "Usb",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11.253f, 0.341f)
                lineTo(9.036f, 2.835f)
                curveTo(8.634f, 3.286f, 8.955f, 4f, 9.559f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(17.132f)
                lineTo(7.445f, 14.762f)
                curveTo(7.167f, 14.576f, 7f, 14.264f, 7f, 13.93f)
                verticalLineTo(12.733f)
                curveTo(7.598f, 12.387f, 8f, 11.74f, 8f, 11f)
                curveTo(8f, 9.895f, 7.105f, 9f, 6f, 9f)
                curveTo(4.895f, 9f, 4f, 9.895f, 4f, 11f)
                curveTo(4f, 11.74f, 4.402f, 12.387f, 5f, 12.733f)
                verticalLineTo(13.93f)
                curveTo(5f, 14.933f, 5.501f, 15.87f, 6.336f, 16.426f)
                lineTo(11f, 19.535f)
                verticalLineTo(20.268f)
                curveTo(10.402f, 20.613f, 10f, 21.26f, 10f, 22f)
                curveTo(10f, 23.105f, 10.895f, 24f, 12f, 24f)
                curveTo(13.105f, 24f, 14f, 23.105f, 14f, 22f)
                curveTo(14f, 21.26f, 13.598f, 20.613f, 13f, 20.268f)
                verticalLineTo(16.535f)
                lineTo(17.664f, 13.426f)
                curveTo(18.499f, 12.87f, 19f, 11.933f, 19f, 10.93f)
                verticalLineTo(10f)
                curveTo(19.552f, 10f, 20f, 9.552f, 20f, 9f)
                verticalLineTo(7f)
                curveTo(20f, 6.448f, 19.552f, 6f, 19f, 6f)
                horizontalLineTo(17f)
                curveTo(16.448f, 6f, 16f, 6.448f, 16f, 7f)
                verticalLineTo(9f)
                curveTo(16f, 9.552f, 16.448f, 10f, 17f, 10f)
                verticalLineTo(10.93f)
                curveTo(17f, 11.264f, 16.833f, 11.576f, 16.555f, 11.762f)
                lineTo(13f, 14.132f)
                verticalLineTo(4f)
                horizontalLineTo(14.441f)
                curveTo(15.045f, 4f, 15.366f, 3.286f, 14.964f, 2.835f)
                lineTo(12.747f, 0.341f)
                curveTo(12.35f, -0.107f, 11.65f, -0.107f, 11.253f, 0.341f)
                close()
            }
        }.build()

        return _Usb!!
    }

@Suppress("ObjectPropertyName")
private var _Usb: ImageVector? = null
