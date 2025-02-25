package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Syringe: ImageVector
    get() {
        if (_Syringe != null) {
            return _Syringe!!
        }
        _Syringe = ImageVector.Builder(
            name = "Syringe",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.707f, 1.293f)
                curveTo(18.317f, 0.902f, 17.683f, 0.902f, 17.293f, 1.293f)
                curveTo(16.902f, 1.683f, 16.902f, 2.317f, 17.293f, 2.707f)
                lineTo(18.586f, 4f)
                lineTo(15.5f, 7.086f)
                lineTo(11.707f, 3.293f)
                curveTo(11.317f, 2.902f, 10.683f, 2.902f, 10.293f, 3.293f)
                curveTo(9.902f, 3.683f, 9.902f, 4.317f, 10.293f, 4.707f)
                lineTo(11.586f, 6f)
                lineTo(3.207f, 14.379f)
                curveTo(2.036f, 15.55f, 2.036f, 17.45f, 3.207f, 18.621f)
                lineTo(3.586f, 19f)
                lineTo(1.293f, 21.293f)
                curveTo(0.902f, 21.683f, 0.902f, 22.317f, 1.293f, 22.707f)
                curveTo(1.683f, 23.098f, 2.317f, 23.098f, 2.707f, 22.707f)
                lineTo(5f, 20.414f)
                lineTo(5.379f, 20.793f)
                curveTo(6.55f, 21.965f, 8.45f, 21.965f, 9.621f, 20.793f)
                lineTo(18f, 12.414f)
                lineTo(19.293f, 13.707f)
                curveTo(19.683f, 14.098f, 20.317f, 14.098f, 20.707f, 13.707f)
                curveTo(21.098f, 13.317f, 21.098f, 12.683f, 20.707f, 12.293f)
                lineTo(16.914f, 8.5f)
                lineTo(20f, 5.414f)
                lineTo(21.293f, 6.707f)
                curveTo(21.683f, 7.098f, 22.317f, 7.098f, 22.707f, 6.707f)
                curveTo(23.098f, 6.317f, 23.098f, 5.683f, 22.707f, 5.293f)
                lineTo(18.707f, 1.293f)
                close()
                moveTo(14.086f, 8.5f)
                lineTo(13f, 7.414f)
                lineTo(10.914f, 9.5f)
                lineTo(12f, 10.586f)
                lineTo(14.086f, 8.5f)
                close()
                moveTo(13.414f, 12f)
                lineTo(15.5f, 9.914f)
                lineTo(16.586f, 11f)
                lineTo(14.5f, 13.086f)
                lineTo(13.414f, 12f)
                close()
                moveTo(4.621f, 15.793f)
                lineTo(9.5f, 10.914f)
                lineTo(13.086f, 14.5f)
                lineTo(8.207f, 19.379f)
                curveTo(7.817f, 19.769f, 7.183f, 19.769f, 6.793f, 19.379f)
                lineTo(4.621f, 17.207f)
                curveTo(4.231f, 16.817f, 4.231f, 16.183f, 4.621f, 15.793f)
                close()
            }
        }.build()

        return _Syringe!!
    }

@Suppress("ObjectPropertyName")
private var _Syringe: ImageVector? = null
