package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ResizeHandle: ImageVector
    get() {
        if (_ResizeHandle != null) {
            return _ResizeHandle!!
        }
        _ResizeHandle = ImageVector.Builder(
            name = "ResizeHandle",
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
                moveTo(21f, 15f)
                lineTo(15f, 21f)
                moveTo(21f, 8f)
                lineTo(8f, 21f)
            }
        }.build()

        return _ResizeHandle!!
    }

@Suppress("ObjectPropertyName")
private var _ResizeHandle: ImageVector? = null
