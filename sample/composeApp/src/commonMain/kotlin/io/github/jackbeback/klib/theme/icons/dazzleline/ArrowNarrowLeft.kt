package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowNarrowLeft: ImageVector
    get() {
        if (_ArrowNarrowLeft != null) {
            return _ArrowNarrowLeft!!
        }
        _ArrowNarrowLeft = ImageVector.Builder(
            name = "ArrowNarrowLeft",
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
                moveTo(4f, 12f)
                horizontalLineTo(20f)
                moveTo(4f, 12f)
                lineTo(8f, 8f)
                moveTo(4f, 12f)
                lineTo(8f, 16f)
            }
        }.build()

        return _ArrowNarrowLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowNarrowLeft: ImageVector? = null
