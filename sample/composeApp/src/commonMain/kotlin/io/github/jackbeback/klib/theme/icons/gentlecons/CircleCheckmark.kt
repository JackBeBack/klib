package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.CircleCheckmark: ImageVector
    get() {
        if (_CircleCheckmark != null) {
            return _CircleCheckmark!!
        }
        _CircleCheckmark = ImageVector.Builder(
            name = "CircleCheckmark",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(15.905f, 8.381f)
                curveTo(16.295f, 7.991f, 16.928f, 7.991f, 17.319f, 8.381f)
                curveTo(17.709f, 8.772f, 17.709f, 9.405f, 17.319f, 9.796f)
                lineTo(12.054f, 15.059f)
                curveTo(11.079f, 16.034f, 9.499f, 16.035f, 8.522f, 15.062f)
                lineTo(6.707f, 13.253f)
                curveTo(6.317f, 12.863f, 6.317f, 12.23f, 6.707f, 11.839f)
                curveTo(7.098f, 11.449f, 7.731f, 11.449f, 8.121f, 11.839f)
                lineTo(9.577f, 13.295f)
                curveTo(9.967f, 13.686f, 10.601f, 13.686f, 10.991f, 13.295f)
                lineTo(15.905f, 8.381f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 23f)
                curveTo(18.075f, 23f, 23f, 18.075f, 23f, 12f)
                curveTo(23f, 5.925f, 18.075f, 1f, 12f, 1f)
                curveTo(5.925f, 1f, 1f, 5.925f, 1f, 12f)
                curveTo(1f, 18.075f, 5.925f, 23f, 12f, 23f)
                close()
                moveTo(12f, 20.993f)
                curveTo(7.033f, 20.993f, 3.007f, 16.967f, 3.007f, 12f)
                curveTo(3.007f, 7.033f, 7.033f, 3.007f, 12f, 3.007f)
                curveTo(16.967f, 3.007f, 20.993f, 7.033f, 20.993f, 12f)
                curveTo(20.993f, 16.967f, 16.967f, 20.993f, 12f, 20.993f)
                close()
            }
        }.build()

        return _CircleCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _CircleCheckmark: ImageVector? = null
