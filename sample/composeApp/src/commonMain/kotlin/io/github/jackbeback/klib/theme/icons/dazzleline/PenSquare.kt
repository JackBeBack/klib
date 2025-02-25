package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PenSquare: ImageVector
    get() {
        if (_PenSquare != null) {
            return _PenSquare!!
        }
        _PenSquare = ImageVector.Builder(
            name = "PenSquare",
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
                moveTo(11f, 4f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 4f, 5.52f, 4f, 5.092f, 4.218f)
                curveTo(4.716f, 4.41f, 4.41f, 4.716f, 4.218f, 5.092f)
                curveTo(4f, 5.52f, 4f, 6.08f, 4f, 7.2f)
                verticalLineTo(16.8f)
                curveTo(4f, 17.92f, 4f, 18.48f, 4.218f, 18.908f)
                curveTo(4.41f, 19.284f, 4.716f, 19.59f, 5.092f, 19.782f)
                curveTo(5.52f, 20f, 6.08f, 20f, 7.2f, 20f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 20f, 18.48f, 20f, 18.908f, 19.782f)
                curveTo(19.284f, 19.59f, 19.59f, 19.284f, 19.782f, 18.908f)
                curveTo(20f, 18.48f, 20f, 17.92f, 20f, 16.8f)
                verticalLineTo(12.5f)
                moveTo(15.5f, 5.5f)
                lineTo(18.328f, 8.328f)
                moveTo(10.763f, 10.237f)
                lineTo(17.411f, 3.589f)
                curveTo(18.192f, 2.808f, 19.458f, 2.808f, 20.239f, 3.589f)
                curveTo(21.021f, 4.37f, 21.021f, 5.636f, 20.239f, 6.417f)
                lineTo(13.377f, 13.279f)
                curveTo(12.616f, 14.041f, 12.235f, 14.422f, 11.801f, 14.725f)
                curveTo(11.416f, 14.994f, 11.001f, 15.216f, 10.564f, 15.388f)
                curveTo(10.072f, 15.582f, 9.544f, 15.689f, 8.488f, 15.902f)
                lineTo(8f, 16f)
                lineTo(8.047f, 15.668f)
                curveTo(8.215f, 14.493f, 8.299f, 13.905f, 8.49f, 13.356f)
                curveTo(8.66f, 12.869f, 8.891f, 12.406f, 9.179f, 11.979f)
                curveTo(9.503f, 11.497f, 9.923f, 11.077f, 10.763f, 10.237f)
                close()
            }
        }.build()

        return _PenSquare!!
    }

@Suppress("ObjectPropertyName")
private var _PenSquare: ImageVector? = null
