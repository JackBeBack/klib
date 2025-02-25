package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowDiagonalDoubleOpp: ImageVector
    get() {
        if (_ArrowDiagonalDoubleOpp != null) {
            return _ArrowDiagonalDoubleOpp!!
        }
        _ArrowDiagonalDoubleOpp = ImageVector.Builder(
            name = "ArrowDiagonalDoubleOpp",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(22f, 16f)
                curveTo(21.448f, 16f, 21f, 16.448f, 21f, 17f)
                verticalLineTo(19.586f)
                lineTo(14.707f, 13.293f)
                curveTo(14.317f, 12.902f, 13.683f, 12.902f, 13.293f, 13.293f)
                curveTo(12.902f, 13.683f, 12.902f, 14.317f, 13.293f, 14.707f)
                lineTo(19.586f, 21f)
                horizontalLineTo(17f)
                curveTo(16.448f, 21f, 16f, 21.448f, 16f, 22f)
                curveTo(16f, 22.552f, 16.448f, 23f, 17f, 23f)
                horizontalLineTo(21f)
                curveTo(22.105f, 23f, 23f, 22.105f, 23f, 21f)
                verticalLineTo(17f)
                curveTo(23f, 16.448f, 22.552f, 16f, 22f, 16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(2f, 8f)
                curveTo(2.552f, 8f, 3f, 7.552f, 3f, 7f)
                verticalLineTo(4.414f)
                lineTo(9.293f, 10.707f)
                curveTo(9.683f, 11.098f, 10.317f, 11.098f, 10.707f, 10.707f)
                curveTo(11.098f, 10.317f, 11.098f, 9.683f, 10.707f, 9.293f)
                lineTo(4.414f, 3f)
                horizontalLineTo(7f)
                curveTo(7.552f, 3f, 8f, 2.552f, 8f, 2f)
                curveTo(8f, 1.448f, 7.552f, 1f, 7f, 1f)
                horizontalLineTo(3f)
                curveTo(1.895f, 1f, 1f, 1.895f, 1f, 3f)
                verticalLineTo(7f)
                curveTo(1f, 7.552f, 1.448f, 8f, 2f, 8f)
                close()
            }
        }.build()

        return _ArrowDiagonalDoubleOpp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDiagonalDoubleOpp: ImageVector? = null
