package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.FolderShare: ImageVector
    get() {
        if (_FolderShare != null) {
            return _FolderShare!!
        }
        _FolderShare = ImageVector.Builder(
            name = "FolderShare",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 4f)
                curveTo(1f, 2.343f, 2.343f, 1f, 4f, 1f)
                horizontalLineTo(7.764f)
                curveTo(8.9f, 1f, 9.939f, 1.642f, 10.447f, 2.658f)
                lineTo(11.342f, 4.447f)
                curveTo(11.511f, 4.786f, 11.857f, 5f, 12.236f, 5f)
                horizontalLineTo(20f)
                curveTo(21.657f, 5f, 23f, 6.343f, 23f, 8f)
                verticalLineTo(20f)
                curveTo(23f, 21.657f, 21.657f, 23f, 20f, 23f)
                horizontalLineTo(4f)
                curveTo(2.343f, 23f, 1f, 21.657f, 1f, 20f)
                verticalLineTo(4f)
                close()
                moveTo(4f, 3f)
                curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
                verticalLineTo(20f)
                curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
                horizontalLineTo(20f)
                curveTo(20.552f, 21f, 21f, 20.552f, 21f, 20f)
                verticalLineTo(8f)
                curveTo(21f, 7.448f, 20.552f, 7f, 20f, 7f)
                horizontalLineTo(12.236f)
                curveTo(11.1f, 7f, 10.061f, 6.358f, 9.553f, 5.342f)
                lineTo(8.658f, 3.553f)
                curveTo(8.489f, 3.214f, 8.143f, 3f, 7.764f, 3f)
                horizontalLineTo(4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(14.5f, 11.45f)
                curveTo(14.5f, 12.831f, 13.381f, 13.95f, 12f, 13.95f)
                curveTo(10.619f, 13.95f, 9.5f, 12.831f, 9.5f, 11.45f)
                curveTo(9.5f, 10.069f, 10.619f, 8.95f, 12f, 8.95f)
                curveTo(13.381f, 8.95f, 14.5f, 10.069f, 14.5f, 11.45f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(16f, 19f)
                horizontalLineTo(8f)
                curveTo(7.448f, 19f, 7.013f, 18.543f, 7.209f, 18.027f)
                curveTo(7.603f, 16.991f, 8.736f, 15.5f, 12f, 15.5f)
                curveTo(15.264f, 15.5f, 16.397f, 16.991f, 16.791f, 18.027f)
                curveTo(16.987f, 18.543f, 16.552f, 19f, 16f, 19f)
                close()
            }
        }.build()

        return _FolderShare!!
    }

@Suppress("ObjectPropertyName")
private var _FolderShare: ImageVector? = null
