package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChevronLeftDouble: ImageVector
    get() {
        if (_ChevronLeftDouble != null) {
            return _ChevronLeftDouble!!
        }
        _ChevronLeftDouble = ImageVector.Builder(
            name = "ChevronLeftDouble",
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
                moveTo(18f, 17f)
                lineTo(13f, 12f)
                lineTo(18f, 7f)
                moveTo(11f, 17f)
                lineTo(6f, 12f)
                lineTo(11f, 7f)
            }
        }.build()

        return _ChevronLeftDouble!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronLeftDouble: ImageVector? = null
