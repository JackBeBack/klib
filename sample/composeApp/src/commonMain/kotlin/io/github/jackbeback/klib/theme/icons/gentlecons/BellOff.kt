package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.BellOff: ImageVector
    get() {
        if (_BellOff != null) {
            return _BellOff!!
        }
        _BellOff = ImageVector.Builder(
            name = "BellOff",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(10.5f, 2f)
                curveTo(10.5f, 1.448f, 10.948f, 1f, 11.5f, 1f)
                horizontalLineTo(12.5f)
                curveTo(13.052f, 1f, 13.5f, 1.448f, 13.5f, 2f)
                verticalLineTo(3f)
                horizontalLineTo(14f)
                curveTo(16.761f, 3f, 19f, 5.238f, 19f, 8f)
                verticalLineTo(11f)
                curveTo(19f, 11.738f, 19.233f, 12.572f, 19.603f, 13.415f)
                curveTo(19.968f, 14.248f, 20.441f, 15.029f, 20.859f, 15.644f)
                curveTo(21.316f, 16.318f, 21.327f, 17.227f, 20.924f, 17.905f)
                lineTo(18.288f, 15.269f)
                curveTo(18.107f, 14.935f, 17.931f, 14.583f, 17.771f, 14.219f)
                curveTo(17.344f, 13.246f, 17f, 12.123f, 17f, 11f)
                verticalLineTo(8f)
                curveTo(17f, 6.343f, 15.657f, 5f, 14f, 5f)
                horizontalLineTo(10f)
                curveTo(9.433f, 5f, 8.902f, 5.157f, 8.45f, 5.431f)
                lineTo(7.011f, 3.992f)
                curveTo(7.844f, 3.369f, 8.879f, 3f, 10f, 3f)
                horizontalLineTo(10.5f)
                verticalLineTo(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 7.946f)
                curveTo(5f, 7.964f, 5f, 7.982f, 5f, 8f)
                verticalLineTo(11f)
                curveTo(5f, 11.738f, 4.767f, 12.572f, 4.397f, 13.415f)
                curveTo(4.032f, 14.248f, 3.559f, 15.029f, 3.141f, 15.644f)
                curveTo(2.382f, 16.762f, 2.852f, 18.53f, 4.406f, 18.81f)
                curveTo(5.421f, 18.993f, 6.857f, 19.212f, 8.547f, 19.353f)
                curveTo(8.545f, 19.402f, 8.544f, 19.451f, 8.544f, 19.5f)
                curveTo(8.544f, 21.433f, 10.111f, 23f, 12.043f, 23f)
                curveTo(13.976f, 23f, 15.543f, 21.433f, 15.543f, 19.5f)
                curveTo(15.543f, 19.448f, 15.542f, 19.397f, 15.54f, 19.345f)
                curveTo(15.809f, 19.322f, 16.071f, 19.298f, 16.326f, 19.271f)
                lineTo(14.474f, 17.42f)
                curveTo(13.69f, 17.47f, 12.86f, 17.5f, 12f, 17.5f)
                curveTo(9f, 17.5f, 6.364f, 17.13f, 4.782f, 16.846f)
                curveTo(4.779f, 16.836f, 4.778f, 16.824f, 4.779f, 16.811f)
                curveTo(4.781f, 16.797f, 4.786f, 16.782f, 4.796f, 16.767f)
                curveTo(5.255f, 16.091f, 5.798f, 15.2f, 6.229f, 14.219f)
                curveTo(6.655f, 13.246f, 7f, 12.123f, 7f, 11f)
                verticalLineTo(9.945f)
                lineTo(5f, 7.946f)
                close()
                moveTo(13.5f, 19.472f)
                curveTo(13.012f, 19.49f, 12.511f, 19.5f, 12f, 19.5f)
                curveTo(11.519f, 19.5f, 11.047f, 19.491f, 10.587f, 19.475f)
                curveTo(10.58f, 20.278f, 11.235f, 20.956f, 12.043f, 20.956f)
                curveTo(12.854f, 20.956f, 13.508f, 20.276f, 13.5f, 19.472f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(2.008f, 3.422f)
                curveTo(1.617f, 3.032f, 1.617f, 2.398f, 2.008f, 2.008f)
                curveTo(2.398f, 1.617f, 3.032f, 1.617f, 3.422f, 2.008f)
                lineTo(22f, 20.586f)
                curveTo(22.391f, 20.977f, 22.391f, 21.61f, 22f, 22f)
                curveTo(21.61f, 22.391f, 20.977f, 22.391f, 20.586f, 22f)
                lineTo(2.008f, 3.422f)
                close()
            }
        }.build()

        return _BellOff!!
    }

@Suppress("ObjectPropertyName")
private var _BellOff: ImageVector? = null
