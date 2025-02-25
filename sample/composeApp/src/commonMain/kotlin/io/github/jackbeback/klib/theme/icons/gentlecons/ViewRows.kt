package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ViewRows: ImageVector
    get() {
        if (_ViewRows != null) {
            return _ViewRows!!
        }
        _ViewRows = ImageVector.Builder(
            name = "ViewRows",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 4f)
                curveTo(23f, 2.343f, 21.657f, 1f, 20f, 1f)
                horizontalLineTo(4f)
                curveTo(2.343f, 1f, 1f, 2.343f, 1f, 4f)
                verticalLineTo(8f)
                curveTo(1f, 9.657f, 2.343f, 11f, 4f, 11f)
                horizontalLineTo(20f)
                curveTo(21.657f, 11f, 23f, 9.657f, 23f, 8f)
                verticalLineTo(4f)
                close()
                moveTo(21f, 4f)
                curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
                horizontalLineTo(4f)
                curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
                verticalLineTo(8f)
                curveTo(3f, 8.552f, 3.448f, 9f, 4f, 9f)
                horizontalLineTo(20f)
                curveTo(20.552f, 9f, 21f, 8.552f, 21f, 8f)
                verticalLineTo(4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 16f)
                curveTo(23f, 14.343f, 21.657f, 13f, 20f, 13f)
                horizontalLineTo(4f)
                curveTo(2.343f, 13f, 1f, 14.343f, 1f, 16f)
                verticalLineTo(20f)
                curveTo(1f, 21.657f, 2.343f, 23f, 4f, 23f)
                horizontalLineTo(20f)
                curveTo(21.657f, 23f, 23f, 21.657f, 23f, 20f)
                verticalLineTo(16f)
                close()
                moveTo(21f, 16f)
                curveTo(21f, 15.448f, 20.552f, 15f, 20f, 15f)
                horizontalLineTo(4f)
                curveTo(3.448f, 15f, 3f, 15.448f, 3f, 16f)
                verticalLineTo(20f)
                curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
                horizontalLineTo(20f)
                curveTo(20.552f, 21f, 21f, 20.552f, 21f, 20f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _ViewRows!!
    }

@Suppress("ObjectPropertyName")
private var _ViewRows: ImageVector? = null
