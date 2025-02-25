package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ExclamationAlt: ImageVector
    get() {
        if (_ExclamationAlt != null) {
            return _ExclamationAlt!!
        }
        _ExclamationAlt = ImageVector.Builder(
            name = "ExclamationAlt",
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
                moveTo(12.01f, 20f)
                horizontalLineTo(12f)
                moveTo(12f, 14f)
                lineTo(12.01f, 4f)
            }
        }.build()

        return _ExclamationAlt!!
    }

@Suppress("ObjectPropertyName")
private var _ExclamationAlt: ImageVector? = null
