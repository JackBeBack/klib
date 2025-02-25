package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.FolderRemove1: ImageVector
    get() {
        if (_FolderRemove1 != null) {
            return _FolderRemove1!!
        }
        _FolderRemove1 = ImageVector.Builder(
            name = "FolderRemove1",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(8.707f, 17.294f)
                curveTo(8.317f, 16.903f, 8.317f, 16.27f, 8.707f, 15.88f)
                lineTo(10.584f, 14.003f)
                lineTo(8.708f, 12.127f)
                curveTo(8.317f, 11.736f, 8.317f, 11.103f, 8.708f, 10.712f)
                curveTo(9.098f, 10.322f, 9.732f, 10.322f, 10.122f, 10.712f)
                lineTo(11.998f, 12.589f)
                lineTo(13.88f, 10.707f)
                curveTo(14.27f, 10.316f, 14.903f, 10.316f, 15.294f, 10.707f)
                curveTo(15.684f, 11.097f, 15.684f, 11.731f, 15.294f, 12.121f)
                lineTo(13.412f, 14.003f)
                lineTo(15.293f, 15.883f)
                curveTo(15.684f, 16.274f, 15.684f, 16.907f, 15.293f, 17.298f)
                curveTo(14.903f, 17.688f, 14.269f, 17.688f, 13.879f, 17.298f)
                lineTo(11.998f, 15.417f)
                lineTo(10.121f, 17.294f)
                curveTo(9.731f, 17.684f, 9.098f, 17.684f, 8.707f, 17.294f)
                close()
            }
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
        }.build()

        return _FolderRemove1!!
    }

@Suppress("ObjectPropertyName")
private var _FolderRemove1: ImageVector? = null
