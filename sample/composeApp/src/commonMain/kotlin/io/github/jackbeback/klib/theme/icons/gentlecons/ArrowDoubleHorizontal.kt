package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowDoubleHorizontal: ImageVector
    get() {
        if (_ArrowDoubleHorizontal != null) {
            return _ArrowDoubleHorizontal!!
        }
        _ArrowDoubleHorizontal = ImageVector.Builder(
            name = "ArrowDoubleHorizontal",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(18.343f, 16.243f)
                curveTo(18.734f, 16.633f, 19.367f, 16.633f, 19.757f, 16.243f)
                lineTo(22.586f, 13.414f)
                curveTo(23.367f, 12.633f, 23.367f, 11.367f, 22.586f, 10.586f)
                lineTo(19.757f, 7.757f)
                curveTo(19.367f, 7.367f, 18.734f, 7.367f, 18.343f, 7.757f)
                curveTo(17.953f, 8.148f, 17.953f, 8.781f, 18.343f, 9.172f)
                lineTo(20.171f, 11f)
                lineTo(15f, 11f)
                curveTo(14.448f, 11f, 14f, 11.448f, 14f, 12f)
                curveTo(14f, 12.552f, 14.448f, 13f, 15f, 13f)
                horizontalLineTo(20.172f)
                lineTo(18.343f, 14.829f)
                curveTo(17.953f, 15.219f, 17.953f, 15.852f, 18.343f, 16.243f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(5.657f, 7.758f)
                curveTo(5.267f, 7.367f, 4.633f, 7.367f, 4.243f, 7.758f)
                lineTo(1.414f, 10.586f)
                curveTo(0.633f, 11.367f, 0.633f, 12.633f, 1.414f, 13.414f)
                lineTo(4.243f, 16.243f)
                curveTo(4.633f, 16.633f, 5.266f, 16.633f, 5.657f, 16.243f)
                curveTo(6.047f, 15.852f, 6.047f, 15.219f, 5.657f, 14.829f)
                lineTo(3.828f, 13f)
                lineTo(9f, 13f)
                curveTo(9.552f, 13f, 10f, 12.552f, 10f, 12f)
                curveTo(10f, 11.448f, 9.552f, 11f, 9f, 11f)
                lineTo(3.829f, 11f)
                lineTo(5.657f, 9.172f)
                curveTo(6.048f, 8.781f, 6.048f, 8.148f, 5.657f, 7.758f)
                close()
            }
        }.build()

        return _ArrowDoubleHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDoubleHorizontal: ImageVector? = null
