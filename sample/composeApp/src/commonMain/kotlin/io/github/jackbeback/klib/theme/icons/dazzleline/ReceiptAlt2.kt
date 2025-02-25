package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ReceiptAlt2: ImageVector
    get() {
        if (_ReceiptAlt2 != null) {
            return _ReceiptAlt2!!
        }
        _ReceiptAlt2 = ImageVector.Builder(
            name = "ReceiptAlt2",
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
                moveTo(9f, 9f)
                horizontalLineTo(15f)
                moveTo(9f, 12f)
                horizontalLineTo(15f)
                moveTo(9f, 15f)
                horizontalLineTo(15f)
                moveTo(5f, 3f)
                verticalLineTo(21f)
                lineTo(8f, 19f)
                lineTo(10f, 21f)
                lineTo(12f, 19f)
                lineTo(14f, 21f)
                lineTo(16f, 19f)
                lineTo(19f, 21f)
                verticalLineTo(3f)
                lineTo(16f, 5f)
                lineTo(14f, 3f)
                lineTo(12f, 5f)
                lineTo(10f, 3f)
                lineTo(8f, 5f)
                lineTo(5f, 3f)
                close()
            }
        }.build()

        return _ReceiptAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptAlt2: ImageVector? = null
