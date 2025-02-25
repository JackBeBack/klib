package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BracketSquare: ImageVector
    get() {
        if (_BracketSquare != null) {
            return _BracketSquare!!
        }
        _BracketSquare = ImageVector.Builder(
            name = "BracketSquare",
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
                moveTo(14f, 3f)
                horizontalLineTo(10f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
            }
        }.build()

        return _BracketSquare!!
    }

@Suppress("ObjectPropertyName")
private var _BracketSquare: ImageVector? = null
