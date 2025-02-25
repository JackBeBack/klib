package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LineHeight: ImageVector
    get() {
        if (_LineHeight != null) {
            return _LineHeight!!
        }
        _LineHeight = ImageVector.Builder(
            name = "LineHeight",
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
                moveTo(13f, 6f)
                lineTo(21f, 6f)
                moveTo(13f, 12f)
                lineTo(21f, 12f)
                moveTo(13f, 18f)
                lineTo(21f, 18f)
                moveTo(6f, 4f)
                verticalLineTo(20f)
                moveTo(6f, 4f)
                lineTo(3f, 7f)
                moveTo(6f, 4f)
                lineTo(9f, 7f)
                moveTo(6f, 20f)
                lineTo(3f, 17f)
                moveTo(6f, 20f)
                lineTo(9f, 17f)
            }
        }.build()

        return _LineHeight!!
    }

@Suppress("ObjectPropertyName")
private var _LineHeight: ImageVector? = null
