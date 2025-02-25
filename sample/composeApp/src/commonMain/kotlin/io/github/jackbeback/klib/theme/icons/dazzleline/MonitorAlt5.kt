package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MonitorAlt5: ImageVector
    get() {
        if (_MonitorAlt5 != null) {
            return _MonitorAlt5!!
        }
        _MonitorAlt5 = ImageVector.Builder(
            name = "MonitorAlt5",
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
                moveTo(9f, 18f)
                verticalLineTo(21f)
                moveTo(15f, 18f)
                verticalLineTo(21f)
                moveTo(7f, 21f)
                horizontalLineTo(17f)
                moveTo(3f, 12f)
                horizontalLineTo(21f)
                moveTo(12f, 15f)
                horizontalLineTo(12.01f)
                moveTo(6.2f, 18f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 18f, 19.48f, 18f, 19.908f, 17.782f)
                curveTo(20.284f, 17.59f, 20.59f, 17.284f, 20.782f, 16.908f)
                curveTo(21f, 16.48f, 21f, 15.92f, 21f, 14.8f)
                verticalLineTo(6.2f)
                curveTo(21f, 5.08f, 21f, 4.52f, 20.782f, 4.092f)
                curveTo(20.59f, 3.716f, 20.284f, 3.41f, 19.908f, 3.218f)
                curveTo(19.48f, 3f, 18.92f, 3f, 17.8f, 3f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 3f, 4.52f, 3f, 4.092f, 3.218f)
                curveTo(3.716f, 3.41f, 3.41f, 3.716f, 3.218f, 4.092f)
                curveTo(3f, 4.52f, 3f, 5.08f, 3f, 6.2f)
                verticalLineTo(14.8f)
                curveTo(3f, 15.92f, 3f, 16.48f, 3.218f, 16.908f)
                curveTo(3.41f, 17.284f, 3.716f, 17.59f, 4.092f, 17.782f)
                curveTo(4.52f, 18f, 5.08f, 18f, 6.2f, 18f)
                close()
            }
        }.build()

        return _MonitorAlt5!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorAlt5: ImageVector? = null
