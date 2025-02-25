package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ExpandAlt1: ImageVector
    get() {
        if (_ExpandAlt1 != null) {
            return _ExpandAlt1!!
        }
        _ExpandAlt1 = ImageVector.Builder(
            name = "ExpandAlt1",
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
                moveTo(15f, 9f)
                lineTo(21f, 3f)
                moveTo(21f, 3f)
                horizontalLineTo(16.5f)
                moveTo(21f, 3f)
                verticalLineTo(7.5f)
                moveTo(9f, 15f)
                lineTo(3f, 21f)
                moveTo(3f, 21f)
                lineTo(7.5f, 21f)
                moveTo(3f, 21f)
                lineTo(3f, 16.5f)
                moveTo(15f, 15f)
                lineTo(9f, 9f)
            }
        }.build()

        return _ExpandAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _ExpandAlt1: ImageVector? = null
