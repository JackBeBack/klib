package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BracketRoundRight: ImageVector
    get() {
        if (_BracketRoundRight != null) {
            return _BracketRoundRight!!
        }
        _BracketRoundRight = ImageVector.Builder(
            name = "BracketRoundRight",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(10f, 3f)
                curveTo(12.241f, 5.336f, 13.619f, 8.507f, 13.619f, 12f)
                curveTo(13.619f, 15.493f, 12.241f, 18.664f, 10f, 21f)
            }
        }.build()

        return _BracketRoundRight!!
    }

@Suppress("ObjectPropertyName")
private var _BracketRoundRight: ImageVector? = null
