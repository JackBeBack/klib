package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ListUl: ImageVector
    get() {
        if (_ListUl != null) {
            return _ListUl!!
        }
        _ListUl = ImageVector.Builder(
            name = "ListUl",
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
                moveTo(7f, 8f)
                horizontalLineTo(21f)
                moveTo(7f, 12f)
                horizontalLineTo(21f)
                moveTo(7f, 16f)
                horizontalLineTo(21f)
                moveTo(3f, 8f)
                horizontalLineTo(3.01f)
                moveTo(3f, 12f)
                horizontalLineTo(3.01f)
                moveTo(3f, 16f)
                horizontalLineTo(3.01f)
            }
        }.build()

        return _ListUl!!
    }

@Suppress("ObjectPropertyName")
private var _ListUl: ImageVector? = null
