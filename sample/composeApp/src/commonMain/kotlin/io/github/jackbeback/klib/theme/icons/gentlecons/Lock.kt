package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Lock: ImageVector
    get() {
        if (_Lock != null) {
            return _Lock!!
        }
        _Lock = ImageVector.Builder(
            name = "Lock",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(13.5f, 16.585f)
                curveTo(13.5f, 17.414f, 12.828f, 18.085f, 12f, 18.085f)
                curveTo(11.172f, 18.085f, 10.5f, 17.414f, 10.5f, 16.585f)
                curveTo(10.5f, 15.757f, 11.172f, 15.085f, 12f, 15.085f)
                curveTo(12.828f, 15.085f, 13.5f, 15.757f, 13.5f, 16.585f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.942f, 10f)
                curveTo(5.939f, 9.873f, 5.938f, 9.737f, 5.938f, 9.594f)
                curveTo(5.938f, 8.707f, 6.003f, 7.504f, 6.274f, 6.283f)
                curveTo(6.543f, 5.073f, 7.032f, 3.763f, 7.94f, 2.742f)
                curveTo(8.879f, 1.686f, 10.213f, 1f, 12f, 1f)
                curveTo(13.787f, 1f, 15.121f, 1.686f, 16.06f, 2.742f)
                curveTo(16.968f, 3.763f, 17.457f, 5.073f, 17.726f, 6.283f)
                curveTo(17.997f, 7.504f, 18.063f, 8.707f, 18.063f, 9.594f)
                curveTo(18.063f, 9.737f, 18.061f, 9.873f, 18.058f, 10f)
                curveTo(19.688f, 10.031f, 21f, 11.363f, 21f, 13f)
                verticalLineTo(20f)
                curveTo(21f, 21.657f, 19.657f, 23f, 18f, 23f)
                horizontalLineTo(6f)
                curveTo(4.343f, 23f, 3f, 21.657f, 3f, 20f)
                verticalLineTo(13f)
                curveTo(3f, 11.363f, 4.312f, 10.031f, 5.942f, 10f)
                close()
                moveTo(16.057f, 10f)
                curveTo(16.06f, 9.875f, 16.063f, 9.739f, 16.063f, 9.594f)
                curveTo(16.063f, 8.793f, 16.003f, 7.746f, 15.774f, 6.717f)
                curveTo(15.543f, 5.677f, 15.157f, 4.737f, 14.565f, 4.071f)
                curveTo(14.004f, 3.44f, 13.213f, 3f, 12f, 3f)
                curveTo(10.787f, 3f, 9.996f, 3.44f, 9.435f, 4.071f)
                curveTo(8.843f, 4.737f, 8.457f, 5.677f, 8.226f, 6.717f)
                curveTo(7.997f, 7.746f, 7.938f, 8.793f, 7.938f, 9.594f)
                curveTo(7.938f, 9.739f, 7.939f, 9.875f, 7.943f, 10f)
                horizontalLineTo(16.057f)
                close()
                moveTo(19f, 13f)
                curveTo(19f, 12.448f, 18.552f, 12f, 18f, 12f)
                horizontalLineTo(6f)
                curveTo(5.448f, 12f, 5f, 12.448f, 5f, 13f)
                verticalLineTo(20f)
                curveTo(5f, 20.552f, 5.448f, 21f, 6f, 21f)
                horizontalLineTo(18f)
                curveTo(18.552f, 21f, 19f, 20.552f, 19f, 20f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _Lock!!
    }

@Suppress("ObjectPropertyName")
private var _Lock: ImageVector? = null
