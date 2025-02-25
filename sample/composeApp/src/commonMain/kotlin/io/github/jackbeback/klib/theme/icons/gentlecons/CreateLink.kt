package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.CreateLink: ImageVector
    get() {
        if (_CreateLink != null) {
            return _CreateLink!!
        }
        _CreateLink = ImageVector.Builder(
            name = "CreateLink",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(17.111f, 13.575f)
                curveTo(17.501f, 13.966f, 18.135f, 13.966f, 18.525f, 13.575f)
                lineTo(21f, 11.101f)
                curveTo(23.148f, 8.953f, 23.148f, 5.47f, 21f, 3.322f)
                curveTo(18.852f, 1.174f, 15.37f, 1.174f, 13.222f, 3.322f)
                lineTo(10.747f, 5.797f)
                curveTo(10.356f, 6.188f, 10.356f, 6.821f, 10.747f, 7.211f)
                curveTo(11.137f, 7.602f, 11.771f, 7.602f, 12.161f, 7.211f)
                lineTo(14.636f, 4.737f)
                curveTo(16.003f, 3.37f, 18.219f, 3.37f, 19.586f, 4.737f)
                curveTo(20.953f, 6.103f, 20.953f, 8.319f, 19.586f, 9.686f)
                lineTo(17.111f, 12.161f)
                curveTo(16.72f, 12.552f, 16.72f, 13.185f, 17.111f, 13.575f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(5.797f, 10.747f)
                curveTo(6.188f, 10.356f, 6.821f, 10.356f, 7.211f, 10.747f)
                curveTo(7.602f, 11.137f, 7.602f, 11.771f, 7.211f, 12.161f)
                lineTo(4.737f, 14.636f)
                curveTo(3.37f, 16.003f, 3.37f, 18.219f, 4.737f, 19.586f)
                curveTo(6.103f, 20.953f, 8.319f, 20.953f, 9.686f, 19.586f)
                lineTo(12.161f, 17.111f)
                curveTo(12.552f, 16.72f, 13.185f, 16.72f, 13.575f, 17.111f)
                curveTo(13.966f, 17.501f, 13.966f, 18.135f, 13.575f, 18.525f)
                lineTo(11.101f, 21f)
                curveTo(8.953f, 23.148f, 5.47f, 23.148f, 3.322f, 21f)
                curveTo(1.174f, 18.852f, 1.174f, 15.37f, 3.322f, 13.222f)
                lineTo(5.797f, 10.747f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(8.979f, 15.343f)
                curveTo(8.589f, 14.953f, 8.589f, 14.319f, 8.979f, 13.929f)
                lineTo(13.929f, 8.979f)
                curveTo(14.319f, 8.589f, 14.953f, 8.589f, 15.343f, 8.979f)
                curveTo(15.734f, 9.37f, 15.734f, 10.003f, 15.343f, 10.393f)
                lineTo(10.393f, 15.343f)
                curveTo(10.003f, 15.734f, 9.37f, 15.734f, 8.979f, 15.343f)
                close()
            }
        }.build()

        return _CreateLink!!
    }

@Suppress("ObjectPropertyName")
private var _CreateLink: ImageVector? = null
