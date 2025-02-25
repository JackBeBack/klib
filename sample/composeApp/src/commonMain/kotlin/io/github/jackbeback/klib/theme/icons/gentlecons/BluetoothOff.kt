package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.BluetoothOff: ImageVector
    get() {
        if (_BluetoothOff != null) {
            return _BluetoothOff!!
        }
        _BluetoothOff = ImageVector.Builder(
            name = "BluetoothOff",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 7.981f)
                lineTo(14.217f, 11.198f)
                lineTo(17.566f, 7.848f)
                curveTo(18.034f, 7.38f, 18.034f, 6.62f, 17.566f, 6.151f)
                lineTo(13.049f, 1.634f)
                curveTo(12.293f, 0.878f, 11f, 1.414f, 11f, 2.483f)
                verticalLineTo(7.981f)
                close()
                moveTo(13f, 9.586f)
                verticalLineTo(4.414f)
                lineTo(15.586f, 7f)
                lineTo(13f, 9.586f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(16.234f, 19.18f)
                lineTo(14.82f, 17.766f)
                lineTo(13f, 19.586f)
                verticalLineTo(15.945f)
                lineTo(9.82f, 12.766f)
                lineTo(7.961f, 14.625f)
                curveTo(7.949f, 14.635f, 7.938f, 14.646f, 7.927f, 14.657f)
                lineTo(6.392f, 16.192f)
                curveTo(6.001f, 16.583f, 6.001f, 17.217f, 6.392f, 17.608f)
                curveTo(6.783f, 17.999f, 7.417f, 17.999f, 7.808f, 17.608f)
                lineTo(9.343f, 16.073f)
                curveTo(9.356f, 16.06f, 9.369f, 16.047f, 9.381f, 16.034f)
                lineTo(11f, 14.414f)
                verticalLineTo(21.517f)
                curveTo(11f, 22.586f, 12.293f, 23.122f, 13.049f, 22.366f)
                lineTo(16.234f, 19.18f)
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

        return _BluetoothOff!!
    }

@Suppress("ObjectPropertyName")
private var _BluetoothOff: ImageVector? = null
