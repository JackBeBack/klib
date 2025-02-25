package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PowerAlt: ImageVector
    get() {
        if (_PowerAlt != null) {
            return _PowerAlt!!
        }
        _PowerAlt = ImageVector.Builder(
            name = "PowerAlt",
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
                moveTo(12f, 7f)
                verticalLineTo(12f)
                moveTo(8f, 9f)
                curveTo(7.372f, 9.835f, 7f, 10.874f, 7f, 12f)
                curveTo(7f, 14.761f, 9.239f, 17f, 12f, 17f)
                curveTo(14.761f, 17f, 17f, 14.761f, 17f, 12f)
                curveTo(17f, 10.874f, 16.628f, 9.835f, 16f, 9f)
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
            }
        }.build()

        return _PowerAlt!!
    }

@Suppress("ObjectPropertyName")
private var _PowerAlt: ImageVector? = null
