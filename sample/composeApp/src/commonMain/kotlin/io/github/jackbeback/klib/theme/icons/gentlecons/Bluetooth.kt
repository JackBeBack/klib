package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Bluetooth: ImageVector
    get() {
        if (_Bluetooth != null) {
            return _Bluetooth!!
        }
        _Bluetooth = ImageVector.Builder(
            name = "Bluetooth",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 9.586f)
                verticalLineTo(2.483f)
                curveTo(11f, 1.414f, 12.293f, 0.878f, 13.049f, 1.634f)
                lineTo(17.566f, 6.151f)
                curveTo(18.034f, 6.62f, 18.034f, 7.38f, 17.566f, 7.848f)
                lineTo(13.414f, 12f)
                lineTo(17.566f, 16.151f)
                curveTo(18.034f, 16.62f, 18.034f, 17.38f, 17.566f, 17.848f)
                lineTo(13.049f, 22.366f)
                curveTo(12.293f, 23.122f, 11f, 22.586f, 11f, 21.517f)
                verticalLineTo(14.414f)
                lineTo(9.381f, 16.034f)
                curveTo(9.369f, 16.047f, 9.356f, 16.06f, 9.343f, 16.073f)
                lineTo(7.808f, 17.608f)
                curveTo(7.417f, 17.999f, 6.783f, 17.999f, 6.392f, 17.608f)
                curveTo(6.001f, 17.217f, 6.001f, 16.583f, 6.392f, 16.192f)
                lineTo(7.927f, 14.657f)
                curveTo(7.938f, 14.646f, 7.949f, 14.635f, 7.961f, 14.625f)
                lineTo(10.586f, 12f)
                lineTo(8.009f, 9.424f)
                curveTo(7.999f, 9.414f, 7.988f, 9.404f, 7.978f, 9.393f)
                lineTo(6.391f, 7.806f)
                curveTo(6f, 7.415f, 6f, 6.782f, 6.391f, 6.391f)
                curveTo(6.782f, 6f, 7.415f, 6f, 7.806f, 6.391f)
                lineTo(9.393f, 7.978f)
                curveTo(9.404f, 7.988f, 9.414f, 7.999f, 9.424f, 8.009f)
                lineTo(11f, 9.586f)
                close()
                moveTo(13f, 4.414f)
                verticalLineTo(9.586f)
                lineTo(15.586f, 7f)
                lineTo(13f, 4.414f)
                close()
                moveTo(13f, 19.586f)
                lineTo(15.586f, 17f)
                lineTo(13f, 14.414f)
                verticalLineTo(19.586f)
                close()
            }
        }.build()

        return _Bluetooth!!
    }

@Suppress("ObjectPropertyName")
private var _Bluetooth: ImageVector? = null
