package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChevronSelectorHorizontalDot: ImageVector
    get() {
        if (_ChevronSelectorHorizontalDot != null) {
            return _ChevronSelectorHorizontalDot!!
        }
        _ChevronSelectorHorizontalDot = ImageVector.Builder(
            name = "ChevronSelectorHorizontalDot",
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
                moveTo(12f, 12f)
                horizontalLineTo(12.01f)
                moveTo(12.5f, 12f)
                curveTo(12.5f, 12.276f, 12.276f, 12.5f, 12f, 12.5f)
                curveTo(11.724f, 12.5f, 11.5f, 12.276f, 11.5f, 12f)
                curveTo(11.5f, 11.724f, 11.724f, 11.5f, 12f, 11.5f)
                curveTo(12.276f, 11.5f, 12.5f, 11.724f, 12.5f, 12f)
                close()
            }
        }.build()

        return _ChevronSelectorHorizontalDot!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronSelectorHorizontalDot: ImageVector? = null
