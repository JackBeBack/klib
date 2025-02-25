package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Badge: ImageVector
    get() {
        if (_Badge != null) {
            return _Badge!!
        }
        _Badge = ImageVector.Builder(
            name = "Badge",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 5f)
                curveTo(1f, 2.791f, 2.791f, 1f, 5f, 1f)
                horizontalLineTo(9.757f)
                curveTo(10.818f, 1f, 11.836f, 1.421f, 12.586f, 2.172f)
                lineTo(21.586f, 11.172f)
                curveTo(23.148f, 12.734f, 23.148f, 15.266f, 21.586f, 16.828f)
                lineTo(16.828f, 21.586f)
                curveTo(15.266f, 23.148f, 12.734f, 23.148f, 11.172f, 21.586f)
                lineTo(2.172f, 12.586f)
                curveTo(1.421f, 11.836f, 1f, 10.818f, 1f, 9.757f)
                verticalLineTo(5f)
                close()
                moveTo(5f, 3f)
                curveTo(3.895f, 3f, 3f, 3.895f, 3f, 5f)
                verticalLineTo(9.757f)
                curveTo(3f, 10.288f, 3.211f, 10.797f, 3.586f, 11.172f)
                lineTo(12.586f, 20.172f)
                curveTo(13.367f, 20.953f, 14.633f, 20.953f, 15.414f, 20.172f)
                lineTo(20.172f, 15.414f)
                curveTo(20.953f, 14.633f, 20.953f, 13.367f, 20.172f, 12.586f)
                lineTo(11.172f, 3.586f)
                curveTo(10.797f, 3.211f, 10.288f, 3f, 9.757f, 3f)
                horizontalLineTo(5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(9f, 7.5f)
                curveTo(9f, 8.328f, 8.328f, 9f, 7.5f, 9f)
                curveTo(6.672f, 9f, 6f, 8.328f, 6f, 7.5f)
                curveTo(6f, 6.672f, 6.672f, 6f, 7.5f, 6f)
                curveTo(8.328f, 6f, 9f, 6.672f, 9f, 7.5f)
                close()
            }
        }.build()

        return _Badge!!
    }

@Suppress("ObjectPropertyName")
private var _Badge: ImageVector? = null
