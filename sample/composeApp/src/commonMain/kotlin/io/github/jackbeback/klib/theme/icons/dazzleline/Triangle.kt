package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Triangle: ImageVector
    get() {
        if (_Triangle != null) {
            return _Triangle!!
        }
        _Triangle = ImageVector.Builder(
            name = "Triangle",
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
                moveTo(4.243f, 17.651f)
                lineTo(10.586f, 5.671f)
                curveTo(11.045f, 4.805f, 11.274f, 4.371f, 11.58f, 4.23f)
                curveTo(11.846f, 4.106f, 12.153f, 4.106f, 12.42f, 4.23f)
                curveTo(12.726f, 4.371f, 12.955f, 4.805f, 13.414f, 5.671f)
                lineTo(19.757f, 17.651f)
                curveTo(20.167f, 18.426f, 20.372f, 18.814f, 20.33f, 19.13f)
                curveTo(20.294f, 19.406f, 20.145f, 19.654f, 19.918f, 19.815f)
                curveTo(19.658f, 20f, 19.219f, 20f, 18.343f, 20f)
                horizontalLineTo(5.657f)
                curveTo(4.78f, 20f, 4.342f, 20f, 4.082f, 19.815f)
                curveTo(3.855f, 19.654f, 3.706f, 19.406f, 3.669f, 19.13f)
                curveTo(3.628f, 18.814f, 3.833f, 18.426f, 4.243f, 17.651f)
                close()
            }
        }.build()

        return _Triangle!!
    }

@Suppress("ObjectPropertyName")
private var _Triangle: ImageVector? = null
