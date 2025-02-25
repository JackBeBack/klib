package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowUpFromArc: ImageVector
    get() {
        if (_ArrowUpFromArc != null) {
            return _ArrowUpFromArc!!
        }
        _ArrowUpFromArc = ImageVector.Builder(
            name = "ArrowUpFromArc",
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
                moveTo(3f, 11f)
                verticalLineTo(12f)
                curveTo(3f, 16.971f, 7.029f, 21f, 12f, 21f)
                curveTo(16.971f, 21f, 21f, 16.971f, 21f, 12f)
                verticalLineTo(11f)
                moveTo(8f, 7f)
                lineTo(12f, 3f)
                moveTo(12f, 3f)
                lineTo(16f, 7f)
                moveTo(12f, 3f)
                verticalLineTo(15f)
            }
        }.build()

        return _ArrowUpFromArc!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpFromArc: ImageVector? = null
