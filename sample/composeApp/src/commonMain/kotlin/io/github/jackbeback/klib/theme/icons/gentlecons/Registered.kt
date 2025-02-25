package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Registered: ImageVector
    get() {
        if (_Registered != null) {
            return _Registered!!
        }
        _Registered = ImageVector.Builder(
            name = "Registered",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 6f)
                curveTo(9.343f, 6f, 8f, 7.343f, 8f, 9f)
                verticalLineTo(17f)
                curveTo(8f, 17.552f, 8.448f, 18f, 9f, 18f)
                curveTo(9.552f, 18f, 10f, 17.552f, 10f, 17f)
                verticalLineTo(14f)
                lineTo(11.5f, 14f)
                lineTo(14.2f, 17.6f)
                curveTo(14.531f, 18.042f, 15.158f, 18.131f, 15.6f, 17.8f)
                curveTo(16.042f, 17.469f, 16.131f, 16.842f, 15.8f, 16.4f)
                lineTo(13.719f, 13.625f)
                curveTo(13.794f, 13.593f, 13.871f, 13.558f, 13.947f, 13.519f)
                curveTo(14.441f, 13.273f, 14.965f, 12.887f, 15.363f, 12.289f)
                curveTo(15.766f, 11.685f, 16f, 10.925f, 16f, 10f)
                curveTo(16f, 9.075f, 15.766f, 8.315f, 15.363f, 7.711f)
                curveTo(14.965f, 7.113f, 14.441f, 6.727f, 13.947f, 6.481f)
                curveTo(13.458f, 6.236f, 12.98f, 6.118f, 12.633f, 6.06f)
                curveTo(12.425f, 6.026f, 12.212f, 6f, 12f, 6f)
                horizontalLineTo(11f)
                close()
                moveTo(10f, 12f)
                verticalLineTo(9f)
                curveTo(10f, 8.448f, 10.448f, 8f, 11f, 8f)
                lineTo(12f, 8f)
                curveTo(12.36f, 8.012f, 12.732f, 8.109f, 13.053f, 8.269f)
                curveTo(13.309f, 8.398f, 13.535f, 8.574f, 13.699f, 8.82f)
                curveTo(13.859f, 9.06f, 14f, 9.425f, 14f, 10f)
                curveTo(14f, 10.575f, 13.859f, 10.94f, 13.699f, 11.18f)
                curveTo(13.535f, 11.426f, 13.309f, 11.602f, 13.053f, 11.731f)
                curveTo(12.732f, 11.891f, 12.36f, 11.988f, 12f, 12f)
                lineTo(10f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 12f)
                curveTo(23f, 18.075f, 18.075f, 23f, 12f, 23f)
                curveTo(5.925f, 23f, 1f, 18.075f, 1f, 12f)
                curveTo(1f, 5.925f, 5.925f, 1f, 12f, 1f)
                curveTo(18.075f, 1f, 23f, 5.925f, 23f, 12f)
                close()
                moveTo(3.007f, 12f)
                curveTo(3.007f, 16.967f, 7.033f, 20.993f, 12f, 20.993f)
                curveTo(16.967f, 20.993f, 20.993f, 16.967f, 20.993f, 12f)
                curveTo(20.993f, 7.033f, 16.967f, 3.007f, 12f, 3.007f)
                curveTo(7.033f, 3.007f, 3.007f, 7.033f, 3.007f, 12f)
                close()
            }
        }.build()

        return _Registered!!
    }

@Suppress("ObjectPropertyName")
private var _Registered: ImageVector? = null
