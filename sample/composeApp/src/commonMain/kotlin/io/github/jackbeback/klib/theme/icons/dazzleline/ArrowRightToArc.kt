package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowRightToArc: ImageVector
    get() {
        if (_ArrowRightToArc != null) {
            return _ArrowRightToArc!!
        }
        _ArrowRightToArc = ImageVector.Builder(
            name = "ArrowRightToArc",
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
                moveTo(11f, 21f)
                horizontalLineTo(12f)
                curveTo(16.971f, 21f, 21f, 16.971f, 21f, 12f)
                curveTo(21f, 7.029f, 16.971f, 3f, 12f, 3f)
                horizontalLineTo(11f)
                moveTo(11f, 16f)
                lineTo(15f, 12f)
                moveTo(15f, 12f)
                lineTo(11f, 8f)
                moveTo(15f, 12f)
                horizontalLineTo(3f)
            }
        }.build()

        return _ArrowRightToArc!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightToArc: ImageVector? = null
