package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Temperature: ImageVector
    get() {
        if (_Temperature != null) {
            return _Temperature!!
        }
        _Temperature = ImageVector.Builder(
            name = "Temperature",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11f, 9f)
                curveTo(11f, 8.448f, 11.448f, 8f, 12f, 8f)
                curveTo(12.552f, 8f, 13f, 8.448f, 13f, 9f)
                verticalLineTo(16.268f)
                curveTo(13.598f, 16.613f, 14f, 17.26f, 14f, 18f)
                curveTo(14f, 19.105f, 13.105f, 20f, 12f, 20f)
                curveTo(10.895f, 20f, 10f, 19.105f, 10f, 18f)
                curveTo(10f, 17.26f, 10.402f, 16.613f, 11f, 16.268f)
                verticalLineTo(9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 15f)
                verticalLineTo(5f)
                curveTo(8f, 4.788f, 8.026f, 4.575f, 8.06f, 4.367f)
                curveTo(8.118f, 4.02f, 8.236f, 3.543f, 8.481f, 3.053f)
                curveTo(8.727f, 2.559f, 9.113f, 2.035f, 9.711f, 1.637f)
                curveTo(10.315f, 1.234f, 11.075f, 1f, 12f, 1f)
                curveTo(12.925f, 1f, 13.685f, 1.234f, 14.289f, 1.637f)
                curveTo(14.887f, 2.035f, 15.273f, 2.559f, 15.519f, 3.053f)
                curveTo(15.764f, 3.543f, 15.882f, 4.02f, 15.939f, 4.367f)
                curveTo(15.974f, 4.575f, 16f, 4.788f, 16f, 4.999f)
                verticalLineTo(15f)
                curveTo(16.282f, 15.376f, 16.512f, 15.793f, 16.679f, 16.238f)
                curveTo(17.061f, 17.251f, 17.103f, 18.361f, 16.8f, 19.4f)
                curveTo(16.497f, 20.439f, 15.865f, 21.352f, 14.998f, 22.001f)
                curveTo(14.132f, 22.65f, 13.079f, 23.001f, 11.996f, 23f)
                curveTo(10.913f, 22.999f, 9.861f, 22.647f, 8.995f, 21.997f)
                curveTo(8.13f, 21.346f, 7.499f, 20.432f, 7.198f, 19.392f)
                curveTo(6.896f, 18.353f, 6.94f, 17.243f, 7.323f, 16.231f)
                curveTo(7.491f, 15.788f, 7.719f, 15.374f, 8f, 15f)
                close()
                moveTo(10f, 15f)
                verticalLineTo(5.006f)
                curveTo(10.01f, 4.644f, 10.108f, 4.269f, 10.269f, 3.947f)
                curveTo(10.398f, 3.691f, 10.574f, 3.465f, 10.82f, 3.301f)
                curveTo(11.06f, 3.141f, 11.425f, 3f, 12f, 3f)
                curveTo(12.575f, 3f, 12.94f, 3.141f, 13.18f, 3.301f)
                curveTo(13.426f, 3.465f, 13.602f, 3.691f, 13.731f, 3.947f)
                curveTo(13.891f, 4.268f, 13.988f, 4.64f, 14f, 5f)
                lineTo(14f, 15f)
                curveTo(14f, 15.407f, 14.098f, 15.774f, 14.358f, 16.097f)
                curveTo(14.56f, 16.347f, 14.721f, 16.628f, 14.836f, 16.932f)
                curveTo(15.067f, 17.546f, 15.093f, 18.219f, 14.909f, 18.848f)
                curveTo(14.725f, 19.478f, 14.342f, 20.031f, 13.817f, 20.425f)
                curveTo(13.292f, 20.818f, 12.654f, 21.031f, 11.998f, 21.03f)
                curveTo(11.342f, 21.03f, 10.703f, 20.816f, 10.179f, 20.422f)
                curveTo(9.655f, 20.028f, 9.272f, 19.474f, 9.09f, 18.844f)
                curveTo(8.907f, 18.214f, 8.934f, 17.542f, 9.166f, 16.928f)
                curveTo(9.281f, 16.624f, 9.443f, 16.343f, 9.645f, 16.094f)
                curveTo(9.908f, 15.768f, 10f, 15.409f, 10f, 15f)
                close()
            }
        }.build()

        return _Temperature!!
    }

@Suppress("ObjectPropertyName")
private var _Temperature: ImageVector? = null
