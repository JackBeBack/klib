package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Bookmark: ImageVector
    get() {
        if (_Bookmark != null) {
            return _Bookmark!!
        }
        _Bookmark = ImageVector.Builder(
            name = "Bookmark",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 4f)
                curveTo(4f, 2.343f, 5.343f, 1f, 7f, 1f)
                horizontalLineTo(17f)
                curveTo(18.657f, 1f, 20f, 2.343f, 20f, 4f)
                verticalLineTo(20.942f)
                curveTo(20f, 22.611f, 18.077f, 23.546f, 16.764f, 22.515f)
                lineTo(12f, 18.772f)
                lineTo(7.236f, 22.515f)
                curveTo(5.923f, 23.546f, 4f, 22.611f, 4f, 20.942f)
                verticalLineTo(4f)
                close()
                moveTo(7f, 3f)
                curveTo(6.448f, 3f, 6f, 3.448f, 6f, 4f)
                verticalLineTo(20.942f)
                lineTo(12f, 16.228f)
                lineTo(18f, 20.942f)
                verticalLineTo(4f)
                curveTo(18f, 3.448f, 17.552f, 3f, 17f, 3f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _Bookmark!!
    }

@Suppress("ObjectPropertyName")
private var _Bookmark: ImageVector? = null
