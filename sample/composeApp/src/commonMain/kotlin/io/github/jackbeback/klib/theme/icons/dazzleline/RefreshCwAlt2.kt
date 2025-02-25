package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.RefreshCwAlt2: ImageVector
    get() {
        if (_RefreshCwAlt2 != null) {
            return _RefreshCwAlt2!!
        }
        _RefreshCwAlt2 = ImageVector.Builder(
            name = "RefreshCwAlt2",
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
                moveTo(11f, 2f)
                lineTo(13f, 3.995f)
                lineTo(12.941f, 4.055f)
                moveTo(13f, 18f)
                lineTo(11f, 19.911f)
                lineTo(11.03f, 19.942f)
                moveTo(12.941f, 4.055f)
                lineTo(11f, 6f)
                moveTo(12.941f, 4.055f)
                curveTo(12.632f, 4.019f, 12.318f, 4f, 12f, 4f)
                curveTo(7.582f, 4f, 4f, 7.582f, 4f, 12f)
                curveTo(4f, 14.526f, 5.171f, 16.779f, 7f, 18.245f)
                moveTo(17f, 5.755f)
                curveTo(18.829f, 7.221f, 20f, 9.474f, 20f, 12f)
                curveTo(20f, 16.418f, 16.418f, 20f, 12f, 20f)
                curveTo(11.672f, 20f, 11.348f, 19.98f, 11.03f, 19.942f)
                moveTo(13f, 22f)
                lineTo(11.03f, 19.942f)
            }
        }.build()

        return _RefreshCwAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshCwAlt2: ImageVector? = null
