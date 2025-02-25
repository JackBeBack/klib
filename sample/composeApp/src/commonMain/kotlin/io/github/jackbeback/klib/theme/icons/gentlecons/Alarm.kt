package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Alarm: ImageVector
    get() {
        if (_Alarm != null) {
            return _Alarm!!
        }
        _Alarm = ImageVector.Builder(
            name = "Alarm",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(13f, 11.881f)
                verticalLineTo(6f)
                curveTo(13f, 5.448f, 12.552f, 5f, 12f, 5f)
                curveTo(11.448f, 5f, 11f, 5.448f, 11f, 6f)
                verticalLineTo(12.467f)
                curveTo(11f, 12.816f, 11.218f, 13.162f, 11.517f, 13.335f)
                lineTo(16.137f, 16.002f)
                curveTo(16.615f, 16.278f, 17.227f, 16.114f, 17.503f, 15.636f)
                curveTo(17.779f, 15.157f, 17.615f, 14.546f, 17.137f, 14.27f)
                lineTo(13f, 11.881f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 0f)
                curveTo(11.448f, 0f, 11f, 0.448f, 11f, 1f)
                verticalLineTo(1.045f)
                curveTo(9.748f, 1.158f, 8.557f, 1.48f, 7.461f, 1.977f)
                curveTo(7.188f, 1.672f, 6.752f, 1.25f, 6.162f, 0.932f)
                curveTo(5.621f, 0.641f, 4.926f, 0.428f, 4.128f, 0.532f)
                curveTo(3.326f, 0.636f, 2.539f, 1.047f, 1.793f, 1.793f)
                curveTo(1.047f, 2.539f, 0.636f, 3.326f, 0.532f, 4.128f)
                curveTo(0.428f, 4.926f, 0.641f, 5.621f, 0.932f, 6.161f)
                curveTo(1.25f, 6.752f, 1.672f, 7.188f, 1.977f, 7.461f)
                curveTo(1.35f, 8.845f, 1f, 10.382f, 1f, 12f)
                curveTo(1f, 14.673f, 1.953f, 17.123f, 3.539f, 19.029f)
                lineTo(2.299f, 20.269f)
                curveTo(1.908f, 20.66f, 1.909f, 21.294f, 2.299f, 21.684f)
                curveTo(2.69f, 22.075f, 3.324f, 22.075f, 3.714f, 21.685f)
                lineTo(4.953f, 20.446f)
                curveTo(6.861f, 22.041f, 9.319f, 23f, 12f, 23f)
                curveTo(14.681f, 23f, 17.139f, 22.041f, 19.047f, 20.446f)
                lineTo(20.285f, 21.685f)
                curveTo(20.676f, 22.075f, 21.31f, 22.075f, 21.7f, 21.684f)
                curveTo(22.091f, 21.294f, 22.092f, 20.66f, 21.701f, 20.269f)
                lineTo(20.461f, 19.029f)
                curveTo(22.046f, 17.123f, 23f, 14.673f, 23f, 12f)
                curveTo(23f, 10.382f, 22.65f, 8.845f, 22.023f, 7.461f)
                curveTo(22.327f, 7.188f, 22.75f, 6.752f, 23.068f, 6.161f)
                curveTo(23.359f, 5.621f, 23.572f, 4.926f, 23.468f, 4.128f)
                curveTo(23.363f, 3.326f, 22.953f, 2.539f, 22.207f, 1.793f)
                curveTo(21.461f, 1.047f, 20.674f, 0.636f, 19.871f, 0.532f)
                curveTo(19.074f, 0.428f, 18.378f, 0.641f, 17.838f, 0.932f)
                curveTo(17.248f, 1.25f, 16.811f, 1.672f, 16.539f, 1.977f)
                curveTo(15.443f, 1.48f, 14.252f, 1.158f, 13f, 1.045f)
                verticalLineTo(1f)
                curveTo(13f, 0.448f, 12.552f, 0f, 12f, 0f)
                close()
                moveTo(18.337f, 3.008f)
                curveTo(19.366f, 3.734f, 20.265f, 4.633f, 20.992f, 5.663f)
                curveTo(21.108f, 5.529f, 21.219f, 5.377f, 21.307f, 5.213f)
                curveTo(21.454f, 4.941f, 21.521f, 4.668f, 21.485f, 4.387f)
                curveTo(21.449f, 4.111f, 21.297f, 3.711f, 20.793f, 3.207f)
                curveTo(20.289f, 2.703f, 19.889f, 2.551f, 19.613f, 2.515f)
                curveTo(19.332f, 2.478f, 19.059f, 2.546f, 18.787f, 2.693f)
                curveTo(18.623f, 2.781f, 18.471f, 2.892f, 18.337f, 3.008f)
                close()
                moveTo(3.008f, 5.663f)
                curveTo(3.734f, 4.633f, 4.634f, 3.734f, 5.663f, 3.008f)
                curveTo(5.529f, 2.892f, 5.377f, 2.781f, 5.213f, 2.693f)
                curveTo(4.941f, 2.546f, 4.668f, 2.478f, 4.387f, 2.515f)
                curveTo(4.111f, 2.551f, 3.711f, 2.703f, 3.207f, 3.207f)
                curveTo(2.703f, 3.711f, 2.551f, 4.111f, 2.515f, 4.387f)
                curveTo(2.478f, 4.668f, 2.546f, 4.941f, 2.693f, 5.213f)
                curveTo(2.781f, 5.377f, 2.892f, 5.529f, 3.008f, 5.663f)
                close()
                moveTo(12f, 20.993f)
                curveTo(7.033f, 20.993f, 3.007f, 16.967f, 3.007f, 12f)
                curveTo(3.007f, 7.033f, 7.033f, 3.007f, 12f, 3.007f)
                curveTo(16.967f, 3.007f, 20.993f, 7.033f, 20.993f, 12f)
                curveTo(20.993f, 16.967f, 16.967f, 20.993f, 12f, 20.993f)
                close()
            }
        }.build()

        return _Alarm!!
    }

@Suppress("ObjectPropertyName")
private var _Alarm: ImageVector? = null
