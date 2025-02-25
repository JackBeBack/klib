package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Cocktail: ImageVector
    get() {
        if (_Cocktail != null) {
            return _Cocktail!!
        }
        _Cocktail = ImageVector.Builder(
            name = "Cocktail",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.081f, 1f)
                curveTo(2.404f, 1f, 1.471f, 2.94f, 2.519f, 4.249f)
                lineTo(11f, 14.851f)
                verticalLineTo(21f)
                horizontalLineTo(6f)
                curveTo(5.448f, 21f, 5f, 21.448f, 5f, 22f)
                curveTo(5f, 22.552f, 5.448f, 23f, 6f, 23f)
                horizontalLineTo(18f)
                curveTo(18.552f, 23f, 19f, 22.552f, 19f, 22f)
                curveTo(19f, 21.448f, 18.552f, 21f, 18f, 21f)
                horizontalLineTo(13f)
                verticalLineTo(14.851f)
                lineTo(21.481f, 4.249f)
                curveTo(22.529f, 2.94f, 21.596f, 1f, 19.919f, 1f)
                horizontalLineTo(4.081f)
                close()
                moveTo(7.281f, 7f)
                lineTo(4.081f, 3f)
                horizontalLineTo(19.919f)
                lineTo(16.719f, 7f)
                horizontalLineTo(7.281f)
                close()
                moveTo(8.881f, 9f)
                lineTo(12f, 12.899f)
                lineTo(15.119f, 9f)
                lineTo(8.881f, 9f)
                close()
            }
        }.build()

        return _Cocktail!!
    }

@Suppress("ObjectPropertyName")
private var _Cocktail: ImageVector? = null
