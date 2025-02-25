package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BookOpen: ImageVector
    get() {
        if (_BookOpen != null) {
            return _BookOpen!!
        }
        _BookOpen = ImageVector.Builder(
            name = "BookOpen",
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
                moveTo(12f, 10.4f)
                verticalLineTo(20f)
                moveTo(12f, 10.4f)
                curveTo(12f, 8.16f, 12f, 7.04f, 11.564f, 6.184f)
                curveTo(11.181f, 5.431f, 10.569f, 4.819f, 9.816f, 4.436f)
                curveTo(8.96f, 4f, 7.84f, 4f, 5.6f, 4f)
                horizontalLineTo(4.6f)
                curveTo(4.04f, 4f, 3.76f, 4f, 3.546f, 4.109f)
                curveTo(3.358f, 4.205f, 3.205f, 4.358f, 3.109f, 4.546f)
                curveTo(3f, 4.76f, 3f, 5.04f, 3f, 5.6f)
                verticalLineTo(16.4f)
                curveTo(3f, 16.96f, 3f, 17.24f, 3.109f, 17.454f)
                curveTo(3.205f, 17.642f, 3.358f, 17.795f, 3.546f, 17.891f)
                curveTo(3.76f, 18f, 4.04f, 18f, 4.6f, 18f)
                horizontalLineTo(7.547f)
                curveTo(8.087f, 18f, 8.357f, 18f, 8.618f, 18.047f)
                curveTo(8.85f, 18.088f, 9.076f, 18.156f, 9.292f, 18.251f)
                curveTo(9.535f, 18.357f, 9.76f, 18.507f, 10.209f, 18.806f)
                lineTo(12f, 20f)
                moveTo(12f, 10.4f)
                curveTo(12f, 8.16f, 12f, 7.04f, 12.436f, 6.184f)
                curveTo(12.819f, 5.431f, 13.431f, 4.819f, 14.184f, 4.436f)
                curveTo(15.04f, 4f, 16.16f, 4f, 18.4f, 4f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 4f, 20.24f, 4f, 20.454f, 4.109f)
                curveTo(20.642f, 4.205f, 20.795f, 4.358f, 20.891f, 4.546f)
                curveTo(21f, 4.76f, 21f, 5.04f, 21f, 5.6f)
                verticalLineTo(16.4f)
                curveTo(21f, 16.96f, 21f, 17.24f, 20.891f, 17.454f)
                curveTo(20.795f, 17.642f, 20.642f, 17.795f, 20.454f, 17.891f)
                curveTo(20.24f, 18f, 19.96f, 18f, 19.4f, 18f)
                horizontalLineTo(16.453f)
                curveTo(15.913f, 18f, 15.643f, 18f, 15.382f, 18.047f)
                curveTo(15.15f, 18.088f, 14.924f, 18.156f, 14.708f, 18.251f)
                curveTo(14.465f, 18.357f, 14.24f, 18.507f, 13.791f, 18.806f)
                lineTo(12f, 20f)
            }
        }.build()

        return _BookOpen!!
    }

@Suppress("ObjectPropertyName")
private var _BookOpen: ImageVector? = null
