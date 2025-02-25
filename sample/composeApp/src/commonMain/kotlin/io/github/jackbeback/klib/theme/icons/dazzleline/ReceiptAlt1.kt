package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ReceiptAlt1: ImageVector
    get() {
        if (_ReceiptAlt1 != null) {
            return _ReceiptAlt1!!
        }
        _ReceiptAlt1 = ImageVector.Builder(
            name = "ReceiptAlt1",
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
                moveTo(9f, 11f)
                horizontalLineTo(15f)
                moveTo(9f, 7f)
                horizontalLineTo(13f)
                moveTo(9f, 15f)
                horizontalLineTo(15f)
                moveTo(5f, 6.2f)
                verticalLineTo(21f)
                lineTo(7.5f, 19f)
                lineTo(10f, 21f)
                lineTo(12f, 19f)
                lineTo(14f, 21f)
                lineTo(16.5f, 19f)
                lineTo(19f, 21f)
                verticalLineTo(6.2f)
                curveTo(19f, 5.08f, 19f, 4.52f, 18.782f, 4.092f)
                curveTo(18.59f, 3.716f, 18.284f, 3.41f, 17.908f, 3.218f)
                curveTo(17.48f, 3f, 16.92f, 3f, 15.8f, 3f)
                horizontalLineTo(8.2f)
                curveTo(7.08f, 3f, 6.52f, 3f, 6.092f, 3.218f)
                curveTo(5.716f, 3.41f, 5.41f, 3.716f, 5.218f, 4.092f)
                curveTo(5f, 4.52f, 5f, 5.08f, 5f, 6.2f)
                close()
            }
        }.build()

        return _ReceiptAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptAlt1: ImageVector? = null
