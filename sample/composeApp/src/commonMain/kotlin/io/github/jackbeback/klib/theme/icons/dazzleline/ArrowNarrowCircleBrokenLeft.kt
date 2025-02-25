package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowNarrowCircleBrokenLeft: ImageVector
    get() {
        if (_ArrowNarrowCircleBrokenLeft != null) {
            return _ArrowNarrowCircleBrokenLeft!!
        }
        _ArrowNarrowCircleBrokenLeft = ImageVector.Builder(
            name = "ArrowNarrowCircleBrokenLeft",
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
                moveTo(13f, 8f)
                lineTo(9f, 12f)
                moveTo(9f, 12f)
                lineTo(13f, 16f)
                moveTo(9f, 12f)
                horizontalLineTo(21f)
                moveTo(19.485f, 7f)
                curveTo(17.87f, 4.588f, 15.12f, 3f, 12f, 3f)
                curveTo(7.029f, 3f, 3f, 7.029f, 3f, 12f)
                curveTo(3f, 16.971f, 7.029f, 21f, 12f, 21f)
                curveTo(15.12f, 21f, 17.87f, 19.412f, 19.485f, 17f)
            }
        }.build()

        return _ArrowNarrowCircleBrokenLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowNarrowCircleBrokenLeft: ImageVector? = null
