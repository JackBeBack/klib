package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MenuAlt2: ImageVector
    get() {
        if (_MenuAlt2 != null) {
            return _MenuAlt2!!
        }
        _MenuAlt2 = ImageVector.Builder(
            name = "MenuAlt2",
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
                moveTo(4f, 12f)
                horizontalLineTo(20f)
                moveTo(4f, 8f)
                horizontalLineTo(20f)
                moveTo(4f, 16f)
                horizontalLineTo(12f)
            }
        }.build()

        return _MenuAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _MenuAlt2: ImageVector? = null
