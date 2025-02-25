package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Dig: ImageVector
    get() {
        if (_Dig != null) {
            return _Dig!!
        }
        _Dig = ImageVector.Builder(
            name = "Dig",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.671f, 1.257f)
                curveTo(19.281f, 0.866f, 18.647f, 0.866f, 18.257f, 1.257f)
                curveTo(17.866f, 1.648f, 17.866f, 2.281f, 18.257f, 2.671f)
                lineTo(19.098f, 3.513f)
                lineTo(10.012f, 12.598f)
                lineTo(8.414f, 11f)
                curveTo(7.633f, 10.219f, 6.367f, 10.219f, 5.586f, 11f)
                lineTo(3.029f, 13.557f)
                curveTo(1.76f, 14.826f, 0.867f, 16.543f, 0.875f, 18.455f)
                curveTo(0.878f, 19.095f, 0.912f, 19.797f, 1.02f, 20.423f)
                curveTo(1.118f, 20.989f, 1.31f, 21.724f, 1.793f, 22.207f)
                curveTo(2.276f, 22.69f, 3.011f, 22.882f, 3.577f, 22.98f)
                curveTo(4.203f, 23.088f, 4.905f, 23.122f, 5.545f, 23.125f)
                curveTo(7.457f, 23.133f, 9.174f, 22.24f, 10.443f, 20.971f)
                lineTo(13f, 18.414f)
                curveTo(13.781f, 17.633f, 13.781f, 16.367f, 13f, 15.586f)
                lineTo(11.427f, 14.013f)
                lineTo(20.513f, 4.927f)
                lineTo(21.321f, 5.736f)
                curveTo(21.712f, 6.126f, 22.345f, 6.126f, 22.736f, 5.736f)
                curveTo(23.126f, 5.345f, 23.126f, 4.712f, 22.736f, 4.321f)
                lineTo(19.671f, 1.257f)
                close()
                moveTo(7.119f, 15.492f)
                lineTo(8.598f, 14.013f)
                lineTo(7f, 12.414f)
                lineTo(4.443f, 14.971f)
                curveTo(3.465f, 15.95f, 2.87f, 17.18f, 2.875f, 18.447f)
                curveTo(2.878f, 19.036f, 2.91f, 19.614f, 2.991f, 20.083f)
                curveTo(3.031f, 20.312f, 3.071f, 20.595f, 3.208f, 20.792f)
                curveTo(3.405f, 20.929f, 3.688f, 20.969f, 3.917f, 21.009f)
                curveTo(4.386f, 21.09f, 4.964f, 21.122f, 5.553f, 21.125f)
                curveTo(6.82f, 21.13f, 8.05f, 20.536f, 9.029f, 19.557f)
                lineTo(11.586f, 17f)
                lineTo(10.013f, 15.427f)
                lineTo(8.533f, 16.906f)
                curveTo(8.143f, 17.297f, 7.51f, 17.297f, 7.119f, 16.906f)
                curveTo(6.729f, 16.516f, 6.729f, 15.882f, 7.119f, 15.492f)
                close()
            }
        }.build()

        return _Dig!!
    }

@Suppress("ObjectPropertyName")
private var _Dig: ImageVector? = null
