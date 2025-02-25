package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.WifiExclamation: ImageVector
    get() {
        if (_WifiExclamation != null) {
            return _WifiExclamation!!
        }
        _WifiExclamation = ImageVector.Builder(
            name = "WifiExclamation",
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
                moveTo(12f, 19.5f)
                horizontalLineTo(12.01f)
                moveTo(2f, 8.82f)
                curveTo(3.697f, 7.301f, 5.742f, 6.163f, 8f, 5.539f)
                moveTo(5f, 12.859f)
                curveTo(5.863f, 12.013f, 6.878f, 11.323f, 8f, 10.832f)
                moveTo(16f, 5.539f)
                curveTo(18.258f, 6.163f, 20.303f, 7.301f, 22f, 8.82f)
                moveTo(16f, 10.832f)
                curveTo(17.122f, 11.323f, 18.138f, 12.013f, 19f, 12.859f)
                moveTo(12f, 4.5f)
                verticalLineTo(15.5f)
            }
        }.build()

        return _WifiExclamation!!
    }

@Suppress("ObjectPropertyName")
private var _WifiExclamation: ImageVector? = null
