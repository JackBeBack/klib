package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.XmarkLarge: ImageVector
    get() {
        if (_XmarkLarge != null) {
            return _XmarkLarge!!
        }
        _XmarkLarge = ImageVector.Builder(
            name = "XmarkLarge",
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
                moveTo(4f, 4f)
                lineTo(20f, 20f)
                moveTo(20f, 4f)
                lineTo(4f, 20f)
            }
        }.build()

        return _XmarkLarge!!
    }

@Suppress("ObjectPropertyName")
private var _XmarkLarge: ImageVector? = null
