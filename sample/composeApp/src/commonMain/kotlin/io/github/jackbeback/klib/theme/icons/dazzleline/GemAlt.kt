package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GemAlt: ImageVector
    get() {
        if (_GemAlt != null) {
            return _GemAlt!!
        }
        _GemAlt = ImageVector.Builder(
            name = "GemAlt",
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
                moveTo(3.125f, 9f)
                horizontalLineTo(20.875f)
                moveTo(12f, 3f)
                lineTo(8f, 9f)
                lineTo(12f, 20.667f)
                lineTo(16f, 9f)
                lineTo(12f, 3f)
                close()
                moveTo(12.64f, 20.147f)
                lineTo(20.64f, 9.48f)
                curveTo(20.769f, 9.308f, 20.834f, 9.222f, 20.858f, 9.127f)
                curveTo(20.881f, 9.044f, 20.881f, 8.956f, 20.858f, 8.873f)
                curveTo(20.834f, 8.778f, 20.769f, 8.692f, 20.64f, 8.52f)
                lineTo(16.74f, 3.32f)
                curveTo(16.652f, 3.203f, 16.608f, 3.144f, 16.552f, 3.102f)
                curveTo(16.503f, 3.064f, 16.447f, 3.036f, 16.387f, 3.019f)
                curveTo(16.32f, 3f, 16.247f, 3f, 16.1f, 3f)
                horizontalLineTo(7.9f)
                curveTo(7.753f, 3f, 7.68f, 3f, 7.613f, 3.019f)
                curveTo(7.553f, 3.036f, 7.497f, 3.064f, 7.448f, 3.102f)
                curveTo(7.392f, 3.144f, 7.348f, 3.203f, 7.26f, 3.32f)
                lineTo(3.36f, 8.52f)
                curveTo(3.231f, 8.692f, 3.166f, 8.778f, 3.141f, 8.873f)
                curveTo(3.12f, 8.956f, 3.12f, 9.044f, 3.141f, 9.127f)
                curveTo(3.166f, 9.222f, 3.231f, 9.308f, 3.36f, 9.48f)
                lineTo(11.36f, 20.147f)
                curveTo(11.577f, 20.436f, 11.686f, 20.581f, 11.819f, 20.633f)
                curveTo(11.935f, 20.678f, 12.065f, 20.678f, 12.181f, 20.633f)
                curveTo(12.314f, 20.581f, 12.423f, 20.436f, 12.64f, 20.147f)
                close()
            }
        }.build()

        return _GemAlt!!
    }

@Suppress("ObjectPropertyName")
private var _GemAlt: ImageVector? = null
