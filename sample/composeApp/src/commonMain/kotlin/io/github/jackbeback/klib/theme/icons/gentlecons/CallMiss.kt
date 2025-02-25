package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.CallMiss: ImageVector
    get() {
        if (_CallMiss != null) {
            return _CallMiss!!
        }
        _CallMiss = ImageVector.Builder(
            name = "CallMiss",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(10f, 1f)
                curveTo(10.552f, 1f, 11f, 1.448f, 11f, 2f)
                curveTo(11f, 2.552f, 10.552f, 3f, 10f, 3f)
                horizontalLineTo(8.414f)
                lineTo(12.043f, 6.629f)
                lineTo(17.379f, 1.293f)
                curveTo(17.769f, 0.902f, 18.402f, 0.902f, 18.793f, 1.293f)
                curveTo(19.183f, 1.683f, 19.183f, 2.317f, 18.793f, 2.707f)
                lineTo(13.459f, 8.041f)
                curveTo(12.682f, 8.818f, 11.425f, 8.822f, 10.643f, 8.053f)
                curveTo(10.616f, 8.029f, 10.59f, 8.004f, 10.564f, 7.978f)
                lineTo(7f, 4.414f)
                lineTo(7f, 6f)
                curveTo(7f, 6.552f, 6.552f, 7f, 6f, 7f)
                curveTo(5.448f, 7f, 5f, 6.552f, 5f, 6f)
                lineTo(5f, 3f)
                curveTo(5f, 1.895f, 5.895f, 1f, 7f, 1f)
                horizontalLineTo(10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 12f)
                curveTo(6.84f, 12f, 3.012f, 13.886f, 1.274f, 14.941f)
                curveTo(0.275f, 15.546f, -0.136f, 16.691f, 0.039f, 17.751f)
                lineTo(0.497f, 20.531f)
                curveTo(0.765f, 22.157f, 2.296f, 23.247f, 3.899f, 22.952f)
                lineTo(6.365f, 22.498f)
                curveTo(7.411f, 22.306f, 8.111f, 21.298f, 7.936f, 20.236f)
                lineTo(7.707f, 18.841f)
                curveTo(8.294f, 18.493f, 9.629f, 17.909f, 12f, 17.909f)
                curveTo(14.371f, 17.909f, 15.706f, 18.493f, 16.294f, 18.841f)
                lineTo(16.064f, 20.236f)
                curveTo(15.889f, 21.298f, 16.589f, 22.306f, 17.635f, 22.498f)
                lineTo(20.101f, 22.952f)
                curveTo(21.704f, 23.247f, 23.235f, 22.157f, 23.503f, 20.531f)
                lineTo(23.961f, 17.751f)
                curveTo(24.135f, 16.691f, 23.725f, 15.546f, 22.726f, 14.941f)
                curveTo(20.988f, 13.886f, 17.16f, 12f, 12f, 12f)
                close()
                moveTo(2.274f, 16.63f)
                curveTo(3.828f, 15.688f, 7.308f, 13.97f, 12f, 13.97f)
                curveTo(16.692f, 13.97f, 20.172f, 15.688f, 21.726f, 16.63f)
                curveTo(21.952f, 16.768f, 22.101f, 17.061f, 22.041f, 17.428f)
                lineTo(21.583f, 20.207f)
                curveTo(21.494f, 20.749f, 20.983f, 21.112f, 20.449f, 21.014f)
                lineTo(17.984f, 20.56f)
                lineTo(18.23f, 19.063f)
                curveTo(18.331f, 18.451f, 18.142f, 17.7f, 17.482f, 17.269f)
                curveTo(16.659f, 16.732f, 14.939f, 15.939f, 12f, 15.939f)
                curveTo(9.061f, 15.939f, 7.341f, 16.732f, 6.518f, 17.269f)
                curveTo(5.858f, 17.7f, 5.669f, 18.451f, 5.77f, 19.063f)
                lineTo(6.016f, 20.56f)
                lineTo(3.551f, 21.014f)
                curveTo(3.016f, 21.112f, 2.506f, 20.749f, 2.417f, 20.207f)
                lineTo(1.959f, 17.428f)
                curveTo(1.899f, 17.061f, 2.048f, 16.768f, 2.274f, 16.63f)
                close()
            }
        }.build()

        return _CallMiss!!
    }

@Suppress("ObjectPropertyName")
private var _CallMiss: ImageVector? = null
