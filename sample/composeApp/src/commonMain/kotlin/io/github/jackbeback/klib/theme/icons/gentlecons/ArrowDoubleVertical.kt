package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowDoubleVertical: ImageVector
    get() {
        if (_ArrowDoubleVertical != null) {
            return _ArrowDoubleVertical!!
        }
        _ArrowDoubleVertical = ImageVector.Builder(
            name = "ArrowDoubleVertical",
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
                verticalLineTo(9f)
                curveTo(11f, 9.552f, 11.448f, 10f, 12f, 10f)
                curveTo(12.552f, 10f, 13f, 9.552f, 13f, 9f)
                verticalLineTo(3.828f)
                lineTo(14.828f, 5.657f)
                curveTo(15.219f, 6.047f, 15.852f, 6.047f, 16.243f, 5.657f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7.757f, 18.343f)
                curveTo(7.367f, 18.733f, 7.367f, 19.367f, 7.757f, 19.757f)
                lineTo(10.586f, 22.586f)
                curveTo(11.367f, 23.367f, 12.633f, 23.367f, 13.414f, 22.586f)
                lineTo(16.243f, 19.757f)
                curveTo(16.633f, 19.367f, 16.633f, 18.734f, 16.243f, 18.343f)
                curveTo(15.852f, 17.953f, 15.219f, 17.953f, 14.828f, 18.343f)
                lineTo(13f, 20.172f)
                lineTo(13f, 15f)
                curveTo(13f, 14.448f, 12.552f, 14f, 12f, 14f)
                curveTo(11.448f, 14f, 11f, 14.448f, 11f, 15f)
                lineTo(11f, 20.171f)
                lineTo(9.172f, 18.343f)
                curveTo(8.781f, 17.952f, 8.148f, 17.952f, 7.757f, 18.343f)
                close()
            }
        }.build()

        return _ArrowDoubleVertical!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDoubleVertical: ImageVector? = null
