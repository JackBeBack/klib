package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.OrnamentAlt: ImageVector
    get() {
        if (_OrnamentAlt != null) {
            return _OrnamentAlt!!
        }
        _OrnamentAlt = ImageVector.Builder(
            name = "OrnamentAlt",
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
                moveTo(14f, 5f)
                verticalLineTo(4f)
                curveTo(14f, 2.895f, 13.105f, 2f, 12f, 2f)
                curveTo(10.895f, 2f, 10f, 2.895f, 10f, 4f)
                verticalLineTo(5f)
                moveTo(19.133f, 9.374f)
                curveTo(17.213f, 11.012f, 14.722f, 12f, 12f, 12f)
                curveTo(9.279f, 12f, 6.788f, 11.012f, 4.867f, 9.374f)
                moveTo(19.979f, 13.571f)
                curveTo(17.975f, 15.683f, 15.141f, 17f, 12f, 17f)
                curveTo(8.858f, 17f, 6.024f, 15.683f, 4.02f, 13.571f)
                moveTo(20f, 13f)
                curveTo(20f, 17.418f, 16.418f, 21f, 12f, 21f)
                curveTo(7.582f, 21f, 4f, 17.418f, 4f, 13f)
                curveTo(4f, 8.582f, 7.582f, 5f, 12f, 5f)
                curveTo(16.418f, 5f, 20f, 8.582f, 20f, 13f)
                close()
            }
        }.build()

        return _OrnamentAlt!!
    }

@Suppress("ObjectPropertyName")
private var _OrnamentAlt: ImageVector? = null
