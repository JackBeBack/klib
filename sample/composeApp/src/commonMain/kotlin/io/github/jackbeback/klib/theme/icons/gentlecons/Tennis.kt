package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Tennis: ImageVector
    get() {
        if (_Tennis != null) {
            return _Tennis!!
        }
        _Tennis = ImageVector.Builder(
            name = "Tennis",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                curveTo(3.007f, 14.587f, 4.1f, 16.92f, 5.849f, 18.561f)
                curveTo(6.077f, 18.233f, 6.347f, 17.808f, 6.617f, 17.3f)
                curveTo(7.316f, 15.985f, 8f, 14.148f, 8f, 12f)
                curveTo(8f, 9.852f, 7.316f, 8.015f, 6.617f, 6.7f)
                curveTo(6.347f, 6.192f, 6.077f, 5.767f, 5.849f, 5.439f)
                curveTo(4.1f, 7.08f, 3.007f, 9.412f, 3.007f, 12f)
                close()
                moveTo(12f, 20.993f)
                curveTo(10.34f, 20.993f, 8.786f, 20.543f, 7.452f, 19.76f)
                curveTo(7.727f, 19.367f, 8.055f, 18.855f, 8.383f, 18.239f)
                curveTo(9.184f, 16.733f, 10f, 14.57f, 10f, 12f)
                curveTo(10f, 9.43f, 9.184f, 7.267f, 8.383f, 5.761f)
                curveTo(8.055f, 5.145f, 7.727f, 4.633f, 7.451f, 4.24f)
                curveTo(8.786f, 3.456f, 10.34f, 3.007f, 12f, 3.007f)
                curveTo(13.66f, 3.007f, 15.214f, 3.456f, 16.549f, 4.24f)
                curveTo(16.273f, 4.633f, 15.945f, 5.145f, 15.617f, 5.761f)
                curveTo(14.816f, 7.267f, 14f, 9.43f, 14f, 12f)
                curveTo(14f, 14.57f, 14.816f, 16.733f, 15.617f, 18.239f)
                curveTo(15.945f, 18.855f, 16.273f, 19.367f, 16.548f, 19.76f)
                curveTo(15.214f, 20.543f, 13.659f, 20.993f, 12f, 20.993f)
                close()
                moveTo(18.151f, 18.561f)
                curveTo(19.9f, 16.92f, 20.993f, 14.587f, 20.993f, 12f)
                curveTo(20.993f, 9.412f, 19.9f, 7.08f, 18.151f, 5.439f)
                curveTo(17.923f, 5.767f, 17.653f, 6.192f, 17.383f, 6.7f)
                curveTo(16.684f, 8.015f, 16f, 9.852f, 16f, 12f)
                curveTo(16f, 14.148f, 16.684f, 15.985f, 17.383f, 17.3f)
                curveTo(17.653f, 17.808f, 17.923f, 18.233f, 18.151f, 18.561f)
                close()
            }
        }.build()

        return _Tennis!!
    }

@Suppress("ObjectPropertyName")
private var _Tennis: ImageVector? = null
