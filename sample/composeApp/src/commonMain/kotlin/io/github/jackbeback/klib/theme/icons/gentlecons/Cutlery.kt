package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Cutlery: ImageVector
    get() {
        if (_Cutlery != null) {
            return _Cutlery!!
        }
        _Cutlery = ImageVector.Builder(
            name = "Cutlery",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.733f, 1.036f)
                curveTo(2.08f, 0.94f, 2.452f, 1.038f, 2.707f, 1.293f)
                lineTo(22.707f, 21.293f)
                curveTo(23.098f, 21.683f, 23.098f, 22.317f, 22.707f, 22.707f)
                curveTo(22.317f, 23.098f, 21.683f, 23.098f, 21.293f, 22.707f)
                lineTo(14f, 15.414f)
                lineTo(12.914f, 16.5f)
                curveTo(12.134f, 17.28f, 10.868f, 17.283f, 10.087f, 16.501f)
                lineTo(3.293f, 9.707f)
                curveTo(1.583f, 7.997f, 1.019f, 6.002f, 0.879f, 4.466f)
                curveTo(0.809f, 3.698f, 0.844f, 3.036f, 0.897f, 2.561f)
                curveTo(0.927f, 2.293f, 0.964f, 2.022f, 1.029f, 1.759f)
                curveTo(1.116f, 1.413f, 1.389f, 1.132f, 1.733f, 1.036f)
                close()
                moveTo(2.871f, 4.285f)
                curveTo(2.981f, 5.498f, 3.417f, 7.003f, 4.707f, 8.293f)
                lineTo(11.5f, 15.086f)
                lineTo(12.586f, 14f)
                lineTo(2.871f, 4.285f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(18.207f, 1.793f)
                curveTo(18.598f, 2.183f, 18.598f, 2.817f, 18.207f, 3.207f)
                lineTo(15.311f, 6.103f)
                curveTo(14.955f, 6.459f, 14.95f, 6.974f, 15.198f, 7.387f)
                lineTo(18.793f, 3.793f)
                curveTo(19.183f, 3.402f, 19.817f, 3.402f, 20.207f, 3.793f)
                curveTo(20.598f, 4.183f, 20.598f, 4.817f, 20.207f, 5.207f)
                lineTo(16.613f, 8.801f)
                curveTo(17.026f, 9.05f, 17.541f, 9.045f, 17.897f, 8.689f)
                lineTo(20.793f, 5.793f)
                curveTo(21.183f, 5.402f, 21.817f, 5.402f, 22.207f, 5.793f)
                curveTo(22.598f, 6.183f, 22.598f, 6.817f, 22.207f, 7.207f)
                lineTo(19.311f, 10.103f)
                curveTo(18.338f, 11.076f, 16.827f, 11.262f, 15.646f, 10.554f)
                lineTo(15.155f, 10.259f)
                lineTo(14.707f, 10.707f)
                curveTo(14.317f, 11.098f, 13.683f, 11.098f, 13.293f, 10.707f)
                curveTo(12.902f, 10.317f, 12.902f, 9.683f, 13.293f, 9.293f)
                lineTo(13.741f, 8.845f)
                lineTo(13.446f, 8.354f)
                curveTo(12.738f, 7.173f, 12.924f, 5.662f, 13.897f, 4.689f)
                lineTo(16.793f, 1.793f)
                curveTo(17.183f, 1.402f, 17.817f, 1.402f, 18.207f, 1.793f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(8.207f, 17.207f)
                curveTo(8.598f, 16.817f, 8.598f, 16.183f, 8.207f, 15.793f)
                curveTo(7.817f, 15.402f, 7.183f, 15.402f, 6.793f, 15.793f)
                lineTo(1.293f, 21.293f)
                curveTo(0.902f, 21.683f, 0.902f, 22.317f, 1.293f, 22.707f)
                curveTo(1.683f, 23.098f, 2.317f, 23.098f, 2.707f, 22.707f)
                lineTo(8.207f, 17.207f)
                close()
            }
        }.build()

        return _Cutlery!!
    }

@Suppress("ObjectPropertyName")
private var _Cutlery: ImageVector? = null
