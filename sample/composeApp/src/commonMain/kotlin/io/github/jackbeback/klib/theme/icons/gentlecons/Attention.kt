package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Attention: ImageVector
    get() {
        if (_Attention != null) {
            return _Attention!!
        }
        _Attention = ImageVector.Builder(
            name = "Attention",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.898f, 3.614f)
                curveTo(12.533f, 2.867f, 11.467f, 2.867f, 11.102f, 3.614f)
                lineTo(3.306f, 19.561f)
                curveTo(2.981f, 20.225f, 3.465f, 21f, 4.204f, 21f)
                horizontalLineTo(19.796f)
                curveTo(20.535f, 21f, 21.019f, 20.225f, 20.694f, 19.561f)
                lineTo(12.898f, 3.614f)
                close()
                moveTo(9.305f, 2.736f)
                curveTo(10.401f, 0.493f, 13.599f, 0.493f, 14.695f, 2.736f)
                lineTo(22.491f, 18.682f)
                curveTo(23.465f, 20.675f, 22.014f, 23f, 19.796f, 23f)
                horizontalLineTo(4.204f)
                curveTo(1.986f, 23f, 0.534f, 20.675f, 1.509f, 18.682f)
                lineTo(9.305f, 2.736f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11f, 8.5f)
                curveTo(11f, 7.948f, 11.448f, 7.5f, 12f, 7.5f)
                curveTo(12.552f, 7.5f, 13f, 7.948f, 13f, 8.5f)
                verticalLineTo(14f)
                curveTo(13f, 14.552f, 12.552f, 15f, 12f, 15f)
                curveTo(11.448f, 15f, 11f, 14.552f, 11f, 14f)
                verticalLineTo(8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(13.5f, 18f)
                curveTo(13.5f, 18.828f, 12.828f, 19.5f, 12f, 19.5f)
                curveTo(11.172f, 19.5f, 10.5f, 18.828f, 10.5f, 18f)
                curveTo(10.5f, 17.172f, 11.172f, 16.5f, 12f, 16.5f)
                curveTo(12.828f, 16.5f, 13.5f, 17.172f, 13.5f, 18f)
                close()
            }
        }.build()

        return _Attention!!
    }

@Suppress("ObjectPropertyName")
private var _Attention: ImageVector? = null
