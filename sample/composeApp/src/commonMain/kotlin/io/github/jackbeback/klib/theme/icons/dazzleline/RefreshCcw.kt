package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.RefreshCcw: ImageVector
    get() {
        if (_RefreshCcw != null) {
            return _RefreshCcw!!
        }
        _RefreshCcw = ImageVector.Builder(
            name = "RefreshCcw",
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
                moveTo(3f, 3f)
                verticalLineTo(8f)
                moveTo(3f, 8f)
                horizontalLineTo(8f)
                moveTo(3f, 8f)
                lineTo(6f, 5.292f)
                curveTo(7.592f, 3.867f, 9.695f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.717f, 21f, 4.132f, 18.008f, 3.223f, 14f)
            }
        }.build()

        return _RefreshCcw!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshCcw: ImageVector? = null
