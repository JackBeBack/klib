package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChevronRightDot: ImageVector
    get() {
        if (_ChevronRightDot != null) {
            return _ChevronRightDot!!
        }
        _ChevronRightDot = ImageVector.Builder(
            name = "ChevronRightDot",
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
                moveTo(9f, 6f)
                lineTo(15f, 12f)
                lineTo(9f, 18f)
                moveTo(9f, 12f)
                horizontalLineTo(9.01f)
            }
        }.build()

        return _ChevronRightDot!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronRightDot: ImageVector? = null
