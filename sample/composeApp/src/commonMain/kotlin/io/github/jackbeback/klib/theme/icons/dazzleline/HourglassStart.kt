package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HourglassStart: ImageVector
    get() {
        if (_HourglassStart != null) {
            return _HourglassStart!!
        }
        _HourglassStart = ImageVector.Builder(
            name = "HourglassStart",
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
                moveTo(15f, 6f)
                horizontalLineTo(9f)
                moveTo(20f, 21f)
                horizontalLineTo(19f)
                moveTo(19f, 21f)
                horizontalLineTo(5f)
                moveTo(19f, 21f)
                curveTo(19f, 18.49f, 17.788f, 16.134f, 15.745f, 14.675f)
                lineTo(12f, 12f)
                moveTo(5f, 21f)
                horizontalLineTo(4f)
                moveTo(5f, 21f)
                curveTo(5f, 18.49f, 6.212f, 16.134f, 8.255f, 14.675f)
                lineTo(12f, 12f)
                moveTo(20f, 3f)
                horizontalLineTo(19f)
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                moveTo(19f, 3f)
                curveTo(19f, 5.51f, 17.788f, 7.866f, 15.745f, 9.325f)
                lineTo(12f, 12f)
                moveTo(5f, 3f)
                horizontalLineTo(4f)
                moveTo(5f, 3f)
                curveTo(5f, 5.51f, 6.212f, 7.866f, 8.255f, 9.325f)
                lineTo(12f, 12f)
            }
        }.build()

        return _HourglassStart!!
    }

@Suppress("ObjectPropertyName")
private var _HourglassStart: ImageVector? = null
