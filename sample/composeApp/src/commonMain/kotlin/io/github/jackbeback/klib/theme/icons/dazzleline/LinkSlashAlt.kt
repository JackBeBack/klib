package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LinkSlashAlt: ImageVector
    get() {
        if (_LinkSlashAlt != null) {
            return _LinkSlashAlt!!
        }
        _LinkSlashAlt = ImageVector.Builder(
            name = "LinkSlashAlt",
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
                moveTo(7f, 7f)
                curveTo(4.239f, 7f, 2f, 9.239f, 2f, 12f)
                curveTo(2f, 14.761f, 4.239f, 17f, 7f, 17f)
                horizontalLineTo(9f)
                curveTo(11.164f, 17f, 13.006f, 15.626f, 13.703f, 13.703f)
                moveTo(17f, 17f)
                horizontalLineTo(16.5f)
                moveTo(10f, 12f)
                curveTo(10f, 11.402f, 10.105f, 10.829f, 10.297f, 10.297f)
                moveTo(21f, 21f)
                lineTo(13.703f, 13.703f)
                moveTo(3f, 3f)
                lineTo(10.297f, 10.297f)
                moveTo(10.297f, 10.297f)
                lineTo(13.703f, 13.703f)
                moveTo(13.046f, 7.396f)
                curveTo(13.647f, 7.141f, 14.307f, 7f, 15f, 7f)
                horizontalLineTo(17f)
                curveTo(19.761f, 7f, 22f, 9.239f, 22f, 12f)
                curveTo(22f, 13.215f, 21.566f, 14.329f, 20.846f, 15.195f)
            }
        }.build()

        return _LinkSlashAlt!!
    }

@Suppress("ObjectPropertyName")
private var _LinkSlashAlt: ImageVector? = null
