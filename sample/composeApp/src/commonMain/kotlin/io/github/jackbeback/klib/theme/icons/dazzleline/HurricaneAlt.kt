package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HurricaneAlt: ImageVector
    get() {
        if (_HurricaneAlt != null) {
            return _HurricaneAlt!!
        }
        _HurricaneAlt = ImageVector.Builder(
            name = "HurricaneAlt",
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
                moveTo(21f, 4f)
                horizontalLineTo(3f)
                moveTo(20f, 8f)
                horizontalLineTo(6f)
                moveTo(18f, 12f)
                horizontalLineTo(9f)
                moveTo(15f, 16f)
                horizontalLineTo(8f)
                moveTo(17f, 20f)
                horizontalLineTo(12f)
            }
        }.build()

        return _HurricaneAlt!!
    }

@Suppress("ObjectPropertyName")
private var _HurricaneAlt: ImageVector? = null
