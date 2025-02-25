package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TughrikSign: ImageVector
    get() {
        if (_TughrikSign != null) {
            return _TughrikSign!!
        }
        _TughrikSign = ImageVector.Builder(
            name = "TughrikSign",
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
                moveTo(8f, 12.5f)
                lineTo(16f, 9f)
                moveTo(8f, 16.5f)
                lineTo(16f, 13f)
                moveTo(12f, 20f)
                verticalLineTo(4f)
                moveTo(12f, 4f)
                horizontalLineTo(5f)
                moveTo(12f, 4f)
                horizontalLineTo(19f)
            }
        }.build()

        return _TughrikSign!!
    }

@Suppress("ObjectPropertyName")
private var _TughrikSign: ImageVector? = null
