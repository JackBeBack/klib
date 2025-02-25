package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowNarrowCircleBrokenDown: ImageVector
    get() {
        if (_ArrowNarrowCircleBrokenDown != null) {
            return _ArrowNarrowCircleBrokenDown!!
        }
        _ArrowNarrowCircleBrokenDown = ImageVector.Builder(
            name = "ArrowNarrowCircleBrokenDown",
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
                moveTo(11f, 16f)
                lineTo(15f, 12f)
                moveTo(15f, 12f)
                lineTo(11f, 8f)
                moveTo(15f, 12f)
                horizontalLineTo(3f)
                moveTo(4.516f, 17f)
                curveTo(6.13f, 19.412f, 8.88f, 21f, 12f, 21f)
                curveTo(16.971f, 21f, 21f, 16.971f, 21f, 12f)
                curveTo(21f, 7.029f, 16.971f, 3f, 12f, 3f)
                curveTo(8.88f, 3f, 6.13f, 4.588f, 4.516f, 7f)
            }
        }.build()

        return _ArrowNarrowCircleBrokenDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowNarrowCircleBrokenDown: ImageVector? = null
