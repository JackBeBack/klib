package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowNarrowRightMove: ImageVector
    get() {
        if (_ArrowNarrowRightMove != null) {
            return _ArrowNarrowRightMove!!
        }
        _ArrowNarrowRightMove = ImageVector.Builder(
            name = "ArrowNarrowRightMove",
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
                moveTo(4f, 4f)
                verticalLineTo(20f)
                moveTo(8f, 12f)
                horizontalLineTo(20f)
                moveTo(20f, 12f)
                lineTo(16f, 8f)
                moveTo(20f, 12f)
                lineTo(16f, 16f)
            }
        }.build()

        return _ArrowNarrowRightMove!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowNarrowRightMove: ImageVector? = null
