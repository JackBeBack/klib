package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HeatAlt: ImageVector
    get() {
        if (_HeatAlt != null) {
            return _HeatAlt!!
        }
        _HeatAlt = ImageVector.Builder(
            name = "HeatAlt",
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
                moveTo(11.001f, 3f)
                curveTo(11.001f, 3f, 9.863f, 7.5f, 11.931f, 12f)
                curveTo(14f, 16.5f, 13.5f, 21f, 13.5f, 21f)
                moveTo(18.931f, 21f)
                curveTo(18.931f, 21f, 19.601f, 16.5f, 17.501f, 13f)
                curveTo(15.401f, 9.5f, 16.001f, 6f, 16.001f, 6f)
                moveTo(7.93f, 21f)
                curveTo(7.93f, 21f, 8.599f, 16.5f, 6.499f, 13f)
                curveTo(4.399f, 9.5f, 4.999f, 6f, 4.999f, 6f)
            }
        }.build()

        return _HeatAlt!!
    }

@Suppress("ObjectPropertyName")
private var _HeatAlt: ImageVector? = null
