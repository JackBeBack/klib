package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.AnchorLink: ImageVector
    get() {
        if (_AnchorLink != null) {
            return _AnchorLink!!
        }
        _AnchorLink = ImageVector.Builder(
            name = "AnchorLink",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(13.222f, 3.322f)
                curveTo(15.37f, 1.174f, 18.852f, 1.174f, 21f, 3.322f)
                curveTo(23.148f, 5.47f, 23.148f, 8.953f, 21f, 11.101f)
                lineTo(17.465f, 14.636f)
                curveTo(15.317f, 16.784f, 11.834f, 16.784f, 9.686f, 14.636f)
                curveTo(9.488f, 14.437f, 9.307f, 14.227f, 9.145f, 14.007f)
                curveTo(8.903f, 13.68f, 8.971f, 13.23f, 9.259f, 12.942f)
                curveTo(9.732f, 12.469f, 10.566f, 12.656f, 11.024f, 13.144f)
                curveTo(11.049f, 13.17f, 11.075f, 13.196f, 11.101f, 13.222f)
                curveTo(12.467f, 14.589f, 14.683f, 14.589f, 16.05f, 13.222f)
                lineTo(19.586f, 9.686f)
                curveTo(20.953f, 8.319f, 20.953f, 6.103f, 19.586f, 4.737f)
                curveTo(18.219f, 3.37f, 16.003f, 3.37f, 14.636f, 4.737f)
                lineTo(13.575f, 5.797f)
                curveTo(13.185f, 6.188f, 12.552f, 6.188f, 12.161f, 5.797f)
                curveTo(11.771f, 5.407f, 11.771f, 4.774f, 12.161f, 4.383f)
                lineTo(13.222f, 3.322f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6.858f, 9.686f)
                curveTo(8.902f, 7.642f, 12.226f, 7.601f, 14.349f, 9.423f)
                curveTo(14.732f, 9.751f, 14.701f, 10.329f, 14.344f, 10.685f)
                curveTo(13.925f, 11.104f, 13.232f, 11.04f, 12.742f, 10.707f)
                curveTo(11.398f, 9.793f, 9.486f, 9.887f, 8.272f, 11.101f)
                lineTo(4.737f, 14.636f)
                curveTo(3.37f, 16.003f, 3.37f, 18.219f, 4.737f, 19.586f)
                curveTo(6.103f, 20.953f, 8.319f, 20.953f, 9.686f, 19.586f)
                lineTo(10.747f, 18.525f)
                curveTo(11.137f, 18.135f, 11.771f, 18.135f, 12.161f, 18.525f)
                curveTo(12.552f, 18.916f, 12.552f, 19.549f, 12.161f, 19.939f)
                lineTo(11.101f, 21f)
                curveTo(8.953f, 23.148f, 5.47f, 23.148f, 3.322f, 21f)
                curveTo(1.174f, 18.852f, 1.174f, 15.37f, 3.322f, 13.222f)
                lineTo(6.858f, 9.686f)
                close()
            }
        }.build()

        return _AnchorLink!!
    }

@Suppress("ObjectPropertyName")
private var _AnchorLink: ImageVector? = null
