package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LinesLeaning: ImageVector
    get() {
        if (_LinesLeaning != null) {
            return _LinesLeaning!!
        }
        _LinesLeaning = ImageVector.Builder(
            name = "LinesLeaning",
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
                moveTo(18f, 5f)
                verticalLineTo(19f)
                moveTo(10f, 5f)
                lineTo(6f, 19f)
                moveTo(14f, 5f)
                lineTo(12f, 19f)
            }
        }.build()

        return _LinesLeaning!!
    }

@Suppress("ObjectPropertyName")
private var _LinesLeaning: ImageVector? = null
