package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChartPyramid: ImageVector
    get() {
        if (_ChartPyramid != null) {
            return _ChartPyramid!!
        }
        _ChartPyramid = ImageVector.Builder(
            name = "ChartPyramid",
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
                moveTo(5.118f, 16f)
                horizontalLineTo(18.882f)
                moveTo(8.294f, 10f)
                horizontalLineTo(15.706f)
                moveTo(10.586f, 5.671f)
                lineTo(4.243f, 17.651f)
                curveTo(3.833f, 18.426f, 3.628f, 18.814f, 3.669f, 19.13f)
                curveTo(3.706f, 19.406f, 3.855f, 19.654f, 4.082f, 19.815f)
                curveTo(4.342f, 20f, 4.78f, 20f, 5.657f, 20f)
                horizontalLineTo(18.343f)
                curveTo(19.219f, 20f, 19.658f, 20f, 19.918f, 19.815f)
                curveTo(20.145f, 19.654f, 20.294f, 19.406f, 20.33f, 19.13f)
                curveTo(20.372f, 18.814f, 20.167f, 18.426f, 19.757f, 17.651f)
                lineTo(13.414f, 5.671f)
                curveTo(12.955f, 4.805f, 12.726f, 4.371f, 12.42f, 4.23f)
                curveTo(12.153f, 4.106f, 11.846f, 4.106f, 11.58f, 4.23f)
                curveTo(11.274f, 4.371f, 11.045f, 4.805f, 10.586f, 5.671f)
                close()
            }
        }.build()

        return _ChartPyramid!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPyramid: ImageVector? = null
