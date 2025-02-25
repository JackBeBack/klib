package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ShoppingCart: ImageVector
    get() {
        if (_ShoppingCart != null) {
            return _ShoppingCart!!
        }
        _ShoppingCart = ImageVector.Builder(
            name = "ShoppingCart",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 1f)
                curveTo(1.448f, 1f, 1f, 1.448f, 1f, 2f)
                curveTo(1f, 2.552f, 1.448f, 3f, 2f, 3f)
                horizontalLineTo(3.219f)
                lineTo(6.783f, 17.257f)
                curveTo(5.733f, 17.724f, 5f, 18.776f, 5f, 20f)
                curveTo(5f, 21.657f, 6.343f, 23f, 8f, 23f)
                curveTo(9.657f, 23f, 11f, 21.657f, 11f, 20f)
                curveTo(11f, 19.649f, 10.94f, 19.313f, 10.829f, 19f)
                horizontalLineTo(15.171f)
                curveTo(15.06f, 19.313f, 15f, 19.649f, 15f, 20f)
                curveTo(15f, 21.657f, 16.343f, 23f, 18f, 23f)
                curveTo(19.657f, 23f, 21f, 21.657f, 21f, 20f)
                curveTo(21f, 18.343f, 19.657f, 17f, 18f, 17f)
                horizontalLineTo(8.781f)
                lineTo(8.281f, 15f)
                horizontalLineTo(18f)
                curveTo(20.064f, 15f, 21.302f, 13.696f, 21.989f, 12.256f)
                curveTo(22.66f, 10.849f, 22.893f, 9.167f, 22.975f, 7.944f)
                curveTo(23.088f, 6.24f, 21.68f, 5f, 20.121f, 5f)
                horizontalLineTo(5.781f)
                lineTo(5.16f, 2.515f)
                curveTo(4.937f, 1.625f, 4.137f, 1f, 3.219f, 1f)
                horizontalLineTo(2f)
                close()
                moveTo(18f, 13f)
                horizontalLineTo(7.781f)
                lineTo(6.281f, 7f)
                horizontalLineTo(20.121f)
                curveTo(20.674f, 7f, 21.006f, 7.407f, 20.979f, 7.811f)
                curveTo(20.903f, 8.952f, 20.691f, 10.332f, 20.184f, 11.395f)
                curveTo(19.692f, 12.425f, 19.02f, 13f, 18f, 13f)
                close()
                moveTo(18f, 20.994f)
                curveTo(17.451f, 20.994f, 17.006f, 20.549f, 17.006f, 20f)
                curveTo(17.006f, 19.451f, 17.451f, 19.006f, 18f, 19.006f)
                curveTo(18.549f, 19.006f, 18.994f, 19.451f, 18.994f, 20f)
                curveTo(18.994f, 20.549f, 18.549f, 20.994f, 18f, 20.994f)
                close()
                moveTo(7.006f, 20f)
                curveTo(7.006f, 20.549f, 7.451f, 20.994f, 8f, 20.994f)
                curveTo(8.549f, 20.994f, 8.994f, 20.549f, 8.994f, 20f)
                curveTo(8.994f, 19.451f, 8.549f, 19.006f, 8f, 19.006f)
                curveTo(7.451f, 19.006f, 7.006f, 19.451f, 7.006f, 20f)
                close()
            }
        }.build()

        return _ShoppingCart!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingCart: ImageVector? = null
