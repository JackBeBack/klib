package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BatteryExclamation: ImageVector
    get() {
        if (_BatteryExclamation != null) {
            return _BatteryExclamation!!
        }
        _BatteryExclamation = ImageVector.Builder(
            name = "BatteryExclamation",
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
                moveTo(7.5f, 6f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 6f, 4.52f, 6f, 4.092f, 6.218f)
                curveTo(3.716f, 6.41f, 3.41f, 6.716f, 3.218f, 7.092f)
                curveTo(3f, 7.52f, 3f, 8.08f, 3f, 9.2f)
                verticalLineTo(14.8f)
                curveTo(3f, 15.92f, 3f, 16.48f, 3.218f, 16.908f)
                curveTo(3.41f, 17.284f, 3.716f, 17.59f, 4.092f, 17.782f)
                curveTo(4.52f, 18f, 5.08f, 18f, 6.2f, 18f)
                horizontalLineTo(7.5f)
                moveTo(15.5f, 6f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 6f, 18.48f, 6f, 18.908f, 6.218f)
                curveTo(19.284f, 6.41f, 19.59f, 6.716f, 19.782f, 7.092f)
                curveTo(20f, 7.52f, 20f, 8.08f, 20f, 9.2f)
                verticalLineTo(14.8f)
                curveTo(20f, 15.92f, 20f, 16.48f, 19.782f, 16.908f)
                curveTo(19.59f, 17.284f, 19.284f, 17.59f, 18.908f, 17.782f)
                curveTo(18.48f, 18f, 17.92f, 18f, 16.8f, 18f)
                horizontalLineTo(15.5f)
                moveTo(11.5f, 6f)
                verticalLineTo(15f)
                moveTo(11.5f, 18f)
                horizontalLineTo(11.51f)
                moveTo(21f, 13f)
                verticalLineTo(11f)
            }
        }.build()

        return _BatteryExclamation!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryExclamation: ImageVector? = null
