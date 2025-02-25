package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChevronSelectorVertical: ImageVector
    get() {
        if (_ChevronSelectorVertical != null) {
            return _ChevronSelectorVertical!!
        }
        _ChevronSelectorVertical = ImageVector.Builder(
            name = "ChevronSelectorVertical",
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
                moveTo(7f, 15f)
                lineTo(12f, 20f)
                lineTo(17f, 15f)
                moveTo(7f, 9f)
                lineTo(12f, 4f)
                lineTo(17f, 9f)
            }
        }.build()

        return _ChevronSelectorVertical!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronSelectorVertical: ImageVector? = null
