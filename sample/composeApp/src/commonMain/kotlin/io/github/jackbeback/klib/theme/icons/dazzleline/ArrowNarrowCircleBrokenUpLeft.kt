package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowNarrowCircleBrokenUpLeft: ImageVector
    get() {
        if (_ArrowNarrowCircleBrokenUpLeft != null) {
            return _ArrowNarrowCircleBrokenUpLeft!!
        }
        _ArrowNarrowCircleBrokenUpLeft = ImageVector.Builder(
            name = "ArrowNarrowCircleBrokenUpLeft",
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
                moveTo(15.657f, 10f)
                horizontalLineTo(10f)
                moveTo(10f, 10f)
                verticalLineTo(15.657f)
                moveTo(10f, 10f)
                lineTo(18.364f, 18.364f)
                moveTo(20.828f, 13.757f)
                curveTo(21.392f, 10.91f, 20.57f, 7.843f, 18.364f, 5.636f)
                curveTo(14.849f, 2.121f, 9.151f, 2.121f, 5.636f, 5.636f)
                curveTo(2.121f, 9.151f, 2.121f, 14.849f, 5.636f, 18.364f)
                curveTo(7.843f, 20.57f, 10.91f, 21.392f, 13.757f, 20.828f)
            }
        }.build()

        return _ArrowNarrowCircleBrokenUpLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowNarrowCircleBrokenUpLeft: ImageVector? = null
