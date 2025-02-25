package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DollarCircleList: ImageVector
    get() {
        if (_DollarCircleList != null) {
            return _DollarCircleList!!
        }
        _DollarCircleList = ImageVector.Builder(
            name = "DollarCircleList",
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
                moveTo(6f, 8f)
                horizontalLineTo(4f)
                moveTo(6f, 16f)
                horizontalLineTo(4f)
                moveTo(6f, 12f)
                horizontalLineTo(3f)
                moveTo(7f, 4.516f)
                curveTo(8.43f, 3.558f, 10.15f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(10.15f, 21f, 8.43f, 20.442f, 7f, 19.485f)
                moveTo(14f, 9.5f)
                curveTo(13.5f, 9.376f, 12.685f, 9.371f, 12f, 9.376f)
                moveTo(12f, 9.376f)
                curveTo(11.771f, 9.377f, 11.909f, 9.368f, 11.6f, 9.376f)
                curveTo(10.793f, 9.401f, 10.002f, 9.737f, 10f, 10.687f)
                curveTo(9.998f, 11.7f, 11f, 12f, 12f, 12f)
                curveTo(13f, 12f, 14f, 12.231f, 14f, 13.312f)
                curveTo(14f, 14.125f, 13.193f, 14.481f, 12.186f, 14.599f)
                curveTo(12.122f, 14.599f, 12.06f, 14.599f, 12f, 14.599f)
                moveTo(12f, 9.376f)
                lineTo(12f, 8f)
                moveTo(12f, 14.599f)
                curveTo(11.32f, 14.602f, 10.919f, 14.615f, 10f, 14.5f)
                moveTo(12f, 14.599f)
                lineTo(12f, 16f)
            }
        }.build()

        return _DollarCircleList!!
    }

@Suppress("ObjectPropertyName")
private var _DollarCircleList: ImageVector? = null
