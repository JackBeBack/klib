package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MenuAlt1: ImageVector
    get() {
        if (_MenuAlt1 != null) {
            return _MenuAlt1!!
        }
        _MenuAlt1 = ImageVector.Builder(
            name = "MenuAlt1",
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
                moveTo(4f, 12f)
                horizontalLineTo(14f)
                moveTo(4f, 18f)
                horizontalLineTo(9f)
            }
        }.build()

        return _MenuAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _MenuAlt1: ImageVector? = null
