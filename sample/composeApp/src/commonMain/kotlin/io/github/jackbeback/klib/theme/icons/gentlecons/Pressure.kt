package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Pressure: ImageVector
    get() {
        if (_Pressure != null) {
            return _Pressure!!
        }
        _Pressure = ImageVector.Builder(
            name = "Pressure",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(12f, 9f)
                curveTo(11.448f, 9f, 11f, 9.448f, 11f, 10f)
                verticalLineTo(15.268f)
                curveTo(10.402f, 15.613f, 10f, 16.26f, 10f, 17f)
                curveTo(10f, 18.105f, 10.895f, 19f, 12f, 19f)
                curveTo(13.105f, 19f, 14f, 18.105f, 14f, 17f)
                curveTo(14f, 16.26f, 13.598f, 15.613f, 13f, 15.268f)
                verticalLineTo(10f)
                curveTo(13f, 9.448f, 12.552f, 9f, 12f, 9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11f, 6f)
                curveTo(11f, 5.448f, 11.448f, 5f, 12f, 5f)
                curveTo(12.552f, 5f, 13f, 5.448f, 13f, 6f)
                curveTo(13f, 6.552f, 12.552f, 7f, 12f, 7f)
                curveTo(11.448f, 7f, 11f, 6.552f, 11f, 6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(16f, 7f)
                curveTo(15.448f, 7f, 15f, 7.448f, 15f, 8f)
                curveTo(15f, 8.552f, 15.448f, 9f, 16f, 9f)
                curveTo(16.552f, 9f, 17f, 8.552f, 17f, 8f)
                curveTo(17f, 7.448f, 16.552f, 7f, 16f, 7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6f, 13f)
                curveTo(5.448f, 13f, 5f, 12.552f, 5f, 12f)
                curveTo(5f, 11.448f, 5.448f, 11f, 6f, 11f)
                curveTo(6.552f, 11f, 7f, 11.448f, 7f, 12f)
                curveTo(7f, 12.552f, 6.552f, 13f, 6f, 13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7f, 8f)
                curveTo(7f, 8.552f, 7.448f, 9f, 8f, 9f)
                curveTo(8.552f, 9f, 9f, 8.552f, 9f, 8f)
                curveTo(9f, 7.448f, 8.552f, 7f, 8f, 7f)
                curveTo(7.448f, 7f, 7f, 7.448f, 7f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(18f, 13f)
                curveTo(17.448f, 13f, 17f, 12.552f, 17f, 12f)
                curveTo(17f, 11.448f, 17.448f, 11f, 18f, 11f)
                curveTo(18.552f, 11f, 19f, 11.448f, 19f, 12f)
                curveTo(19f, 12.552f, 18.552f, 13f, 18f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 23f)
                curveTo(18.075f, 23f, 23f, 18.075f, 23f, 12f)
                curveTo(23f, 5.925f, 18.075f, 1f, 12f, 1f)
                curveTo(5.925f, 1f, 1f, 5.925f, 1f, 12f)
                curveTo(1f, 18.075f, 5.925f, 23f, 12f, 23f)
                close()
                moveTo(12f, 20.993f)
                curveTo(7.033f, 20.993f, 3.007f, 16.967f, 3.007f, 12f)
                curveTo(3.007f, 7.033f, 7.033f, 3.007f, 12f, 3.007f)
                curveTo(16.967f, 3.007f, 20.993f, 7.033f, 20.993f, 12f)
                curveTo(20.993f, 16.967f, 16.967f, 20.993f, 12f, 20.993f)
                close()
            }
        }.build()

        return _Pressure!!
    }

@Suppress("ObjectPropertyName")
private var _Pressure: ImageVector? = null
