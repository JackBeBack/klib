package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.BloodType: ImageVector
    get() {
        if (_BloodType != null) {
            return _BloodType!!
        }
        _BloodType = ImageVector.Builder(
            name = "BloodType",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11f, 11f)
                curveTo(11f, 10.448f, 11.448f, 10f, 12f, 10f)
                curveTo(12.552f, 10f, 13f, 10.448f, 13f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                curveTo(15.552f, 13f, 16f, 13.448f, 16f, 14f)
                curveTo(16f, 14.552f, 15.552f, 15f, 15f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                curveTo(13f, 17.552f, 12.552f, 18f, 12f, 18f)
                curveTo(11.448f, 18f, 11f, 17.552f, 11f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                curveTo(8.448f, 15f, 8f, 14.552f, 8f, 14f)
                curveTo(8f, 13.448f, 8.448f, 13f, 9f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.577f, 1.543f)
                curveTo(11.348f, 0.712f, 12.651f, 0.712f, 13.423f, 1.543f)
                curveTo(14.367f, 2.559f, 16.108f, 4.53f, 17.621f, 6.779f)
                curveTo(19.129f, 9.022f, 20.531f, 11.577f, 20.506f, 14.353f)
                curveTo(20.504f, 14.598f, 20.491f, 14.943f, 20.448f, 15.354f)
                curveTo(20.363f, 16.17f, 20.157f, 17.278f, 19.666f, 18.401f)
                curveTo(19.173f, 19.529f, 18.381f, 20.692f, 17.118f, 21.571f)
                curveTo(15.849f, 22.454f, 14.174f, 23f, 12f, 23f)
                curveTo(9.826f, 23f, 8.151f, 22.454f, 6.882f, 21.571f)
                curveTo(5.619f, 20.692f, 4.827f, 19.528f, 4.334f, 18.401f)
                curveTo(3.842f, 17.278f, 3.637f, 16.17f, 3.552f, 15.354f)
                curveTo(3.509f, 14.943f, 3.496f, 14.598f, 3.494f, 14.353f)
                curveTo(3.47f, 11.577f, 4.87f, 9.022f, 6.379f, 6.779f)
                curveTo(7.891f, 4.53f, 9.633f, 2.559f, 10.577f, 1.543f)
                close()
                moveTo(12f, 2.949f)
                curveTo(11.08f, 3.943f, 9.446f, 5.803f, 8.039f, 7.895f)
                curveTo(6.765f, 9.789f, 5.473f, 11.981f, 5.494f, 14.335f)
                curveTo(5.496f, 14.527f, 5.506f, 14.807f, 5.541f, 15.146f)
                curveTo(5.613f, 15.83f, 5.782f, 16.722f, 6.166f, 17.599f)
                curveTo(6.548f, 18.472f, 7.131f, 19.308f, 8.024f, 19.929f)
                curveTo(8.911f, 20.546f, 10.174f, 21f, 12f, 21f)
                curveTo(13.826f, 21f, 15.088f, 20.546f, 15.976f, 19.929f)
                curveTo(16.869f, 19.308f, 17.452f, 18.472f, 17.834f, 17.599f)
                curveTo(18.218f, 16.722f, 18.387f, 15.83f, 18.458f, 15.146f)
                curveTo(18.494f, 14.807f, 18.504f, 14.527f, 18.506f, 14.335f)
                curveTo(18.527f, 11.981f, 17.235f, 9.789f, 15.961f, 7.895f)
                curveTo(14.554f, 5.803f, 12.92f, 3.943f, 12f, 2.949f)
                close()
            }
        }.build()

        return _BloodType!!
    }

@Suppress("ObjectPropertyName")
private var _BloodType: ImageVector? = null
