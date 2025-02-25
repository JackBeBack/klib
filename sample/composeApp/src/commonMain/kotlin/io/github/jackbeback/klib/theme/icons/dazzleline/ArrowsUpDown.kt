package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowsUpDown: ImageVector
    get() {
        if (_ArrowsUpDown != null) {
            return _ArrowsUpDown!!
        }
        _ArrowsUpDown = ImageVector.Builder(
            name = "ArrowsUpDown",
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
                moveTo(12f, 3f)
                verticalLineTo(21f)
                moveTo(12f, 3f)
                lineTo(16f, 7f)
                moveTo(12f, 3f)
                lineTo(8f, 7f)
                moveTo(12f, 21f)
                lineTo(8f, 17f)
                moveTo(12f, 21f)
                lineTo(16f, 17f)
            }
        }.build()

        return _ArrowsUpDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsUpDown: ImageVector? = null
