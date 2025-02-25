package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowResize: ImageVector
    get() {
        if (_ArrowResize != null) {
            return _ArrowResize!!
        }
        _ArrowResize = ImageVector.Builder(
            name = "ArrowResize",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(22f, 8f)
                curveTo(21.448f, 8f, 21f, 7.552f, 21f, 7f)
                verticalLineTo(4.414f)
                lineTo(13.414f, 12f)
                lineTo(21f, 19.586f)
                verticalLineTo(17f)
                curveTo(21f, 16.448f, 21.448f, 16f, 22f, 16f)
                curveTo(22.552f, 16f, 23f, 16.448f, 23f, 17f)
                verticalLineTo(21f)
                curveTo(23f, 22.105f, 22.105f, 23f, 21f, 23f)
                horizontalLineTo(17f)
                curveTo(16.448f, 23f, 16f, 22.552f, 16f, 22f)
                curveTo(16f, 21.448f, 16.448f, 21f, 17f, 21f)
                horizontalLineTo(19.586f)
                lineTo(12f, 13.414f)
                lineTo(4.414f, 21f)
                horizontalLineTo(7f)
                curveTo(7.552f, 21f, 8f, 21.448f, 8f, 22f)
                curveTo(8f, 22.552f, 7.552f, 23f, 7f, 23f)
                horizontalLineTo(3f)
                curveTo(1.895f, 23f, 1f, 22.105f, 1f, 21f)
                verticalLineTo(17f)
                curveTo(1f, 16.448f, 1.448f, 16f, 2f, 16f)
                curveTo(2.552f, 16f, 3f, 16.448f, 3f, 17f)
                verticalLineTo(19.586f)
                lineTo(10.586f, 12f)
                lineTo(3f, 4.414f)
                verticalLineTo(7f)
                curveTo(3f, 7.552f, 2.552f, 8f, 2f, 8f)
                curveTo(1.448f, 8f, 1f, 7.552f, 1f, 7f)
                verticalLineTo(3f)
                curveTo(1f, 1.895f, 1.895f, 1f, 3f, 1f)
                horizontalLineTo(7f)
                curveTo(7.552f, 1f, 8f, 1.448f, 8f, 2f)
                curveTo(8f, 2.552f, 7.552f, 3f, 7f, 3f)
                horizontalLineTo(4.414f)
                lineTo(12f, 10.586f)
                lineTo(19.586f, 3f)
                horizontalLineTo(17f)
                curveTo(16.448f, 3f, 16f, 2.552f, 16f, 2f)
                curveTo(16f, 1.448f, 16.448f, 1f, 17f, 1f)
                horizontalLineTo(21f)
                curveTo(22.105f, 1f, 23f, 1.895f, 23f, 3f)
                verticalLineTo(7f)
                curveTo(23f, 7.552f, 22.552f, 8f, 22f, 8f)
                close()
            }
        }.build()

        return _ArrowResize!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowResize: ImageVector? = null
