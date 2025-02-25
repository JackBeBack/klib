package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChevronUpDouble: ImageVector
    get() {
        if (_ChevronUpDouble != null) {
            return _ChevronUpDouble!!
        }
        _ChevronUpDouble = ImageVector.Builder(
            name = "ChevronUpDouble",
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
                moveTo(17f, 18f)
                lineTo(12f, 13f)
                lineTo(7f, 18f)
                moveTo(17f, 11f)
                lineTo(12f, 6f)
                lineTo(7f, 11f)
            }
        }.build()

        return _ChevronUpDouble!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronUpDouble: ImageVector? = null
