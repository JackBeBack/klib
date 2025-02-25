package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BracketsRound: ImageVector
    get() {
        if (_BracketsRound != null) {
            return _BracketsRound!!
        }
        _BracketsRound = ImageVector.Builder(
            name = "BracketsRound",
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
                moveTo(8.619f, 3f)
                curveTo(6.378f, 5.336f, 5f, 8.507f, 5f, 12f)
                curveTo(5f, 15.493f, 6.378f, 18.664f, 8.619f, 21f)
                moveTo(15.381f, 3f)
                curveTo(17.622f, 5.336f, 19f, 8.507f, 19f, 12f)
                curveTo(19f, 15.493f, 17.622f, 18.664f, 15.381f, 21f)
            }
        }.build()

        return _BracketsRound!!
    }

@Suppress("ObjectPropertyName")
private var _BracketsRound: ImageVector? = null
