package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PaperclipSlashAlt: ImageVector
    get() {
        if (_PaperclipSlashAlt != null) {
            return _PaperclipSlashAlt!!
        }
        _PaperclipSlashAlt = ImageVector.Builder(
            name = "PaperclipSlashAlt",
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
                moveTo(16.916f, 16.917f)
                curveTo(16.485f, 19.241f, 14.448f, 21f, 12f, 21f)
                curveTo(9.239f, 21f, 7f, 18.761f, 7f, 16f)
                verticalLineTo(7f)
                moveTo(3f, 3f)
                lineTo(21f, 21f)
                moveTo(8.927f, 3.31f)
                curveTo(9.354f, 3.111f, 9.831f, 3f, 10.333f, 3f)
                curveTo(12.174f, 3f, 13.667f, 4.492f, 13.667f, 6.333f)
                verticalLineTo(8.062f)
                moveTo(17f, 5.93f)
                verticalLineTo(11.394f)
                moveTo(10.333f, 10.333f)
                verticalLineTo(15.984f)
                curveTo(10.333f, 16.905f, 11.08f, 17.651f, 12f, 17.651f)
                curveTo(12.921f, 17.651f, 13.667f, 16.905f, 13.667f, 15.984f)
                verticalLineTo(13.668f)
            }
        }.build()

        return _PaperclipSlashAlt!!
    }

@Suppress("ObjectPropertyName")
private var _PaperclipSlashAlt: ImageVector? = null
