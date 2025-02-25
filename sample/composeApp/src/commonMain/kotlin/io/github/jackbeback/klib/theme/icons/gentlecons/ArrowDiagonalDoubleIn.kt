package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowDiagonalDoubleIn: ImageVector
    get() {
        if (_ArrowDiagonalDoubleIn != null) {
            return _ArrowDiagonalDoubleIn!!
        }
        _ArrowDiagonalDoubleIn = ImageVector.Builder(
            name = "ArrowDiagonalDoubleIn",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(9f, 5f)
                curveTo(9f, 4.448f, 9.448f, 4f, 10f, 4f)
                curveTo(10.552f, 4f, 11f, 4.448f, 11f, 5f)
                verticalLineTo(9f)
                curveTo(11f, 10.105f, 10.105f, 11f, 9f, 11f)
                horizontalLineTo(5f)
                curveTo(4.448f, 11f, 4f, 10.552f, 4f, 10f)
                curveTo(4f, 9.448f, 4.448f, 9f, 5f, 9f)
                horizontalLineTo(7.586f)
                lineTo(1.293f, 2.707f)
                curveTo(0.902f, 2.317f, 0.902f, 1.683f, 1.293f, 1.293f)
                curveTo(1.683f, 0.902f, 2.317f, 0.902f, 2.707f, 1.293f)
                lineTo(9f, 7.586f)
                verticalLineTo(5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(15f, 19f)
                curveTo(15f, 19.552f, 14.552f, 20f, 14f, 20f)
                curveTo(13.448f, 20f, 13f, 19.552f, 13f, 19f)
                verticalLineTo(15f)
                curveTo(13f, 13.895f, 13.895f, 13f, 15f, 13f)
                horizontalLineTo(19f)
                curveTo(19.552f, 13f, 20f, 13.448f, 20f, 14f)
                curveTo(20f, 14.552f, 19.552f, 15f, 19f, 15f)
                horizontalLineTo(16.414f)
                lineTo(22.707f, 21.293f)
                curveTo(23.098f, 21.683f, 23.098f, 22.317f, 22.707f, 22.707f)
                curveTo(22.317f, 23.098f, 21.683f, 23.098f, 21.293f, 22.707f)
                lineTo(15f, 16.414f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _ArrowDiagonalDoubleIn!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDiagonalDoubleIn: ImageVector? = null
