package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MonitorAlt4: ImageVector
    get() {
        if (_MonitorAlt4 != null) {
            return _MonitorAlt4!!
        }
        _MonitorAlt4 = ImageVector.Builder(
            name = "MonitorAlt4",
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
                moveTo(6f, 21f)
                curveTo(6f, 21f, 7.8f, 20f, 12f, 20f)
                curveTo(16.2f, 20f, 18f, 21f, 18f, 21f)
                moveTo(9f, 17f)
                verticalLineTo(20.194f)
                moveTo(15f, 17f)
                verticalLineTo(20.194f)
                moveTo(6.2f, 17f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 17f, 19.48f, 17f, 19.908f, 16.782f)
                curveTo(20.284f, 16.59f, 20.59f, 16.284f, 20.782f, 15.908f)
                curveTo(21f, 15.48f, 21f, 14.92f, 21f, 13.8f)
                verticalLineTo(6.2f)
                curveTo(21f, 5.08f, 21f, 4.52f, 20.782f, 4.092f)
                curveTo(20.59f, 3.716f, 20.284f, 3.41f, 19.908f, 3.218f)
                curveTo(19.48f, 3f, 18.92f, 3f, 17.8f, 3f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 3f, 4.52f, 3f, 4.092f, 3.218f)
                curveTo(3.716f, 3.41f, 3.41f, 3.716f, 3.218f, 4.092f)
                curveTo(3f, 4.52f, 3f, 5.08f, 3f, 6.2f)
                verticalLineTo(13.8f)
                curveTo(3f, 14.92f, 3f, 15.48f, 3.218f, 15.908f)
                curveTo(3.41f, 16.284f, 3.716f, 16.59f, 4.092f, 16.782f)
                curveTo(4.52f, 17f, 5.08f, 17f, 6.2f, 17f)
                close()
            }
        }.build()

        return _MonitorAlt4!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorAlt4: ImageVector? = null
