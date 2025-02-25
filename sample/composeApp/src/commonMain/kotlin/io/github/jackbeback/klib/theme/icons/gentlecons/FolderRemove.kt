package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.FolderRemove: ImageVector
    get() {
        if (_FolderRemove != null) {
            return _FolderRemove!!
        }
        _FolderRemove = ImageVector.Builder(
            name = "FolderRemove",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(8f, 14f)
                curveTo(8f, 14.552f, 8.448f, 15f, 9f, 15f)
                horizontalLineTo(15f)
                curveTo(15.552f, 15f, 16f, 14.552f, 16f, 14f)
                curveTo(16f, 13.448f, 15.552f, 13f, 15f, 13f)
                horizontalLineTo(9f)
                curveTo(8.448f, 13f, 8f, 13.448f, 8f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 1f)
                curveTo(2.343f, 1f, 1f, 2.343f, 1f, 4f)
                verticalLineTo(20f)
                curveTo(1f, 21.657f, 2.343f, 23f, 4f, 23f)
                horizontalLineTo(20f)
                curveTo(21.657f, 23f, 23f, 21.657f, 23f, 20f)
                verticalLineTo(8f)
                curveTo(23f, 6.343f, 21.657f, 5f, 20f, 5f)
                horizontalLineTo(12.236f)
                curveTo(11.857f, 5f, 11.511f, 4.786f, 11.342f, 4.447f)
                lineTo(10.447f, 2.658f)
                curveTo(9.939f, 1.642f, 8.9f, 1f, 7.764f, 1f)
                horizontalLineTo(4f)
                close()
                moveTo(3f, 4f)
                curveTo(3f, 3.448f, 3.448f, 3f, 4f, 3f)
                horizontalLineTo(7.764f)
                curveTo(8.143f, 3f, 8.489f, 3.214f, 8.658f, 3.553f)
                lineTo(9.553f, 5.342f)
                curveTo(10.061f, 6.358f, 11.1f, 7f, 12.236f, 7f)
                horizontalLineTo(20f)
                curveTo(20.552f, 7f, 21f, 7.448f, 21f, 8f)
                verticalLineTo(20f)
                curveTo(21f, 20.552f, 20.552f, 21f, 20f, 21f)
                horizontalLineTo(4f)
                curveTo(3.448f, 21f, 3f, 20.552f, 3f, 20f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _FolderRemove!!
    }

@Suppress("ObjectPropertyName")
private var _FolderRemove: ImageVector? = null
