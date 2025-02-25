package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ClockSlash: ImageVector
    get() {
        if (_ClockSlash != null) {
            return _ClockSlash!!
        }
        _ClockSlash = ImageVector.Builder(
            name = "ClockSlash",
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
                moveTo(3f, 5.5f)
                lineTo(4.25f, 4.25f)
                moveTo(21f, 5.5f)
                lineTo(19f, 3.5f)
                moveTo(3f, 3f)
                lineTo(4.25f, 4.25f)
                moveTo(21f, 21f)
                lineTo(17.901f, 17.901f)
                moveTo(4.25f, 4.25f)
                lineTo(6.599f, 6.599f)
                moveTo(6.599f, 6.599f)
                curveTo(5.002f, 8.061f, 4f, 10.164f, 4f, 12.5f)
                curveTo(4f, 16.918f, 7.582f, 20.5f, 12f, 20.5f)
                curveTo(14.336f, 20.5f, 16.439f, 19.499f, 17.901f, 17.901f)
                moveTo(6.599f, 6.599f)
                lineTo(17.901f, 17.901f)
                moveTo(10.324f, 4.676f)
                curveTo(10.865f, 4.561f, 11.425f, 4.5f, 12f, 4.5f)
                curveTo(16.418f, 4.5f, 20f, 8.082f, 20f, 12.5f)
                curveTo(20f, 13.075f, 19.939f, 13.635f, 19.824f, 14.176f)
            }
        }.build()

        return _ClockSlash!!
    }

@Suppress("ObjectPropertyName")
private var _ClockSlash: ImageVector? = null
