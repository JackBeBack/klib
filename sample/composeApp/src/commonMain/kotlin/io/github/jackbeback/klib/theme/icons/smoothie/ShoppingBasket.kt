package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.ShoppingBasket: ImageVector
    get() {
        if (_ShoppingBasket != null) {
            return _ShoppingBasket!!
        }
        _ShoppingBasket = ImageVector.Builder(
            name = "ShoppingBasket",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-24f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 9f)
                horizontalLineTo(5.18f)
                curveTo(4.563f, 9f, 4.092f, 9.555f, 4.194f, 10.164f)
                lineTo(5.861f, 20.164f)
                curveTo(5.941f, 20.647f, 6.358f, 21f, 6.847f, 21f)
                horizontalLineTo(17.153f)
                curveTo(17.642f, 21f, 18.059f, 20.647f, 18.139f, 20.164f)
                lineTo(19.806f, 10.164f)
                curveTo(19.907f, 9.555f, 19.438f, 9f, 18.819f, 9f)
                horizontalLineTo(15f)
                moveTo(9f, 9f)
                horizontalLineTo(15f)
                moveTo(9f, 9f)
                lineTo(8f, 4f)
                horizontalLineTo(16f)
                lineTo(15f, 9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 11f)
                lineTo(15f, 19f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 11f)
                lineTo(9f, 19f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 11f)
                verticalLineTo(19f)
            }
        }.build()

        return _ShoppingBasket!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingBasket: ImageVector? = null
