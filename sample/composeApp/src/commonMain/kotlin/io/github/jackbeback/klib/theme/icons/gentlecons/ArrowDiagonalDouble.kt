package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowDiagonalDouble: ImageVector
    get() {
        if (_ArrowDiagonalDouble != null) {
            return _ArrowDiagonalDouble!!
        }
        _ArrowDiagonalDouble = ImageVector.Builder(
            name = "ArrowDiagonalDouble",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(22f, 8f)
                curveTo(21.448f, 8f, 21f, 7.552f, 21f, 7f)
                verticalLineTo(4.414f)
                lineTo(14.707f, 10.707f)
                curveTo(14.317f, 11.098f, 13.683f, 11.098f, 13.293f, 10.707f)
                curveTo(12.902f, 10.317f, 12.902f, 9.683f, 13.293f, 9.293f)
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
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(2f, 16f)
                curveTo(2.552f, 16f, 3f, 16.448f, 3f, 17f)
                verticalLineTo(19.586f)
                lineTo(9.293f, 13.293f)
                curveTo(9.683f, 12.902f, 10.317f, 12.902f, 10.707f, 13.293f)
                curveTo(11.098f, 13.683f, 11.098f, 14.317f, 10.707f, 14.707f)
                lineTo(4.414f, 21f)
                horizontalLineTo(7f)
                curveTo(7.552f, 21f, 8f, 21.448f, 8f, 22f)
                curveTo(8f, 22.552f, 7.552f, 23f, 7f, 23f)
                horizontalLineTo(3f)
                curveTo(1.895f, 23f, 1f, 22.105f, 1f, 21f)
                verticalLineTo(17f)
                curveTo(1f, 16.448f, 1.448f, 16f, 2f, 16f)
                close()
            }
        }.build()

        return _ArrowDiagonalDouble!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDiagonalDouble: ImageVector? = null
