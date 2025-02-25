package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Takeoff: ImageVector
    get() {
        if (_Takeoff != null) {
            return _Takeoff!!
        }
        _Takeoff = ImageVector.Builder(
            name = "Takeoff",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.309f, 9.321f)
                curveTo(2.991f, 8.202f, 3.18f, 6.115f, 4.677f, 5.25f)
                lineTo(5.111f, 5f)
                curveTo(5.888f, 4.551f, 6.846f, 4.554f, 7.621f, 5.006f)
                lineTo(13.082f, 8.191f)
                curveTo(13.088f, 8.194f, 13.215f, 8.235f, 13.339f, 8.243f)
                curveTo(13.408f, 8.248f, 13.463f, 8.246f, 13.497f, 8.241f)
                lineTo(16.726f, 6.377f)
                curveTo(18.529f, 5.336f, 19.824f, 5.19f, 21.111f, 5.629f)
                curveTo(22.356f, 6.054f, 23.164f, 6.967f, 23.637f, 7.68f)
                curveTo(24.431f, 8.879f, 23.779f, 10.237f, 22.798f, 10.804f)
                lineTo(8.076f, 19.454f)
                curveTo(6.94f, 20.11f, 5.509f, 19.951f, 4.544f, 19.063f)
                lineTo(0.5f, 15.338f)
                curveTo(-0.54f, 14.38f, 0.202f, 12.647f, 1.613f, 12.738f)
                lineTo(5.297f, 12.976f)
                lineTo(7.27f, 11.836f)
                lineTo(4.309f, 9.321f)
                close()
                moveTo(5.677f, 6.983f)
                curveTo(5.378f, 7.155f, 5.34f, 7.573f, 5.603f, 7.797f)
                lineTo(9.106f, 10.771f)
                curveTo(9.896f, 11.443f, 9.783f, 12.695f, 8.884f, 13.214f)
                lineTo(5.773f, 15.01f)
                lineTo(2.895f, 14.825f)
                lineTo(5.899f, 17.591f)
                curveTo(6.22f, 17.888f, 6.697f, 17.941f, 7.076f, 17.722f)
                lineTo(21.798f, 9.072f)
                curveTo(21.878f, 9.026f, 22.039f, 8.89f, 21.97f, 8.785f)
                curveTo(21.623f, 8.262f, 21.126f, 7.748f, 20.464f, 7.522f)
                curveTo(19.844f, 7.31f, 19.15f, 7.287f, 17.726f, 8.109f)
                lineTo(14.451f, 10f)
                curveTo(14.026f, 10.245f, 13.525f, 10.262f, 13.196f, 10.238f)
                curveTo(12.847f, 10.213f, 12.423f, 10.122f, 12.081f, 9.923f)
                lineTo(6.613f, 6.733f)
                curveTo(6.458f, 6.643f, 6.266f, 6.642f, 6.111f, 6.732f)
                lineTo(5.677f, 6.983f)
                close()
            }
        }.build()

        return _Takeoff!!
    }

@Suppress("ObjectPropertyName")
private var _Takeoff: ImageVector? = null
