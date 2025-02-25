package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Paragraph: ImageVector
    get() {
        if (_Paragraph != null) {
            return _Paragraph!!
        }
        _Paragraph = ImageVector.Builder(
            name = "Paragraph",
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
                moveTo(3f, 10f)
                horizontalLineTo(21f)
                moveTo(3f, 14f)
                horizontalLineTo(12f)
            }
        }.build()

        return _Paragraph!!
    }

@Suppress("ObjectPropertyName")
private var _Paragraph: ImageVector? = null
