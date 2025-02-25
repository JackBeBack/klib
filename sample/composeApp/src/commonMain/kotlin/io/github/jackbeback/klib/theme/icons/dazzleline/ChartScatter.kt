package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChartScatter: ImageVector
    get() {
        if (_ChartScatter != null) {
            return _ChartScatter!!
        }
        _ChartScatter = ImageVector.Builder(
            name = "ChartScatter",
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
                moveTo(21f, 21f)
                horizontalLineTo(7.8f)
                curveTo(6.12f, 21f, 5.28f, 21f, 4.638f, 20.673f)
                curveTo(4.074f, 20.385f, 3.615f, 19.927f, 3.327f, 19.362f)
                curveTo(3f, 18.72f, 3f, 17.88f, 3f, 16.2f)
                verticalLineTo(3f)
                moveTo(9.5f, 8.5f)
                horizontalLineTo(9.51f)
                moveTo(19.5f, 7.5f)
                horizontalLineTo(19.51f)
                moveTo(14.5f, 12.5f)
                horizontalLineTo(14.51f)
                moveTo(8.5f, 15.5f)
                horizontalLineTo(8.51f)
                moveTo(18.5f, 15.5f)
                horizontalLineTo(18.51f)
            }
        }.build()

        return _ChartScatter!!
    }

@Suppress("ObjectPropertyName")
private var _ChartScatter: ImageVector? = null
