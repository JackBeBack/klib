package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SquareUserChart: ImageVector
    get() {
        if (_SquareUserChart != null) {
            return _SquareUserChart!!
        }
        _SquareUserChart = ImageVector.Builder(
            name = "SquareUserChart",
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
                moveTo(10f, 16f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                close()
                moveTo(10f, 16f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                close()
                moveTo(11f, 20f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 20f, 5.52f, 20f, 5.092f, 19.782f)
                curveTo(4.716f, 19.59f, 4.41f, 19.284f, 4.218f, 18.908f)
                curveTo(4f, 18.48f, 4f, 17.92f, 4f, 16.8f)
                verticalLineTo(7.2f)
                curveTo(4f, 6.08f, 4f, 5.52f, 4.218f, 5.092f)
                curveTo(4.41f, 4.716f, 4.716f, 4.41f, 5.092f, 4.218f)
                curveTo(5.52f, 4f, 6.08f, 4f, 7.2f, 4f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 4f, 18.48f, 4f, 18.908f, 4.218f)
                curveTo(19.284f, 4.41f, 19.59f, 4.716f, 19.782f, 5.092f)
                curveTo(20f, 5.52f, 20f, 6.08f, 20f, 7.2f)
                verticalLineTo(9.1f)
                moveTo(19f, 13.5f)
                curveTo(19f, 14.328f, 18.328f, 15f, 17.5f, 15f)
                curveTo(16.672f, 15f, 16f, 14.328f, 16f, 13.5f)
                curveTo(16f, 12.672f, 16.672f, 12f, 17.5f, 12f)
                curveTo(18.328f, 12f, 19f, 12.672f, 19f, 13.5f)
                close()
                moveTo(18.559f, 18f)
                horizontalLineTo(16.441f)
                curveTo(15.581f, 18f, 14.816f, 18.551f, 14.544f, 19.368f)
                lineTo(14f, 21f)
                horizontalLineTo(21f)
                lineTo(20.456f, 19.368f)
                curveTo(20.184f, 18.551f, 19.419f, 18f, 18.559f, 18f)
                close()
            }
        }.build()

        return _SquareUserChart!!
    }

@Suppress("ObjectPropertyName")
private var _SquareUserChart: ImageVector? = null
