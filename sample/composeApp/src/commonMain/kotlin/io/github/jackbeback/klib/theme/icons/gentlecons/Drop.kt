package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Drop: ImageVector
    get() {
        if (_Drop != null) {
            return _Drop!!
        }
        _Drop = ImageVector.Builder(
            name = "Drop",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(9f, 14f)
                curveTo(9f, 13.448f, 8.552f, 13f, 8f, 13f)
                curveTo(7.448f, 13f, 7f, 13.448f, 7f, 14f)
                curveTo(7f, 15.357f, 7.267f, 16.737f, 8.082f, 17.797f)
                curveTo(8.934f, 18.905f, 10.257f, 19.5f, 12f, 19.5f)
                curveTo(12.552f, 19.5f, 13f, 19.052f, 13f, 18.5f)
                curveTo(13f, 17.948f, 12.552f, 17.5f, 12f, 17.5f)
                curveTo(10.743f, 17.5f, 10.066f, 17.095f, 9.668f, 16.578f)
                curveTo(9.233f, 16.013f, 9f, 15.143f, 9f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.423f, 1.543f)
                curveTo(12.651f, 0.712f, 11.348f, 0.712f, 10.577f, 1.543f)
                curveTo(9.633f, 2.559f, 7.891f, 4.53f, 6.379f, 6.779f)
                curveTo(4.87f, 9.022f, 3.47f, 11.577f, 3.494f, 14.353f)
                curveTo(3.496f, 14.598f, 3.509f, 14.943f, 3.552f, 15.354f)
                curveTo(3.637f, 16.17f, 3.842f, 17.278f, 4.334f, 18.401f)
                curveTo(4.827f, 19.528f, 5.619f, 20.692f, 6.882f, 21.571f)
                curveTo(8.151f, 22.454f, 9.826f, 23f, 12f, 23f)
                curveTo(14.174f, 23f, 15.849f, 22.454f, 17.118f, 21.571f)
                curveTo(18.381f, 20.692f, 19.173f, 19.529f, 19.666f, 18.401f)
                curveTo(20.157f, 17.278f, 20.363f, 16.17f, 20.448f, 15.354f)
                curveTo(20.49f, 14.943f, 20.504f, 14.598f, 20.506f, 14.353f)
                curveTo(20.531f, 11.577f, 19.129f, 9.022f, 17.621f, 6.779f)
                curveTo(16.108f, 4.53f, 14.367f, 2.559f, 13.423f, 1.543f)
                close()
                moveTo(8.039f, 7.895f)
                curveTo(9.446f, 5.803f, 11.08f, 3.943f, 12f, 2.949f)
                curveTo(12.92f, 3.943f, 14.554f, 5.803f, 15.961f, 7.895f)
                curveTo(17.235f, 9.789f, 18.527f, 11.981f, 18.506f, 14.335f)
                curveTo(18.504f, 14.527f, 18.494f, 14.807f, 18.458f, 15.146f)
                curveTo(18.387f, 15.83f, 18.218f, 16.722f, 17.834f, 17.599f)
                curveTo(17.452f, 18.472f, 16.869f, 19.308f, 15.976f, 19.929f)
                curveTo(15.088f, 20.546f, 13.826f, 21f, 12f, 21f)
                curveTo(10.174f, 21f, 8.911f, 20.546f, 8.024f, 19.929f)
                curveTo(7.131f, 19.308f, 6.548f, 18.472f, 6.166f, 17.599f)
                curveTo(5.782f, 16.722f, 5.613f, 15.83f, 5.541f, 15.146f)
                curveTo(5.506f, 14.807f, 5.496f, 14.527f, 5.494f, 14.335f)
                curveTo(5.473f, 11.981f, 6.765f, 9.789f, 8.039f, 7.895f)
                close()
            }
        }.build()

        return _Drop!!
    }

@Suppress("ObjectPropertyName")
private var _Drop: ImageVector? = null
