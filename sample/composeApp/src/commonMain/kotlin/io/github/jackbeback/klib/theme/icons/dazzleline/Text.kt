package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Text: ImageVector
    get() {
        if (_Text != null) {
            return _Text!!
        }
        _Text = ImageVector.Builder(
            name = "Text",
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
                verticalLineTo(21f)
                moveTo(9f, 21f)
                horizontalLineTo(15f)
                moveTo(19f, 6f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
            }
        }.build()

        return _Text!!
    }

@Suppress("ObjectPropertyName")
private var _Text: ImageVector? = null
