package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.PingPong: ImageVector
    get() {
        if (_PingPong != null) {
            return _PingPong!!
        }
        _PingPong = ImageVector.Builder(
            name = "PingPong",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.5f, 7f)
                curveTo(22.433f, 7f, 24f, 5.433f, 24f, 3.5f)
                curveTo(24f, 1.567f, 22.433f, 0f, 20.5f, 0f)
                curveTo(18.567f, 0f, 17f, 1.567f, 17f, 3.5f)
                curveTo(17f, 5.433f, 18.567f, 7f, 20.5f, 7f)
                close()
                moveTo(20.5f, 5.056f)
                curveTo(19.641f, 5.056f, 18.944f, 4.359f, 18.944f, 3.5f)
                curveTo(18.944f, 2.641f, 19.641f, 1.944f, 20.5f, 1.944f)
                curveTo(21.359f, 1.944f, 22.056f, 2.641f, 22.056f, 3.5f)
                curveTo(22.056f, 4.359f, 21.359f, 5.056f, 20.5f, 5.056f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.708f, 5.454f)
                curveTo(13.08f, 4.934f, 12.168f, 4.286f, 11.056f, 3.817f)
                curveTo(9.941f, 3.346f, 8.593f, 3.042f, 7.124f, 3.257f)
                curveTo(5.643f, 3.474f, 4.126f, 4.207f, 2.668f, 5.666f)
                curveTo(1.209f, 7.125f, 0.476f, 8.642f, 0.258f, 10.123f)
                curveTo(0.043f, 11.592f, 0.347f, 12.939f, 0.818f, 14.054f)
                curveTo(1.288f, 15.166f, 1.935f, 16.079f, 2.456f, 16.706f)
                curveTo(3.415f, 17.864f, 4.593f, 18.919f, 5.997f, 19.491f)
                curveTo(6.874f, 19.849f, 7.726f, 19.983f, 8.548f, 20.053f)
                curveTo(8.953f, 20.088f, 9.344f, 20.109f, 9.733f, 20.129f)
                curveTo(10.902f, 20.191f, 12.048f, 20.251f, 13.445f, 20.686f)
                lineTo(16.103f, 23.344f)
                curveTo(16.884f, 24.125f, 18.15f, 24.125f, 18.931f, 23.344f)
                lineTo(20.345f, 21.93f)
                curveTo(21.126f, 21.149f, 21.126f, 19.882f, 20.345f, 19.101f)
                lineTo(17.687f, 16.443f)
                curveTo(17.253f, 15.047f, 17.192f, 13.901f, 17.131f, 12.732f)
                curveTo(17.11f, 12.343f, 17.089f, 11.951f, 17.055f, 11.547f)
                curveTo(16.984f, 10.725f, 16.85f, 9.873f, 16.493f, 8.996f)
                curveTo(15.93f, 7.613f, 14.851f, 6.402f, 13.708f, 5.454f)
                close()
                moveTo(6.752f, 17.639f)
                curveTo(6.978f, 17.732f, 7.207f, 17.805f, 7.441f, 17.863f)
                lineTo(14.865f, 10.44f)
                curveTo(14.806f, 10.205f, 14.733f, 9.977f, 14.641f, 9.75f)
                curveTo(14.195f, 8.656f, 13.333f, 7.74f, 12.432f, 6.994f)
                curveTo(11.9f, 6.553f, 11.155f, 6.03f, 10.278f, 5.659f)
                curveTo(9.404f, 5.29f, 8.431f, 5.087f, 7.414f, 5.236f)
                curveTo(6.409f, 5.383f, 5.275f, 5.888f, 4.082f, 7.08f)
                curveTo(2.889f, 8.273f, 2.385f, 9.408f, 2.237f, 10.413f)
                curveTo(2.088f, 11.43f, 2.292f, 12.403f, 2.661f, 13.276f)
                curveTo(3.031f, 14.153f, 3.555f, 14.898f, 3.996f, 15.43f)
                curveTo(4.737f, 16.326f, 5.666f, 17.197f, 6.752f, 17.639f)
                close()
                moveTo(13.689f, 18.686f)
                curveTo(12.479f, 18.367f, 11.252f, 18.214f, 9.995f, 18.138f)
                lineTo(15.139f, 12.993f)
                curveTo(15.215f, 14.251f, 15.368f, 15.477f, 15.688f, 16.688f)
                lineTo(13.689f, 18.686f)
                close()
                moveTo(15.396f, 19.808f)
                lineTo(16.81f, 18.394f)
                lineTo(18.931f, 20.515f)
                lineTo(17.517f, 21.93f)
                lineTo(15.396f, 19.808f)
                close()
            }
        }.build()

        return _PingPong!!
    }

@Suppress("ObjectPropertyName")
private var _PingPong: ImageVector? = null
