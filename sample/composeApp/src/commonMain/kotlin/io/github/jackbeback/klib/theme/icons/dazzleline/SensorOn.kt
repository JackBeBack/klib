package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SensorOn: ImageVector
    get() {
        if (_SensorOn != null) {
            return _SensorOn!!
        }
        _SensorOn = ImageVector.Builder(
            name = "SensorOn",
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
                moveTo(6f, 9f)
                verticalLineTo(13f)
                moveTo(10f, 9f)
                verticalLineTo(13f)
                moveTo(20f, 12f)
                horizontalLineTo(22f)
                moveTo(20f, 8f)
                lineTo(22f, 6f)
                moveTo(22f, 18f)
                lineTo(20f, 16f)
                moveTo(5.2f, 19f)
                horizontalLineTo(12.8f)
                curveTo(13.92f, 19f, 14.48f, 19f, 14.908f, 18.782f)
                curveTo(15.284f, 18.59f, 15.59f, 18.284f, 15.782f, 17.908f)
                curveTo(16f, 17.48f, 16f, 16.92f, 16f, 15.8f)
                verticalLineTo(8.2f)
                curveTo(16f, 7.08f, 16f, 6.52f, 15.782f, 6.092f)
                curveTo(15.59f, 5.716f, 15.284f, 5.41f, 14.908f, 5.218f)
                curveTo(14.48f, 5f, 13.92f, 5f, 12.8f, 5f)
                horizontalLineTo(5.2f)
                curveTo(4.08f, 5f, 3.52f, 5f, 3.092f, 5.218f)
                curveTo(2.716f, 5.41f, 2.41f, 5.716f, 2.218f, 6.092f)
                curveTo(2f, 6.52f, 2f, 7.08f, 2f, 8.2f)
                verticalLineTo(15.8f)
                curveTo(2f, 16.92f, 2f, 17.48f, 2.218f, 17.908f)
                curveTo(2.41f, 18.284f, 2.716f, 18.59f, 3.092f, 18.782f)
                curveTo(3.52f, 19f, 4.08f, 19f, 5.2f, 19f)
                close()
            }
        }.build()

        return _SensorOn!!
    }

@Suppress("ObjectPropertyName")
private var _SensorOn: ImageVector? = null
