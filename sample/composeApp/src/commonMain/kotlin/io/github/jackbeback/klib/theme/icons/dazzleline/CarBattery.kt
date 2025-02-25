package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CarBattery: ImageVector
    get() {
        if (_CarBattery != null) {
            return _CarBattery!!
        }
        _CarBattery = ImageVector.Builder(
            name = "CarBattery",
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
                moveTo(5f, 5f)
                horizontalLineTo(9f)
                moveTo(6f, 13.5f)
                horizontalLineTo(10f)
                moveTo(15f, 5f)
                horizontalLineTo(19f)
                moveTo(14f, 13.5f)
                horizontalLineTo(18f)
                moveTo(16f, 11.5f)
                verticalLineTo(15.5f)
                moveTo(6.2f, 19f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 19f, 19.48f, 19f, 19.908f, 18.782f)
                curveTo(20.284f, 18.59f, 20.59f, 18.284f, 20.782f, 17.908f)
                curveTo(21f, 17.48f, 21f, 16.92f, 21f, 15.8f)
                verticalLineTo(11.2f)
                curveTo(21f, 10.08f, 21f, 9.52f, 20.782f, 9.092f)
                curveTo(20.59f, 8.716f, 20.284f, 8.41f, 19.908f, 8.218f)
                curveTo(19.48f, 8f, 18.92f, 8f, 17.8f, 8f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 8f, 4.52f, 8f, 4.092f, 8.218f)
                curveTo(3.716f, 8.41f, 3.41f, 8.716f, 3.218f, 9.092f)
                curveTo(3f, 9.52f, 3f, 10.08f, 3f, 11.2f)
                verticalLineTo(15.8f)
                curveTo(3f, 16.92f, 3f, 17.48f, 3.218f, 17.908f)
                curveTo(3.41f, 18.284f, 3.716f, 18.59f, 4.092f, 18.782f)
                curveTo(4.52f, 19f, 5.08f, 19f, 6.2f, 19f)
                close()
            }
        }.build()

        return _CarBattery!!
    }

@Suppress("ObjectPropertyName")
private var _CarBattery: ImageVector? = null
