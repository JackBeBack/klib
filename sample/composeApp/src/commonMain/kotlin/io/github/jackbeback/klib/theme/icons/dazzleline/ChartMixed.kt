package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChartMixed: ImageVector
    get() {
        if (_ChartMixed != null) {
            return _ChartMixed!!
        }
        _ChartMixed = ImageVector.Builder(
            name = "ChartMixed",
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
                moveTo(3f, 21f)
                verticalLineTo(17f)
                moveTo(9f, 21f)
                verticalLineTo(13f)
                moveTo(15f, 21f)
                verticalLineTo(15f)
                moveTo(21f, 21f)
                verticalLineTo(11f)
                moveTo(8.439f, 5.561f)
                curveTo(8.711f, 5.832f, 9.086f, 6f, 9.5f, 6f)
                curveTo(9.914f, 6f, 10.289f, 5.832f, 10.561f, 5.561f)
                moveTo(8.439f, 5.561f)
                curveTo(8.168f, 5.289f, 8f, 4.914f, 8f, 4.5f)
                curveTo(8f, 3.672f, 8.672f, 3f, 9.5f, 3f)
                curveTo(10.328f, 3f, 11f, 3.672f, 11f, 4.5f)
                curveTo(11f, 4.914f, 10.832f, 5.289f, 10.561f, 5.561f)
                moveTo(8.439f, 5.561f)
                lineTo(5.561f, 8.439f)
                moveTo(5.561f, 8.439f)
                curveTo(5.289f, 8.168f, 4.914f, 8f, 4.5f, 8f)
                curveTo(3.672f, 8f, 3f, 8.672f, 3f, 9.5f)
                curveTo(3f, 10.328f, 3.672f, 11f, 4.5f, 11f)
                curveTo(5.328f, 11f, 6f, 10.328f, 6f, 9.5f)
                curveTo(6f, 9.086f, 5.832f, 8.711f, 5.561f, 8.439f)
                close()
                moveTo(10.561f, 5.561f)
                lineTo(13.439f, 8.439f)
                moveTo(13.439f, 8.439f)
                curveTo(13.168f, 8.711f, 13f, 9.086f, 13f, 9.5f)
                curveTo(13f, 10.328f, 13.672f, 11f, 14.5f, 11f)
                curveTo(15.328f, 11f, 16f, 10.328f, 16f, 9.5f)
                curveTo(16f, 9.086f, 15.832f, 8.711f, 15.561f, 8.439f)
                moveTo(13.439f, 8.439f)
                curveTo(13.711f, 8.168f, 14.086f, 8f, 14.5f, 8f)
                curveTo(14.914f, 8f, 15.289f, 8.168f, 15.561f, 8.439f)
                moveTo(15.561f, 8.439f)
                lineTo(18.439f, 5.561f)
                moveTo(18.439f, 5.561f)
                curveTo(18.711f, 5.832f, 19.086f, 6f, 19.5f, 6f)
                curveTo(20.328f, 6f, 21f, 5.328f, 21f, 4.5f)
                curveTo(21f, 3.672f, 20.328f, 3f, 19.5f, 3f)
                curveTo(18.672f, 3f, 18f, 3.672f, 18f, 4.5f)
                curveTo(18f, 4.914f, 18.168f, 5.289f, 18.439f, 5.561f)
                close()
            }
        }.build()

        return _ChartMixed!!
    }

@Suppress("ObjectPropertyName")
private var _ChartMixed: ImageVector? = null
