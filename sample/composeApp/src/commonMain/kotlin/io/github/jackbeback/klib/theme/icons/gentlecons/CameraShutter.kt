package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.CameraShutter: ImageVector
    get() {
        if (_CameraShutter != null) {
            return _CameraShutter!!
        }
        _CameraShutter = ImageVector.Builder(
            name = "CameraShutter",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveTo(11.166f, 17f)
                lineTo(13.488f, 20.871f)
                curveTo(15.98f, 20.455f, 18.125f, 19.016f, 19.476f, 17f)
                horizontalLineTo(11.166f)
                close()
                moveTo(6.877f, 13.738f)
                lineTo(11.209f, 20.959f)
                curveTo(8.478f, 20.721f, 6.097f, 19.262f, 4.614f, 17.132f)
                lineTo(6.877f, 13.738f)
                close()
                moveTo(7.631f, 9f)
                horizontalLineTo(3.519f)
                curveTo(3.187f, 9.938f, 3.007f, 10.948f, 3.007f, 12f)
                curveTo(3.007f, 13.093f, 3.202f, 14.14f, 3.559f, 15.109f)
                lineTo(7.631f, 9f)
                close()
                moveTo(20.481f, 15f)
                horizontalLineTo(16.314f)
                lineTo(20.339f, 8.627f)
                curveTo(20.761f, 9.669f, 20.993f, 10.807f, 20.993f, 12f)
                curveTo(20.993f, 13.052f, 20.813f, 14.062f, 20.481f, 15f)
                close()
                moveTo(12.834f, 7f)
                horizontalLineTo(4.524f)
                curveTo(5.875f, 4.984f, 8.02f, 3.544f, 10.512f, 3.129f)
                lineTo(12.834f, 7f)
                close()
                moveTo(12.791f, 3.041f)
                lineTo(17.035f, 10.114f)
                lineTo(19.226f, 6.645f)
                curveTo(17.735f, 4.636f, 15.425f, 3.271f, 12.791f, 3.041f)
                close()
                moveTo(8.179f, 12f)
                lineTo(10.054f, 9f)
                horizontalLineTo(13.946f)
                lineTo(15.821f, 12f)
                lineTo(13.946f, 15f)
                horizontalLineTo(10.054f)
                lineTo(8.179f, 12f)
                close()
            }
        }.build()

        return _CameraShutter!!
    }

@Suppress("ObjectPropertyName")
private var _CameraShutter: ImageVector? = null
