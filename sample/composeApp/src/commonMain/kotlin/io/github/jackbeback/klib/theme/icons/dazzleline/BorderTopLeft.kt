package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BorderTopLeft: ImageVector
    get() {
        if (_BorderTopLeft != null) {
            return _BorderTopLeft!!
        }
        _BorderTopLeft = ImageVector.Builder(
            name = "BorderTopLeft",
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
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                lineTo(4f, 20f)
                moveTo(20f, 8f)
                horizontalLineTo(20.01f)
                moveTo(20f, 20f)
                horizontalLineTo(20.01f)
                moveTo(16f, 20f)
                horizontalLineTo(16.01f)
                moveTo(12f, 20f)
                horizontalLineTo(12.01f)
                moveTo(8f, 20f)
                horizontalLineTo(8.01f)
                moveTo(20f, 16f)
                horizontalLineTo(20.01f)
                moveTo(20f, 12f)
                horizontalLineTo(20.01f)
            }
        }.build()

        return _BorderTopLeft!!
    }

@Suppress("ObjectPropertyName")
private var _BorderTopLeft: ImageVector? = null
