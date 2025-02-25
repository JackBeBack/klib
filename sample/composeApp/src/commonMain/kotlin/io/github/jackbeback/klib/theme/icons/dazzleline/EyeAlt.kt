package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.EyeAlt: ImageVector
    get() {
        if (_EyeAlt != null) {
            return _EyeAlt!!
        }
        _EyeAlt = ImageVector.Builder(
            name = "EyeAlt",
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
                moveTo(3f, 14f)
                curveTo(3f, 9.029f, 7.029f, 5f, 12f, 5f)
                curveTo(16.971f, 5f, 21f, 9.029f, 21f, 14f)
                moveTo(17f, 14f)
                curveTo(17f, 16.761f, 14.761f, 19f, 12f, 19f)
                curveTo(9.239f, 19f, 7f, 16.761f, 7f, 14f)
                curveTo(7f, 11.239f, 9.239f, 9f, 12f, 9f)
                curveTo(14.761f, 9f, 17f, 11.239f, 17f, 14f)
                close()
            }
        }.build()

        return _EyeAlt!!
    }

@Suppress("ObjectPropertyName")
private var _EyeAlt: ImageVector? = null
