package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MenuAlt: ImageVector
    get() {
        if (_MenuAlt != null) {
            return _MenuAlt!!
        }
        _MenuAlt = ImageVector.Builder(
            name = "MenuAlt",
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
                moveTo(4f, 6f)
                horizontalLineTo(20f)
                moveTo(7f, 12f)
                horizontalLineTo(17f)
                moveTo(9f, 18f)
                horizontalLineTo(15f)
            }
        }.build()

        return _MenuAlt!!
    }

@Suppress("ObjectPropertyName")
private var _MenuAlt: ImageVector? = null
