package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.AlignRightJustify: ImageVector
    get() {
        if (_AlignRightJustify != null) {
            return _AlignRightJustify!!
        }
        _AlignRightJustify = ImageVector.Builder(
            name = "AlignRightJustify",
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
                moveTo(3f, 8f)
                horizontalLineTo(21f)
                moveTo(3f, 12f)
                horizontalLineTo(21f)
                moveTo(3f, 16f)
                horizontalLineTo(21f)
                moveTo(11f, 20f)
                horizontalLineTo(21f)
                moveTo(3f, 4f)
                horizontalLineTo(21f)
            }
        }.build()

        return _AlignRightJustify!!
    }

@Suppress("ObjectPropertyName")
private var _AlignRightJustify: ImageVector? = null
