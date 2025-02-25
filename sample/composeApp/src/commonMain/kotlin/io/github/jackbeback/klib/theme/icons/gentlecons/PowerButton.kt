package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.PowerButton: ImageVector
    get() {
        if (_PowerButton != null) {
            return _PowerButton!!
        }
        _PowerButton = ImageVector.Builder(
            name = "PowerButton",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(14.064f, 6.334f)
                curveTo(14.247f, 5.831f, 14.808f, 5.566f, 15.281f, 5.817f)
                curveTo(16.436f, 6.43f, 17.403f, 7.357f, 18.063f, 8.501f)
                curveTo(18.885f, 9.926f, 19.179f, 11.595f, 18.894f, 13.215f)
                curveTo(18.608f, 14.836f, 17.761f, 16.304f, 16.501f, 17.361f)
                curveTo(15.24f, 18.419f, 13.648f, 18.999f, 12.002f, 19f)
                curveTo(10.357f, 19.001f, 8.764f, 18.422f, 7.503f, 17.365f)
                curveTo(6.242f, 16.308f, 5.394f, 14.84f, 5.107f, 13.22f)
                curveTo(4.82f, 11.6f, 5.113f, 9.931f, 5.935f, 8.505f)
                curveTo(6.594f, 7.361f, 7.56f, 6.433f, 8.714f, 5.819f)
                curveTo(9.187f, 5.568f, 9.748f, 5.832f, 9.932f, 6.336f)
                curveTo(10.116f, 6.839f, 9.85f, 7.388f, 9.391f, 7.664f)
                curveTo(8.66f, 8.104f, 8.047f, 8.725f, 7.616f, 9.473f)
                curveTo(7.022f, 10.504f, 6.81f, 11.711f, 7.017f, 12.882f)
                curveTo(7.224f, 14.053f, 7.838f, 15.114f, 8.749f, 15.878f)
                curveTo(9.661f, 16.642f, 10.812f, 17.061f, 12.002f, 17.06f)
                curveTo(13.191f, 17.06f, 14.342f, 16.64f, 15.253f, 15.876f)
                curveTo(16.164f, 15.111f, 16.777f, 14.05f, 16.983f, 12.878f)
                curveTo(17.19f, 11.707f, 16.977f, 10.5f, 16.383f, 9.47f)
                curveTo(15.951f, 8.722f, 15.338f, 8.102f, 14.606f, 7.662f)
                curveTo(14.147f, 7.386f, 13.881f, 6.837f, 14.064f, 6.334f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(12f, 5f)
                curveTo(11.448f, 5f, 11f, 5.448f, 11f, 6f)
                verticalLineTo(12f)
                curveTo(11f, 12.552f, 11.448f, 13f, 12f, 13f)
                curveTo(12.552f, 13f, 13f, 12.552f, 13f, 12f)
                verticalLineTo(6f)
                curveTo(13f, 5.448f, 12.552f, 5f, 12f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 12f)
                curveTo(23f, 18.075f, 18.075f, 23f, 12f, 23f)
                curveTo(5.925f, 23f, 1f, 18.075f, 1f, 12f)
                curveTo(1f, 5.925f, 5.925f, 1f, 12f, 1f)
                curveTo(18.075f, 1f, 23f, 5.925f, 23f, 12f)
                close()
                moveTo(3.007f, 12f)
                curveTo(3.007f, 16.967f, 7.033f, 20.993f, 12f, 20.993f)
                curveTo(16.967f, 20.993f, 20.993f, 16.967f, 20.993f, 12f)
                curveTo(20.993f, 7.033f, 16.967f, 3.007f, 12f, 3.007f)
                curveTo(7.033f, 3.007f, 3.007f, 7.033f, 3.007f, 12f)
                close()
            }
        }.build()

        return _PowerButton!!
    }

@Suppress("ObjectPropertyName")
private var _PowerButton: ImageVector? = null
