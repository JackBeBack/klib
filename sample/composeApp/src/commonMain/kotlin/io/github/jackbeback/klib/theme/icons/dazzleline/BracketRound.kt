package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BracketRound: ImageVector
    get() {
        if (_BracketRound != null) {
            return _BracketRound!!
        }
        _BracketRound = ImageVector.Builder(
            name = "BracketRound",
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
                moveTo(13.619f, 3f)
                curveTo(11.378f, 5.336f, 10f, 8.507f, 10f, 12f)
                curveTo(10f, 15.493f, 11.378f, 18.664f, 13.619f, 21f)
            }
        }.build()

        return _BracketRound!!
    }

@Suppress("ObjectPropertyName")
private var _BracketRound: ImageVector? = null
