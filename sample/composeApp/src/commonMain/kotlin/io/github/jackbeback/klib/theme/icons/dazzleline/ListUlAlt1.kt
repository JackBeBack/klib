package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ListUlAlt1: ImageVector
    get() {
        if (_ListUlAlt1 != null) {
            return _ListUlAlt1!!
        }
        _ListUlAlt1 = ImageVector.Builder(
            name = "ListUlAlt1",
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
                moveTo(8f, 8f)
                horizontalLineTo(20f)
                moveTo(11f, 12f)
                horizontalLineTo(20f)
                moveTo(14f, 16f)
                horizontalLineTo(20f)
                moveTo(4f, 8f)
                horizontalLineTo(4.01f)
                moveTo(7f, 12f)
                horizontalLineTo(7.01f)
                moveTo(10f, 16f)
                horizontalLineTo(10.01f)
            }
        }.build()

        return _ListUlAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _ListUlAlt1: ImageVector? = null
