package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Asterisk: ImageVector
    get() {
        if (_Asterisk != null) {
            return _Asterisk!!
        }
        _Asterisk = ImageVector.Builder(
            name = "Asterisk",
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
                moveTo(12f, 4f)
                verticalLineTo(20f)
                moveTo(19f, 7f)
                lineTo(5f, 17f)
                moveTo(5f, 7f)
                lineTo(19f, 17f)
            }
        }.build()

        return _Asterisk!!
    }

@Suppress("ObjectPropertyName")
private var _Asterisk: ImageVector? = null
