package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ShieldAlt: ImageVector
    get() {
        if (_ShieldAlt != null) {
            return _ShieldAlt!!
        }
        _ShieldAlt = ImageVector.Builder(
            name = "ShieldAlt",
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
                moveTo(20f, 6f)
                curveTo(20f, 6f, 19.184f, 6f, 19f, 6f)
                curveTo(16.268f, 6f, 13.887f, 4.935f, 12f, 3f)
                curveTo(10.113f, 4.935f, 7.732f, 6f, 5f, 6f)
                curveTo(4.816f, 6f, 4f, 6f, 4f, 6f)
                curveTo(4f, 6f, 4f, 8f, 4f, 9.166f)
                curveTo(4f, 14.86f, 7.399f, 19.644f, 12f, 21f)
                curveTo(16.601f, 19.644f, 20f, 14.86f, 20f, 9.166f)
                curveTo(20f, 8f, 20f, 6f, 20f, 6f)
                close()
            }
        }.build()

        return _ShieldAlt!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldAlt: ImageVector? = null
