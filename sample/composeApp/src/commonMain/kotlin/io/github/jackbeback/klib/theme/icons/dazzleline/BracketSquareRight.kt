package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BracketSquareRight: ImageVector
    get() {
        if (_BracketSquareRight != null) {
            return _BracketSquareRight!!
        }
        _BracketSquareRight = ImageVector.Builder(
            name = "BracketSquareRight",
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
                moveTo(10f, 21f)
                horizontalLineTo(14f)
                lineTo(14f, 3f)
                horizontalLineTo(10f)
            }
        }.build()

        return _BracketSquareRight!!
    }

@Suppress("ObjectPropertyName")
private var _BracketSquareRight: ImageVector? = null
