package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowDoubleVerticalIn: ImageVector
    get() {
        if (_ArrowDoubleVerticalIn != null) {
            return _ArrowDoubleVerticalIn!!
        }
        _ArrowDoubleVerticalIn = ImageVector.Builder(
            name = "ArrowDoubleVerticalIn",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(16.243f, 6.586f)
                curveTo(16.633f, 6.195f, 16.633f, 5.562f, 16.243f, 5.172f)
                curveTo(15.852f, 4.781f, 15.219f, 4.781f, 14.828f, 5.172f)
                lineTo(13f, 7f)
                verticalLineTo(1.828f)
                curveTo(13f, 1.276f, 12.552f, 0.828f, 12f, 0.828f)
                curveTo(11.448f, 0.828f, 11f, 1.276f, 11f, 1.828f)
                verticalLineTo(7f)
                lineTo(9.172f, 5.171f)
                curveTo(8.781f, 4.781f, 8.148f, 4.781f, 7.757f, 5.171f)
                curveTo(7.367f, 5.562f, 7.367f, 6.195f, 7.757f, 6.586f)
                lineTo(10.586f, 9.414f)
                curveTo(11.367f, 10.195f, 12.633f, 10.195f, 13.414f, 9.414f)
                lineTo(16.243f, 6.586f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7.757f, 17.414f)
                curveTo(7.367f, 17.805f, 7.367f, 18.438f, 7.757f, 18.828f)
                curveTo(8.148f, 19.219f, 8.781f, 19.219f, 9.172f, 18.828f)
                lineTo(11f, 17f)
                verticalLineTo(22.171f)
                curveTo(11f, 22.724f, 11.448f, 23.171f, 12f, 23.171f)
                curveTo(12.552f, 23.171f, 13f, 22.724f, 13f, 22.171f)
                lineTo(13f, 17f)
                lineTo(14.828f, 18.828f)
                curveTo(15.219f, 19.219f, 15.852f, 19.219f, 16.243f, 18.828f)
                curveTo(16.633f, 18.438f, 16.633f, 17.805f, 16.243f, 17.414f)
                lineTo(13.414f, 14.586f)
                curveTo(12.633f, 13.805f, 11.367f, 13.805f, 10.586f, 14.586f)
                lineTo(7.757f, 17.414f)
                close()
            }
        }.build()

        return _ArrowDoubleVerticalIn!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDoubleVerticalIn: ImageVector? = null
