package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SquareDollarChart: ImageVector
    get() {
        if (_SquareDollarChart != null) {
            return _SquareDollarChart!!
        }
        _SquareDollarChart = ImageVector.Builder(
            name = "SquareDollarChart",
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
                moveTo(4f, 9f)
                verticalLineTo(7.2f)
                curveTo(4f, 6.08f, 4f, 5.52f, 4.218f, 5.092f)
                curveTo(4.41f, 4.716f, 4.716f, 4.41f, 5.092f, 4.218f)
                curveTo(5.52f, 4f, 6.08f, 4f, 7.2f, 4f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 4f, 18.48f, 4f, 18.908f, 4.218f)
                curveTo(19.284f, 4.41f, 19.59f, 4.716f, 19.782f, 5.092f)
                curveTo(20f, 5.52f, 20f, 6.08f, 20f, 7.2f)
                verticalLineTo(16.8f)
                curveTo(20f, 17.92f, 20f, 18.48f, 19.782f, 18.908f)
                curveTo(19.59f, 19.284f, 19.284f, 19.59f, 18.908f, 19.782f)
                curveTo(18.48f, 20f, 17.92f, 20f, 16.8f, 20f)
                horizontalLineTo(10.5f)
                moveTo(11f, 16f)
                horizontalLineTo(17f)
                moveTo(8f, 11f)
                lineTo(11f, 9f)
                verticalLineTo(12f)
                lineTo(17f, 7f)
                moveTo(17f, 7f)
                horizontalLineTo(14f)
                moveTo(17f, 7f)
                verticalLineTo(10f)
                moveTo(7f, 14.5f)
                curveTo(6.5f, 14.376f, 5.685f, 14.371f, 5f, 14.376f)
                curveTo(4.771f, 14.377f, 4.909f, 14.368f, 4.6f, 14.376f)
                curveTo(3.793f, 14.401f, 3.002f, 14.737f, 3f, 15.688f)
                curveTo(2.998f, 16.7f, 4f, 17f, 5f, 17f)
                curveTo(6f, 17f, 7f, 17.231f, 7f, 18.313f)
                curveTo(7f, 19.125f, 6.193f, 19.481f, 5.186f, 19.599f)
                curveTo(4.386f, 19.599f, 4f, 19.625f, 3f, 19.5f)
                moveTo(5f, 20f)
                verticalLineTo(21f)
                moveTo(5f, 13f)
                verticalLineTo(14f)
            }
        }.build()

        return _SquareDollarChart!!
    }

@Suppress("ObjectPropertyName")
private var _SquareDollarChart: ImageVector? = null
