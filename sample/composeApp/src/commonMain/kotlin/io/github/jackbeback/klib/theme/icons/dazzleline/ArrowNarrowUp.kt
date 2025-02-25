package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowNarrowUp: ImageVector
    get() {
        if (_ArrowNarrowUp != null) {
            return _ArrowNarrowUp!!
        }
        _ArrowNarrowUp = ImageVector.Builder(
            name = "ArrowNarrowUp",
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
                moveTo(12f, 4f)
                verticalLineTo(20f)
                moveTo(12f, 4f)
                lineTo(8f, 8f)
                moveTo(12f, 4f)
                lineTo(16f, 8f)
            }
        }.build()

        return _ArrowNarrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowNarrowUp: ImageVector? = null
