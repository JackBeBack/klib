package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PenSlash: ImageVector
    get() {
        if (_PenSlash != null) {
            return _PenSlash!!
        }
        _PenSlash = ImageVector.Builder(
            name = "PenSlash",
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
                moveTo(15.5f, 5.501f)
                lineTo(18.328f, 8.329f)
                moveTo(13.325f, 7.675f)
                lineTo(17.411f, 3.59f)
                curveTo(18.192f, 2.809f, 19.458f, 2.809f, 20.239f, 3.59f)
                curveTo(21.02f, 4.371f, 21.02f, 5.637f, 20.239f, 6.418f)
                lineTo(16.154f, 10.503f)
                moveTo(3f, 3f)
                lineTo(10.5f, 10.5f)
                moveTo(21f, 21f)
                lineTo(13.329f, 13.329f)
                moveTo(13.329f, 13.329f)
                lineTo(8.377f, 18.28f)
                curveTo(7.616f, 19.042f, 7.235f, 19.422f, 6.801f, 19.725f)
                curveTo(6.416f, 19.994f, 6.001f, 20.217f, 5.564f, 20.389f)
                curveTo(5.072f, 20.582f, 4.544f, 20.689f, 3.488f, 20.902f)
                lineTo(3f, 21f)
                lineTo(3.047f, 20.668f)
                curveTo(3.215f, 19.493f, 3.299f, 18.905f, 3.49f, 18.357f)
                curveTo(3.66f, 17.87f, 3.891f, 17.407f, 4.179f, 16.979f)
                curveTo(4.503f, 16.497f, 4.923f, 16.077f, 5.763f, 15.238f)
                lineTo(10.5f, 10.5f)
                moveTo(13.329f, 13.329f)
                lineTo(10.5f, 10.5f)
            }
        }.build()

        return _PenSlash!!
    }

@Suppress("ObjectPropertyName")
private var _PenSlash: ImageVector? = null
