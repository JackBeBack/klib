package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TextHeight: ImageVector
    get() {
        if (_TextHeight != null) {
            return _TextHeight!!
        }
        _TextHeight = ImageVector.Builder(
            name = "TextHeight",
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
                moveTo(7f, 4f)
                verticalLineTo(20f)
                moveTo(5f, 20f)
                horizontalLineTo(9f)
                moveTo(11f, 7f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                moveTo(18f, 4f)
                verticalLineTo(20f)
                moveTo(18f, 4f)
                lineTo(15f, 7f)
                moveTo(18f, 4f)
                lineTo(21f, 7f)
                moveTo(18f, 20f)
                lineTo(15f, 17f)
                moveTo(18f, 20f)
                lineTo(21f, 17f)
            }
        }.build()

        return _TextHeight!!
    }

@Suppress("ObjectPropertyName")
private var _TextHeight: ImageVector? = null
