package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.RefreshCcwClock: ImageVector
    get() {
        if (_RefreshCcwClock != null) {
            return _RefreshCcwClock!!
        }
        _RefreshCcwClock = ImageVector.Builder(
            name = "RefreshCcwClock",
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
                moveTo(4f, 12f)
                curveTo(4f, 16.418f, 7.582f, 20f, 12f, 20f)
                curveTo(16.418f, 20f, 20f, 16.418f, 20f, 12f)
                curveTo(20f, 7.582f, 16.418f, 4f, 12f, 4f)
                curveTo(9.611f, 4f, 7.466f, 5.048f, 6f, 6.708f)
                curveTo(5.916f, 6.804f, 5.834f, 6.901f, 5.755f, 7f)
                moveTo(12f, 8f)
                verticalLineTo(12f)
                lineTo(14.5f, 14.5f)
                moveTo(5.754f, 4.004f)
                verticalLineTo(7.004f)
                horizontalLineTo(8.754f)
            }
        }.build()

        return _RefreshCcwClock!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshCcwClock: ImageVector? = null
