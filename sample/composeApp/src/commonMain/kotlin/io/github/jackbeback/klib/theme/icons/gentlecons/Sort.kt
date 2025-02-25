package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Sort: ImageVector
    get() {
        if (_Sort != null) {
            return _Sort!!
        }
        _Sort = ImageVector.Builder(
            name = "Sort",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11.192f, 5.657f)
                curveTo(11.583f, 5.266f, 11.583f, 4.633f, 11.192f, 4.243f)
                lineTo(8.364f, 1.414f)
                curveTo(8.306f, 1.356f, 8.245f, 1.302f, 8.182f, 1.253f)
                curveTo(7.503f, 0.721f, 6.559f, 0.689f, 5.849f, 1.158f)
                curveTo(5.738f, 1.231f, 5.633f, 1.317f, 5.536f, 1.414f)
                lineTo(2.707f, 4.243f)
                curveTo(2.317f, 4.633f, 2.317f, 5.266f, 2.707f, 5.657f)
                curveTo(3.098f, 6.047f, 3.731f, 6.047f, 4.121f, 5.657f)
                lineTo(6f, 3.778f)
                verticalLineTo(18f)
                curveTo(6f, 18.552f, 6.448f, 19f, 7f, 19f)
                curveTo(7.552f, 19f, 8f, 18.552f, 8f, 18f)
                verticalLineTo(3.879f)
                lineTo(9.778f, 5.657f)
                curveTo(10.169f, 6.047f, 10.802f, 6.047f, 11.192f, 5.657f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(12.707f, 18.343f)
                curveTo(12.317f, 18.734f, 12.317f, 19.367f, 12.707f, 19.757f)
                lineTo(15.535f, 22.586f)
                curveTo(15.633f, 22.683f, 15.738f, 22.769f, 15.849f, 22.842f)
                curveTo(16.626f, 23.355f, 17.681f, 23.269f, 18.364f, 22.586f)
                lineTo(21.192f, 19.757f)
                curveTo(21.583f, 19.367f, 21.583f, 18.734f, 21.192f, 18.343f)
                curveTo(20.802f, 17.953f, 20.169f, 17.953f, 19.778f, 18.343f)
                lineTo(18f, 20.121f)
                lineTo(18f, 6f)
                curveTo(18f, 5.448f, 17.552f, 5f, 17f, 5f)
                curveTo(16.448f, 5f, 16f, 5.448f, 16f, 6f)
                lineTo(16f, 20.222f)
                lineTo(14.121f, 18.343f)
                curveTo(13.731f, 17.953f, 13.098f, 17.953f, 12.707f, 18.343f)
                close()
            }
        }.build()

        return _Sort!!
    }

@Suppress("ObjectPropertyName")
private var _Sort: ImageVector? = null
