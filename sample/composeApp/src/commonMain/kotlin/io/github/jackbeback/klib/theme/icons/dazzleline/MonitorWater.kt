package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MonitorWater: ImageVector
    get() {
        if (_MonitorWater != null) {
            return _MonitorWater!!
        }
        _MonitorWater = ImageVector.Builder(
            name = "MonitorWater",
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
                moveTo(12f, 3f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 3f, 19.48f, 3f, 19.908f, 3.218f)
                curveTo(20.284f, 3.41f, 20.59f, 3.716f, 20.782f, 4.092f)
                curveTo(21f, 4.52f, 21f, 5.08f, 21f, 6.2f)
                verticalLineTo(13.8f)
                curveTo(21f, 14.92f, 21f, 15.48f, 20.782f, 15.908f)
                curveTo(20.59f, 16.284f, 20.284f, 16.59f, 19.908f, 16.782f)
                curveTo(19.48f, 17f, 18.92f, 17f, 17.8f, 17f)
                horizontalLineTo(6.209f)
                curveTo(5.086f, 17f, 4.525f, 17f, 4.096f, 16.781f)
                curveTo(3.719f, 16.589f, 3.413f, 16.282f, 3.222f, 15.904f)
                curveTo(3.004f, 15.475f, 3.006f, 14.914f, 3.009f, 13.791f)
                lineTo(3.01f, 13.5f)
                moveTo(9f, 7.018f)
                curveTo(9f, 8.665f, 7.657f, 10f, 6f, 10f)
                curveTo(4.343f, 10f, 3f, 8.665f, 3f, 7.018f)
                curveTo(3f, 6.261f, 3.682f, 5.428f, 4.148f, 4.902f)
                curveTo(4.698f, 4.283f, 5.991f, 3f, 5.991f, 3f)
                curveTo(5.991f, 3f, 7.349f, 4.283f, 7.898f, 4.902f)
                curveTo(8.365f, 5.428f, 9f, 6.261f, 9f, 7.018f)
                close()
            }
        }.build()

        return _MonitorWater!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorWater: ImageVector? = null
