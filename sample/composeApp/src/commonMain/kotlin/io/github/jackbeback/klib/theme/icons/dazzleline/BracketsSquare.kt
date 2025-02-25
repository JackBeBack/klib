package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BracketsSquare: ImageVector
    get() {
        if (_BracketsSquare != null) {
            return _BracketsSquare!!
        }
        _BracketsSquare = ImageVector.Builder(
            name = "BracketsSquare",
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
                moveTo(9f, 3f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                moveTo(15f, 21f)
                horizontalLineTo(19f)
                verticalLineTo(3f)
                horizontalLineTo(15f)
            }
        }.build()

        return _BracketsSquare!!
    }

@Suppress("ObjectPropertyName")
private var _BracketsSquare: ImageVector? = null
