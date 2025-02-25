package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DeleteLeft: ImageVector
    get() {
        if (_DeleteLeft != null) {
            return _DeleteLeft!!
        }
        _DeleteLeft = ImageVector.Builder(
            name = "DeleteLeft",
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
                moveTo(12f, 9.5f)
                lineTo(17f, 14.5f)
                moveTo(17f, 9.5f)
                lineTo(12f, 14.5f)
                moveTo(4.508f, 13.955f)
                lineTo(7.44f, 17.755f)
                curveTo(7.792f, 18.212f, 7.968f, 18.44f, 8.19f, 18.605f)
                curveTo(8.386f, 18.75f, 8.607f, 18.859f, 8.842f, 18.925f)
                curveTo(9.108f, 19f, 9.396f, 19f, 9.973f, 19f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 19f, 19.481f, 19f, 19.908f, 18.782f)
                curveTo(20.285f, 18.59f, 20.591f, 18.284f, 20.782f, 17.908f)
                curveTo(21f, 17.48f, 21f, 16.92f, 21f, 15.8f)
                verticalLineTo(8.2f)
                curveTo(21f, 7.08f, 21f, 6.52f, 20.782f, 6.092f)
                curveTo(20.591f, 5.716f, 20.285f, 5.41f, 19.908f, 5.218f)
                curveTo(19.481f, 5f, 18.92f, 5f, 17.8f, 5f)
                horizontalLineTo(9.973f)
                curveTo(9.396f, 5f, 9.108f, 5f, 8.842f, 5.075f)
                curveTo(8.607f, 5.141f, 8.386f, 5.249f, 8.19f, 5.395f)
                curveTo(7.968f, 5.56f, 7.792f, 5.788f, 7.44f, 6.245f)
                lineTo(4.508f, 10.045f)
                curveTo(3.969f, 10.745f, 3.699f, 11.095f, 3.595f, 11.48f)
                curveTo(3.503f, 11.821f, 3.503f, 12.179f, 3.595f, 12.52f)
                curveTo(3.699f, 12.905f, 3.969f, 13.255f, 4.508f, 13.955f)
                close()
            }
        }.build()

        return _DeleteLeft!!
    }

@Suppress("ObjectPropertyName")
private var _DeleteLeft: ImageVector? = null
