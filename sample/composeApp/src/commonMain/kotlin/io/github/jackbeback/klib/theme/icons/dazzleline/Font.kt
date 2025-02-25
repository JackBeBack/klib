package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Font: ImageVector
    get() {
        if (_Font != null) {
            return _Font!!
        }
        _Font = ImageVector.Builder(
            name = "Font",
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
                moveTo(16f, 21f)
                horizontalLineTo(19.5f)
                moveTo(6f, 21f)
                lineTo(12f, 3f)
                lineTo(18f, 21f)
                moveTo(4.5f, 21f)
                horizontalLineTo(8f)
                moveTo(15f, 14f)
                horizontalLineTo(9f)
            }
        }.build()

        return _Font!!
    }

@Suppress("ObjectPropertyName")
private var _Font: ImageVector? = null
