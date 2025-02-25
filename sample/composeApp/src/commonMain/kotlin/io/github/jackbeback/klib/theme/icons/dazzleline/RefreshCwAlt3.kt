package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.RefreshCwAlt3: ImageVector
    get() {
        if (_RefreshCwAlt3 != null) {
            return _RefreshCwAlt3!!
        }
        _RefreshCwAlt3 = ImageVector.Builder(
            name = "RefreshCwAlt3",
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
                moveTo(4.062f, 13f)
                curveTo(4.021f, 12.672f, 4f, 12.339f, 4f, 12f)
                curveTo(4f, 7.582f, 7.582f, 4f, 12f, 4f)
                curveTo(14.501f, 4f, 16.733f, 5.147f, 18.2f, 6.944f)
                moveTo(19.938f, 11f)
                curveTo(19.979f, 11.328f, 20f, 11.661f, 20f, 12f)
                curveTo(20f, 16.418f, 16.418f, 20f, 12f, 20f)
                curveTo(9.611f, 20f, 7.466f, 18.952f, 6f, 17.292f)
                moveTo(9f, 17f)
                horizontalLineTo(6f)
                verticalLineTo(17.292f)
                moveTo(18.2f, 4f)
                verticalLineTo(6.944f)
                moveTo(18.2f, 6.944f)
                verticalLineTo(7f)
                lineTo(15.2f, 7f)
                moveTo(6f, 20f)
                verticalLineTo(17.292f)
            }
        }.build()

        return _RefreshCwAlt3!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshCwAlt3: ImageVector? = null
