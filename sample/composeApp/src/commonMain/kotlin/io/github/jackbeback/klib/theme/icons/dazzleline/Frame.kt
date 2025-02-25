package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Frame: ImageVector
    get() {
        if (_Frame != null) {
            return _Frame!!
        }
        _Frame = ImageVector.Builder(
            name = "Frame",
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
                moveTo(6f, 3f)
                verticalLineTo(21f)
                moveTo(18f, 3f)
                verticalLineTo(21f)
                moveTo(3f, 6f)
                horizontalLineTo(21f)
                moveTo(3f, 18f)
                horizontalLineTo(21f)
            }
        }.build()

        return _Frame!!
    }

@Suppress("ObjectPropertyName")
private var _Frame: ImageVector? = null
