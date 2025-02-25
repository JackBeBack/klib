package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ClockLines: ImageVector
    get() {
        if (_ClockLines != null) {
            return _ClockLines!!
        }
        _ClockLines = ImageVector.Builder(
            name = "ClockLines",
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
                moveTo(5.062f, 12f)
                curveTo(5.554f, 8.054f, 8.92f, 5f, 13f, 5f)
                curveTo(17.418f, 5f, 21f, 8.582f, 21f, 13f)
                curveTo(21f, 17.418f, 17.418f, 21f, 13f, 21f)
                horizontalLineTo(8f)
                moveTo(13f, 13f)
                verticalLineTo(9f)
                moveTo(11f, 3f)
                horizontalLineTo(15f)
                moveTo(3f, 15f)
                horizontalLineTo(8f)
                moveTo(5f, 18f)
                horizontalLineTo(10f)
            }
        }.build()

        return _ClockLines!!
    }

@Suppress("ObjectPropertyName")
private var _ClockLines: ImageVector? = null
