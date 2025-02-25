package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Taxi: ImageVector
    get() {
        if (_Taxi != null) {
            return _Taxi!!
        }
        _Taxi = ImageVector.Builder(
            name = "Taxi",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(2f, 11f)
                curveTo(2f, 11.552f, 2.448f, 12f, 3f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                curveTo(6f, 8.448f, 5.552f, 8f, 5f, 8f)
                horizontalLineTo(3f)
                curveTo(2.448f, 8f, 2f, 8.448f, 2f, 9f)
                verticalLineTo(11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(10f, 12f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                curveTo(14f, 8.448f, 13.552f, 8f, 13f, 8f)
                horizontalLineTo(11f)
                curveTo(10.448f, 8f, 10f, 8.448f, 10f, 9f)
                verticalLineTo(12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6f, 15f)
                curveTo(6f, 15.552f, 6.448f, 16f, 7f, 16f)
                horizontalLineTo(9f)
                curveTo(9.552f, 16f, 10f, 15.552f, 10f, 15f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(18f, 12f)
                horizontalLineTo(21f)
                curveTo(21.552f, 12f, 22f, 11.552f, 22f, 11f)
                verticalLineTo(9f)
                curveTo(22f, 8.448f, 21.552f, 8f, 21f, 8f)
                horizontalLineTo(19f)
                curveTo(18.448f, 8f, 18f, 8.448f, 18f, 9f)
                verticalLineTo(12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(14f, 15f)
                curveTo(14f, 15.552f, 14.448f, 16f, 15f, 16f)
                horizontalLineTo(17f)
                curveTo(17.552f, 16f, 18f, 15.552f, 18f, 15f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(2f, 19f)
                curveTo(2f, 18.448f, 2.448f, 18f, 3f, 18f)
                horizontalLineTo(21f)
                curveTo(21.552f, 18f, 22f, 18.448f, 22f, 19f)
                curveTo(22f, 19.552f, 21.552f, 20f, 21f, 20f)
                horizontalLineTo(3f)
                curveTo(2.448f, 20f, 2f, 19.552f, 2f, 19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(2f, 5f)
                curveTo(2f, 4.448f, 2.448f, 4f, 3f, 4f)
                horizontalLineTo(21f)
                curveTo(21.552f, 4f, 22f, 4.448f, 22f, 5f)
                curveTo(22f, 5.552f, 21.552f, 6f, 21f, 6f)
                horizontalLineTo(3f)
                curveTo(2.448f, 6f, 2f, 5.552f, 2f, 5f)
                close()
            }
        }.build()

        return _Taxi!!
    }

@Suppress("ObjectPropertyName")
private var _Taxi: ImageVector? = null
