package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CheckDouble: ImageVector
    get() {
        if (_CheckDouble != null) {
            return _CheckDouble!!
        }
        _CheckDouble = ImageVector.Builder(
            name = "CheckDouble",
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
                moveTo(4f, 14f)
                lineTo(9f, 19f)
                lineTo(20f, 8f)
                moveTo(6f, 8.889f)
                lineTo(9.077f, 12f)
                lineTo(16f, 5f)
            }
        }.build()

        return _CheckDouble!!
    }

@Suppress("ObjectPropertyName")
private var _CheckDouble: ImageVector? = null
