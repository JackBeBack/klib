package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Indent: ImageVector
    get() {
        if (_Indent != null) {
            return _Indent!!
        }
        _Indent = ImageVector.Builder(
            name = "Indent",
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
                moveTo(3f, 5f)
                horizontalLineTo(21f)
                moveTo(10f, 10f)
                horizontalLineTo(21f)
                moveTo(10f, 14f)
                horizontalLineTo(21f)
                moveTo(3f, 19f)
                horizontalLineTo(21f)
                moveTo(3f, 9f)
                lineTo(6f, 12f)
                lineTo(3f, 15f)
            }
        }.build()

        return _Indent!!
    }

@Suppress("ObjectPropertyName")
private var _Indent: ImageVector? = null
