package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChartLineUp: ImageVector
    get() {
        if (_ChartLineUp != null) {
            return _ChartLineUp!!
        }
        _ChartLineUp = ImageVector.Builder(
            name = "ChartLineUp",
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
                moveTo(6f, 15f)
                lineTo(10f, 11f)
                lineTo(14f, 15f)
                lineTo(20f, 9f)
                moveTo(20f, 9f)
                verticalLineTo(13f)
                moveTo(20f, 9f)
                horizontalLineTo(16f)
            }
        }.build()

        return _ChartLineUp!!
    }

@Suppress("ObjectPropertyName")
private var _ChartLineUp: ImageVector? = null
