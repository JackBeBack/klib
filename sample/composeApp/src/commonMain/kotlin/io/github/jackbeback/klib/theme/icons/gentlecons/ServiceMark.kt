package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ServiceMark: ImageVector
    get() {
        if (_ServiceMark != null) {
            return _ServiceMark!!
        }
        _ServiceMark = ImageVector.Builder(
            name = "ServiceMark",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(12.66f, 8.06f)
                curveTo(13.055f, 7.916f, 13.499f, 8.036f, 13.768f, 8.36f)
                lineTo(15.5f, 10.438f)
                lineTo(17.232f, 8.36f)
                curveTo(17.501f, 8.036f, 17.945f, 7.916f, 18.34f, 8.06f)
                curveTo(18.736f, 8.203f, 19f, 8.579f, 19f, 9f)
                verticalLineTo(15f)
                curveTo(19f, 15.552f, 18.552f, 16f, 18f, 16f)
                curveTo(17.448f, 16f, 17f, 15.552f, 17f, 15f)
                verticalLineTo(11.762f)
                lineTo(16.268f, 12.64f)
                curveTo(16.078f, 12.868f, 15.797f, 13f, 15.5f, 13f)
                curveTo(15.203f, 13f, 14.922f, 12.868f, 14.732f, 12.64f)
                lineTo(14f, 11.762f)
                verticalLineTo(15f)
                curveTo(14f, 15.552f, 13.552f, 16f, 13f, 16f)
                curveTo(12.448f, 16f, 12f, 15.552f, 12f, 15f)
                verticalLineTo(9f)
                curveTo(12f, 8.579f, 12.264f, 8.203f, 12.66f, 8.06f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7.5f, 8f)
                curveTo(6.729f, 8f, 6.077f, 8.299f, 5.628f, 8.804f)
                curveTo(5.195f, 9.291f, 5f, 9.912f, 5f, 10.5f)
                curveTo(5f, 11.088f, 5.195f, 11.709f, 5.628f, 12.196f)
                curveTo(6.077f, 12.701f, 6.729f, 13f, 7.5f, 13f)
                horizontalLineTo(8.5f)
                curveTo(8.729f, 13f, 8.827f, 13.076f, 8.878f, 13.133f)
                curveTo(8.945f, 13.209f, 9f, 13.338f, 9f, 13.5f)
                curveTo(9f, 13.662f, 8.945f, 13.791f, 8.878f, 13.867f)
                curveTo(8.827f, 13.924f, 8.729f, 14f, 8.5f, 14f)
                horizontalLineTo(6f)
                curveTo(5.448f, 14f, 5f, 14.448f, 5f, 15f)
                curveTo(5f, 15.552f, 5.448f, 16f, 6f, 16f)
                horizontalLineTo(8.5f)
                curveTo(9.271f, 16f, 9.923f, 15.701f, 10.372f, 15.196f)
                curveTo(10.805f, 14.709f, 11f, 14.088f, 11f, 13.5f)
                curveTo(11f, 12.912f, 10.805f, 12.291f, 10.372f, 11.804f)
                curveTo(9.923f, 11.299f, 9.271f, 11f, 8.5f, 11f)
                horizontalLineTo(7.5f)
                curveTo(7.271f, 11f, 7.173f, 10.924f, 7.122f, 10.867f)
                curveTo(7.055f, 10.791f, 7f, 10.662f, 7f, 10.5f)
                curveTo(7f, 10.338f, 7.055f, 10.209f, 7.122f, 10.133f)
                curveTo(7.173f, 10.076f, 7.271f, 10f, 7.5f, 10f)
                horizontalLineTo(10f)
                curveTo(10.552f, 10f, 11f, 9.552f, 11f, 9f)
                curveTo(11f, 8.448f, 10.552f, 8f, 10f, 8f)
                horizontalLineTo(7.5f)
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

        return _ServiceMark!!
    }

@Suppress("ObjectPropertyName")
private var _ServiceMark: ImageVector? = null
