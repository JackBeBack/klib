package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PaperclipAlt: ImageVector
    get() {
        if (_PaperclipAlt != null) {
            return _PaperclipAlt!!
        }
        _PaperclipAlt = ImageVector.Builder(
            name = "PaperclipAlt",
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
                moveTo(17f, 5.93f)
                verticalLineTo(16f)
                curveTo(17f, 18.761f, 14.761f, 21f, 12f, 21f)
                curveTo(9.239f, 21f, 7f, 18.761f, 7f, 16f)
                verticalLineTo(6.333f)
                curveTo(7f, 4.492f, 8.492f, 3f, 10.333f, 3f)
                curveTo(12.174f, 3f, 13.667f, 4.492f, 13.667f, 6.333f)
                verticalLineTo(15.984f)
                curveTo(13.667f, 16.905f, 12.92f, 17.651f, 12f, 17.651f)
                curveTo(11.08f, 17.651f, 10.333f, 16.905f, 10.333f, 15.984f)
                verticalLineTo(6.5f)
            }
        }.build()

        return _PaperclipAlt!!
    }

@Suppress("ObjectPropertyName")
private var _PaperclipAlt: ImageVector? = null
