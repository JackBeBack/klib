package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowNarrowDownMove: ImageVector
    get() {
        if (_ArrowNarrowDownMove != null) {
            return _ArrowNarrowDownMove!!
        }
        _ArrowNarrowDownMove = ImageVector.Builder(
            name = "ArrowNarrowDownMove",
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
                moveTo(8f, 16f)
                lineTo(12f, 20f)
                moveTo(12f, 20f)
                lineTo(16f, 16f)
                moveTo(12f, 20f)
                verticalLineTo(8f)
                moveTo(4f, 4f)
                horizontalLineTo(20f)
            }
        }.build()

        return _ArrowNarrowDownMove!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowNarrowDownMove: ImageVector? = null
