package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowNarrowLeftAlignment: ImageVector
    get() {
        if (_ArrowNarrowLeftAlignment != null) {
            return _ArrowNarrowLeftAlignment!!
        }
        _ArrowNarrowLeftAlignment = ImageVector.Builder(
            name = "ArrowNarrowLeftAlignment",
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
                moveTo(8f, 12f)
                lineTo(12f, 8f)
                moveTo(8f, 12f)
                lineTo(12f, 16f)
            }
        }.build()

        return _ArrowNarrowLeftAlignment!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowNarrowLeftAlignment: ImageVector? = null
