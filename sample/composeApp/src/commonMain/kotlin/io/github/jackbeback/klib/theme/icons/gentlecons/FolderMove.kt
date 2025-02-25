package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.FolderMove: ImageVector
    get() {
        if (_FolderMove != null) {
            return _FolderMove!!
        }
        _FolderMove = ImageVector.Builder(
            name = "FolderMove",
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
                moveTo(11.542f, 11.414f)
                curveTo(11.152f, 11.024f, 11.152f, 10.391f, 11.542f, 10f)
                curveTo(11.933f, 9.609f, 12.566f, 9.609f, 12.957f, 10f)
                lineTo(15.493f, 12.536f)
                curveTo(15.895f, 12.938f, 16.09f, 13.47f, 16.078f, 13.998f)
                curveTo(16.072f, 14.238f, 16.023f, 14.477f, 15.932f, 14.703f)
                curveTo(15.834f, 14.943f, 15.688f, 15.169f, 15.493f, 15.364f)
                lineTo(12.914f, 17.942f)
                curveTo(12.524f, 18.333f, 11.891f, 18.333f, 11.5f, 17.942f)
                curveTo(11.109f, 17.552f, 11.109f, 16.919f, 11.5f, 16.528f)
                lineTo(13.028f, 15f)
                horizontalLineTo(9f)
                curveTo(8.448f, 15f, 8f, 14.552f, 8f, 14f)
                curveTo(8f, 13.448f, 8.448f, 13f, 9f, 13f)
                horizontalLineTo(13.128f)
                lineTo(11.542f, 11.414f)
                close()
            }
        }.build()

        return _FolderMove!!
    }

@Suppress("ObjectPropertyName")
private var _FolderMove: ImageVector? = null
