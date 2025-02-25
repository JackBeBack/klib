package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChevronSelectorVerticalDot: ImageVector
    get() {
        if (_ChevronSelectorVerticalDot != null) {
            return _ChevronSelectorVerticalDot!!
        }
        _ChevronSelectorVerticalDot = ImageVector.Builder(
            name = "ChevronSelectorVerticalDot",
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

        return _ChevronSelectorVerticalDot!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronSelectorVerticalDot: ImageVector? = null
