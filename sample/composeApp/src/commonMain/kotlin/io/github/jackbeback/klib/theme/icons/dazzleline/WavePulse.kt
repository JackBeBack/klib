package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.WavePulse: ImageVector
    get() {
        if (_WavePulse != null) {
            return _WavePulse!!
        }
        _WavePulse = ImageVector.Builder(
            name = "WavePulse",
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
                moveTo(3f, 12f)
                horizontalLineTo(7f)
                lineTo(9f, 19f)
                lineTo(12f, 5f)
                lineTo(15f, 17f)
                lineTo(17f, 12f)
                horizontalLineTo(21f)
            }
        }.build()

        return _WavePulse!!
    }

@Suppress("ObjectPropertyName")
private var _WavePulse: ImageVector? = null
