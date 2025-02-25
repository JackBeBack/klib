package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MonitorSun: ImageVector
    get() {
        if (_MonitorSun != null) {
            return _MonitorSun!!
        }
        _MonitorSun = ImageVector.Builder(
            name = "MonitorSun",
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
                moveTo(8f, 21f)
                horizontalLineTo(16f)
                moveTo(12f, 17f)
                verticalLineTo(21f)
                moveTo(14.5f, 3f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 3f, 19.48f, 3f, 19.908f, 3.218f)
                curveTo(20.284f, 3.41f, 20.59f, 3.716f, 20.782f, 4.092f)
                curveTo(21f, 4.52f, 21f, 5.08f, 21f, 6.2f)
                verticalLineTo(13.8f)
                curveTo(21f, 14.92f, 21f, 15.48f, 20.782f, 15.908f)
                curveTo(20.59f, 16.284f, 20.284f, 16.59f, 19.908f, 16.782f)
                curveTo(19.48f, 17f, 18.92f, 17f, 17.8f, 17f)
                horizontalLineTo(6f)
                curveTo(5.068f, 17f, 4.602f, 17f, 4.235f, 16.848f)
                curveTo(3.745f, 16.645f, 3.355f, 16.255f, 3.152f, 15.765f)
                curveTo(3f, 15.398f, 3f, 14.932f, 3f, 14f)
                moveTo(7f, 2f)
                verticalLineTo(2.417f)
                moveTo(7f, 11.583f)
                verticalLineTo(12f)
                moveTo(12f, 7f)
                horizontalLineTo(11.583f)
                moveTo(2.417f, 7f)
                horizontalLineTo(2f)
                moveTo(10.535f, 3.465f)
                lineTo(10.24f, 3.759f)
                moveTo(3.759f, 10.241f)
                lineTo(3.465f, 10.535f)
                moveTo(3.465f, 3.465f)
                lineTo(3.76f, 3.759f)
                moveTo(10.241f, 10.241f)
                lineTo(10.536f, 10.536f)
                moveTo(9f, 7f)
                curveTo(9f, 8.105f, 8.105f, 9f, 7f, 9f)
                curveTo(5.895f, 9f, 5f, 8.105f, 5f, 7f)
                curveTo(5f, 5.895f, 5.895f, 5f, 7f, 5f)
                curveTo(8.105f, 5f, 9f, 5.895f, 9f, 7f)
                close()
            }
        }.build()

        return _MonitorSun!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorSun: ImageVector? = null
