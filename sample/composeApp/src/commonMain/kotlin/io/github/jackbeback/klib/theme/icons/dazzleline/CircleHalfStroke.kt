package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CircleHalfStroke: ImageVector
    get() {
        if (_CircleHalfStroke != null) {
            return _CircleHalfStroke!!
        }
        _CircleHalfStroke = ImageVector.Builder(
            name = "CircleHalfStroke",
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
                moveTo(12f, 21f)
                curveTo(16.971f, 21f, 21f, 16.971f, 21f, 12f)
                curveTo(21f, 7.029f, 16.971f, 3f, 12f, 3f)
                moveTo(12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                moveTo(12f, 21f)
                verticalLineTo(3f)
            }
        }.build()

        return _CircleHalfStroke!!
    }

@Suppress("ObjectPropertyName")
private var _CircleHalfStroke: ImageVector? = null
