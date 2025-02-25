package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowNarrowBottomAlignment: ImageVector
    get() {
        if (_ArrowNarrowBottomAlignment != null) {
            return _ArrowNarrowBottomAlignment!!
        }
        _ArrowNarrowBottomAlignment = ImageVector.Builder(
            name = "ArrowNarrowBottomAlignment",
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
                moveTo(8f, 12f)
                lineTo(12f, 16f)
                moveTo(12f, 16f)
                lineTo(16f, 12f)
                moveTo(12f, 16f)
                verticalLineTo(4f)
                moveTo(4f, 20f)
                horizontalLineTo(20f)
            }
        }.build()

        return _ArrowNarrowBottomAlignment!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowNarrowBottomAlignment: ImageVector? = null
