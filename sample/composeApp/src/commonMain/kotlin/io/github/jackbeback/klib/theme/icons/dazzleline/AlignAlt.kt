package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.AlignAlt: ImageVector
    get() {
        if (_AlignAlt != null) {
            return _AlignAlt!!
        }
        _AlignAlt = ImageVector.Builder(
            name = "AlignAlt",
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
                moveTo(6f, 4f)
                horizontalLineTo(10f)
                moveTo(18f, 20f)
                horizontalLineTo(14f)
                moveTo(3f, 8f)
                horizontalLineTo(10f)
                moveTo(21f, 16f)
                horizontalLineTo(14f)
                moveTo(3f, 12f)
                horizontalLineTo(10f)
                moveTo(21f, 12f)
                horizontalLineTo(14f)
                moveTo(3f, 16f)
                horizontalLineTo(10f)
                moveTo(21f, 8f)
                horizontalLineTo(14f)
                moveTo(3f, 20f)
                horizontalLineTo(10f)
                moveTo(20f, 4f)
                horizontalLineTo(14f)
            }
        }.build()

        return _AlignAlt!!
    }

@Suppress("ObjectPropertyName")
private var _AlignAlt: ImageVector? = null
