package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ExpandAlt2: ImageVector
    get() {
        if (_ExpandAlt2 != null) {
            return _ExpandAlt2!!
        }
        _ExpandAlt2 = ImageVector.Builder(
            name = "ExpandAlt2",
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
                moveTo(3f, 21f)
                lineTo(21f, 3f)
                moveTo(3f, 21f)
                horizontalLineTo(7.5f)
                moveTo(3f, 21f)
                lineTo(3f, 16.5f)
                moveTo(21f, 3f)
                horizontalLineTo(16.5f)
                moveTo(21f, 3f)
                verticalLineTo(7.5f)
            }
        }.build()

        return _ExpandAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _ExpandAlt2: ImageVector? = null
