package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowSmLeft: ImageVector
    get() {
        if (_ArrowSmLeft != null) {
            return _ArrowSmLeft!!
        }
        _ArrowSmLeft = ImageVector.Builder(
            name = "ArrowSmLeft",
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
                moveTo(6f, 12f)
                horizontalLineTo(18f)
                moveTo(6f, 12f)
                lineTo(11f, 7f)
                moveTo(6f, 12f)
                lineTo(11f, 17f)
            }
        }.build()

        return _ArrowSmLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSmLeft: ImageVector? = null
