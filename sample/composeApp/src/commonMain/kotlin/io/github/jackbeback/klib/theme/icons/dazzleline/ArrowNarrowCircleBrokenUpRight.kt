package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowNarrowCircleBrokenUpRight: ImageVector
    get() {
        if (_ArrowNarrowCircleBrokenUpRight != null) {
            return _ArrowNarrowCircleBrokenUpRight!!
        }
        _ArrowNarrowCircleBrokenUpRight = ImageVector.Builder(
            name = "ArrowNarrowCircleBrokenUpRight",
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
                moveTo(14f, 15.657f)
                verticalLineTo(10f)
                moveTo(14f, 10f)
                horizontalLineTo(8.343f)
                moveTo(14f, 10f)
                lineTo(5.636f, 18.364f)
                moveTo(10.243f, 20.828f)
                curveTo(13.09f, 21.392f, 16.157f, 20.57f, 18.364f, 18.364f)
                curveTo(21.879f, 14.849f, 21.879f, 9.151f, 18.364f, 5.636f)
                curveTo(14.849f, 2.121f, 9.151f, 2.121f, 5.636f, 5.636f)
                curveTo(3.43f, 7.843f, 2.608f, 10.91f, 3.172f, 13.757f)
            }
        }.build()

        return _ArrowNarrowCircleBrokenUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowNarrowCircleBrokenUpRight: ImageVector? = null
