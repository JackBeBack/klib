package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SensorFire: ImageVector
    get() {
        if (_SensorFire != null) {
            return _SensorFire!!
        }
        _SensorFire = ImageVector.Builder(
            name = "SensorFire",
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
                moveTo(19f, 8.5f)
                verticalLineTo(7.2f)
                curveTo(19f, 6.08f, 19f, 5.52f, 18.782f, 5.092f)
                curveTo(18.59f, 4.716f, 18.284f, 4.41f, 17.908f, 4.218f)
                curveTo(17.48f, 4f, 16.92f, 4f, 15.8f, 4f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 4f, 4.52f, 4f, 4.092f, 4.218f)
                curveTo(3.716f, 4.41f, 3.41f, 4.716f, 3.218f, 5.092f)
                curveTo(3f, 5.52f, 3f, 6.08f, 3f, 7.2f)
                verticalLineTo(16.8f)
                curveTo(3f, 17.92f, 3f, 18.48f, 3.218f, 18.908f)
                curveTo(3.41f, 19.284f, 3.716f, 19.59f, 4.092f, 19.782f)
                curveTo(4.52f, 20f, 5.08f, 20f, 6.2f, 20f)
                horizontalLineTo(9.5f)
                moveTo(7f, 8f)
                verticalLineTo(12f)
                moveTo(11f, 8f)
                verticalLineTo(12f)
                moveTo(19.828f, 19.828f)
                curveTo(18.266f, 21.39f, 15.734f, 21.39f, 14.172f, 19.828f)
                curveTo(13.391f, 19.047f, 13f, 18.024f, 13f, 17f)
                curveTo(13f, 15.976f, 13.391f, 14.953f, 14.172f, 14.172f)
                curveTo(14.172f, 14.172f, 14.5f, 15f, 15.5f, 15.5f)
                curveTo(15.5f, 14.5f, 15.75f, 13f, 16.993f, 12f)
                curveTo(18f, 13f, 19.046f, 13.389f, 19.828f, 14.172f)
                curveTo(20.61f, 14.953f, 21f, 15.976f, 21f, 17f)
                curveTo(21f, 18.024f, 20.61f, 19.047f, 19.828f, 19.828f)
                close()
            }
        }.build()

        return _SensorFire!!
    }

@Suppress("ObjectPropertyName")
private var _SensorFire: ImageVector? = null
