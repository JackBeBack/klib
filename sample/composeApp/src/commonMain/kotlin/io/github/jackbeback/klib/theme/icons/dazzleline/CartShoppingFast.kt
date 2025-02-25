package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CartShoppingFast: ImageVector
    get() {
        if (_CartShoppingFast != null) {
            return _CartShoppingFast!!
        }
        _CartShoppingFast = ImageVector.Builder(
            name = "CartShoppingFast",
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
                moveTo(7.3f, 5f)
                horizontalLineTo(22f)
                lineTo(20f, 12f)
                horizontalLineTo(8.377f)
                moveTo(21f, 16f)
                horizontalLineTo(9f)
                lineTo(7f, 3f)
                horizontalLineTo(4f)
                moveTo(4f, 8f)
                horizontalLineTo(2f)
                moveTo(5f, 11f)
                horizontalLineTo(2f)
                moveTo(6f, 14f)
                horizontalLineTo(2f)
                moveTo(10f, 20f)
                curveTo(10f, 20.552f, 9.552f, 21f, 9f, 21f)
                curveTo(8.448f, 21f, 8f, 20.552f, 8f, 20f)
                curveTo(8f, 19.448f, 8.448f, 19f, 9f, 19f)
                curveTo(9.552f, 19f, 10f, 19.448f, 10f, 20f)
                close()
                moveTo(21f, 20f)
                curveTo(21f, 20.552f, 20.552f, 21f, 20f, 21f)
                curveTo(19.448f, 21f, 19f, 20.552f, 19f, 20f)
                curveTo(19f, 19.448f, 19.448f, 19f, 20f, 19f)
                curveTo(20.552f, 19f, 21f, 19.448f, 21f, 20f)
                close()
            }
        }.build()

        return _CartShoppingFast!!
    }

@Suppress("ObjectPropertyName")
private var _CartShoppingFast: ImageVector? = null
