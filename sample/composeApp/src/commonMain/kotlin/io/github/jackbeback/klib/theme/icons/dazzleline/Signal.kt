package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Signal: ImageVector
    get() {
        if (_Signal != null) {
            return _Signal!!
        }
        _Signal = ImageVector.Builder(
            name = "Signal",
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
                moveTo(4f, 20f)
                verticalLineTo(19f)
                moveTo(8f, 20f)
                verticalLineTo(16f)
                moveTo(12f, 20f)
                verticalLineTo(12f)
                moveTo(16f, 20f)
                verticalLineTo(8f)
                moveTo(20f, 20f)
                verticalLineTo(4f)
            }
        }.build()

        return _Signal!!
    }

@Suppress("ObjectPropertyName")
private var _Signal: ImageVector? = null
