package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ViewGrid: ImageVector
    get() {
        if (_ViewGrid != null) {
            return _ViewGrid!!
        }
        _ViewGrid = ImageVector.Builder(
            name = "ViewGrid",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 1f)
                curveTo(9.657f, 1f, 11f, 2.343f, 11f, 4f)
                verticalLineTo(8f)
                curveTo(11f, 9.657f, 9.657f, 11f, 8f, 11f)
                horizontalLineTo(4f)
                curveTo(2.343f, 11f, 1f, 9.657f, 1f, 8f)
                verticalLineTo(4f)
                curveTo(1f, 2.343f, 2.343f, 1f, 4f, 1f)
                horizontalLineTo(8f)
                close()
                moveTo(8f, 3f)
                curveTo(8.552f, 3f, 9f, 3.448f, 9f, 4f)
                verticalLineTo(8f)
                curveTo(9f, 8.552f, 8.552f, 9f, 8f, 9f)
                horizontalLineTo(4f)
                curveTo(3.448f, 9f, 3f, 8.552f, 3f, 8f)
                verticalLineTo(4f)
                curveTo(3f, 3.448f, 3.448f, 3f, 4f, 3f)
                horizontalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 13f)
                curveTo(9.657f, 13f, 11f, 14.343f, 11f, 16f)
                verticalLineTo(20f)
                curveTo(11f, 21.657f, 9.657f, 23f, 8f, 23f)
                horizontalLineTo(4f)
                curveTo(2.343f, 23f, 1f, 21.657f, 1f, 20f)
                verticalLineTo(16f)
                curveTo(1f, 14.343f, 2.343f, 13f, 4f, 13f)
                horizontalLineTo(8f)
                close()
                moveTo(8f, 15f)
                curveTo(8.552f, 15f, 9f, 15.448f, 9f, 16f)
                verticalLineTo(20f)
                curveTo(9f, 20.552f, 8.552f, 21f, 8f, 21f)
                horizontalLineTo(4f)
                curveTo(3.448f, 21f, 3f, 20.552f, 3f, 20f)
                verticalLineTo(16f)
                curveTo(3f, 15.448f, 3.448f, 15f, 4f, 15f)
                horizontalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 4f)
                curveTo(23f, 2.343f, 21.657f, 1f, 20f, 1f)
                horizontalLineTo(16f)
                curveTo(14.343f, 1f, 13f, 2.343f, 13f, 4f)
                verticalLineTo(8f)
                curveTo(13f, 9.657f, 14.343f, 11f, 16f, 11f)
                horizontalLineTo(20f)
                curveTo(21.657f, 11f, 23f, 9.657f, 23f, 8f)
                verticalLineTo(4f)
                close()
                moveTo(21f, 4f)
                curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
                horizontalLineTo(16f)
                curveTo(15.448f, 3f, 15f, 3.448f, 15f, 4f)
                verticalLineTo(8f)
                curveTo(15f, 8.552f, 15.448f, 9f, 16f, 9f)
                horizontalLineTo(20f)
                curveTo(20.552f, 9f, 21f, 8.552f, 21f, 8f)
                verticalLineTo(4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20f, 13f)
                curveTo(21.657f, 13f, 23f, 14.343f, 23f, 16f)
                verticalLineTo(20f)
                curveTo(23f, 21.657f, 21.657f, 23f, 20f, 23f)
                horizontalLineTo(16f)
                curveTo(14.343f, 23f, 13f, 21.657f, 13f, 20f)
                verticalLineTo(16f)
                curveTo(13f, 14.343f, 14.343f, 13f, 16f, 13f)
                horizontalLineTo(20f)
                close()
                moveTo(20f, 15f)
                curveTo(20.552f, 15f, 21f, 15.448f, 21f, 16f)
                verticalLineTo(20f)
                curveTo(21f, 20.552f, 20.552f, 21f, 20f, 21f)
                horizontalLineTo(16f)
                curveTo(15.448f, 21f, 15f, 20.552f, 15f, 20f)
                verticalLineTo(16f)
                curveTo(15f, 15.448f, 15.448f, 15f, 16f, 15f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _ViewGrid!!
    }

@Suppress("ObjectPropertyName")
private var _ViewGrid: ImageVector? = null
