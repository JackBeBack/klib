package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowNarrowCircleBrokenDownRight: ImageVector
    get() {
        if (_ArrowNarrowCircleBrokenDownRight != null) {
            return _ArrowNarrowCircleBrokenDownRight!!
        }
        _ArrowNarrowCircleBrokenDownRight = ImageVector.Builder(
            name = "ArrowNarrowCircleBrokenDownRight",
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
                moveTo(8.343f, 14f)
                horizontalLineTo(14f)
                moveTo(14f, 14f)
                verticalLineTo(8.343f)
                moveTo(14f, 14f)
                lineTo(5.636f, 5.636f)
                moveTo(3.172f, 10.243f)
                curveTo(2.608f, 13.09f, 3.43f, 16.157f, 5.636f, 18.364f)
                curveTo(9.151f, 21.879f, 14.849f, 21.879f, 18.364f, 18.364f)
                curveTo(21.879f, 14.849f, 21.879f, 9.151f, 18.364f, 5.636f)
                curveTo(16.157f, 3.43f, 13.09f, 2.608f, 10.243f, 3.172f)
            }
        }.build()

        return _ArrowNarrowCircleBrokenDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowNarrowCircleBrokenDownRight: ImageVector? = null
