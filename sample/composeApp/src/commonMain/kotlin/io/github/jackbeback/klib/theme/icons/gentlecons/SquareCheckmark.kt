package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.SquareCheckmark: ImageVector
    get() {
        if (_SquareCheckmark != null) {
            return _SquareCheckmark!!
        }
        _SquareCheckmark = ImageVector.Builder(
            name = "SquareCheckmark",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(17.319f, 8.382f)
                curveTo(16.928f, 7.991f, 16.295f, 7.991f, 15.905f, 8.382f)
                lineTo(10.991f, 13.295f)
                curveTo(10.601f, 13.686f, 9.968f, 13.686f, 9.577f, 13.295f)
                lineTo(8.121f, 11.839f)
                curveTo(7.731f, 11.449f, 7.098f, 11.449f, 6.707f, 11.839f)
                curveTo(6.317f, 12.23f, 6.317f, 12.863f, 6.707f, 13.254f)
                lineTo(8.522f, 15.062f)
                curveTo(9.499f, 16.035f, 11.079f, 16.034f, 12.054f, 15.059f)
                lineTo(17.319f, 9.796f)
                curveTo(17.709f, 9.405f, 17.709f, 8.772f, 17.319f, 8.382f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20f, 1f)
                curveTo(21.657f, 1f, 23f, 2.343f, 23f, 4f)
                verticalLineTo(20f)
                curveTo(23f, 21.657f, 21.657f, 23f, 20f, 23f)
                horizontalLineTo(4f)
                curveTo(2.343f, 23f, 1f, 21.657f, 1f, 20f)
                verticalLineTo(4f)
                curveTo(1f, 2.343f, 2.343f, 1f, 4f, 1f)
                horizontalLineTo(20f)
                close()
                moveTo(20f, 3f)
                curveTo(20.552f, 3f, 21f, 3.448f, 21f, 4f)
                verticalLineTo(20f)
                curveTo(21f, 20.552f, 20.552f, 21f, 20f, 21f)
                horizontalLineTo(4f)
                curveTo(3.448f, 21f, 3f, 20.552f, 3f, 20f)
                verticalLineTo(4f)
                curveTo(3f, 3.448f, 3.448f, 3f, 4f, 3f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _SquareCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _SquareCheckmark: ImageVector? = null
