package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChevronDownDouble: ImageVector
    get() {
        if (_ChevronDownDouble != null) {
            return _ChevronDownDouble!!
        }
        _ChevronDownDouble = ImageVector.Builder(
            name = "ChevronDownDouble",
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
                moveTo(7f, 13f)
                lineTo(12f, 18f)
                lineTo(17f, 13f)
                moveTo(7f, 6f)
                lineTo(12f, 11f)
                lineTo(17f, 6f)
            }
        }.build()

        return _ChevronDownDouble!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDownDouble: ImageVector? = null
