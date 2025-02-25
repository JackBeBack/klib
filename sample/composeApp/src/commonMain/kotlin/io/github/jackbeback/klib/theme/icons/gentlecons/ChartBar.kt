package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ChartBar: ImageVector
    get() {
        if (_ChartBar != null) {
            return _ChartBar!!
        }
        _ChartBar = ImageVector.Builder(
            name = "ChartBar",
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
                moveTo(7f, 18f)
                curveTo(6.448f, 18f, 6f, 17.552f, 6f, 17f)
                curveTo(6f, 16.448f, 6.448f, 16f, 7f, 16f)
                horizontalLineTo(10f)
                curveTo(10.552f, 16f, 11f, 16.448f, 11f, 17f)
                curveTo(11f, 17.552f, 10.552f, 18f, 10f, 18f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6f, 13f)
                curveTo(6f, 13.552f, 6.448f, 14f, 7f, 14f)
                horizontalLineTo(13f)
                curveTo(13.552f, 14f, 14f, 13.552f, 14f, 13f)
                curveTo(14f, 12.448f, 13.552f, 12f, 13f, 12f)
                horizontalLineTo(7f)
                curveTo(6.448f, 12f, 6f, 12.448f, 6f, 13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7f, 10f)
                curveTo(6.448f, 10f, 6f, 9.552f, 6f, 9f)
                curveTo(6f, 8.448f, 6.448f, 8f, 7f, 8f)
                horizontalLineTo(16f)
                curveTo(16.552f, 8f, 17f, 8.448f, 17f, 9f)
                curveTo(17f, 9.552f, 16.552f, 10f, 16f, 10f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6f, 5f)
                curveTo(6f, 5.552f, 6.448f, 6f, 7f, 6f)
                lineTo(19f, 6f)
                curveTo(19.552f, 6f, 20f, 5.552f, 20f, 5f)
                curveTo(20f, 4.448f, 19.552f, 4f, 19f, 4f)
                lineTo(7f, 4f)
                curveTo(6.448f, 4f, 6f, 4.448f, 6f, 5f)
                close()
            }
        }.build()

        return _ChartBar!!
    }

@Suppress("ObjectPropertyName")
private var _ChartBar: ImageVector? = null
