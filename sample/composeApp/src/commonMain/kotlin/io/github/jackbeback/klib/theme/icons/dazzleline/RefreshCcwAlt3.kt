package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.RefreshCcwAlt3: ImageVector
    get() {
        if (_RefreshCcwAlt3 != null) {
            return _RefreshCcwAlt3!!
        }
        _RefreshCcwAlt3 = ImageVector.Builder(
            name = "RefreshCcwAlt3",
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
                moveTo(19.938f, 13f)
                curveTo(19.979f, 12.672f, 20f, 12.339f, 20f, 12f)
                curveTo(20f, 7.582f, 16.418f, 4f, 12f, 4f)
                curveTo(9.499f, 4f, 7.267f, 5.147f, 5.8f, 6.944f)
                moveTo(4.062f, 11f)
                curveTo(4.021f, 11.328f, 4f, 11.661f, 4f, 12f)
                curveTo(4f, 16.418f, 7.582f, 20f, 12f, 20f)
                curveTo(14.389f, 20f, 16.534f, 18.952f, 18f, 17.292f)
                moveTo(15f, 17f)
                horizontalLineTo(18f)
                verticalLineTo(17.292f)
                moveTo(5.8f, 4f)
                verticalLineTo(6.944f)
                moveTo(5.8f, 6.944f)
                verticalLineTo(7f)
                lineTo(8.8f, 7f)
                moveTo(18f, 20f)
                verticalLineTo(17.292f)
            }
        }.build()

        return _RefreshCcwAlt3!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshCcwAlt3: ImageVector? = null
