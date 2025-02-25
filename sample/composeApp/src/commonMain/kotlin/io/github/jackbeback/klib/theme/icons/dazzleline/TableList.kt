package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TableList: ImageVector
    get() {
        if (_TableList != null) {
            return _TableList!!
        }
        _TableList = ImageVector.Builder(
            name = "TableList",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f
            ) {
                moveTo(3f, 9.5f)
                horizontalLineTo(21f)
                moveTo(3f, 14.5f)
                horizontalLineTo(21f)
                moveTo(8f, 4.5f)
                verticalLineTo(19.5f)
                moveTo(6.2f, 19.5f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 19.5f, 19.48f, 19.5f, 19.908f, 19.282f)
                curveTo(20.284f, 19.09f, 20.59f, 18.784f, 20.782f, 18.408f)
                curveTo(21f, 17.98f, 21f, 17.42f, 21f, 16.3f)
                verticalLineTo(7.7f)
                curveTo(21f, 6.58f, 21f, 6.02f, 20.782f, 5.592f)
                curveTo(20.59f, 5.216f, 20.284f, 4.91f, 19.908f, 4.718f)
                curveTo(19.48f, 4.5f, 18.92f, 4.5f, 17.8f, 4.5f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 4.5f, 4.52f, 4.5f, 4.092f, 4.718f)
                curveTo(3.716f, 4.91f, 3.41f, 5.216f, 3.218f, 5.592f)
                curveTo(3f, 6.02f, 3f, 6.58f, 3f, 7.7f)
                verticalLineTo(16.3f)
                curveTo(3f, 17.42f, 3f, 17.98f, 3.218f, 18.408f)
                curveTo(3.41f, 18.784f, 3.716f, 19.09f, 4.092f, 19.282f)
                curveTo(4.52f, 19.5f, 5.08f, 19.5f, 6.2f, 19.5f)
                close()
            }
        }.build()

        return _TableList!!
    }

@Suppress("ObjectPropertyName")
private var _TableList: ImageVector? = null
