package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChartScatterBubble: ImageVector
    get() {
        if (_ChartScatterBubble != null) {
            return _ChartScatterBubble!!
        }
        _ChartScatterBubble = ImageVector.Builder(
            name = "ChartScatterBubble",
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
                moveTo(9f, 15f)
                horizontalLineTo(9.01f)
                moveTo(16f, 13f)
                horizontalLineTo(16.01f)
                moveTo(10f, 10f)
                horizontalLineTo(10.01f)
                moveTo(17f, 8f)
                horizontalLineTo(17.01f)
            }
        }.build()

        return _ChartScatterBubble!!
    }

@Suppress("ObjectPropertyName")
private var _ChartScatterBubble: ImageVector? = null
