package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChartGantt: ImageVector
    get() {
        if (_ChartGantt != null) {
            return _ChartGantt!!
        }
        _ChartGantt = ImageVector.Builder(
            name = "ChartGantt",
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
                moveTo(2.999f, 3f)
                verticalLineTo(16.2f)
                curveTo(2.999f, 17.88f, 2.999f, 18.72f, 3.326f, 19.362f)
                curveTo(3.614f, 19.927f, 4.073f, 20.385f, 4.637f, 20.673f)
                curveTo(5.279f, 21f, 6.119f, 21f, 7.799f, 21f)
                horizontalLineTo(20.999f)
                moveTo(20f, 15f)
                horizontalLineTo(16f)
                moveTo(13f, 7f)
                horizontalLineTo(7f)
                moveTo(18f, 11f)
                horizontalLineTo(9f)
            }
        }.build()

        return _ChartGantt!!
    }

@Suppress("ObjectPropertyName")
private var _ChartGantt: ImageVector? = null
