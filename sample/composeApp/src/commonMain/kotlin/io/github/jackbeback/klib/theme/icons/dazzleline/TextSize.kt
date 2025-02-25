package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TextSize: ImageVector
    get() {
        if (_TextSize != null) {
            return _TextSize!!
        }
        _TextSize = ImageVector.Builder(
            name = "TextSize",
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
                moveTo(8f, 4f)
                verticalLineTo(20f)
                moveTo(17f, 12f)
                verticalLineTo(20f)
                moveTo(6f, 20f)
                horizontalLineTo(10f)
                moveTo(15f, 20f)
                horizontalLineTo(19f)
                moveTo(13f, 7f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                moveTo(21f, 14f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
            }
        }.build()

        return _TextSize!!
    }

@Suppress("ObjectPropertyName")
private var _TextSize: ImageVector? = null
