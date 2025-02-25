package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Archive: ImageVector
    get() {
        if (_Archive != null) {
            return _Archive!!
        }
        _Archive = ImageVector.Builder(
            name = "Archive",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(8f, 10f)
                curveTo(7.448f, 10f, 7f, 10.448f, 7f, 11f)
                curveTo(7f, 11.552f, 7.448f, 12f, 8f, 12f)
                horizontalLineTo(16f)
                curveTo(16.552f, 12f, 17f, 11.552f, 17f, 11f)
                curveTo(17f, 10.448f, 16.552f, 10f, 16f, 10f)
                horizontalLineTo(8f)
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
                verticalLineTo(5f)
                curveTo(1f, 6.306f, 1.835f, 7.417f, 3f, 7.829f)
                verticalLineTo(20f)
                curveTo(3f, 21.657f, 4.343f, 23f, 6f, 23f)
                horizontalLineTo(18f)
                curveTo(19.657f, 23f, 21f, 21.657f, 21f, 20f)
                verticalLineTo(7.829f)
                curveTo(22.165f, 7.417f, 23f, 6.306f, 23f, 5f)
                verticalLineTo(4f)
                close()
                moveTo(20f, 6f)
                horizontalLineTo(4f)
                curveTo(3.448f, 6f, 3f, 5.552f, 3f, 5f)
                verticalLineTo(4f)
                curveTo(3f, 3.448f, 3.448f, 3f, 4f, 3f)
                horizontalLineTo(20f)
                curveTo(20.552f, 3f, 21f, 3.448f, 21f, 4f)
                verticalLineTo(5f)
                curveTo(21f, 5.552f, 20.552f, 6f, 20f, 6f)
                close()
                moveTo(5f, 20f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                curveTo(19f, 20.552f, 18.552f, 21f, 18f, 21f)
                horizontalLineTo(6f)
                curveTo(5.448f, 21f, 5f, 20.552f, 5f, 20f)
                close()
            }
        }.build()

        return _Archive!!
    }

@Suppress("ObjectPropertyName")
private var _Archive: ImageVector? = null
