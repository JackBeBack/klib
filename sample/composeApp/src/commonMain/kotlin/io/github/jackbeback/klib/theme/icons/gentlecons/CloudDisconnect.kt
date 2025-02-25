package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.CloudDisconnect: ImageVector
    get() {
        if (_CloudDisconnect != null) {
            return _CloudDisconnect!!
        }
        _CloudDisconnect = ImageVector.Builder(
            name = "CloudDisconnect",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(23.939f, 15.531f)
                curveTo(23.898f, 13.572f, 22.572f, 11.64f, 20.24f, 11.13f)
                curveTo(20.637f, 8.194f, 18.635f, 5.556f, 16.147f, 4.557f)
                curveTo(14.719f, 3.983f, 13.059f, 3.906f, 11.489f, 4.619f)
                curveTo(10.695f, 4.98f, 9.954f, 5.528f, 9.293f, 6.274f)
                lineTo(10.711f, 7.692f)
                curveTo(11.228f, 7.084f, 11.778f, 6.684f, 12.316f, 6.44f)
                curveTo(13.326f, 5.981f, 14.414f, 6.016f, 15.402f, 6.413f)
                curveTo(17.455f, 7.237f, 18.792f, 9.452f, 18.098f, 11.549f)
                curveTo(17.863f, 12.26f, 18.388f, 12.982f, 19.118f, 13.002f)
                curveTo(20.991f, 13.054f, 21.913f, 14.347f, 21.939f, 15.573f)
                curveTo(21.952f, 16.192f, 21.736f, 16.782f, 21.299f, 17.217f)
                curveTo(21.136f, 17.379f, 20.93f, 17.531f, 20.676f, 17.657f)
                lineTo(22.133f, 19.114f)
                curveTo(22.341f, 18.97f, 22.534f, 18.81f, 22.71f, 18.635f)
                curveTo(23.57f, 17.778f, 23.962f, 16.644f, 23.939f, 15.531f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(17.055f, 20f)
                lineTo(6f, 20f)
                curveTo(2.024f, 20f, -0.024f, 16.479f, 0.252f, 13.433f)
                curveTo(0.393f, 11.872f, 1.136f, 10.332f, 2.592f, 9.337f)
                curveTo(3.364f, 8.809f, 4.297f, 8.461f, 5.382f, 8.328f)
                lineTo(7.381f, 10.327f)
                curveTo(5.672f, 10.122f, 4.492f, 10.46f, 3.72f, 10.988f)
                curveTo(2.828f, 11.598f, 2.34f, 12.556f, 2.244f, 13.614f)
                curveTo(2.045f, 15.805f, 3.496f, 18f, 6f, 18f)
                lineTo(15.055f, 18f)
                lineTo(17.055f, 20f)
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

        return _CloudDisconnect!!
    }

@Suppress("ObjectPropertyName")
private var _CloudDisconnect: ImageVector? = null
