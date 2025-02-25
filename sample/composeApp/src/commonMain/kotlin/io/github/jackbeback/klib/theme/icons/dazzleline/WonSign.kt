package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.WonSign: ImageVector
    get() {
        if (_WonSign != null) {
            return _WonSign!!
        }
        _WonSign = ImageVector.Builder(
            name = "WonSign",
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
                moveTo(6f, 12f)
                lineTo(8f, 19f)
                lineTo(10f, 12f)
                moveTo(6f, 12f)
                lineTo(4f, 5f)
                moveTo(6f, 12f)
                horizontalLineTo(3f)
                moveTo(6f, 12f)
                horizontalLineTo(10f)
                moveTo(14f, 12f)
                lineTo(16f, 19f)
                lineTo(18f, 12f)
                moveTo(14f, 12f)
                lineTo(12f, 5f)
                lineTo(10f, 12f)
                moveTo(14f, 12f)
                horizontalLineTo(10f)
                moveTo(14f, 12f)
                horizontalLineTo(18f)
                moveTo(18f, 12f)
                lineTo(20f, 5f)
                moveTo(18f, 12f)
                horizontalLineTo(21f)
            }
        }.build()

        return _WonSign!!
    }

@Suppress("ObjectPropertyName")
private var _WonSign: ImageVector? = null
