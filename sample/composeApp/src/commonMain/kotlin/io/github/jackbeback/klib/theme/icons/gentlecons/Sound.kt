package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Sound: ImageVector
    get() {
        if (_Sound != null) {
            return _Sound!!
        }
        _Sound = ImageVector.Builder(
            name = "Sound",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.4f, 1.8f)
                curveTo(11.553f, 0.262f, 14f, 1.078f, 14f, 3f)
                verticalLineTo(21.121f)
                curveTo(14f, 23.054f, 11.531f, 23.863f, 10.388f, 22.305f)
                lineTo(6.494f, 17f)
                horizontalLineTo(4f)
                curveTo(2.343f, 17f, 1f, 15.657f, 1f, 14f)
                verticalLineTo(10f)
                curveTo(1f, 8.343f, 2.343f, 7f, 4f, 7f)
                horizontalLineTo(6.5f)
                lineTo(10.4f, 1.8f)
                close()
                moveTo(12f, 3f)
                lineTo(8.1f, 8.2f)
                curveTo(7.722f, 8.704f, 7.13f, 9f, 6.5f, 9f)
                horizontalLineTo(4f)
                curveTo(3.448f, 9f, 3f, 9.448f, 3f, 10f)
                verticalLineTo(14f)
                curveTo(3f, 14.552f, 3.448f, 15f, 4f, 15f)
                horizontalLineTo(6.494f)
                curveTo(7.13f, 15f, 7.729f, 15.303f, 8.106f, 15.816f)
                lineTo(12f, 21.121f)
                verticalLineTo(3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(16.214f, 4.174f)
                curveTo(16.109f, 3.565f, 16.577f, 3f, 17.196f, 3f)
                curveTo(17.663f, 3f, 18.065f, 3.328f, 18.146f, 3.788f)
                curveTo(18.424f, 5.353f, 19f, 8.965f, 19f, 12f)
                curveTo(19f, 15.035f, 18.424f, 18.646f, 18.146f, 20.212f)
                curveTo(18.065f, 20.672f, 17.663f, 21f, 17.196f, 21f)
                curveTo(16.577f, 21f, 16.109f, 20.435f, 16.214f, 19.826f)
                curveTo(16.507f, 18.107f, 17f, 14.807f, 17f, 12f)
                curveTo(17f, 9.193f, 16.507f, 5.893f, 16.214f, 4.174f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(21.41f, 5f)
                curveTo(20.735f, 5f, 20.24f, 5.694f, 20.397f, 6.351f)
                curveTo(20.676f, 7.524f, 21f, 9.438f, 21f, 12f)
                curveTo(21f, 14.562f, 20.676f, 16.476f, 20.397f, 17.649f)
                curveTo(20.24f, 18.306f, 20.735f, 19f, 21.41f, 19f)
                curveTo(21.772f, 19f, 22.097f, 18.794f, 22.21f, 18.451f)
                curveTo(22.503f, 17.557f, 23f, 15.523f, 23f, 12f)
                curveTo(23f, 8.477f, 22.503f, 6.443f, 22.21f, 5.549f)
                curveTo(22.097f, 5.206f, 21.772f, 5f, 21.41f, 5f)
                close()
            }
        }.build()

        return _Sound!!
    }

@Suppress("ObjectPropertyName")
private var _Sound: ImageVector? = null
