package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.CloudSuccess: ImageVector
    get() {
        if (_CloudSuccess != null) {
            return _CloudSuccess!!
        }
        _CloudSuccess = ImageVector.Builder(
            name = "CloudSuccess",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.24f, 11.13f)
                curveTo(22.572f, 11.64f, 23.898f, 13.572f, 23.939f, 15.53f)
                curveTo(23.962f, 16.643f, 23.57f, 17.778f, 22.71f, 18.634f)
                curveTo(21.842f, 19.497f, 20.578f, 20f, 19f, 20f)
                lineTo(6f, 20f)
                curveTo(2.024f, 20f, -0.024f, 16.479f, 0.252f, 13.433f)
                curveTo(0.393f, 11.872f, 1.136f, 10.332f, 2.592f, 9.337f)
                curveTo(3.91f, 8.435f, 5.697f, 8.059f, 7.908f, 8.379f)
                curveTo(8.833f, 6.497f, 10.076f, 5.26f, 11.489f, 4.619f)
                curveTo(13.059f, 3.906f, 14.719f, 3.983f, 16.147f, 4.557f)
                curveTo(18.635f, 5.556f, 20.637f, 8.194f, 20.24f, 11.13f)
                close()
                moveTo(12.316f, 6.44f)
                curveTo(11.307f, 6.898f, 10.255f, 7.903f, 9.455f, 9.808f)
                curveTo(9.25f, 10.295f, 8.727f, 10.566f, 8.216f, 10.462f)
                curveTo(6.049f, 10.022f, 4.612f, 10.378f, 3.72f, 10.988f)
                curveTo(2.828f, 11.598f, 2.34f, 12.556f, 2.244f, 13.614f)
                curveTo(2.045f, 15.805f, 3.496f, 18f, 6f, 18f)
                lineTo(19f, 18f)
                curveTo(20.145f, 18f, 20.869f, 17.645f, 21.299f, 17.217f)
                curveTo(21.736f, 16.782f, 21.952f, 16.192f, 21.939f, 15.572f)
                curveTo(21.913f, 14.347f, 20.991f, 13.053f, 19.118f, 13.002f)
                curveTo(18.388f, 12.981f, 17.863f, 12.26f, 18.098f, 11.549f)
                curveTo(18.792f, 9.452f, 17.455f, 7.237f, 15.402f, 6.413f)
                curveTo(14.414f, 6.016f, 13.326f, 5.981f, 12.316f, 6.44f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(15.809f, 10.293f)
                curveTo(15.419f, 9.902f, 14.786f, 9.902f, 14.395f, 10.293f)
                lineTo(11.064f, 13.625f)
                lineTo(9.707f, 12.268f)
                curveTo(9.317f, 11.877f, 8.683f, 11.877f, 8.293f, 12.268f)
                curveTo(7.902f, 12.658f, 7.902f, 13.292f, 8.293f, 13.682f)
                lineTo(10.355f, 15.744f)
                curveTo(10.506f, 15.896f, 10.694f, 15.988f, 10.889f, 16.022f)
                curveTo(11.2f, 16.077f, 11.532f, 15.985f, 11.772f, 15.745f)
                lineTo(15.809f, 11.707f)
                curveTo(16.2f, 11.317f, 16.2f, 10.683f, 15.809f, 10.293f)
                close()
            }
        }.build()

        return _CloudSuccess!!
    }

@Suppress("ObjectPropertyName")
private var _CloudSuccess: ImageVector? = null
