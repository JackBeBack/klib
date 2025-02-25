package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Tornado: ImageVector
    get() {
        if (_Tornado != null) {
            return _Tornado!!
        }
        _Tornado = ImageVector.Builder(
            name = "Tornado",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(3f, 3f)
                curveTo(3f, 2.448f, 3.448f, 2f, 4f, 2f)
                horizontalLineTo(19f)
                curveTo(19.552f, 2f, 20f, 2.448f, 20f, 3f)
                curveTo(20f, 3.552f, 19.552f, 4f, 19f, 4f)
                horizontalLineTo(4f)
                curveTo(3.448f, 4f, 3f, 3.552f, 3f, 3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7f, 6f)
                curveTo(7f, 5.448f, 7.448f, 5f, 8f, 5f)
                horizontalLineTo(20f)
                curveTo(20.552f, 5f, 21f, 5.448f, 21f, 6f)
                curveTo(21f, 6.552f, 20.552f, 7f, 20f, 7f)
                horizontalLineTo(8f)
                curveTo(7.448f, 7f, 7f, 6.552f, 7f, 6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(10f, 8f)
                curveTo(9.448f, 8f, 9f, 8.448f, 9f, 9f)
                curveTo(9f, 9.552f, 9.448f, 10f, 10f, 10f)
                horizontalLineTo(19f)
                curveTo(19.552f, 10f, 20f, 9.552f, 20f, 9f)
                curveTo(20f, 8.448f, 19.552f, 8f, 19f, 8f)
                horizontalLineTo(10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6f, 12f)
                curveTo(6f, 11.448f, 6.448f, 11f, 7f, 11f)
                horizontalLineTo(15f)
                curveTo(15.552f, 11f, 16f, 11.448f, 16f, 12f)
                curveTo(16f, 12.552f, 15.552f, 13f, 15f, 13f)
                horizontalLineTo(7f)
                curveTo(6.448f, 13f, 6f, 12.552f, 6f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7f, 14f)
                curveTo(6.448f, 14f, 6f, 14.448f, 6f, 15f)
                curveTo(6f, 15.552f, 6.448f, 16f, 7f, 16f)
                horizontalLineTo(13f)
                curveTo(13.552f, 16f, 14f, 15.552f, 14f, 15f)
                curveTo(14f, 14.448f, 13.552f, 14f, 13f, 14f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(9f, 18f)
                curveTo(9f, 17.448f, 9.448f, 17f, 10f, 17f)
                horizontalLineTo(15f)
                curveTo(15.552f, 17f, 16f, 17.448f, 16f, 18f)
                curveTo(16f, 18.552f, 15.552f, 19f, 15f, 19f)
                horizontalLineTo(10f)
                curveTo(9.448f, 19f, 9f, 18.552f, 9f, 18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(14f, 20f)
                curveTo(13.448f, 20f, 13f, 20.448f, 13f, 21f)
                curveTo(13f, 21.552f, 13.448f, 22f, 14f, 22f)
                horizontalLineTo(16f)
                curveTo(16.552f, 22f, 17f, 21.552f, 17f, 21f)
                curveTo(17f, 20.448f, 16.552f, 20f, 16f, 20f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _Tornado!!
    }

@Suppress("ObjectPropertyName")
private var _Tornado: ImageVector? = null
