package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.YenSign: ImageVector
    get() {
        if (_YenSign != null) {
            return _YenSign!!
        }
        _YenSign = ImageVector.Builder(
            name = "YenSign",
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
                moveTo(12f, 20f)
                verticalLineTo(12f)
                moveTo(12f, 12f)
                lineTo(7f, 4f)
                moveTo(12f, 12f)
                lineTo(17f, 4f)
                moveTo(8f, 12f)
                horizontalLineTo(16f)
                moveTo(8f, 16f)
                horizontalLineTo(16f)
            }
        }.build()

        return _YenSign!!
    }

@Suppress("ObjectPropertyName")
private var _YenSign: ImageVector? = null
