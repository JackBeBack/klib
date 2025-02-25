package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChevronUpLeft: ImageVector
    get() {
        if (_ChevronUpLeft != null) {
            return _ChevronUpLeft!!
        }
        _ChevronUpLeft = ImageVector.Builder(
            name = "ChevronUpLeft",
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
                moveTo(7f, 17f)
                verticalLineTo(7f)
                lineTo(17f, 7f)
            }
        }.build()

        return _ChevronUpLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronUpLeft: ImageVector? = null
