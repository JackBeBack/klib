package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.CallCancel: ImageVector
    get() {
        if (_CallCancel != null) {
            return _CallCancel!!
        }
        _CallCancel = ImageVector.Builder(
            name = "CallCancel",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.274f, 8.94f)
                curveTo(3.012f, 7.886f, 6.84f, 6f, 12f, 6f)
                curveTo(17.16f, 6f, 20.988f, 7.886f, 22.726f, 8.94f)
                curveTo(23.725f, 9.546f, 24.135f, 10.691f, 23.961f, 11.751f)
                lineTo(23.503f, 14.531f)
                curveTo(23.235f, 16.157f, 21.704f, 17.247f, 20.101f, 16.952f)
                lineTo(17.635f, 16.498f)
                curveTo(16.589f, 16.306f, 15.889f, 15.298f, 16.064f, 14.236f)
                lineTo(16.294f, 12.841f)
                curveTo(15.706f, 12.493f, 14.371f, 11.909f, 12f, 11.909f)
                curveTo(9.629f, 11.909f, 8.294f, 12.493f, 7.707f, 12.841f)
                lineTo(7.936f, 14.236f)
                curveTo(8.111f, 15.298f, 7.411f, 16.306f, 6.365f, 16.498f)
                lineTo(3.899f, 16.952f)
                curveTo(2.296f, 17.247f, 0.765f, 16.157f, 0.497f, 14.531f)
                lineTo(0.039f, 11.751f)
                curveTo(-0.136f, 10.691f, 0.275f, 9.546f, 1.274f, 8.94f)
                close()
                moveTo(12f, 7.97f)
                curveTo(7.308f, 7.97f, 3.828f, 9.688f, 2.274f, 10.63f)
                curveTo(2.048f, 10.768f, 1.899f, 11.061f, 1.959f, 11.428f)
                lineTo(2.417f, 14.207f)
                curveTo(2.506f, 14.749f, 3.016f, 15.112f, 3.551f, 15.014f)
                lineTo(6.016f, 14.56f)
                lineTo(5.77f, 13.063f)
                curveTo(5.669f, 12.451f, 5.858f, 11.7f, 6.518f, 11.269f)
                curveTo(7.341f, 10.732f, 9.061f, 9.939f, 12f, 9.939f)
                curveTo(14.939f, 9.939f, 16.659f, 10.732f, 17.482f, 11.269f)
                curveTo(18.142f, 11.7f, 18.331f, 12.451f, 18.23f, 13.063f)
                lineTo(17.984f, 14.56f)
                lineTo(20.449f, 15.014f)
                curveTo(20.983f, 15.112f, 21.494f, 14.749f, 21.583f, 14.207f)
                lineTo(22.041f, 11.428f)
                curveTo(22.101f, 11.061f, 21.952f, 10.768f, 21.726f, 10.63f)
                curveTo(20.172f, 9.688f, 16.692f, 7.97f, 12f, 7.97f)
                close()
            }
        }.build()

        return _CallCancel!!
    }

@Suppress("ObjectPropertyName")
private var _CallCancel: ImageVector? = null
