package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChevronLeftDot: ImageVector
    get() {
        if (_ChevronLeftDot != null) {
            return _ChevronLeftDot!!
        }
        _ChevronLeftDot = ImageVector.Builder(
            name = "ChevronLeftDot",
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
                moveTo(15f, 6f)
                lineTo(9f, 12f)
                lineTo(15f, 18f)
                moveTo(15f, 12f)
                horizontalLineTo(15.01f)
            }
        }.build()

        return _ChevronLeftDot!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronLeftDot: ImageVector? = null
