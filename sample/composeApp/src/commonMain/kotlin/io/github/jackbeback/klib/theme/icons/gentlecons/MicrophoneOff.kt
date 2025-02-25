package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.MicrophoneOff: ImageVector
    get() {
        if (_MicrophoneOff != null) {
            return _MicrophoneOff!!
        }
        _MicrophoneOff = ImageVector.Builder(
            name = "MicrophoneOff",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(14.5f, 5.5f)
                verticalLineTo(10.5f)
                curveTo(14.5f, 10.794f, 14.449f, 11.075f, 14.356f, 11.337f)
                lineTo(15.85f, 12.831f)
                curveTo(16.263f, 12.151f, 16.5f, 11.353f, 16.5f, 10.5f)
                verticalLineTo(5.5f)
                curveTo(16.5f, 3.015f, 14.485f, 1f, 12f, 1f)
                curveTo(9.831f, 1f, 8.021f, 2.534f, 7.595f, 4.576f)
                lineTo(9.5f, 6.481f)
                verticalLineTo(5.5f)
                curveTo(9.5f, 4.119f, 10.619f, 3f, 12f, 3f)
                curveTo(13.381f, 3f, 14.5f, 4.119f, 14.5f, 5.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(12.054f, 15f)
                lineTo(7.5f, 10.445f)
                verticalLineTo(10.5f)
                curveTo(7.5f, 12.985f, 9.515f, 15f, 12f, 15f)
                curveTo(12.018f, 15f, 12.036f, 15f, 12.054f, 15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(13.889f, 16.834f)
                lineTo(15.538f, 18.483f)
                curveTo(14.815f, 18.727f, 13.975f, 18.897f, 13f, 18.966f)
                verticalLineTo(22f)
                curveTo(13f, 22.552f, 12.552f, 23f, 12f, 23f)
                curveTo(11.448f, 23f, 11f, 22.552f, 11f, 22f)
                verticalLineTo(18.966f)
                curveTo(3.54f, 18.438f, 4f, 12f, 4f, 12f)
                curveTo(4f, 12f, 4f, 11f, 5f, 11f)
                curveTo(6f, 11f, 6f, 12f, 6f, 12f)
                curveTo(6f, 12f, 5.5f, 17f, 12f, 17f)
                curveTo(12.71f, 17f, 13.336f, 16.94f, 13.889f, 16.834f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(18.94f, 15.921f)
                lineTo(17.466f, 14.447f)
                curveTo(18.122f, 13.215f, 18f, 12f, 18f, 12f)
                curveTo(18f, 12f, 18f, 11f, 19f, 11f)
                curveTo(20f, 11f, 20f, 12f, 20f, 12f)
                curveTo(20f, 12f, 20.146f, 14.043f, 18.94f, 15.921f)
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

        return _MicrophoneOff!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneOff: ImageVector? = null
