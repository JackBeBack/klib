package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowSmRight: ImageVector
    get() {
        if (_ArrowSmRight != null) {
            return _ArrowSmRight!!
        }
        _ArrowSmRight = ImageVector.Builder(
            name = "ArrowSmRight",
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
                moveTo(18f, 12f)
                lineTo(13f, 7f)
                moveTo(18f, 12f)
                lineTo(13f, 17f)
            }
        }.build()

        return _ArrowSmRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSmRight: ImageVector? = null
