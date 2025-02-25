package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowNarrowCircleBrokenDownLeft: ImageVector
    get() {
        if (_ArrowNarrowCircleBrokenDownLeft != null) {
            return _ArrowNarrowCircleBrokenDownLeft!!
        }
        _ArrowNarrowCircleBrokenDownLeft = ImageVector.Builder(
            name = "ArrowNarrowCircleBrokenDownLeft",
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
                moveTo(10f, 8.343f)
                verticalLineTo(14f)
                moveTo(10f, 14f)
                horizontalLineTo(15.5f)
                moveTo(10f, 14f)
                lineTo(18.364f, 5.636f)
                moveTo(13.757f, 3.172f)
                curveTo(10.91f, 2.608f, 7.843f, 3.43f, 5.636f, 5.636f)
                curveTo(2.121f, 9.151f, 2.121f, 14.849f, 5.636f, 18.364f)
                curveTo(9.151f, 21.879f, 14.849f, 21.879f, 18.364f, 18.364f)
                curveTo(20.57f, 16.157f, 21.392f, 13.09f, 20.828f, 10.243f)
            }
        }.build()

        return _ArrowNarrowCircleBrokenDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowNarrowCircleBrokenDownLeft: ImageVector? = null
