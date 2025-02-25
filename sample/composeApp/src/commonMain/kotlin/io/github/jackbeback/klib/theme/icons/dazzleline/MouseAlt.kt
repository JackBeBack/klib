package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MouseAlt: ImageVector
    get() {
        if (_MouseAlt != null) {
            return _MouseAlt!!
        }
        _MouseAlt = ImageVector.Builder(
            name = "MouseAlt",
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
                moveTo(12f, 9f)
                verticalLineTo(3f)
                moveTo(12f, 3f)
                curveTo(15.314f, 3f, 18f, 5.686f, 18f, 9f)
                verticalLineTo(15f)
                curveTo(18f, 18.314f, 15.314f, 21f, 12f, 21f)
                curveTo(8.686f, 21f, 6f, 18.314f, 6f, 15f)
                verticalLineTo(9f)
                curveTo(6f, 5.686f, 8.686f, 3f, 12f, 3f)
                close()
            }
        }.build()

        return _MouseAlt!!
    }

@Suppress("ObjectPropertyName")
private var _MouseAlt: ImageVector? = null
