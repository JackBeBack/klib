package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChevronDownRight: ImageVector
    get() {
        if (_ChevronDownRight != null) {
            return _ChevronDownRight!!
        }
        _ChevronDownRight = ImageVector.Builder(
            name = "ChevronDownRight",
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
                moveTo(17f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
            }
        }.build()

        return _ChevronDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDownRight: ImageVector? = null
