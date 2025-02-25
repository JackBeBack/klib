package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Js: ImageVector
    get() {
        if (_Js != null) {
            return _Js!!
        }
        _Js = ImageVector.Builder(
            name = "Js",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(13f, 6f)
                curveTo(13f, 5.448f, 13.448f, 5f, 14f, 5f)
                horizontalLineTo(17f)
                curveTo(17.552f, 5f, 18f, 5.448f, 18f, 6f)
                curveTo(18f, 6.552f, 17.552f, 7f, 17f, 7f)
                horizontalLineTo(15.2f)
                curveTo(15.09f, 7f, 15f, 7.09f, 15f, 7.2f)
                verticalLineTo(8.8f)
                curveTo(15f, 8.91f, 15.09f, 9f, 15.2f, 9f)
                horizontalLineTo(17f)
                curveTo(17.552f, 9f, 18f, 9.448f, 18f, 10f)
                verticalLineTo(13f)
                curveTo(18f, 13.265f, 17.895f, 13.52f, 17.707f, 13.707f)
                lineTo(14.707f, 16.707f)
                curveTo(14.317f, 17.098f, 13.683f, 17.098f, 13.293f, 16.707f)
                curveTo(12.902f, 16.317f, 12.902f, 15.683f, 13.293f, 15.293f)
                lineTo(15.941f, 12.644f)
                curveTo(15.979f, 12.607f, 16f, 12.556f, 16f, 12.503f)
                verticalLineTo(11.2f)
                curveTo(16f, 11.09f, 15.91f, 11f, 15.8f, 11f)
                horizontalLineTo(14f)
                curveTo(13.448f, 11f, 13f, 10.552f, 13f, 10f)
                verticalLineTo(6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11f, 6f)
                curveTo(11f, 5.448f, 10.552f, 5f, 10f, 5f)
                curveTo(9.448f, 5f, 9f, 5.448f, 9f, 6f)
                verticalLineTo(13.103f)
                curveTo(9f, 13.281f, 8.785f, 13.37f, 8.659f, 13.244f)
                lineTo(8.059f, 12.644f)
                curveTo(8.021f, 12.607f, 8f, 12.556f, 8f, 12.503f)
                verticalLineTo(12f)
                curveTo(8f, 11.448f, 7.552f, 11f, 7f, 11f)
                curveTo(6.448f, 11f, 6f, 11.448f, 6f, 12f)
                verticalLineTo(13f)
                curveTo(6f, 13.265f, 6.105f, 13.52f, 6.293f, 13.707f)
                lineTo(9.293f, 16.707f)
                curveTo(9.579f, 16.993f, 10.009f, 17.079f, 10.383f, 16.924f)
                curveTo(10.756f, 16.769f, 11f, 16.404f, 11f, 16f)
                verticalLineTo(6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.336f, 4.424f)
                curveTo(1.078f, 2.617f, 2.48f, 1f, 4.306f, 1f)
                horizontalLineTo(19.694f)
                curveTo(21.52f, 1f, 22.922f, 2.617f, 22.664f, 4.424f)
                lineTo(21.095f, 15.407f)
                curveTo(20.993f, 16.118f, 20.64f, 16.768f, 20.101f, 17.241f)
                lineTo(13.976f, 22.6f)
                curveTo(12.844f, 23.59f, 11.156f, 23.59f, 10.024f, 22.6f)
                lineTo(3.9f, 17.241f)
                curveTo(3.359f, 16.768f, 3.007f, 16.118f, 2.905f, 15.407f)
                lineTo(1.336f, 4.424f)
                close()
                moveTo(4.306f, 3f)
                curveTo(3.697f, 3f, 3.23f, 3.539f, 3.316f, 4.141f)
                lineTo(4.885f, 15.125f)
                curveTo(4.919f, 15.361f, 5.037f, 15.578f, 5.217f, 15.736f)
                lineTo(11.342f, 21.095f)
                curveTo(11.719f, 21.425f, 12.281f, 21.425f, 12.658f, 21.095f)
                lineTo(18.784f, 15.736f)
                curveTo(18.963f, 15.578f, 19.081f, 15.361f, 19.115f, 15.125f)
                lineTo(20.684f, 4.141f)
                curveTo(20.77f, 3.539f, 20.302f, 3f, 19.694f, 3f)
                horizontalLineTo(4.306f)
                close()
            }
        }.build()

        return _Js!!
    }

@Suppress("ObjectPropertyName")
private var _Js: ImageVector? = null
