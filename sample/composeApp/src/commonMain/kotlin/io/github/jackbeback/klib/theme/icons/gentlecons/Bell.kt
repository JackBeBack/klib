package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Bell: ImageVector
    get() {
        if (_Bell != null) {
            return _Bell!!
        }
        _Bell = ImageVector.Builder(
            name = "Bell",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.5f, 1f)
                curveTo(10.948f, 1f, 10.5f, 1.448f, 10.5f, 2f)
                verticalLineTo(3f)
                horizontalLineTo(10f)
                curveTo(7.239f, 3f, 5f, 5.238f, 5f, 8f)
                verticalLineTo(11f)
                curveTo(5f, 11.738f, 4.767f, 12.572f, 4.397f, 13.415f)
                curveTo(4.032f, 14.248f, 3.559f, 15.029f, 3.141f, 15.644f)
                curveTo(2.382f, 16.762f, 2.852f, 18.53f, 4.406f, 18.81f)
                curveTo(5.421f, 18.993f, 6.857f, 19.212f, 8.547f, 19.353f)
                curveTo(8.545f, 19.402f, 8.544f, 19.451f, 8.544f, 19.5f)
                curveTo(8.544f, 21.433f, 10.111f, 23f, 12.043f, 23f)
                curveTo(13.976f, 23f, 15.543f, 21.433f, 15.543f, 19.5f)
                curveTo(15.543f, 19.448f, 15.542f, 19.397f, 15.54f, 19.345f)
                curveTo(17.192f, 19.204f, 18.596f, 18.99f, 19.594f, 18.81f)
                curveTo(21.148f, 18.53f, 21.618f, 16.762f, 20.859f, 15.644f)
                curveTo(20.441f, 15.029f, 19.968f, 14.248f, 19.603f, 13.415f)
                curveTo(19.233f, 12.572f, 19f, 11.738f, 19f, 11f)
                verticalLineTo(8f)
                curveTo(19f, 5.238f, 16.761f, 3f, 14f, 3f)
                horizontalLineTo(13.5f)
                verticalLineTo(2f)
                curveTo(13.5f, 1.448f, 13.052f, 1f, 12.5f, 1f)
                horizontalLineTo(11.5f)
                close()
                moveTo(12f, 19.5f)
                curveTo(12.511f, 19.5f, 13.012f, 19.49f, 13.5f, 19.472f)
                curveTo(13.508f, 20.276f, 12.854f, 20.956f, 12.043f, 20.956f)
                curveTo(11.235f, 20.956f, 10.58f, 20.278f, 10.587f, 19.475f)
                curveTo(11.047f, 19.491f, 11.519f, 19.5f, 12f, 19.5f)
                close()
                moveTo(10f, 5f)
                curveTo(8.343f, 5f, 7f, 6.343f, 7f, 8f)
                verticalLineTo(11f)
                curveTo(7f, 12.123f, 6.655f, 13.246f, 6.229f, 14.219f)
                curveTo(5.798f, 15.2f, 5.255f, 16.091f, 4.796f, 16.767f)
                curveTo(4.786f, 16.782f, 4.781f, 16.797f, 4.779f, 16.811f)
                curveTo(4.778f, 16.824f, 4.779f, 16.836f, 4.782f, 16.846f)
                curveTo(6.364f, 17.13f, 9f, 17.5f, 12f, 17.5f)
                curveTo(15f, 17.5f, 17.636f, 17.13f, 19.218f, 16.846f)
                curveTo(19.221f, 16.836f, 19.222f, 16.824f, 19.221f, 16.811f)
                curveTo(19.219f, 16.797f, 19.214f, 16.782f, 19.204f, 16.767f)
                curveTo(18.745f, 16.091f, 18.202f, 15.2f, 17.771f, 14.219f)
                curveTo(17.344f, 13.246f, 17f, 12.123f, 17f, 11f)
                verticalLineTo(8f)
                curveTo(17f, 6.343f, 15.657f, 5f, 14f, 5f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _Bell!!
    }

@Suppress("ObjectPropertyName")
private var _Bell: ImageVector? = null
