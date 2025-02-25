package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowSmDown: ImageVector
    get() {
        if (_ArrowSmDown != null) {
            return _ArrowSmDown!!
        }
        _ArrowSmDown = ImageVector.Builder(
            name = "ArrowSmDown",
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
                moveTo(12f, 18f)
                lineTo(7f, 13f)
                moveTo(12f, 18f)
                lineTo(17f, 13f)
            }
        }.build()

        return _ArrowSmDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSmDown: ImageVector? = null
