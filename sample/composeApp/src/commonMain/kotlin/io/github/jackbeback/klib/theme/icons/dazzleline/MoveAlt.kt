package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MoveAlt: ImageVector
    get() {
        if (_MoveAlt != null) {
            return _MoveAlt!!
        }
        _MoveAlt = ImageVector.Builder(
            name = "MoveAlt",
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
                lineTo(9f, 6f)
                moveTo(12f, 3f)
                lineTo(15f, 6f)
                moveTo(12f, 15f)
                verticalLineTo(21f)
                moveTo(12f, 21f)
                lineTo(15f, 18f)
                moveTo(12f, 21f)
                lineTo(9f, 18f)
                moveTo(3f, 12f)
                horizontalLineTo(9f)
                moveTo(3f, 12f)
                lineTo(6f, 15f)
                moveTo(3f, 12f)
                lineTo(6f, 9f)
                moveTo(15f, 12f)
                horizontalLineTo(21f)
                moveTo(21f, 12f)
                lineTo(18f, 9f)
                moveTo(21f, 12f)
                lineTo(18f, 15f)
            }
        }.build()

        return _MoveAlt!!
    }

@Suppress("ObjectPropertyName")
private var _MoveAlt: ImageVector? = null
