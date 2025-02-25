package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChevronUpDot: ImageVector
    get() {
        if (_ChevronUpDot != null) {
            return _ChevronUpDot!!
        }
        _ChevronUpDot = ImageVector.Builder(
            name = "ChevronUpDot",
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
                moveTo(6f, 15f)
                lineTo(12f, 9f)
                lineTo(18f, 15f)
                moveTo(12f, 15f)
                horizontalLineTo(12.01f)
            }
        }.build()

        return _ChevronUpDot!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronUpDot: ImageVector? = null
