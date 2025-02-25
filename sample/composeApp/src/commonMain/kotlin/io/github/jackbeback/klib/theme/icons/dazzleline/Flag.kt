package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Flag: ImageVector
    get() {
        if (_Flag != null) {
            return _Flag!!
        }
        _Flag = ImageVector.Builder(
            name = "Flag",
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
                moveTo(5f, 21f)
                verticalLineTo(3.9f)
                curveTo(5f, 3.9f, 5.875f, 3f, 8.5f, 3f)
                curveTo(11.125f, 3f, 12.875f, 4.8f, 15.5f, 4.8f)
                curveTo(18.125f, 4.8f, 19f, 3.9f, 19f, 3.9f)
                verticalLineTo(14.7f)
                curveTo(19f, 14.7f, 18.125f, 15.6f, 15.5f, 15.6f)
                curveTo(12.875f, 15.6f, 11.125f, 13.8f, 8.5f, 13.8f)
                curveTo(5.875f, 13.8f, 5f, 14.7f, 5f, 14.7f)
            }
        }.build()

        return _Flag!!
    }

@Suppress("ObjectPropertyName")
private var _Flag: ImageVector? = null
