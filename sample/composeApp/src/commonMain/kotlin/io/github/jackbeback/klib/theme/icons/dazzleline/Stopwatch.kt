package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Stopwatch: ImageVector
    get() {
        if (_Stopwatch != null) {
            return _Stopwatch!!
        }
        _Stopwatch = ImageVector.Builder(
            name = "Stopwatch",
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
                moveTo(12f, 14f)
                verticalLineTo(11f)
                moveTo(12f, 6f)
                curveTo(7.858f, 6f, 4.5f, 9.358f, 4.5f, 13.5f)
                curveTo(4.5f, 17.642f, 7.858f, 21f, 12f, 21f)
                curveTo(16.142f, 21f, 19.5f, 17.642f, 19.5f, 13.5f)
                curveTo(19.5f, 11.556f, 18.76f, 9.785f, 17.547f, 8.453f)
                moveTo(12f, 6f)
                curveTo(14.198f, 6f, 16.176f, 6.946f, 17.547f, 8.453f)
                moveTo(12f, 6f)
                verticalLineTo(3f)
                moveTo(19.5f, 6.5f)
                lineTo(17.547f, 8.453f)
                moveTo(12f, 3f)
                horizontalLineTo(9f)
                moveTo(12f, 3f)
                horizontalLineTo(15f)
            }
        }.build()

        return _Stopwatch!!
    }

@Suppress("ObjectPropertyName")
private var _Stopwatch: ImageVector? = null
