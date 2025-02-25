package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TableListAlt: ImageVector
    get() {
        if (_TableListAlt != null) {
            return _TableListAlt!!
        }
        _TableListAlt = ImageVector.Builder(
            name = "TableListAlt",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f
            ) {
                moveTo(4f, 9.5f)
                horizontalLineTo(20f)
                moveTo(4f, 14.5f)
                horizontalLineTo(20f)
                moveTo(9f, 4.5f)
                verticalLineTo(19.5f)
                moveTo(7.2f, 19.5f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 19.5f, 18.48f, 19.5f, 18.908f, 19.282f)
                curveTo(19.284f, 19.09f, 19.59f, 18.784f, 19.782f, 18.408f)
                curveTo(20f, 17.98f, 20f, 17.42f, 20f, 16.3f)
                verticalLineTo(7.7f)
                curveTo(20f, 6.58f, 20f, 6.02f, 19.782f, 5.592f)
                curveTo(19.59f, 5.216f, 19.284f, 4.91f, 18.908f, 4.718f)
                curveTo(18.48f, 4.5f, 17.92f, 4.5f, 16.8f, 4.5f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 4.5f, 5.52f, 4.5f, 5.092f, 4.718f)
                curveTo(4.716f, 4.91f, 4.41f, 5.216f, 4.218f, 5.592f)
                curveTo(4f, 6.02f, 4f, 6.58f, 4f, 7.7f)
                verticalLineTo(16.3f)
                curveTo(4f, 17.42f, 4f, 17.98f, 4.218f, 18.408f)
                curveTo(4.41f, 18.784f, 4.716f, 19.09f, 5.092f, 19.282f)
                curveTo(5.52f, 19.5f, 6.08f, 19.5f, 7.2f, 19.5f)
                close()
            }
        }.build()

        return _TableListAlt!!
    }

@Suppress("ObjectPropertyName")
private var _TableListAlt: ImageVector? = null
