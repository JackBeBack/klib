package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.RefreshCwAlt1: ImageVector
    get() {
        if (_RefreshCwAlt1 != null) {
            return _RefreshCwAlt1!!
        }
        _RefreshCwAlt1 = ImageVector.Builder(
            name = "RefreshCwAlt1",
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
                moveTo(12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 9.695f, 3.867f, 7.592f, 5.292f, 6f)
                lineTo(8f, 3f)
                moveTo(12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                curveTo(21f, 14.305f, 20.133f, 16.408f, 18.708f, 18f)
                lineTo(16f, 21f)
                moveTo(3f, 3f)
                horizontalLineTo(8f)
                moveTo(8f, 3f)
                verticalLineTo(8f)
                moveTo(21f, 21f)
                horizontalLineTo(16f)
                moveTo(16f, 21f)
                verticalLineTo(16f)
            }
        }.build()

        return _RefreshCwAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshCwAlt1: ImageVector? = null
