package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BasketShopping: ImageVector
    get() {
        if (_BasketShopping != null) {
            return _BasketShopping!!
        }
        _BasketShopping = ImageVector.Builder(
            name = "BasketShopping",
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
                moveTo(20f, 10f)
                lineTo(18.514f, 17.428f)
                curveTo(18.331f, 18.344f, 18.24f, 18.802f, 18f, 19.145f)
                curveTo(17.789f, 19.447f, 17.499f, 19.685f, 17.161f, 19.833f)
                curveTo(16.778f, 20f, 16.311f, 20f, 15.377f, 20f)
                horizontalLineTo(8.623f)
                curveTo(7.689f, 20f, 7.222f, 20f, 6.839f, 19.833f)
                curveTo(6.501f, 19.685f, 6.211f, 19.447f, 6f, 19.145f)
                curveTo(5.76f, 18.802f, 5.669f, 18.344f, 5.486f, 17.428f)
                lineTo(4f, 10f)
                moveTo(20f, 10f)
                horizontalLineTo(18f)
                moveTo(20f, 10f)
                horizontalLineTo(21f)
                moveTo(4f, 10f)
                horizontalLineTo(3f)
                moveTo(4f, 10f)
                horizontalLineTo(6f)
                moveTo(6f, 10f)
                horizontalLineTo(18f)
                moveTo(6f, 10f)
                lineTo(9f, 4f)
                moveTo(18f, 10f)
                lineTo(15f, 4f)
                moveTo(9f, 13f)
                verticalLineTo(16f)
                moveTo(12f, 13f)
                verticalLineTo(16f)
                moveTo(15f, 13f)
                verticalLineTo(16f)
            }
        }.build()

        return _BasketShopping!!
    }

@Suppress("ObjectPropertyName")
private var _BasketShopping: ImageVector? = null
