package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowsLeftRight: ImageVector
    get() {
        if (_ArrowsLeftRight != null) {
            return _ArrowsLeftRight!!
        }
        _ArrowsLeftRight = ImageVector.Builder(
            name = "ArrowsLeftRight",
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
                moveTo(3f, 12f)
                horizontalLineTo(21f)
                moveTo(3f, 12f)
                lineTo(7f, 8f)
                moveTo(3f, 12f)
                lineTo(7f, 16f)
                moveTo(21f, 12f)
                lineTo(17f, 16f)
                moveTo(21f, 12f)
                lineTo(17f, 8f)
            }
        }.build()

        return _ArrowsLeftRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsLeftRight: ImageVector? = null
