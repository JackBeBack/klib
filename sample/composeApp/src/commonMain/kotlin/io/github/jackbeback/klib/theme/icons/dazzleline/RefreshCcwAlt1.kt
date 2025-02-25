package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.RefreshCcwAlt1: ImageVector
    get() {
        if (_RefreshCcwAlt1 != null) {
            return _RefreshCcwAlt1!!
        }
        _RefreshCcwAlt1 = ImageVector.Builder(
            name = "RefreshCcwAlt1",
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
                curveTo(16.971f, 21f, 21f, 16.971f, 21f, 12f)
                curveTo(21f, 9.695f, 20.133f, 7.592f, 18.708f, 6f)
                lineTo(16f, 3f)
                moveTo(12f, 3f)
                curveTo(7.029f, 3f, 3f, 7.029f, 3f, 12f)
                curveTo(3f, 14.305f, 3.867f, 16.408f, 5.292f, 18f)
                lineTo(8f, 21f)
                moveTo(21f, 3f)
                horizontalLineTo(16f)
                moveTo(16f, 3f)
                verticalLineTo(8f)
                moveTo(3f, 21f)
                horizontalLineTo(8f)
                moveTo(8f, 21f)
                verticalLineTo(16f)
            }
        }.build()

        return _RefreshCcwAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshCcwAlt1: ImageVector? = null
