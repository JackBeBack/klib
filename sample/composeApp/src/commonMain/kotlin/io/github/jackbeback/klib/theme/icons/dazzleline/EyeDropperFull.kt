package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.EyeDropperFull: ImageVector
    get() {
        if (_EyeDropperFull != null) {
            return _EyeDropperFull!!
        }
        _EyeDropperFull = ImageVector.Builder(
            name = "EyeDropperFull",
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
                moveTo(12.5f, 7.5f)
                lineTo(16f, 4f)
                curveTo(17.105f, 2.895f, 18.895f, 2.895f, 20f, 4f)
                curveTo(21.105f, 5.105f, 21.105f, 6.895f, 20f, 8f)
                lineTo(16.5f, 11.5f)
                moveTo(11f, 6f)
                lineTo(18f, 13f)
                moveTo(14f, 14f)
                lineTo(10.406f, 17.594f)
                curveTo(9.887f, 18.113f, 9.628f, 18.372f, 9.325f, 18.558f)
                curveTo(9.056f, 18.722f, 8.764f, 18.844f, 8.458f, 18.917f)
                curveTo(8.112f, 19f, 7.746f, 19f, 7.012f, 19f)
                horizontalLineTo(6f)
                lineTo(3f, 21f)
                lineTo(5f, 18f)
                verticalLineTo(16.988f)
                curveTo(5f, 16.254f, 5f, 15.888f, 5.083f, 15.542f)
                curveTo(5.156f, 15.236f, 5.278f, 14.944f, 5.442f, 14.675f)
                curveTo(5.628f, 14.373f, 5.887f, 14.113f, 6.406f, 13.594f)
                lineTo(10f, 10f)
                lineTo(14f, 14f)
                close()
            }
        }.build()

        return _EyeDropperFull!!
    }

@Suppress("ObjectPropertyName")
private var _EyeDropperFull: ImageVector? = null
