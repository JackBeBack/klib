package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowNarrowTopAlignment: ImageVector
    get() {
        if (_ArrowNarrowTopAlignment != null) {
            return _ArrowNarrowTopAlignment!!
        }
        _ArrowNarrowTopAlignment = ImageVector.Builder(
            name = "ArrowNarrowTopAlignment",
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
                lineTo(12f, 8f)
                moveTo(12f, 8f)
                lineTo(16f, 12f)
                moveTo(12f, 8f)
                verticalLineTo(20f)
                moveTo(4f, 4f)
                horizontalLineTo(20f)
            }
        }.build()

        return _ArrowNarrowTopAlignment!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowNarrowTopAlignment: ImageVector? = null
