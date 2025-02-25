package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowNarrowDown: ImageVector
    get() {
        if (_ArrowNarrowDown != null) {
            return _ArrowNarrowDown!!
        }
        _ArrowNarrowDown = ImageVector.Builder(
            name = "ArrowNarrowDown",
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
                moveTo(12f, 20f)
                lineTo(8f, 16f)
                moveTo(12f, 20f)
                lineTo(16f, 16f)
            }
        }.build()

        return _ArrowNarrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowNarrowDown: ImageVector? = null
