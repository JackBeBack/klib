package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.FolderAdd: ImageVector
    get() {
        if (_FolderAdd != null) {
            return _FolderAdd!!
        }
        _FolderAdd = ImageVector.Builder(
            name = "FolderAdd",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11f, 11f)
                curveTo(11f, 10.448f, 11.448f, 10f, 12f, 10f)
                curveTo(12.552f, 10f, 13f, 10.448f, 13f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                curveTo(15.552f, 13f, 16f, 13.448f, 16f, 14f)
                curveTo(16f, 14.552f, 15.552f, 15f, 15f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                curveTo(13f, 17.552f, 12.552f, 18f, 12f, 18f)
                curveTo(11.448f, 18f, 11f, 17.552f, 11f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                curveTo(8.448f, 15f, 8f, 14.552f, 8f, 14f)
                curveTo(8f, 13.448f, 8.448f, 13f, 9f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
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

        return _FolderAdd!!
    }

@Suppress("ObjectPropertyName")
private var _FolderAdd: ImageVector? = null
