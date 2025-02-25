package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Bullhorn: ImageVector
    get() {
        if (_Bullhorn != null) {
            return _Bullhorn!!
        }
        _Bullhorn = ImageVector.Builder(
            name = "Bullhorn",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22.549f, 4.339f)
                curveTo(22.236f, 2.047f, 19.675f, 1.313f, 18.001f, 2.512f)
                curveTo(16.676f, 3.461f, 14.97f, 4.602f, 13.29f, 5.502f)
                curveTo(11.562f, 6.426f, 10.031f, 7f, 9f, 7f)
                horizontalLineTo(4f)
                curveTo(2.343f, 7f, 1f, 8.343f, 1f, 10f)
                verticalLineTo(13f)
                curveTo(1f, 14.583f, 2.227f, 15.88f, 3.782f, 15.992f)
                lineTo(3.376f, 18.019f)
                curveTo(3.073f, 19.537f, 3.974f, 21.036f, 5.456f, 21.481f)
                lineTo(6.669f, 21.845f)
                curveTo(8.329f, 22.343f, 10.064f, 21.335f, 10.454f, 19.646f)
                lineTo(11.177f, 16.511f)
                curveTo(11.828f, 16.762f, 12.54f, 17.097f, 13.29f, 17.498f)
                curveTo(14.97f, 18.398f, 16.676f, 19.539f, 18.001f, 20.488f)
                curveTo(19.675f, 21.687f, 22.236f, 20.953f, 22.549f, 18.661f)
                curveTo(22.784f, 16.946f, 23f, 14.542f, 23f, 11.5f)
                curveTo(23f, 8.458f, 22.784f, 6.054f, 22.549f, 4.339f)
                close()
                moveTo(19.166f, 4.138f)
                curveTo(19.479f, 3.913f, 19.825f, 3.893f, 20.086f, 3.99f)
                curveTo(20.334f, 4.082f, 20.523f, 4.284f, 20.568f, 4.61f)
                curveTo(20.791f, 6.24f, 21f, 8.552f, 21f, 11.5f)
                curveTo(21f, 14.448f, 20.791f, 16.76f, 20.568f, 18.39f)
                curveTo(20.523f, 18.716f, 20.334f, 18.917f, 20.086f, 19.01f)
                curveTo(19.825f, 19.107f, 19.479f, 19.087f, 19.166f, 18.862f)
                curveTo(17.807f, 17.889f, 16.023f, 16.692f, 14.233f, 15.735f)
                curveTo(12.491f, 14.803f, 10.572f, 14f, 9f, 14f)
                horizontalLineTo(4f)
                curveTo(3.448f, 14f, 3f, 13.552f, 3f, 13f)
                verticalLineTo(10f)
                curveTo(3f, 9.448f, 3.448f, 9f, 4f, 9f)
                horizontalLineTo(9f)
                curveTo(10.572f, 9f, 12.491f, 8.197f, 14.233f, 7.265f)
                curveTo(16.023f, 6.308f, 17.807f, 5.111f, 19.166f, 4.138f)
                close()
                moveTo(9.241f, 16.01f)
                curveTo(9.158f, 16.003f, 9.077f, 16f, 9f, 16f)
                horizontalLineTo(5.82f)
                lineTo(5.338f, 18.411f)
                curveTo(5.236f, 18.917f, 5.537f, 19.417f, 6.031f, 19.565f)
                lineTo(7.244f, 19.929f)
                curveTo(7.797f, 20.095f, 8.375f, 19.759f, 8.505f, 19.196f)
                lineTo(9.241f, 16.01f)
                close()
            }
        }.build()

        return _Bullhorn!!
    }

@Suppress("ObjectPropertyName")
private var _Bullhorn: ImageVector? = null
