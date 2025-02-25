package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Book: ImageVector
    get() {
        if (_Book != null) {
            return _Book!!
        }
        _Book = ImageVector.Builder(
            name = "Book",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7f, 7f)
                curveTo(7f, 6.448f, 7.448f, 6f, 8f, 6f)
                horizontalLineTo(16f)
                curveTo(16.552f, 6f, 17f, 6.448f, 17f, 7f)
                curveTo(17f, 7.552f, 16.552f, 8f, 16f, 8f)
                horizontalLineTo(8f)
                curveTo(7.448f, 8f, 7f, 7.552f, 7f, 7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(8f, 9f)
                curveTo(7.448f, 9f, 7f, 9.448f, 7f, 10f)
                curveTo(7f, 10.552f, 7.448f, 11f, 8f, 11f)
                horizontalLineTo(13f)
                curveTo(13.552f, 11f, 14f, 10.552f, 14f, 10f)
                curveTo(14f, 9.448f, 13.552f, 9f, 13f, 9f)
                horizontalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 23f)
                horizontalLineTo(19f)
                curveTo(20.657f, 23f, 22f, 21.657f, 22f, 20f)
                verticalLineTo(4f)
                curveTo(22f, 2.343f, 20.657f, 1f, 19f, 1f)
                horizontalLineTo(7f)
                curveTo(4.239f, 1f, 2f, 3.239f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 20.705f, 4.275f, 23f, 7f, 23f)
                close()
                moveTo(4f, 6f)
                curveTo(4f, 4.343f, 5.343f, 3f, 7f, 3f)
                horizontalLineTo(19f)
                curveTo(19.552f, 3f, 20f, 3.448f, 20f, 4f)
                verticalLineTo(14.171f)
                curveTo(19.687f, 14.06f, 19.351f, 14f, 19f, 14f)
                horizontalLineTo(7f)
                curveTo(5.874f, 14f, 4.836f, 14.372f, 4f, 15f)
                verticalLineTo(6f)
                close()
                moveTo(20f, 17f)
                curveTo(20f, 16.448f, 19.552f, 16f, 19f, 16f)
                horizontalLineTo(7f)
                curveTo(5.514f, 16f, 4.041f, 17.053f, 4.041f, 18.5f)
                curveTo(4.041f, 19.916f, 5.514f, 21f, 7f, 21f)
                horizontalLineTo(19f)
                curveTo(19.552f, 21f, 20f, 20.552f, 20f, 20f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _Book!!
    }

@Suppress("ObjectPropertyName")
private var _Book: ImageVector? = null
