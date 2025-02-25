package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Italic: ImageVector
    get() {
        if (_Italic != null) {
            return _Italic!!
        }
        _Italic = ImageVector.Builder(
            name = "Italic",
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
                moveTo(10f, 3f)
                horizontalLineTo(20f)
                moveTo(4f, 21f)
                horizontalLineTo(14f)
                moveTo(15f, 3f)
                lineTo(9f, 21f)
            }
        }.build()

        return _Italic!!
    }

@Suppress("ObjectPropertyName")
private var _Italic: ImageVector? = null
