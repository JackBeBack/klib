package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.RepeatAlt: ImageVector
    get() {
        if (_RepeatAlt != null) {
            return _RepeatAlt!!
        }
        _RepeatAlt = ImageVector.Builder(
            name = "RepeatAlt",
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
                moveTo(10f, 17f)
                horizontalLineTo(8.001f)
                curveTo(4.687f, 17f, 2.001f, 14.314f, 2.001f, 11f)
                curveTo(2.001f, 7.686f, 4.687f, 5f, 8.001f, 5f)
                horizontalLineTo(16f)
                curveTo(19.314f, 5f, 22f, 7.686f, 22f, 11f)
                curveTo(22f, 14.314f, 19.314f, 17f, 16f, 17f)
                horizontalLineTo(14f)
                moveTo(17f, 20f)
                lineTo(14f, 17f)
                moveTo(14f, 17f)
                lineTo(17f, 14f)
            }
        }.build()

        return _RepeatAlt!!
    }

@Suppress("ObjectPropertyName")
private var _RepeatAlt: ImageVector? = null
