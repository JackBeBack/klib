package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Telegram: ImageVector
    get() {
        if (_Telegram != null) {
            return _Telegram!!
        }
        _Telegram = ImageVector.Builder(
            name = "Telegram",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23.112f, 4.494f)
                curveTo(23.43f, 2.945f, 21.907f, 1.657f, 20.432f, 2.227f)
                lineTo(2.342f, 9.216f)
                curveTo(0.695f, 9.853f, 0.621f, 12.157f, 2.225f, 12.898f)
                lineTo(6.165f, 14.716f)
                lineTo(8.038f, 21.275f)
                curveTo(8.136f, 21.615f, 8.406f, 21.879f, 8.749f, 21.968f)
                curveTo(9.092f, 22.057f, 9.457f, 21.958f, 9.707f, 21.707f)
                lineTo(12.594f, 18.82f)
                lineTo(16.638f, 21.853f)
                curveTo(17.811f, 22.733f, 19.502f, 22.092f, 19.797f, 20.655f)
                lineTo(23.112f, 4.494f)
                close()
                moveTo(3.063f, 11.082f)
                lineTo(21.153f, 4.093f)
                lineTo(17.837f, 20.253f)
                lineTo(13.1f, 16.7f)
                curveTo(12.702f, 16.401f, 12.145f, 16.441f, 11.793f, 16.793f)
                lineTo(10.557f, 18.029f)
                lineTo(10.928f, 15.986f)
                lineTo(18.207f, 8.707f)
                curveTo(18.561f, 8.353f, 18.599f, 7.791f, 18.295f, 7.393f)
                curveTo(17.991f, 6.995f, 17.439f, 6.883f, 17.004f, 7.132f)
                lineTo(6.951f, 12.876f)
                lineTo(3.063f, 11.082f)
                close()
                moveTo(8.177f, 14.479f)
                lineTo(8.783f, 16.601f)
                lineTo(9.016f, 15.321f)
                curveTo(9.053f, 15.121f, 9.149f, 14.937f, 9.293f, 14.793f)
                lineTo(11.513f, 12.573f)
                lineTo(8.177f, 14.479f)
                close()
            }
        }.build()

        return _Telegram!!
    }

@Suppress("ObjectPropertyName")
private var _Telegram: ImageVector? = null
