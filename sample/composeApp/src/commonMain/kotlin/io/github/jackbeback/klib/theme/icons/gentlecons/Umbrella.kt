package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Umbrella: ImageVector
    get() {
        if (_Umbrella != null) {
            return _Umbrella!!
        }
        _Umbrella = ImageVector.Builder(
            name = "Umbrella",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 1f)
                curveTo(11f, 0.448f, 11.448f, 0f, 12f, 0f)
                curveTo(12.552f, 0f, 13f, 0.448f, 13f, 1f)
                verticalLineTo(2f)
                curveTo(13f, 2.01f, 13f, 2.02f, 13f, 2.03f)
                curveTo(16.176f, 2.221f, 18.4f, 3.325f, 19.931f, 4.799f)
                curveTo(21.594f, 6.402f, 22.349f, 8.357f, 22.695f, 9.791f)
                curveTo(23.139f, 11.633f, 21.601f, 13f, 20f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                curveTo(13f, 21.92f, 12.62f, 22.671f, 12.015f, 23.174f)
                curveTo(11.434f, 23.659f, 10.696f, 23.875f, 10f, 23.875f)
                curveTo(9.304f, 23.875f, 8.566f, 23.659f, 7.985f, 23.174f)
                curveTo(7.38f, 22.671f, 7f, 21.92f, 7f, 21f)
                curveTo(7f, 20.448f, 7.448f, 20f, 8f, 20f)
                curveTo(8.552f, 20f, 9f, 20.448f, 9f, 21f)
                curveTo(9f, 21.33f, 9.12f, 21.517f, 9.265f, 21.638f)
                curveTo(9.434f, 21.778f, 9.696f, 21.875f, 10f, 21.875f)
                curveTo(10.304f, 21.875f, 10.566f, 21.778f, 10.735f, 21.638f)
                curveTo(10.88f, 21.517f, 11f, 21.33f, 11f, 21f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                curveTo(2.399f, 13f, 0.861f, 11.633f, 1.305f, 9.791f)
                curveTo(1.651f, 8.357f, 2.406f, 6.402f, 4.069f, 4.799f)
                curveTo(5.6f, 3.325f, 7.824f, 2.221f, 11f, 2.03f)
                curveTo(11f, 2.02f, 11f, 2.01f, 11f, 2f)
                verticalLineTo(1f)
                close()
                moveTo(5.457f, 6.239f)
                curveTo(4.162f, 7.488f, 3.542f, 9.045f, 3.249f, 10.26f)
                curveTo(3.202f, 10.458f, 3.253f, 10.616f, 3.369f, 10.745f)
                curveTo(3.496f, 10.885f, 3.717f, 11f, 4f, 11f)
                horizontalLineTo(7.047f)
                curveTo(7.269f, 8.655f, 8.227f, 6.597f, 9.148f, 5.101f)
                curveTo(9.352f, 4.769f, 9.557f, 4.462f, 9.753f, 4.183f)
                curveTo(7.769f, 4.528f, 6.407f, 5.324f, 5.457f, 6.239f)
                close()
                moveTo(14.941f, 11f)
                curveTo(14.727f, 9.148f, 13.955f, 7.461f, 13.148f, 6.149f)
                curveTo(12.74f, 5.485f, 12.331f, 4.932f, 12f, 4.519f)
                curveTo(11.669f, 4.932f, 11.26f, 5.485f, 10.852f, 6.149f)
                curveTo(10.045f, 7.461f, 9.273f, 9.148f, 9.058f, 11f)
                horizontalLineTo(14.941f)
                close()
                moveTo(14.247f, 4.183f)
                curveTo(16.231f, 4.528f, 17.593f, 5.324f, 18.543f, 6.239f)
                curveTo(19.838f, 7.488f, 20.458f, 9.045f, 20.751f, 10.26f)
                curveTo(20.798f, 10.458f, 20.747f, 10.616f, 20.631f, 10.745f)
                curveTo(20.504f, 10.885f, 20.283f, 11f, 20f, 11f)
                horizontalLineTo(16.952f)
                curveTo(16.731f, 8.655f, 15.773f, 6.597f, 14.852f, 5.101f)
                curveTo(14.648f, 4.769f, 14.443f, 4.462f, 14.247f, 4.183f)
                close()
            }
        }.build()

        return _Umbrella!!
    }

@Suppress("ObjectPropertyName")
private var _Umbrella: ImageVector? = null
