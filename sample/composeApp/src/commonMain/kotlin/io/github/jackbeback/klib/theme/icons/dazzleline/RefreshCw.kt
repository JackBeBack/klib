package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.RefreshCw: ImageVector
    get() {
        if (_RefreshCw != null) {
            return _RefreshCw!!
        }
        _RefreshCw = ImageVector.Builder(
            name = "RefreshCw",
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
                moveTo(21f, 3f)
                verticalLineTo(8f)
                moveTo(21f, 8f)
                horizontalLineTo(16f)
                moveTo(21f, 8f)
                lineTo(18f, 5.292f)
                curveTo(16.408f, 3.867f, 14.305f, 3f, 12f, 3f)
                curveTo(7.029f, 3f, 3f, 7.029f, 3f, 12f)
                curveTo(3f, 16.971f, 7.029f, 21f, 12f, 21f)
                curveTo(16.283f, 21f, 19.868f, 18.008f, 20.777f, 14f)
            }
        }.build()

        return _RefreshCw!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshCw: ImageVector? = null
