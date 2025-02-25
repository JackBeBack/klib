package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.EyeOff: ImageVector
    get() {
        if (_EyeOff != null) {
            return _EyeOff!!
        }
        _EyeOff = ImageVector.Builder(
            name = "EyeOff",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(4.496f, 7.441f)
                curveTo(3.547f, 8.118f, 2.778f, 8.842f, 2.189f, 9.48f)
                curveTo(0.857f, 10.922f, 0.857f, 13.078f, 2.189f, 14.52f)
                curveTo(3.917f, 16.391f, 7.189f, 19f, 12f, 19f)
                curveTo(13.296f, 19f, 14.48f, 18.811f, 15.552f, 18.498f)
                lineTo(13.889f, 16.835f)
                curveTo(13.294f, 16.941f, 12.664f, 17f, 12f, 17f)
                curveTo(7.967f, 17f, 5.188f, 14.82f, 3.659f, 13.163f)
                curveTo(3.034f, 12.487f, 3.034f, 11.513f, 3.659f, 10.837f)
                curveTo(4.238f, 10.21f, 4.995f, 9.508f, 5.932f, 8.878f)
                lineTo(4.496f, 7.441f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(8.533f, 11.478f)
                curveTo(8.508f, 11.649f, 8.494f, 11.823f, 8.494f, 12f)
                curveTo(8.494f, 13.933f, 10.061f, 15.5f, 11.994f, 15.5f)
                curveTo(12.172f, 15.5f, 12.346f, 15.487f, 12.516f, 15.461f)
                lineTo(8.533f, 11.478f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(15.466f, 12.447f)
                lineTo(11.547f, 8.528f)
                curveTo(11.694f, 8.51f, 11.843f, 8.5f, 11.994f, 8.5f)
                curveTo(13.927f, 8.5f, 15.494f, 10.067f, 15.494f, 12f)
                curveTo(15.494f, 12.151f, 15.485f, 12.301f, 15.466f, 12.447f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(18.112f, 15.093f)
                curveTo(19.028f, 14.47f, 19.771f, 13.781f, 20.341f, 13.163f)
                curveTo(20.966f, 12.487f, 20.966f, 11.513f, 20.341f, 10.837f)
                curveTo(18.812f, 9.18f, 16.033f, 7f, 12f, 7f)
                curveTo(11.359f, 7f, 10.75f, 7.055f, 10.173f, 7.154f)
                lineTo(8.505f, 5.486f)
                curveTo(9.562f, 5.183f, 10.727f, 5f, 12f, 5f)
                curveTo(16.811f, 5f, 20.083f, 7.609f, 21.811f, 9.48f)
                curveTo(23.143f, 10.922f, 23.143f, 13.078f, 21.811f, 14.52f)
                curveTo(21.23f, 15.149f, 20.476f, 15.86f, 19.547f, 16.528f)
                lineTo(18.112f, 15.093f)
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

        return _EyeOff!!
    }

@Suppress("ObjectPropertyName")
private var _EyeOff: ImageVector? = null
