package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowDualHorizontal: ImageVector
    get() {
        if (_ArrowDualHorizontal != null) {
            return _ArrowDualHorizontal!!
        }
        _ArrowDualHorizontal = ImageVector.Builder(
            name = "ArrowDualHorizontal",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(5.657f, 7.757f)
                curveTo(5.266f, 7.367f, 4.633f, 7.367f, 4.243f, 7.757f)
                lineTo(1.414f, 10.586f)
                curveTo(0.633f, 11.367f, 0.633f, 12.633f, 1.414f, 13.414f)
                lineTo(4.243f, 16.243f)
                curveTo(4.633f, 16.633f, 5.266f, 16.633f, 5.657f, 16.243f)
                curveTo(6.047f, 15.852f, 6.047f, 15.219f, 5.657f, 14.828f)
                lineTo(3.828f, 13f)
                lineTo(18f, 13f)
                lineTo(18.001f, 13f)
                horizontalLineTo(20.171f)
                lineTo(18.343f, 14.828f)
                curveTo(17.952f, 15.219f, 17.952f, 15.852f, 18.343f, 16.243f)
                curveTo(18.733f, 16.633f, 19.367f, 16.633f, 19.757f, 16.243f)
                lineTo(22.586f, 13.414f)
                curveTo(23.367f, 12.633f, 23.367f, 11.367f, 22.586f, 10.586f)
                lineTo(19.757f, 7.757f)
                curveTo(19.367f, 7.367f, 18.734f, 7.367f, 18.343f, 7.757f)
                curveTo(17.953f, 8.148f, 17.953f, 8.781f, 18.343f, 9.171f)
                lineTo(20.171f, 11f)
                lineTo(3.828f, 11f)
                lineTo(5.657f, 9.171f)
                curveTo(6.047f, 8.781f, 6.047f, 8.148f, 5.657f, 7.757f)
                close()
            }
        }.build()

        return _ArrowDualHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDualHorizontal: ImageVector? = null
