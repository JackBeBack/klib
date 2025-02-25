package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Refresh: ImageVector
    get() {
        if (_Refresh != null) {
            return _Refresh!!
        }
        _Refresh = ImageVector.Builder(
            name = "Refresh",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(4.522f, 7f)
                horizontalLineTo(7f)
                curveTo(7.552f, 7f, 8f, 7.448f, 8f, 8f)
                curveTo(8f, 8.552f, 7.552f, 9f, 7f, 9f)
                horizontalLineTo(3f)
                curveTo(1.895f, 9f, 1f, 8.105f, 1f, 7f)
                verticalLineTo(3f)
                curveTo(1f, 2.448f, 1.448f, 2f, 2f, 2f)
                curveTo(2.552f, 2f, 3f, 2.448f, 3f, 3f)
                verticalLineTo(5.675f)
                curveTo(4.142f, 4.05f, 5.709f, 2.757f, 7.54f, 1.945f)
                curveTo(9.787f, 0.948f, 12.304f, 0.733f, 14.689f, 1.334f)
                curveTo(17.073f, 1.935f, 19.187f, 3.317f, 20.693f, 5.26f)
                curveTo(21.995f, 6.939f, 22.778f, 8.953f, 22.959f, 11.055f)
                curveTo(23.007f, 11.605f, 22.548f, 12.052f, 21.995f, 12.049f)
                curveTo(21.443f, 12.046f, 20.999f, 11.595f, 20.94f, 11.046f)
                curveTo(20.764f, 9.393f, 20.132f, 7.815f, 19.106f, 6.491f)
                curveTo(17.874f, 4.903f, 16.146f, 3.773f, 14.198f, 3.282f)
                curveTo(12.249f, 2.79f, 10.191f, 2.966f, 8.354f, 3.781f)
                curveTo(6.823f, 4.46f, 5.519f, 5.551f, 4.58f, 6.922f)
                curveTo(4.562f, 6.949f, 4.542f, 6.975f, 4.522f, 7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(21f, 18.325f)
                curveTo(19.858f, 19.95f, 18.291f, 21.243f, 16.46f, 22.055f)
                curveTo(14.213f, 23.052f, 11.696f, 23.267f, 9.312f, 22.666f)
                curveTo(6.927f, 22.065f, 4.813f, 20.683f, 3.307f, 18.74f)
                curveTo(2.005f, 17.061f, 1.222f, 15.047f, 1.041f, 12.945f)
                curveTo(0.993f, 12.395f, 1.452f, 11.948f, 2.005f, 11.951f)
                curveTo(2.557f, 11.954f, 3.001f, 12.405f, 3.06f, 12.954f)
                curveTo(3.236f, 14.607f, 3.868f, 16.185f, 4.894f, 17.509f)
                curveTo(6.126f, 19.097f, 7.854f, 20.227f, 9.803f, 20.718f)
                curveTo(11.751f, 21.21f, 13.809f, 21.034f, 15.646f, 20.219f)
                curveTo(17.177f, 19.54f, 18.482f, 18.449f, 19.42f, 17.078f)
                curveTo(19.438f, 17.051f, 19.458f, 17.025f, 19.478f, 17f)
                horizontalLineTo(17f)
                curveTo(16.448f, 17f, 16f, 16.552f, 16f, 16f)
                curveTo(16f, 15.448f, 16.448f, 15f, 17f, 15f)
                horizontalLineTo(21f)
                curveTo(22.105f, 15f, 23f, 15.895f, 23f, 17f)
                verticalLineTo(21f)
                curveTo(23f, 21.552f, 22.552f, 22f, 22f, 22f)
                curveTo(21.448f, 22f, 21f, 21.552f, 21f, 21f)
                verticalLineTo(18.325f)
                close()
            }
        }.build()

        return _Refresh!!
    }

@Suppress("ObjectPropertyName")
private var _Refresh: ImageVector? = null
