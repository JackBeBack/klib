package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Wrench: ImageVector
    get() {
        if (_Wrench != null) {
            return _Wrench!!
        }
        _Wrench = ImageVector.Builder(
            name = "Wrench",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.872f, 1.588f)
                curveTo(4.183f, 1.918f, 4.343f, 2.757f, 4.793f, 3.207f)
                lineTo(9.086f, 7.5f)
                lineTo(7.5f, 9.086f)
                lineTo(3.207f, 4.793f)
                curveTo(2.757f, 4.343f, 1.909f, 4.2f, 1.584f, 4.88f)
                curveTo(0.986f, 6.132f, 0.769f, 7.541f, 0.976f, 8.929f)
                curveTo(1.231f, 10.648f, 2.117f, 12.21f, 3.461f, 13.312f)
                curveTo(4.805f, 14.414f, 6.511f, 14.977f, 8.247f, 14.891f)
                curveTo(8.89f, 14.859f, 9.521f, 14.738f, 10.123f, 14.537f)
                lineTo(17.879f, 22.293f)
                curveTo(19.05f, 23.465f, 20.95f, 23.465f, 22.121f, 22.293f)
                lineTo(22.293f, 22.121f)
                curveTo(23.465f, 20.95f, 23.465f, 19.05f, 22.293f, 17.879f)
                lineTo(14.537f, 10.123f)
                curveTo(14.74f, 9.518f, 14.86f, 8.884f, 14.891f, 8.238f)
                curveTo(14.975f, 6.502f, 14.41f, 4.796f, 13.307f, 3.454f)
                curveTo(12.203f, 2.111f, 10.639f, 1.227f, 8.92f, 0.974f)
                curveTo(7.532f, 0.77f, 6.123f, 0.988f, 4.872f, 1.588f)
                close()
                moveTo(12.094f, 10.509f)
                curveTo(12.536f, 9.8f, 12.793f, 8.984f, 12.834f, 8.138f)
                curveTo(12.893f, 6.913f, 12.495f, 5.709f, 11.716f, 4.762f)
                curveTo(10.937f, 3.815f, 9.833f, 3.191f, 8.619f, 3.012f)
                curveTo(8.212f, 2.952f, 7.802f, 2.944f, 7.399f, 2.985f)
                lineTo(10.5f, 6.086f)
                curveTo(11.281f, 6.867f, 11.281f, 8.133f, 10.5f, 8.914f)
                lineTo(8.914f, 10.5f)
                curveTo(8.133f, 11.281f, 6.867f, 11.281f, 6.086f, 10.5f)
                lineTo(2.985f, 7.399f)
                curveTo(2.943f, 7.804f, 2.952f, 8.216f, 3.013f, 8.626f)
                curveTo(3.193f, 9.839f, 3.819f, 10.942f, 4.767f, 11.72f)
                curveTo(5.716f, 12.497f, 6.919f, 12.894f, 8.145f, 12.834f)
                curveTo(8.99f, 12.792f, 9.803f, 12.534f, 10.511f, 12.093f)
                lineTo(11.995f, 13.577f)
                lineTo(11.992f, 13.578f)
                lineTo(19.293f, 20.879f)
                curveTo(19.683f, 21.269f, 20.317f, 21.269f, 20.707f, 20.879f)
                lineTo(20.879f, 20.707f)
                curveTo(21.269f, 20.317f, 21.269f, 19.683f, 20.879f, 19.293f)
                lineTo(12.094f, 10.509f)
                close()
            }
        }.build()

        return _Wrench!!
    }

@Suppress("ObjectPropertyName")
private var _Wrench: ImageVector? = null
