package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Rate: ImageVector
    get() {
        if (_Rate != null) {
            return _Rate!!
        }
        _Rate = ImageVector.Builder(
            name = "Rate",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.64f, 12.337f)
                lineTo(5.64f, 15.645f)
                curveTo(5.397f, 16.45f, 4.655f, 17f, 3.814f, 17f)
                curveTo(3.365f, 17f, 3f, 17.365f, 3f, 17.814f)
                verticalLineTo(20f)
                curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
                horizontalLineTo(10.056f)
                curveTo(10.524f, 21f, 10.93f, 20.675f, 11.032f, 20.218f)
                lineTo(11.479f, 18.218f)
                curveTo(11.619f, 17.593f, 11.144f, 17f, 10.503f, 17f)
                horizontalLineTo(9.452f)
                curveTo(8.15f, 17f, 7.196f, 15.776f, 7.512f, 14.514f)
                curveTo(7.725f, 13.661f, 7.356f, 12.789f, 6.64f, 12.337f)
                close()
                moveTo(4.892f, 11.21f)
                curveTo(5.139f, 10.393f, 6.017f, 9.947f, 6.823f, 10.228f)
                lineTo(6.892f, 10.252f)
                curveTo(8.844f, 10.935f, 9.954f, 12.994f, 9.452f, 15f)
                lineTo(10.503f, 15f)
                curveTo(12.424f, 15f, 13.85f, 16.78f, 13.431f, 18.655f)
                lineTo(12.984f, 20.655f)
                curveTo(12.678f, 22.025f, 11.461f, 23f, 10.056f, 23f)
                horizontalLineTo(4f)
                curveTo(2.343f, 23f, 1f, 21.657f, 1f, 20f)
                verticalLineTo(17.814f)
                curveTo(1f, 16.283f, 2.223f, 15.038f, 3.745f, 15.001f)
                lineTo(4.892f, 11.21f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.36f, 11.663f)
                lineTo(18.36f, 8.355f)
                curveTo(18.603f, 7.55f, 19.345f, 7f, 20.186f, 7f)
                curveTo(20.635f, 7f, 21f, 6.635f, 21f, 6.186f)
                verticalLineTo(4f)
                curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
                lineTo(13.944f, 3f)
                curveTo(13.476f, 3f, 13.07f, 3.325f, 12.968f, 3.782f)
                lineTo(12.521f, 5.782f)
                curveTo(12.381f, 6.407f, 12.856f, 7f, 13.497f, 7f)
                horizontalLineTo(14.548f)
                curveTo(15.85f, 7f, 16.804f, 8.224f, 16.488f, 9.486f)
                curveTo(16.275f, 10.339f, 16.645f, 11.211f, 17.36f, 11.663f)
                close()
                moveTo(19.108f, 12.79f)
                curveTo(18.861f, 13.607f, 17.983f, 14.054f, 17.177f, 13.772f)
                lineTo(17.108f, 13.748f)
                curveTo(15.156f, 13.065f, 14.046f, 11.006f, 14.548f, 9f)
                lineTo(13.497f, 9f)
                curveTo(11.576f, 9f, 10.15f, 7.22f, 10.569f, 5.345f)
                lineTo(11.016f, 3.345f)
                curveTo(11.322f, 1.975f, 12.539f, 1f, 13.944f, 1f)
                lineTo(20f, 1f)
                curveTo(21.657f, 1f, 23f, 2.343f, 23f, 4f)
                verticalLineTo(6.186f)
                curveTo(23f, 7.717f, 21.777f, 8.962f, 20.255f, 8.999f)
                lineTo(19.108f, 12.79f)
                close()
            }
        }.build()

        return _Rate!!
    }

@Suppress("ObjectPropertyName")
private var _Rate: ImageVector? = null
