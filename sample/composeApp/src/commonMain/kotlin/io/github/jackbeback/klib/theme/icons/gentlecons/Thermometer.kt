package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Thermometer: ImageVector
    get() {
        if (_Thermometer != null) {
            return _Thermometer!!
        }
        _Thermometer = ImageVector.Builder(
            name = "Thermometer",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(16.707f, 8.707f)
                curveTo(17.098f, 8.317f, 17.098f, 7.684f, 16.707f, 7.293f)
                curveTo(16.317f, 6.902f, 15.683f, 6.902f, 15.293f, 7.293f)
                lineTo(7.293f, 15.293f)
                curveTo(6.902f, 15.684f, 6.902f, 16.317f, 7.293f, 16.707f)
                curveTo(7.683f, 17.098f, 8.317f, 17.098f, 8.707f, 16.707f)
                lineTo(16.707f, 8.707f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 15.328f)
                verticalLineTo(18.586f)
                lineTo(1.293f, 21.293f)
                curveTo(0.902f, 21.684f, 0.902f, 22.317f, 1.293f, 22.707f)
                curveTo(1.683f, 23.098f, 2.317f, 23.098f, 2.707f, 22.707f)
                lineTo(5.414f, 20f)
                horizontalLineTo(8.672f)
                curveTo(9.467f, 20f, 10.23f, 19.684f, 10.793f, 19.121f)
                lineTo(21.457f, 8.457f)
                curveTo(23.09f, 6.824f, 23.09f, 4.176f, 21.457f, 2.543f)
                curveTo(19.824f, 0.91f, 17.176f, 0.91f, 15.543f, 2.543f)
                lineTo(4.879f, 13.207f)
                curveTo(4.316f, 13.77f, 4f, 14.533f, 4f, 15.328f)
                close()
                moveTo(16.957f, 3.957f)
                curveTo(17.809f, 3.105f, 19.191f, 3.105f, 20.043f, 3.957f)
                curveTo(20.895f, 4.809f, 20.895f, 6.191f, 20.043f, 7.043f)
                lineTo(9.379f, 17.707f)
                curveTo(9.191f, 17.895f, 8.937f, 18f, 8.672f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(15.328f)
                curveTo(6f, 15.063f, 6.105f, 14.809f, 6.293f, 14.621f)
                lineTo(16.957f, 3.957f)
                close()
            }
        }.build()

        return _Thermometer!!
    }

@Suppress("ObjectPropertyName")
private var _Thermometer: ImageVector? = null
