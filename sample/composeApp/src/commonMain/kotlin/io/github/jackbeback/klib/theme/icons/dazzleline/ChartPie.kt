package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChartPie: ImageVector
    get() {
        if (_ChartPie != null) {
            return _ChartPie!!
        }
        _ChartPie = ImageVector.Builder(
            name = "ChartPie",
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
                moveTo(19.95f, 17.95f)
                lineTo(15f, 13f)
                horizontalLineTo(22f)
                curveTo(22f, 14.933f, 21.216f, 16.683f, 19.95f, 17.95f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 10f)
                curveTo(20f, 6.134f, 16.866f, 3f, 13f, 3f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12f)
                curveTo(2f, 16.418f, 5.582f, 20f, 10f, 20f)
                curveTo(12.209f, 20f, 14.209f, 19.105f, 15.657f, 17.657f)
                lineTo(10f, 12f)
                verticalLineTo(4f)
                curveTo(5.582f, 4f, 2f, 7.582f, 2f, 12f)
                close()
            }
        }.build()

        return _ChartPie!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPie: ImageVector? = null
