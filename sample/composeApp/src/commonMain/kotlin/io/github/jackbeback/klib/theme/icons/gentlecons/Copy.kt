package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Copy: ImageVector
    get() {
        if (_Copy != null) {
            return _Copy!!
        }
        _Copy = ImageVector.Builder(
            name = "Copy",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21f, 8f)
                curveTo(21f, 6.343f, 19.657f, 5f, 18f, 5f)
                horizontalLineTo(10f)
                curveTo(8.343f, 5f, 7f, 6.343f, 7f, 8f)
                verticalLineTo(20f)
                curveTo(7f, 21.657f, 8.343f, 23f, 10f, 23f)
                horizontalLineTo(18f)
                curveTo(19.657f, 23f, 21f, 21.657f, 21f, 20f)
                verticalLineTo(8f)
                close()
                moveTo(19f, 8f)
                curveTo(19f, 7.448f, 18.552f, 7f, 18f, 7f)
                horizontalLineTo(10f)
                curveTo(9.448f, 7f, 9f, 7.448f, 9f, 8f)
                verticalLineTo(20f)
                curveTo(9f, 20.552f, 9.448f, 21f, 10f, 21f)
                horizontalLineTo(18f)
                curveTo(18.552f, 21f, 19f, 20.552f, 19f, 20f)
                verticalLineTo(8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6f, 3f)
                horizontalLineTo(16f)
                curveTo(16.552f, 3f, 17f, 2.552f, 17f, 2f)
                curveTo(17f, 1.448f, 16.552f, 1f, 16f, 1f)
                horizontalLineTo(6f)
                curveTo(4.343f, 1f, 3f, 2.343f, 3f, 4f)
                verticalLineTo(18f)
                curveTo(3f, 18.552f, 3.448f, 19f, 4f, 19f)
                curveTo(4.552f, 19f, 5f, 18.552f, 5f, 18f)
                verticalLineTo(4f)
                curveTo(5f, 3.448f, 5.448f, 3f, 6f, 3f)
                close()
            }
        }.build()

        return _Copy!!
    }

@Suppress("ObjectPropertyName")
private var _Copy: ImageVector? = null
