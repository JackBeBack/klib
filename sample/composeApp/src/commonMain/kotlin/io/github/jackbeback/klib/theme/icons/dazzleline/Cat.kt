package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Cat: ImageVector
    get() {
        if (_Cat != null) {
            return _Cat!!
        }
        _Cat = ImageVector.Builder(
            name = "Cat",
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
                moveTo(14f, 9f)
                verticalLineTo(3f)
                lineTo(11f, 4f)
                horizontalLineTo(8f)
                lineTo(5f, 3f)
                verticalLineTo(9f)
                lineTo(9.5f, 11f)
                lineTo(14f, 9f)
                close()
                moveTo(14f, 9f)
                lineTo(20f, 12f)
                lineTo(22f, 18f)
                lineTo(20f, 21f)
                horizontalLineTo(4f)
                lineTo(2f, 19f)
                lineTo(4f, 17f)
                lineTo(2f, 15f)
                lineTo(4f, 13f)
                moveTo(7f, 21f)
                verticalLineTo(9.889f)
                moveTo(11f, 15f)
                verticalLineTo(21f)
                lineTo(16.044f, 16f)
                horizontalLineTo(18f)
                moveTo(8f, 7f)
                lineTo(8.007f, 7.007f)
                moveTo(11f, 7f)
                lineTo(11.007f, 7.007f)
            }
        }.build()

        return _Cat!!
    }

@Suppress("ObjectPropertyName")
private var _Cat: ImageVector? = null
