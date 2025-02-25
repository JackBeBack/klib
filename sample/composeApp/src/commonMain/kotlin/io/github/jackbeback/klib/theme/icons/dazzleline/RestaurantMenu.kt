package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.RestaurantMenu: ImageVector
    get() {
        if (_RestaurantMenu != null) {
            return _RestaurantMenu!!
        }
        _RestaurantMenu = ImageVector.Builder(
            name = "RestaurantMenu",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 6f)
                verticalLineTo(4.284f)
                curveTo(16f, 3.516f, 16f, 3.132f, 15.839f, 2.883f)
                curveTo(15.698f, 2.666f, 15.478f, 2.512f, 15.225f, 2.453f)
                curveTo(14.937f, 2.387f, 14.575f, 2.518f, 13.853f, 2.781f)
                lineTo(6.58f, 5.426f)
                curveTo(6.011f, 5.633f, 5.726f, 5.736f, 5.516f, 5.918f)
                curveTo(5.331f, 6.08f, 5.188f, 6.284f, 5.1f, 6.513f)
                curveTo(5f, 6.773f, 5f, 7.075f, 5f, 7.681f)
                verticalLineTo(12f)
                moveTo(9f, 17f)
                horizontalLineTo(15f)
                moveTo(9f, 13.5f)
                horizontalLineTo(15f)
                moveTo(9f, 10f)
                horizontalLineTo(15f)
                moveTo(8.2f, 21f)
                horizontalLineTo(15.8f)
                curveTo(16.92f, 21f, 17.48f, 21f, 17.908f, 20.782f)
                curveTo(18.284f, 20.59f, 18.59f, 20.284f, 18.782f, 19.908f)
                curveTo(19f, 19.48f, 19f, 18.92f, 19f, 17.8f)
                verticalLineTo(9.2f)
                curveTo(19f, 8.08f, 19f, 7.52f, 18.782f, 7.092f)
                curveTo(18.59f, 6.716f, 18.284f, 6.41f, 17.908f, 6.218f)
                curveTo(17.48f, 6f, 16.92f, 6f, 15.8f, 6f)
                horizontalLineTo(8.2f)
                curveTo(7.08f, 6f, 6.52f, 6f, 6.092f, 6.218f)
                curveTo(5.716f, 6.41f, 5.41f, 6.716f, 5.218f, 7.092f)
                curveTo(5f, 7.52f, 5f, 8.08f, 5f, 9.2f)
                verticalLineTo(17.8f)
                curveTo(5f, 18.92f, 5f, 19.48f, 5.218f, 19.908f)
                curveTo(5.41f, 20.284f, 5.716f, 20.59f, 6.092f, 20.782f)
                curveTo(6.52f, 21f, 7.08f, 21f, 8.2f, 21f)
                close()
            }
        }.build()

        return _RestaurantMenu!!
    }

@Suppress("ObjectPropertyName")
private var _RestaurantMenu: ImageVector? = null
