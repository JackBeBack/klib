package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Drag: ImageVector
    get() {
        if (_Drag != null) {
            return _Drag!!
        }
        _Drag = ImageVector.Builder(
            name = "Drag",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(16.192f, 5.657f)
                curveTo(16.583f, 5.266f, 16.583f, 4.633f, 16.192f, 4.243f)
                lineTo(13.364f, 1.414f)
                curveTo(12.583f, 0.633f, 11.317f, 0.633f, 10.535f, 1.414f)
                lineTo(7.707f, 4.243f)
                curveTo(7.317f, 4.633f, 7.317f, 5.266f, 7.707f, 5.657f)
                curveTo(8.098f, 6.047f, 8.731f, 6.047f, 9.121f, 5.657f)
                lineTo(11f, 3.778f)
                verticalLineTo(11.05f)
                horizontalLineTo(3.728f)
                lineTo(5.607f, 9.172f)
                curveTo(5.997f, 8.781f, 5.997f, 8.148f, 5.607f, 7.757f)
                curveTo(5.216f, 7.367f, 4.583f, 7.367f, 4.192f, 7.757f)
                lineTo(1.364f, 10.586f)
                curveTo(0.583f, 11.367f, 0.583f, 12.633f, 1.364f, 13.414f)
                lineTo(4.192f, 16.243f)
                curveTo(4.583f, 16.633f, 5.216f, 16.633f, 5.607f, 16.243f)
                curveTo(5.997f, 15.852f, 5.997f, 15.219f, 5.607f, 14.828f)
                lineTo(3.828f, 13.05f)
                horizontalLineTo(11f)
                verticalLineTo(20.222f)
                lineTo(9.121f, 18.343f)
                curveTo(8.731f, 17.953f, 8.098f, 17.953f, 7.707f, 18.343f)
                curveTo(7.317f, 18.734f, 7.317f, 19.367f, 7.707f, 19.757f)
                lineTo(10.535f, 22.586f)
                curveTo(11.317f, 23.367f, 12.583f, 23.367f, 13.364f, 22.586f)
                lineTo(16.192f, 19.757f)
                curveTo(16.583f, 19.367f, 16.583f, 18.734f, 16.192f, 18.343f)
                curveTo(15.802f, 17.953f, 15.169f, 17.953f, 14.778f, 18.343f)
                lineTo(13f, 20.121f)
                verticalLineTo(13.05f)
                horizontalLineTo(20.071f)
                lineTo(18.293f, 14.828f)
                curveTo(17.902f, 15.219f, 17.902f, 15.852f, 18.293f, 16.243f)
                curveTo(18.683f, 16.633f, 19.317f, 16.633f, 19.707f, 16.243f)
                lineTo(22.535f, 13.414f)
                curveTo(23.317f, 12.633f, 23.317f, 11.367f, 22.535f, 10.586f)
                lineTo(19.707f, 7.757f)
                curveTo(19.317f, 7.367f, 18.683f, 7.367f, 18.293f, 7.757f)
                curveTo(17.902f, 8.148f, 17.902f, 8.781f, 18.293f, 9.172f)
                lineTo(20.172f, 11.05f)
                horizontalLineTo(13f)
                verticalLineTo(3.879f)
                lineTo(14.778f, 5.657f)
                curveTo(15.169f, 6.047f, 15.802f, 6.047f, 16.192f, 5.657f)
                close()
            }
        }.build()

        return _Drag!!
    }

@Suppress("ObjectPropertyName")
private var _Drag: ImageVector? = null
