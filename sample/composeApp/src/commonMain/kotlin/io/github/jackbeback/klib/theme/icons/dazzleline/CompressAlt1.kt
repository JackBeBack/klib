package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CompressAlt1: ImageVector
    get() {
        if (_CompressAlt1 != null) {
            return _CompressAlt1!!
        }
        _CompressAlt1 = ImageVector.Builder(
            name = "CompressAlt1",
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
                moveTo(15f, 9f)
                horizontalLineTo(19.5f)
                moveTo(15f, 9f)
                verticalLineTo(4.5f)
                moveTo(9f, 15f)
                lineTo(3f, 21f)
                moveTo(9f, 15f)
                horizontalLineTo(4.5f)
                moveTo(9f, 15f)
                verticalLineTo(19.5f)
                moveTo(15f, 15f)
                lineTo(9f, 9f)
            }
        }.build()

        return _CompressAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _CompressAlt1: ImageVector? = null
