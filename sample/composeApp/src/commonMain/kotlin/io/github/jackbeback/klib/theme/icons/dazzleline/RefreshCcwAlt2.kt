package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.RefreshCcwAlt2: ImageVector
    get() {
        if (_RefreshCcwAlt2 != null) {
            return _RefreshCcwAlt2!!
        }
        _RefreshCcwAlt2 = ImageVector.Builder(
            name = "RefreshCcwAlt2",
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
                moveTo(13f, 2f)
                lineTo(11f, 3.995f)
                lineTo(11.059f, 4.055f)
                moveTo(11f, 18f)
                lineTo(13f, 19.911f)
                lineTo(12.97f, 19.942f)
                moveTo(11.059f, 4.055f)
                lineTo(13f, 6f)
                moveTo(11.059f, 4.055f)
                curveTo(11.368f, 4.019f, 11.682f, 4f, 12f, 4f)
                curveTo(16.418f, 4f, 20f, 7.582f, 20f, 12f)
                curveTo(20f, 14.526f, 18.829f, 16.779f, 17f, 18.245f)
                moveTo(7f, 5.755f)
                curveTo(5.171f, 7.221f, 4f, 9.474f, 4f, 12f)
                curveTo(4f, 16.418f, 7.582f, 20f, 12f, 20f)
                curveTo(12.328f, 20f, 12.652f, 19.98f, 12.97f, 19.942f)
                moveTo(11f, 22f)
                lineTo(12.97f, 19.942f)
            }
        }.build()

        return _RefreshCcwAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshCcwAlt2: ImageVector? = null
