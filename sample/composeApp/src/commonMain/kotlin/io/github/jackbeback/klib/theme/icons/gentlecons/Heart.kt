package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Heart: ImageVector
    get() {
        if (_Heart != null) {
            return _Heart!!
        }
        _Heart = ImageVector.Builder(
            name = "Heart",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.489f, 6.004f)
                curveTo(2.763f, 7.248f, 2.524f, 8.974f, 2.97f, 10.757f)
                curveTo(3.131f, 11.399f, 3.597f, 12.224f, 4.336f, 13.174f)
                curveTo(5.061f, 14.105f, 5.986f, 15.079f, 6.966f, 16.013f)
                curveTo(8.909f, 17.865f, 11.001f, 19.499f, 12f, 20.254f)
                curveTo(12.999f, 19.499f, 15.09f, 17.865f, 17.034f, 16.013f)
                curveTo(18.014f, 15.079f, 18.939f, 14.105f, 19.664f, 13.174f)
                curveTo(20.403f, 12.224f, 20.869f, 11.399f, 21.03f, 10.757f)
                curveTo(21.476f, 8.974f, 21.237f, 7.248f, 20.511f, 6.004f)
                curveTo(19.803f, 4.79f, 18.62f, 4f, 17f, 4f)
                curveTo(15.59f, 4f, 14.597f, 5.042f, 13.894f, 6.447f)
                curveTo(13.557f, 7.122f, 13.328f, 7.807f, 13.182f, 8.33f)
                curveTo(13.11f, 8.59f, 13.06f, 8.804f, 13.029f, 8.952f)
                curveTo(12.917f, 9.474f, 12.314f, 9.5f, 12f, 9.5f)
                curveTo(11.686f, 9.5f, 11.082f, 9.469f, 10.971f, 8.952f)
                curveTo(10.94f, 8.804f, 10.89f, 8.59f, 10.818f, 8.33f)
                curveTo(10.672f, 7.807f, 10.443f, 7.122f, 10.106f, 6.447f)
                curveTo(9.403f, 5.042f, 8.41f, 4f, 7f, 4f)
                curveTo(5.38f, 4f, 4.197f, 4.79f, 3.489f, 6.004f)
                close()
                moveTo(12f, 5.77f)
                curveTo(12.034f, 5.698f, 12.069f, 5.625f, 12.106f, 5.553f)
                curveTo(12.903f, 3.958f, 14.41f, 2f, 17f, 2f)
                curveTo(19.38f, 2f, 21.197f, 3.21f, 22.239f, 4.996f)
                curveTo(23.263f, 6.752f, 23.524f, 9.026f, 22.97f, 11.243f)
                curveTo(22.708f, 12.293f, 22.035f, 13.383f, 21.242f, 14.403f)
                curveTo(20.434f, 15.44f, 19.433f, 16.489f, 18.413f, 17.461f)
                curveTo(16.374f, 19.404f, 14.196f, 21.102f, 13.181f, 21.868f)
                curveTo(12.48f, 22.397f, 11.52f, 22.397f, 10.819f, 21.868f)
                curveTo(9.804f, 21.102f, 7.626f, 19.404f, 5.586f, 17.461f)
                curveTo(4.567f, 16.489f, 3.566f, 15.44f, 2.758f, 14.403f)
                curveTo(1.965f, 13.383f, 1.292f, 12.293f, 1.03f, 11.243f)
                curveTo(0.476f, 9.026f, 0.737f, 6.752f, 1.761f, 4.996f)
                curveTo(2.803f, 3.21f, 4.62f, 2f, 7f, 2f)
                curveTo(9.59f, 2f, 11.097f, 3.958f, 11.894f, 5.553f)
                curveTo(11.931f, 5.625f, 11.966f, 5.698f, 12f, 5.77f)
                close()
            }
        }.build()

        return _Heart!!
    }

@Suppress("ObjectPropertyName")
private var _Heart: ImageVector? = null
