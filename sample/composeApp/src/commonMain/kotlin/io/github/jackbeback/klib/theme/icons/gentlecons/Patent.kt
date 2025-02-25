package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Patent: ImageVector
    get() {
        if (_Patent != null) {
            return _Patent!!
        }
        _Patent = ImageVector.Builder(
            name = "Patent",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 9f)
                curveTo(8f, 7.343f, 9.343f, 6f, 11f, 6f)
                horizontalLineTo(12f)
                curveTo(12.212f, 6f, 12.425f, 6.026f, 12.633f, 6.06f)
                curveTo(12.98f, 6.118f, 13.458f, 6.236f, 13.947f, 6.481f)
                curveTo(14.441f, 6.727f, 14.965f, 7.113f, 15.363f, 7.711f)
                curveTo(15.766f, 8.315f, 16f, 9.075f, 16f, 10f)
                curveTo(16f, 10.925f, 15.766f, 11.685f, 15.363f, 12.289f)
                curveTo(14.965f, 12.887f, 14.441f, 13.273f, 13.947f, 13.519f)
                curveTo(13.458f, 13.764f, 12.98f, 13.882f, 12.633f, 13.939f)
                curveTo(12.426f, 13.974f, 12.215f, 13.999f, 12.005f, 14f)
                lineTo(10f, 14f)
                verticalLineTo(17f)
                curveTo(10f, 17.552f, 9.552f, 18f, 9f, 18f)
                curveTo(8.448f, 18f, 8f, 17.552f, 8f, 17f)
                verticalLineTo(9f)
                close()
                moveTo(10f, 9f)
                verticalLineTo(12f)
                lineTo(12f, 12f)
                curveTo(12.36f, 11.988f, 12.732f, 11.891f, 13.053f, 11.731f)
                curveTo(13.309f, 11.602f, 13.535f, 11.426f, 13.699f, 11.18f)
                curveTo(13.859f, 10.94f, 14f, 10.575f, 14f, 10f)
                curveTo(14f, 9.425f, 13.859f, 9.06f, 13.699f, 8.82f)
                curveTo(13.535f, 8.574f, 13.309f, 8.398f, 13.053f, 8.269f)
                curveTo(12.732f, 8.109f, 12.36f, 8.012f, 12f, 8f)
                lineTo(11f, 8f)
                curveTo(10.448f, 8f, 10f, 8.448f, 10f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 23f)
                curveTo(18.075f, 23f, 23f, 18.075f, 23f, 12f)
                curveTo(23f, 5.925f, 18.075f, 1f, 12f, 1f)
                curveTo(5.925f, 1f, 1f, 5.925f, 1f, 12f)
                curveTo(1f, 18.075f, 5.925f, 23f, 12f, 23f)
                close()
                moveTo(12f, 20.993f)
                curveTo(7.033f, 20.993f, 3.007f, 16.967f, 3.007f, 12f)
                curveTo(3.007f, 7.033f, 7.033f, 3.007f, 12f, 3.007f)
                curveTo(16.967f, 3.007f, 20.993f, 7.033f, 20.993f, 12f)
                curveTo(20.993f, 16.967f, 16.967f, 20.993f, 12f, 20.993f)
                close()
            }
        }.build()

        return _Patent!!
    }

@Suppress("ObjectPropertyName")
private var _Patent: ImageVector? = null
