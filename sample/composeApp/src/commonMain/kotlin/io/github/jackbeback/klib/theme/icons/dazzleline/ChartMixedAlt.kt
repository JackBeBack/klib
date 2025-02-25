package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChartMixedAlt: ImageVector
    get() {
        if (_ChartMixedAlt != null) {
            return _ChartMixedAlt!!
        }
        _ChartMixedAlt = ImageVector.Builder(
            name = "ChartMixedAlt",
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
                moveTo(21f, 3f)
                lineTo(14f, 9f)
                lineTo(10f, 5f)
                lineTo(3f, 11f)
                moveTo(4.5f, 21f)
                curveTo(3.672f, 21f, 3f, 20.328f, 3f, 19.5f)
                verticalLineTo(17.5f)
                curveTo(3f, 16.672f, 3.672f, 16f, 4.5f, 16f)
                curveTo(5.328f, 16f, 6f, 16.672f, 6f, 17.5f)
                verticalLineTo(19.5f)
                curveTo(6f, 20.328f, 5.328f, 21f, 4.5f, 21f)
                close()
                moveTo(11.5f, 21f)
                curveTo(10.672f, 21f, 10f, 20.328f, 10f, 19.5f)
                verticalLineTo(14.5f)
                curveTo(10f, 13.672f, 10.672f, 13f, 11.5f, 13f)
                curveTo(12.328f, 13f, 13f, 13.672f, 13f, 14.5f)
                verticalLineTo(19.5f)
                curveTo(13f, 20.328f, 12.328f, 21f, 11.5f, 21f)
                close()
                moveTo(18.5f, 21f)
                curveTo(17.672f, 21f, 17f, 20.328f, 17f, 19.5f)
                verticalLineTo(16.5f)
                curveTo(17f, 15.672f, 17.672f, 15f, 18.5f, 15f)
                curveTo(19.328f, 15f, 20f, 15.672f, 20f, 16.5f)
                verticalLineTo(19.5f)
                curveTo(20f, 20.328f, 19.328f, 21f, 18.5f, 21f)
                close()
            }
        }.build()

        return _ChartMixedAlt!!
    }

@Suppress("ObjectPropertyName")
private var _ChartMixedAlt: ImageVector? = null
