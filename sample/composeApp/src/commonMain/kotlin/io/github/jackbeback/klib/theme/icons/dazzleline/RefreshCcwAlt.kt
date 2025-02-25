package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.RefreshCcwAlt: ImageVector
    get() {
        if (_RefreshCcwAlt != null) {
            return _RefreshCcwAlt!!
        }
        _RefreshCcwAlt = ImageVector.Builder(
            name = "RefreshCcwAlt",
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
                moveTo(3f, 12f)
                curveTo(3f, 16.971f, 7.029f, 21f, 12f, 21f)
                curveTo(14.305f, 21f, 16.408f, 20.133f, 18f, 18.708f)
                lineTo(21f, 16f)
                moveTo(21f, 12f)
                curveTo(21f, 7.029f, 16.971f, 3f, 12f, 3f)
                curveTo(9.695f, 3f, 7.592f, 3.867f, 6f, 5.292f)
                lineTo(3f, 8f)
                moveTo(21f, 21f)
                verticalLineTo(16f)
                moveTo(21f, 16f)
                horizontalLineTo(16f)
                moveTo(3f, 3f)
                verticalLineTo(8f)
                moveTo(3f, 8f)
                horizontalLineTo(8f)
            }
        }.build()

        return _RefreshCcwAlt!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshCcwAlt: ImageVector? = null
