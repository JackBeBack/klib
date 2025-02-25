package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowNarrowUpMove: ImageVector
    get() {
        if (_ArrowNarrowUpMove != null) {
            return _ArrowNarrowUpMove!!
        }
        _ArrowNarrowUpMove = ImageVector.Builder(
            name = "ArrowNarrowUpMove",
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
                moveTo(8f, 8f)
                lineTo(12f, 4f)
                moveTo(12f, 4f)
                lineTo(16f, 8f)
                moveTo(12f, 4f)
                verticalLineTo(16f)
                moveTo(4f, 20f)
                horizontalLineTo(20f)
            }
        }.build()

        return _ArrowNarrowUpMove!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowNarrowUpMove: ImageVector? = null
