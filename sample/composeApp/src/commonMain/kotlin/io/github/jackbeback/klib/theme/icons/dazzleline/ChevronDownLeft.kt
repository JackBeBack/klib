package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChevronDownLeft: ImageVector
    get() {
        if (_ChevronDownLeft != null) {
            return _ChevronDownLeft!!
        }
        _ChevronDownLeft = ImageVector.Builder(
            name = "ChevronDownLeft",
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
                moveTo(17f, 17f)
                horizontalLineTo(7f)
                lineTo(7f, 7f)
            }
        }.build()

        return _ChevronDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDownLeft: ImageVector? = null
