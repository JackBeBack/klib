package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MouseAlt1: ImageVector
    get() {
        if (_MouseAlt1 != null) {
            return _MouseAlt1!!
        }
        _MouseAlt1 = ImageVector.Builder(
            name = "MouseAlt1",
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
                moveTo(12f, 3f)
                verticalLineTo(9f)
                moveTo(12f, 3f)
                curveTo(15.314f, 3f, 18f, 5.686f, 18f, 9f)
                moveTo(12f, 3f)
                curveTo(8.686f, 3f, 6f, 5.686f, 6f, 9f)
                moveTo(6f, 9f)
                horizontalLineTo(18f)
                moveTo(6f, 9f)
                verticalLineTo(15f)
                curveTo(6f, 18.314f, 8.686f, 21f, 12f, 21f)
                curveTo(15.314f, 21f, 18f, 18.314f, 18f, 15f)
                verticalLineTo(9f)
            }
        }.build()

        return _MouseAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _MouseAlt1: ImageVector? = null
