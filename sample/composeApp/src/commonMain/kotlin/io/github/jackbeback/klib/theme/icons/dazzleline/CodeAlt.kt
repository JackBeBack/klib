package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CodeAlt: ImageVector
    get() {
        if (_CodeAlt != null) {
            return _CodeAlt!!
        }
        _CodeAlt = ImageVector.Builder(
            name = "CodeAlt",
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
                moveTo(9f, 8f)
                lineTo(5f, 11.692f)
                lineTo(9f, 16f)
                moveTo(15f, 8f)
                lineTo(19f, 11.692f)
                lineTo(15f, 16f)
            }
        }.build()

        return _CodeAlt!!
    }

@Suppress("ObjectPropertyName")
private var _CodeAlt: ImageVector? = null
