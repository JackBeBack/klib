package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.AddSquare: ImageVector
    get() {
        if (_AddSquare != null) {
            return _AddSquare!!
        }
        _AddSquare = ImageVector.Builder(
            name = "AddSquare",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11f, 8f)
                curveTo(11f, 7.448f, 11.448f, 7f, 12f, 7f)
                curveTo(12.552f, 7f, 13f, 7.448f, 13f, 8f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                curveTo(16.552f, 11f, 17f, 11.448f, 17f, 12f)
                curveTo(17f, 12.552f, 16.552f, 13f, 16f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                curveTo(13f, 16.552f, 12.552f, 17f, 12f, 17f)
                curveTo(11.448f, 17f, 11f, 16.552f, 11f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                curveTo(7.448f, 13f, 7f, 12.552f, 7f, 12f)
                curveTo(7f, 11.448f, 7.448f, 11f, 8f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 4f)
                curveTo(23f, 2.343f, 21.657f, 1f, 20f, 1f)
                horizontalLineTo(4f)
                curveTo(2.343f, 1f, 1f, 2.343f, 1f, 4f)
                verticalLineTo(20f)
                curveTo(1f, 21.657f, 2.343f, 23f, 4f, 23f)
                horizontalLineTo(20f)
                curveTo(21.657f, 23f, 23f, 21.657f, 23f, 20f)
                verticalLineTo(4f)
                close()
                moveTo(21f, 4f)
                curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
                horizontalLineTo(4f)
                curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
                verticalLineTo(20f)
                curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
                horizontalLineTo(20f)
                curveTo(20.552f, 21f, 21f, 20.552f, 21f, 20f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _AddSquare!!
    }

@Suppress("ObjectPropertyName")
private var _AddSquare: ImageVector? = null
