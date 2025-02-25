package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChevronUpRight: ImageVector
    get() {
        if (_ChevronUpRight != null) {
            return _ChevronUpRight!!
        }
        _ChevronUpRight = ImageVector.Builder(
            name = "ChevronUpRight",
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
                moveTo(7f, 7f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
            }
        }.build()

        return _ChevronUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronUpRight: ImageVector? = null
