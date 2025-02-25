package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowDownToArc: ImageVector
    get() {
        if (_ArrowDownToArc != null) {
            return _ArrowDownToArc!!
        }
        _ArrowDownToArc = ImageVector.Builder(
            name = "ArrowDownToArc",
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
                moveTo(8f, 11f)
                lineTo(12f, 15f)
                moveTo(12f, 15f)
                lineTo(16f, 11f)
                moveTo(12f, 15f)
                verticalLineTo(3f)
            }
        }.build()

        return _ArrowDownToArc!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownToArc: ImageVector? = null
