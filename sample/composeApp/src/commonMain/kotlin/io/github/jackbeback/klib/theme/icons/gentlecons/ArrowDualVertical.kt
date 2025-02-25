package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowDualVertical: ImageVector
    get() {
        if (_ArrowDualVertical != null) {
            return _ArrowDualVertical!!
        }
        _ArrowDualVertical = ImageVector.Builder(
            name = "ArrowDualVertical",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(16.243f, 5.657f)
                curveTo(16.633f, 5.266f, 16.633f, 4.633f, 16.243f, 4.243f)
                lineTo(13.414f, 1.414f)
                curveTo(12.633f, 0.633f, 11.367f, 0.633f, 10.586f, 1.414f)
                lineTo(7.757f, 4.243f)
                curveTo(7.367f, 4.633f, 7.367f, 5.266f, 7.757f, 5.657f)
                curveTo(8.148f, 6.047f, 8.781f, 6.047f, 9.172f, 5.657f)
                lineTo(11f, 3.828f)
                verticalLineTo(18f)
                lineTo(11f, 18.001f)
                verticalLineTo(20.171f)
                lineTo(9.172f, 18.343f)
                curveTo(8.781f, 17.952f, 8.148f, 17.952f, 7.757f, 18.343f)
                curveTo(7.367f, 18.733f, 7.367f, 19.367f, 7.757f, 19.757f)
                lineTo(10.586f, 22.586f)
                curveTo(11.367f, 23.367f, 12.633f, 23.367f, 13.414f, 22.586f)
                lineTo(16.243f, 19.757f)
                curveTo(16.633f, 19.367f, 16.633f, 18.734f, 16.243f, 18.343f)
                curveTo(15.852f, 17.952f, 15.219f, 17.952f, 14.828f, 18.343f)
                lineTo(13f, 20.171f)
                verticalLineTo(18.001f)
                verticalLineTo(3.828f)
                lineTo(14.828f, 5.657f)
                curveTo(15.219f, 6.047f, 15.852f, 6.047f, 16.243f, 5.657f)
                close()
            }
        }.build()

        return _ArrowDualVertical!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDualVertical: ImageVector? = null
