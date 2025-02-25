package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Basket: ImageVector
    get() {
        if (_Basket != null) {
            return _Basket!!
        }
        _Basket = ImageVector.Builder(
            name = "Basket",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.531f, 1f)
                curveTo(5.524f, 1f, 3.197f, 3.636f, 3.57f, 6.62f)
                lineTo(5.289f, 20.372f)
                curveTo(5.476f, 21.873f, 6.753f, 23f, 8.266f, 23f)
                horizontalLineTo(15.734f)
                curveTo(17.247f, 23f, 18.524f, 21.873f, 18.711f, 20.372f)
                lineTo(20.43f, 6.62f)
                curveTo(20.803f, 3.636f, 18.476f, 1f, 15.469f, 1f)
                horizontalLineTo(8.531f)
                close()
                moveTo(5.701f, 5f)
                curveTo(6.111f, 3.845f, 7.212f, 3f, 8.531f, 3f)
                horizontalLineTo(15.469f)
                curveTo(16.788f, 3f, 17.889f, 3.845f, 18.299f, 5f)
                horizontalLineTo(5.701f)
                close()
                moveTo(5.633f, 7f)
                lineTo(7.273f, 20.124f)
                curveTo(7.336f, 20.625f, 7.761f, 21f, 8.266f, 21f)
                horizontalLineTo(15.734f)
                curveTo(16.239f, 21f, 16.664f, 20.625f, 16.727f, 20.124f)
                lineTo(18.367f, 7f)
                horizontalLineTo(5.633f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(15.002f, 10.998f)
                curveTo(14.611f, 10.608f, 13.978f, 10.608f, 13.588f, 10.998f)
                lineTo(12f, 12.586f)
                lineTo(10.42f, 11.006f)
                curveTo(10.03f, 10.615f, 9.396f, 10.615f, 9.006f, 11.006f)
                curveTo(8.615f, 11.396f, 8.615f, 12.03f, 9.006f, 12.42f)
                lineTo(10.586f, 14f)
                lineTo(9f, 15.586f)
                curveTo(8.609f, 15.976f, 8.609f, 16.61f, 9f, 17f)
                curveTo(9.391f, 17.39f, 10.024f, 17.39f, 10.414f, 17f)
                lineTo(12f, 15.414f)
                lineTo(13.588f, 17.002f)
                curveTo(13.978f, 17.392f, 14.611f, 17.392f, 15.002f, 17.002f)
                curveTo(15.392f, 16.611f, 15.392f, 15.978f, 15.002f, 15.588f)
                lineTo(13.414f, 14f)
                lineTo(15.002f, 12.412f)
                curveTo(15.392f, 12.022f, 15.392f, 11.389f, 15.002f, 10.998f)
                close()
            }
        }.build()

        return _Basket!!
    }

@Suppress("ObjectPropertyName")
private var _Basket: ImageVector? = null
