package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowNarrowCircleBrokenRight: ImageVector
    get() {
        if (_ArrowNarrowCircleBrokenRight != null) {
            return _ArrowNarrowCircleBrokenRight!!
        }
        _ArrowNarrowCircleBrokenRight = ImageVector.Builder(
            name = "ArrowNarrowCircleBrokenRight",
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
                moveTo(8f, 11f)
                lineTo(12f, 15f)
                moveTo(12f, 15f)
                lineTo(16f, 11f)
                moveTo(12f, 15f)
                verticalLineTo(3f)
                moveTo(7f, 4.516f)
                curveTo(4.588f, 6.13f, 3f, 8.88f, 3f, 12f)
                curveTo(3f, 16.971f, 7.029f, 21f, 12f, 21f)
                curveTo(16.971f, 21f, 21f, 16.971f, 21f, 12f)
                curveTo(21f, 8.88f, 19.412f, 6.13f, 17f, 4.516f)
            }
        }.build()

        return _ArrowNarrowCircleBrokenRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowNarrowCircleBrokenRight: ImageVector? = null
