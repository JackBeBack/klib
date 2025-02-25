package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.PhotoFocus: ImageVector
    get() {
        if (_PhotoFocus != null) {
            return _PhotoFocus!!
        }
        _PhotoFocus = ImageVector.Builder(
            name = "PhotoFocus",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(23f, 4f)
                curveTo(23f, 2.343f, 21.657f, 1f, 20f, 1f)
                horizontalLineTo(16f)
                curveTo(15.448f, 1f, 15f, 1.448f, 15f, 2f)
                curveTo(15f, 2.552f, 15.448f, 3f, 16f, 3f)
                horizontalLineTo(20f)
                curveTo(20.552f, 3f, 21f, 3.448f, 21f, 4f)
                verticalLineTo(8f)
                curveTo(21f, 8.552f, 21.448f, 9f, 22f, 9f)
                curveTo(22.552f, 9f, 23f, 8.552f, 23f, 8f)
                verticalLineTo(4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(23f, 16f)
                curveTo(23f, 15.448f, 22.552f, 15f, 22f, 15f)
                curveTo(21.448f, 15f, 21f, 15.448f, 21f, 16f)
                verticalLineTo(20f)
                curveTo(21f, 20.552f, 20.552f, 21f, 20f, 21f)
                horizontalLineTo(16f)
                curveTo(15.448f, 21f, 15f, 21.448f, 15f, 22f)
                curveTo(15f, 22.552f, 15.448f, 23f, 16f, 23f)
                horizontalLineTo(20f)
                curveTo(21.657f, 23f, 23f, 21.657f, 23f, 20f)
                verticalLineTo(16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(8f, 21f)
                horizontalLineTo(4f)
                curveTo(3.448f, 21f, 3f, 20.552f, 3f, 20f)
                verticalLineTo(16f)
                curveTo(3f, 15.448f, 2.552f, 15f, 2f, 15f)
                curveTo(1.448f, 15f, 1f, 15.448f, 1f, 16f)
                verticalLineTo(20f)
                curveTo(1f, 21.657f, 2.343f, 23f, 4f, 23f)
                horizontalLineTo(8f)
                curveTo(8.552f, 23f, 9f, 22.552f, 9f, 22f)
                curveTo(9f, 21.448f, 8.552f, 21f, 8f, 21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(1f, 8f)
                curveTo(1f, 8.552f, 1.448f, 9f, 2f, 9f)
                curveTo(2.552f, 9f, 3f, 8.552f, 3f, 8f)
                verticalLineTo(4f)
                curveTo(3f, 3.448f, 3.448f, 3f, 4f, 3f)
                horizontalLineTo(8f)
                curveTo(8.552f, 3f, 9f, 2.552f, 9f, 2f)
                curveTo(9f, 1.448f, 8.552f, 1f, 8f, 1f)
                horizontalLineTo(4f)
                curveTo(2.343f, 1f, 1f, 2.343f, 1f, 4f)
                verticalLineTo(8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11f, 9f)
                curveTo(11f, 8.448f, 11.448f, 8f, 12f, 8f)
                curveTo(12.552f, 8f, 13f, 8.448f, 13f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                curveTo(15.552f, 11f, 16f, 11.448f, 16f, 12f)
                curveTo(16f, 12.552f, 15.552f, 13f, 15f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                curveTo(13f, 15.552f, 12.552f, 16f, 12f, 16f)
                curveTo(11.448f, 16f, 11f, 15.552f, 11f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                curveTo(8.448f, 13f, 8f, 12.552f, 8f, 12f)
                curveTo(8f, 11.448f, 8.448f, 11f, 9f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _PhotoFocus!!
    }

@Suppress("ObjectPropertyName")
private var _PhotoFocus: ImageVector? = null
