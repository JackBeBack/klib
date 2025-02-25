package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Information: ImageVector
    get() {
        if (_Information != null) {
            return _Information!!
        }
        _Information = ImageVector.Builder(
            name = "Information",
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
                moveTo(12.01f, 19f)
                verticalLineTo(9f)
                moveTo(12.01f, 5f)
                horizontalLineTo(12f)
            }
        }.build()

        return _Information!!
    }

@Suppress("ObjectPropertyName")
private var _Information: ImageVector? = null
