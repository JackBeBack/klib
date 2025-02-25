package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChartPieAlt1: ImageVector
    get() {
        if (_ChartPieAlt1 != null) {
            return _ChartPieAlt1!!
        }
        _ChartPieAlt1 = ImageVector.Builder(
            name = "ChartPieAlt1",
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
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                moveTo(21f, 12f)
                curveTo(21f, 7.029f, 16.971f, 3f, 12f, 3f)
                moveTo(21f, 12f)
                horizontalLineTo(12f)
                moveTo(12f, 3f)
                verticalLineTo(12f)
                moveTo(12f, 12f)
                lineTo(16.995f, 19.488f)
            }
        }.build()

        return _ChartPieAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPieAlt1: ImageVector? = null
