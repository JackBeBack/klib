package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.AlignJustify: ImageVector
    get() {
        if (_AlignJustify != null) {
            return _AlignJustify!!
        }
        _AlignJustify = ImageVector.Builder(
            name = "AlignJustify",
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
                horizontalLineTo(21f)
                moveTo(3f, 18f)
                horizontalLineTo(21f)
                moveTo(3f, 6f)
                horizontalLineTo(21f)
            }
        }.build()

        return _AlignJustify!!
    }

@Suppress("ObjectPropertyName")
private var _AlignJustify: ImageVector? = null
