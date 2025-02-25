package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LinkAlt: ImageVector
    get() {
        if (_LinkAlt != null) {
            return _LinkAlt!!
        }
        _LinkAlt = ImageVector.Builder(
            name = "LinkAlt",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(14f, 12f)
                curveTo(14f, 14.761f, 11.761f, 17f, 9f, 17f)
                horizontalLineTo(7f)
                curveTo(4.239f, 17f, 2f, 14.761f, 2f, 12f)
                curveTo(2f, 9.239f, 4.239f, 7f, 7f, 7f)
                horizontalLineTo(7.5f)
                moveTo(10f, 12f)
                curveTo(10f, 9.239f, 12.239f, 7f, 15f, 7f)
                horizontalLineTo(17f)
                curveTo(19.761f, 7f, 22f, 9.239f, 22f, 12f)
                curveTo(22f, 14.761f, 19.761f, 17f, 17f, 17f)
                horizontalLineTo(16.5f)
            }
        }.build()

        return _LinkAlt!!
    }

@Suppress("ObjectPropertyName")
private var _LinkAlt: ImageVector? = null
