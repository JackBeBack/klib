package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Tally: ImageVector
    get() {
        if (_Tally != null) {
            return _Tally!!
        }
        _Tally = ImageVector.Builder(
            name = "Tally",
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
                moveTo(6f, 20f)
                verticalLineTo(4f)
                moveTo(10f, 20f)
                verticalLineTo(4f)
                moveTo(14f, 20f)
                verticalLineTo(4f)
                moveTo(18f, 20f)
                verticalLineTo(4f)
                moveTo(21f, 5f)
                lineTo(3f, 19f)
            }
        }.build()

        return _Tally!!
    }

@Suppress("ObjectPropertyName")
private var _Tally: ImageVector? = null
