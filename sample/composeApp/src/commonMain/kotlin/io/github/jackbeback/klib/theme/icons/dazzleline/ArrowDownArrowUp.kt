package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowDownArrowUp: ImageVector
    get() {
        if (_ArrowDownArrowUp != null) {
            return _ArrowDownArrowUp!!
        }
        _ArrowDownArrowUp = ImageVector.Builder(
            name = "ArrowDownArrowUp",
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
                moveTo(7f, 4f)
                verticalLineTo(20f)
                moveTo(7f, 20f)
                lineTo(3f, 16f)
                moveTo(7f, 20f)
                lineTo(11f, 16f)
                moveTo(17f, 4f)
                verticalLineTo(20f)
                moveTo(17f, 4f)
                lineTo(21f, 8f)
                moveTo(17f, 4f)
                lineTo(13f, 8f)
            }
        }.build()

        return _ArrowDownArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownArrowUp: ImageVector? = null
