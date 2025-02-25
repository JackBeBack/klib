package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MartiniGlass: ImageVector
    get() {
        if (_MartiniGlass != null) {
            return _MartiniGlass!!
        }
        _MartiniGlass = ImageVector.Builder(
            name = "MartiniGlass",
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
                moveTo(12f, 14f)
                lineTo(5f, 3f)
                lineTo(19f, 3f)
                lineTo(12f, 14f)
                close()
                moveTo(12f, 14f)
                lineTo(12f, 21f)
                moveTo(8f, 21f)
                horizontalLineTo(16f)
                moveTo(7.545f, 7f)
                horizontalLineTo(16.455f)
            }
        }.build()

        return _MartiniGlass!!
    }

@Suppress("ObjectPropertyName")
private var _MartiniGlass: ImageVector? = null
