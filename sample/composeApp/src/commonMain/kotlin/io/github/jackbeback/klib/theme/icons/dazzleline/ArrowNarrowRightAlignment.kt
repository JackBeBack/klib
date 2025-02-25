package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowNarrowRightAlignment: ImageVector
    get() {
        if (_ArrowNarrowRightAlignment != null) {
            return _ArrowNarrowRightAlignment!!
        }
        _ArrowNarrowRightAlignment = ImageVector.Builder(
            name = "ArrowNarrowRightAlignment",
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
                moveTo(20f, 4f)
                verticalLineTo(20f)
                moveTo(4f, 12f)
                horizontalLineTo(16f)
                moveTo(16f, 12f)
                lineTo(12f, 8f)
                moveTo(16f, 12f)
                lineTo(12f, 16f)
            }
        }.build()

        return _ArrowNarrowRightAlignment!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowNarrowRightAlignment: ImageVector? = null
