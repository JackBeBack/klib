package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.FastForward: ImageVector
    get() {
        if (_FastForward != null) {
            return _FastForward!!
        }
        _FastForward = ImageVector.Builder(
            name = "FastForward",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.946f, 5.595f)
                curveTo(3.929f, 4.16f, 1f, 5.484f, 1f, 7.831f)
                verticalLineTo(16.169f)
                curveTo(1f, 18.516f, 3.929f, 19.84f, 5.946f, 18.405f)
                lineTo(11f, 14.81f)
                verticalLineTo(16.169f)
                curveTo(11f, 18.516f, 13.929f, 19.84f, 15.946f, 18.405f)
                lineTo(21.807f, 14.236f)
                curveTo(23.397f, 13.105f, 23.397f, 10.895f, 21.807f, 9.764f)
                lineTo(15.946f, 5.595f)
                curveTo(13.929f, 4.16f, 11f, 5.484f, 11f, 7.831f)
                verticalLineTo(9.19f)
                lineTo(5.946f, 5.595f)
                close()
                moveTo(3.046f, 7.831f)
                curveTo(3.046f, 7.048f, 4.022f, 6.607f, 4.695f, 7.085f)
                lineTo(10.556f, 11.255f)
                curveTo(11.086f, 11.632f, 11.086f, 12.368f, 10.556f, 12.745f)
                lineTo(4.695f, 16.915f)
                curveTo(4.022f, 17.393f, 3.046f, 16.952f, 3.046f, 16.169f)
                verticalLineTo(7.831f)
                close()
                moveTo(13.046f, 7.831f)
                curveTo(13.046f, 7.048f, 14.022f, 6.607f, 14.695f, 7.085f)
                lineTo(20.556f, 11.255f)
                curveTo(21.086f, 11.632f, 21.086f, 12.368f, 20.556f, 12.745f)
                lineTo(14.695f, 16.915f)
                curveTo(14.022f, 17.393f, 13.046f, 16.952f, 13.046f, 16.169f)
                verticalLineTo(7.831f)
                close()
            }
        }.build()

        return _FastForward!!
    }

@Suppress("ObjectPropertyName")
private var _FastForward: ImageVector? = null
