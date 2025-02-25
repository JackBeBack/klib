package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TextWidth: ImageVector
    get() {
        if (_TextWidth != null) {
            return _TextWidth!!
        }
        _TextWidth = ImageVector.Builder(
            name = "TextWidth",
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
                verticalLineTo(12f)
                moveTo(9f, 12f)
                horizontalLineTo(15f)
                moveTo(20f, 6f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                moveTo(4f, 18f)
                horizontalLineTo(20f)
                moveTo(4f, 18f)
                lineTo(7f, 21f)
                moveTo(4f, 18f)
                lineTo(7f, 15f)
                moveTo(20f, 18f)
                lineTo(17f, 21f)
                moveTo(20f, 18f)
                lineTo(17f, 15f)
            }
        }.build()

        return _TextWidth!!
    }

@Suppress("ObjectPropertyName")
private var _TextWidth: ImageVector? = null
