package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Glasses: ImageVector
    get() {
        if (_Glasses != null) {
            return _Glasses!!
        }
        _Glasses = ImageVector.Builder(
            name = "Glasses",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.442f, 5f)
                curveTo(5.008f, 5f, 4.636f, 5.274f, 4.508f, 5.673f)
                curveTo(4.12f, 6.89f, 3.541f, 8.753f, 3.036f, 10.582f)
                curveTo(3.777f, 10.21f, 4.614f, 10f, 5.5f, 10f)
                curveTo(8.08f, 10f, 10.245f, 11.777f, 10.839f, 14.174f)
                curveTo(11.174f, 14.067f, 11.56f, 14f, 12f, 14f)
                curveTo(12.44f, 14f, 12.826f, 14.067f, 13.161f, 14.174f)
                curveTo(13.755f, 11.777f, 15.92f, 10f, 18.5f, 10f)
                curveTo(19.386f, 10f, 20.223f, 10.21f, 20.965f, 10.582f)
                curveTo(20.459f, 8.753f, 19.88f, 6.89f, 19.492f, 5.673f)
                curveTo(19.364f, 5.274f, 18.992f, 5f, 18.559f, 5f)
                horizontalLineTo(17f)
                curveTo(16.448f, 5f, 16f, 4.553f, 16f, 4f)
                curveTo(16f, 3.448f, 16.448f, 3f, 17f, 3f)
                horizontalLineTo(18.559f)
                curveTo(19.847f, 3f, 21f, 3.823f, 21.397f, 5.065f)
                curveTo(21.816f, 6.378f, 22.46f, 8.454f, 23f, 10.444f)
                curveTo(23.27f, 11.438f, 23.517f, 12.421f, 23.697f, 13.282f)
                curveTo(23.804f, 13.794f, 23.893f, 14.289f, 23.947f, 14.73f)
                curveTo(23.982f, 14.982f, 24f, 15.239f, 24f, 15.5f)
                curveTo(24f, 18.538f, 21.538f, 21f, 18.5f, 21f)
                curveTo(15.774f, 21f, 13.512f, 19.017f, 13.076f, 16.415f)
                curveTo(12.817f, 16.104f, 12.389f, 16f, 12f, 16f)
                curveTo(11.611f, 16f, 11.183f, 16.104f, 10.924f, 16.415f)
                curveTo(10.488f, 19.017f, 8.226f, 21f, 5.5f, 21f)
                curveTo(2.462f, 21f, 0f, 18.538f, 0f, 15.5f)
                curveTo(0f, 15.239f, 0.018f, 14.982f, 0.053f, 14.73f)
                curveTo(0.107f, 14.289f, 0.196f, 13.794f, 0.303f, 13.282f)
                curveTo(0.483f, 12.421f, 0.73f, 11.438f, 1f, 10.444f)
                curveTo(1.54f, 8.454f, 2.184f, 6.378f, 2.603f, 5.065f)
                curveTo(2.999f, 3.823f, 4.153f, 3f, 5.442f, 3f)
                horizontalLineTo(7f)
                curveTo(7.552f, 3f, 8f, 3.448f, 8f, 4f)
                curveTo(8f, 4.553f, 7.552f, 5f, 7f, 5f)
                horizontalLineTo(5.442f)
                close()
                moveTo(2.01f, 15.5f)
                curveTo(2.01f, 17.428f, 3.572f, 18.99f, 5.5f, 18.99f)
                curveTo(7.428f, 18.99f, 8.99f, 17.428f, 8.99f, 15.5f)
                curveTo(8.99f, 13.573f, 7.428f, 12.01f, 5.5f, 12.01f)
                curveTo(3.572f, 12.01f, 2.01f, 13.573f, 2.01f, 15.5f)
                close()
                moveTo(15.01f, 15.5f)
                curveTo(15.01f, 17.428f, 16.573f, 18.99f, 18.5f, 18.99f)
                curveTo(20.427f, 18.99f, 21.99f, 17.428f, 21.99f, 15.5f)
                curveTo(21.99f, 13.573f, 20.427f, 12.01f, 18.5f, 12.01f)
                curveTo(16.573f, 12.01f, 15.01f, 13.573f, 15.01f, 15.5f)
                close()
            }
        }.build()

        return _Glasses!!
    }

@Suppress("ObjectPropertyName")
private var _Glasses: ImageVector? = null
