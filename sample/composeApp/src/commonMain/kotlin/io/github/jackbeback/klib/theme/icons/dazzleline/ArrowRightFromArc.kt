package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowRightFromArc: ImageVector
    get() {
        if (_ArrowRightFromArc != null) {
            return _ArrowRightFromArc!!
        }
        _ArrowRightFromArc = ImageVector.Builder(
            name = "ArrowRightFromArc",
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
                moveTo(13f, 3f)
                horizontalLineTo(12f)
                curveTo(7.029f, 3f, 3f, 7.029f, 3f, 12f)
                curveTo(3f, 16.971f, 7.029f, 21f, 12f, 21f)
                horizontalLineTo(13f)
                moveTo(17f, 8f)
                lineTo(21f, 12f)
                moveTo(21f, 12f)
                lineTo(17f, 16f)
                moveTo(21f, 12f)
                horizontalLineTo(9f)
            }
        }.build()

        return _ArrowRightFromArc!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightFromArc: ImageVector? = null
