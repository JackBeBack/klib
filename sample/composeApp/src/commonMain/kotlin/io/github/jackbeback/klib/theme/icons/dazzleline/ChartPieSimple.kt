package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChartPieSimple: ImageVector
    get() {
        if (_ChartPieSimple != null) {
            return _ChartPieSimple!!
        }
        _ChartPieSimple = ImageVector.Builder(
            name = "ChartPieSimple",
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
                moveTo(21f, 10f)
                curveTo(21f, 6.134f, 17.866f, 3f, 14f, 3f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 21f)
                curveTo(15.418f, 21f, 19f, 17.418f, 19f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                curveTo(6.582f, 5f, 3f, 8.582f, 3f, 13f)
                curveTo(3f, 17.418f, 6.582f, 21f, 11f, 21f)
                close()
            }
        }.build()

        return _ChartPieSimple!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPieSimple: ImageVector? = null
