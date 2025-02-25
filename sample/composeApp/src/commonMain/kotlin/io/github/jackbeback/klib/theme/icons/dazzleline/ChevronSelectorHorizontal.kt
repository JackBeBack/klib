package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChevronSelectorHorizontal: ImageVector
    get() {
        if (_ChevronSelectorHorizontal != null) {
            return _ChevronSelectorHorizontal!!
        }
        _ChevronSelectorHorizontal = ImageVector.Builder(
            name = "ChevronSelectorHorizontal",
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
                moveTo(9f, 7f)
                lineTo(4f, 12f)
                lineTo(9f, 17f)
                moveTo(15f, 7f)
                lineTo(20f, 12f)
                lineTo(15f, 17f)
            }
        }.build()

        return _ChevronSelectorHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronSelectorHorizontal: ImageVector? = null
