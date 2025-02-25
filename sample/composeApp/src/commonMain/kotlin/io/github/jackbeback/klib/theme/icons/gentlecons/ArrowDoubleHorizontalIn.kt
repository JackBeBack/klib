package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowDoubleHorizontalIn: ImageVector
    get() {
        if (_ArrowDoubleHorizontalIn != null) {
            return _ArrowDoubleHorizontalIn!!
        }
        _ArrowDoubleHorizontalIn = ImageVector.Builder(
            name = "ArrowDoubleHorizontalIn",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6.586f, 7.757f)
                curveTo(6.195f, 7.367f, 5.562f, 7.367f, 5.171f, 7.757f)
                curveTo(4.781f, 8.148f, 4.781f, 8.781f, 5.171f, 9.171f)
                lineTo(7f, 11f)
                horizontalLineTo(1.829f)
                curveTo(1.276f, 11f, 0.829f, 11.448f, 0.829f, 12f)
                curveTo(0.829f, 12.552f, 1.276f, 13f, 1.829f, 13f)
                lineTo(7f, 13f)
                lineTo(5.172f, 14.828f)
                curveTo(4.781f, 15.219f, 4.781f, 15.852f, 5.172f, 16.243f)
                curveTo(5.562f, 16.633f, 6.195f, 16.633f, 6.586f, 16.243f)
                lineTo(9.414f, 13.414f)
                curveTo(10.195f, 12.633f, 10.195f, 11.367f, 9.414f, 10.586f)
                lineTo(6.586f, 7.757f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(17.414f, 16.243f)
                curveTo(17.805f, 16.633f, 18.438f, 16.633f, 18.828f, 16.243f)
                curveTo(19.219f, 15.852f, 19.219f, 15.219f, 18.828f, 14.829f)
                lineTo(17f, 13f)
                horizontalLineTo(22.172f)
                curveTo(22.724f, 13f, 23.172f, 12.552f, 23.172f, 12f)
                curveTo(23.172f, 11.448f, 22.724f, 11f, 22.172f, 11f)
                horizontalLineTo(17f)
                lineTo(18.829f, 9.172f)
                curveTo(19.219f, 8.781f, 19.219f, 8.148f, 18.829f, 7.757f)
                curveTo(18.438f, 7.367f, 17.805f, 7.367f, 17.414f, 7.757f)
                lineTo(14.586f, 10.586f)
                curveTo(13.805f, 11.367f, 13.805f, 12.633f, 14.586f, 13.414f)
                lineTo(17.414f, 16.243f)
                close()
            }
        }.build()

        return _ArrowDoubleHorizontalIn!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDoubleHorizontalIn: ImageVector? = null
