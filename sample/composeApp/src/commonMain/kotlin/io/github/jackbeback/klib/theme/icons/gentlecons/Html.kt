package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Html: ImageVector
    get() {
        if (_Html != null) {
            return _Html!!
        }
        _Html = ImageVector.Builder(
            name = "Html",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(8f, 5f)
                curveTo(7.692f, 5f, 7.401f, 5.142f, 7.212f, 5.385f)
                curveTo(7.022f, 5.627f, 6.955f, 5.944f, 7.03f, 6.243f)
                lineTo(8.03f, 10.243f)
                curveTo(8.141f, 10.688f, 8.541f, 11f, 9f, 11f)
                horizontalLineTo(13.8f)
                curveTo(13.91f, 11f, 14f, 11.09f, 14f, 11.2f)
                verticalLineTo(13.503f)
                curveTo(14f, 13.556f, 13.979f, 13.607f, 13.941f, 13.644f)
                lineTo(12.141f, 15.444f)
                curveTo(12.063f, 15.523f, 11.937f, 15.523f, 11.859f, 15.444f)
                lineTo(9.707f, 13.293f)
                curveTo(9.317f, 12.902f, 8.683f, 12.902f, 8.293f, 13.293f)
                curveTo(7.902f, 13.683f, 7.902f, 14.317f, 8.293f, 14.707f)
                lineTo(11.293f, 17.707f)
                curveTo(11.683f, 18.098f, 12.317f, 18.098f, 12.707f, 17.707f)
                lineTo(15.707f, 14.707f)
                curveTo(15.895f, 14.52f, 16f, 14.265f, 16f, 14f)
                verticalLineTo(10f)
                curveTo(16f, 9.448f, 15.552f, 9f, 15f, 9f)
                horizontalLineTo(9.937f)
                curveTo(9.845f, 9f, 9.765f, 8.938f, 9.743f, 8.849f)
                lineTo(9.343f, 7.249f)
                curveTo(9.311f, 7.122f, 9.407f, 7f, 9.537f, 7f)
                horizontalLineTo(16f)
                curveTo(16.552f, 7f, 17f, 6.552f, 17f, 6f)
                curveTo(17f, 5.448f, 16.552f, 5f, 16f, 5f)
                horizontalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.306f, 1f)
                curveTo(2.48f, 1f, 1.078f, 2.617f, 1.336f, 4.424f)
                lineTo(2.905f, 15.407f)
                curveTo(3.007f, 16.118f, 3.359f, 16.768f, 3.9f, 17.241f)
                lineTo(10.024f, 22.6f)
                curveTo(11.156f, 23.59f, 12.844f, 23.59f, 13.976f, 22.6f)
                lineTo(20.101f, 17.241f)
                curveTo(20.64f, 16.768f, 20.993f, 16.118f, 21.095f, 15.407f)
                lineTo(22.664f, 4.424f)
                curveTo(22.922f, 2.617f, 21.52f, 1f, 19.694f, 1f)
                horizontalLineTo(4.306f)
                close()
                moveTo(3.316f, 4.141f)
                curveTo(3.23f, 3.539f, 3.697f, 3f, 4.306f, 3f)
                horizontalLineTo(19.694f)
                curveTo(20.302f, 3f, 20.77f, 3.539f, 20.684f, 4.141f)
                lineTo(19.115f, 15.125f)
                curveTo(19.081f, 15.361f, 18.963f, 15.578f, 18.784f, 15.736f)
                lineTo(12.658f, 21.095f)
                curveTo(12.281f, 21.425f, 11.719f, 21.425f, 11.342f, 21.095f)
                lineTo(5.217f, 15.736f)
                curveTo(5.036f, 15.578f, 4.919f, 15.361f, 4.885f, 15.125f)
                lineTo(3.316f, 4.141f)
                close()
            }
        }.build()

        return _Html!!
    }

@Suppress("ObjectPropertyName")
private var _Html: ImageVector? = null
