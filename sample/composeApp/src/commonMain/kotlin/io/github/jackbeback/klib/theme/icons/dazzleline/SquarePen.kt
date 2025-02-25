package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SquarePen: ImageVector
    get() {
        if (_SquarePen != null) {
            return _SquarePen!!
        }
        _SquarePen = ImageVector.Builder(
            name = "SquarePen",
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
                moveTo(13.971f, 8.028f)
                curveTo(14.54f, 7.459f, 15.462f, 7.459f, 16.03f, 8.028f)
                curveTo(16.598f, 8.596f, 16.598f, 9.518f, 16.03f, 10.087f)
                lineTo(12.009f, 14.107f)
                curveTo(11.498f, 14.619f, 11.242f, 14.874f, 10.951f, 15.077f)
                curveTo(10.692f, 15.257f, 10.413f, 15.406f, 10.119f, 15.521f)
                curveTo(9.789f, 15.65f, 9.434f, 15.72f, 8.724f, 15.861f)
                lineTo(7.967f, 16.01f)
                lineTo(8.158f, 15.198f)
                curveTo(8.313f, 14.538f, 8.39f, 14.208f, 8.519f, 13.901f)
                curveTo(8.634f, 13.628f, 8.778f, 13.368f, 8.95f, 13.127f)
                curveTo(9.144f, 12.856f, 9.383f, 12.616f, 9.863f, 12.137f)
                lineTo(13.971f, 8.028f)
                close()
            }
        }.build()

        return _SquarePen!!
    }

@Suppress("ObjectPropertyName")
private var _SquarePen: ImageVector? = null
