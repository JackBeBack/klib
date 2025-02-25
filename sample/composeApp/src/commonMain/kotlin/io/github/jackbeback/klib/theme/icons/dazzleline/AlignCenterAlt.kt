package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.AlignCenterAlt: ImageVector
    get() {
        if (_AlignCenterAlt != null) {
            return _AlignCenterAlt!!
        }
        _AlignCenterAlt = ImageVector.Builder(
            name = "AlignCenterAlt",
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
                moveTo(5f, 8f)
                horizontalLineTo(19f)
                moveTo(5f, 16f)
                horizontalLineTo(19f)
                moveTo(3f, 12f)
                horizontalLineTo(21f)
            }
        }.build()

        return _AlignCenterAlt!!
    }

@Suppress("ObjectPropertyName")
private var _AlignCenterAlt: ImageVector? = null
