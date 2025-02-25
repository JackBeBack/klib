package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowSmUp: ImageVector
    get() {
        if (_ArrowSmUp != null) {
            return _ArrowSmUp!!
        }
        _ArrowSmUp = ImageVector.Builder(
            name = "ArrowSmUp",
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
                moveTo(12f, 6f)
                verticalLineTo(18f)
                moveTo(12f, 6f)
                lineTo(7f, 11f)
                moveTo(12f, 6f)
                lineTo(17f, 11f)
            }
        }.build()

        return _ArrowSmUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSmUp: ImageVector? = null
