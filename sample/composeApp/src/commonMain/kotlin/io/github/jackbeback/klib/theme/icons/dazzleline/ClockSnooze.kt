package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ClockSnooze: ImageVector
    get() {
        if (_ClockSnooze != null) {
            return _ClockSnooze!!
        }
        _ClockSnooze = ImageVector.Builder(
            name = "ClockSnooze",
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
                lineTo(5f, 3.5f)
                moveTo(21f, 5.5f)
                lineTo(19f, 3.5f)
                moveTo(10f, 10.5f)
                horizontalLineTo(14f)
                lineTo(10f, 14.5f)
                horizontalLineTo(14f)
                moveTo(20f, 12.5f)
                curveTo(20f, 16.918f, 16.418f, 20.5f, 12f, 20.5f)
                curveTo(7.582f, 20.5f, 4f, 16.918f, 4f, 12.5f)
                curveTo(4f, 8.082f, 7.582f, 4.5f, 12f, 4.5f)
                curveTo(16.418f, 4.5f, 20f, 8.082f, 20f, 12.5f)
                close()
            }
        }.build()

        return _ClockSnooze!!
    }

@Suppress("ObjectPropertyName")
private var _ClockSnooze: ImageVector? = null
