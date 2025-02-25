package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ChartColumn: ImageVector
    get() {
        if (_ChartColumn != null) {
            return _ChartColumn!!
        }
        _ChartColumn = ImageVector.Builder(
            name = "ChartColumn",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(2f, 1f)
                curveTo(1.448f, 1f, 1f, 1.448f, 1f, 2f)
                verticalLineTo(21f)
                curveTo(1f, 22.105f, 1.895f, 23f, 3f, 23f)
                horizontalLineTo(22f)
                curveTo(22.552f, 23f, 23f, 22.552f, 23f, 22f)
                curveTo(23f, 21.448f, 22.552f, 21f, 22f, 21f)
                lineTo(4f, 21f)
                curveTo(3.448f, 21f, 3f, 20.552f, 3f, 20f)
                verticalLineTo(2f)
                curveTo(3f, 1.448f, 2.552f, 1f, 2f, 1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6f, 14f)
                curveTo(6f, 13.448f, 6.448f, 13f, 7f, 13f)
                curveTo(7.552f, 13f, 8f, 13.448f, 8f, 14f)
                verticalLineTo(17f)
                curveTo(8f, 17.552f, 7.552f, 18f, 7f, 18f)
                curveTo(6.448f, 18f, 6f, 17.552f, 6f, 17f)
                verticalLineTo(14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11f, 10f)
                curveTo(10.448f, 10f, 10f, 10.448f, 10f, 11f)
                verticalLineTo(17f)
                curveTo(10f, 17.552f, 10.448f, 18f, 11f, 18f)
                curveTo(11.552f, 18f, 12f, 17.552f, 12f, 17f)
                verticalLineTo(11f)
                curveTo(12f, 10.448f, 11.552f, 10f, 11f, 10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(14f, 8f)
                curveTo(14f, 7.448f, 14.448f, 7f, 15f, 7f)
                curveTo(15.552f, 7f, 16f, 7.448f, 16f, 8f)
                verticalLineTo(17f)
                curveTo(16f, 17.552f, 15.552f, 18f, 15f, 18f)
                curveTo(14.448f, 18f, 14f, 17.552f, 14f, 17f)
                verticalLineTo(8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(19f, 4f)
                curveTo(18.448f, 4f, 18f, 4.448f, 18f, 5f)
                verticalLineTo(17f)
                curveTo(18f, 17.552f, 18.448f, 18f, 19f, 18f)
                curveTo(19.552f, 18f, 20f, 17.552f, 20f, 17f)
                verticalLineTo(5f)
                curveTo(20f, 4.448f, 19.552f, 4f, 19f, 4f)
                close()
            }
        }.build()

        return _ChartColumn!!
    }

@Suppress("ObjectPropertyName")
private var _ChartColumn: ImageVector? = null
