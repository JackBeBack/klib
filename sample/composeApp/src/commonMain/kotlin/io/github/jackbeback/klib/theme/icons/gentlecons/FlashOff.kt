package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.FlashOff: ImageVector
    get() {
        if (_FlashOff != null) {
            return _FlashOff!!
        }
        _FlashOff = ImageVector.Builder(
            name = "FlashOff",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7.28f, 4.261f)
                lineTo(5.689f, 2.67f)
                curveTo(6.04f, 1.672f, 6.984f, 1f, 8.047f, 1f)
                horizontalLineTo(13.176f)
                curveTo(14.97f, 1f, 16.181f, 2.835f, 15.474f, 4.485f)
                lineTo(13.967f, 8f)
                horizontalLineTo(18.24f)
                curveTo(20.488f, 8f, 21.594f, 10.735f, 19.978f, 12.297f)
                lineTo(17.608f, 14.589f)
                lineTo(16.193f, 13.174f)
                lineTo(18.588f, 10.859f)
                curveTo(18.911f, 10.547f, 18.69f, 10f, 18.24f, 10f)
                horizontalLineTo(13.019f)
                lineTo(11.578f, 8.559f)
                curveTo(11.594f, 8.481f, 11.618f, 8.404f, 11.651f, 8.327f)
                lineTo(13.635f, 3.697f)
                curveTo(13.777f, 3.367f, 13.535f, 3f, 13.176f, 3f)
                horizontalLineTo(8.047f)
                curveTo(7.83f, 3f, 7.637f, 3.141f, 7.571f, 3.348f)
                lineTo(7.28f, 4.261f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(13.161f, 16.106f)
                lineTo(14.575f, 17.52f)
                lineTo(9.431f, 22.493f)
                curveTo(8.253f, 23.631f, 6.364f, 22.329f, 7.009f, 20.824f)
                lineTo(9.934f, 14f)
                horizontalLineTo(5.502f)
                curveTo(3.81f, 14f, 2.606f, 12.354f, 3.119f, 10.742f)
                lineTo(4.248f, 7.194f)
                lineTo(5.841f, 8.786f)
                lineTo(5.025f, 11.348f)
                curveTo(4.923f, 11.671f, 5.163f, 12f, 5.502f, 12f)
                horizontalLineTo(9.055f)
                lineTo(11.793f, 14.739f)
                lineTo(9.826f, 19.33f)
                lineTo(13.161f, 16.106f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(2.008f, 2.008f)
                curveTo(1.617f, 2.398f, 1.617f, 3.032f, 2.008f, 3.422f)
                lineTo(20.586f, 22f)
                curveTo(20.977f, 22.391f, 21.61f, 22.391f, 22f, 22f)
                curveTo(22.391f, 21.61f, 22.391f, 20.977f, 22f, 20.586f)
                lineTo(3.422f, 2.008f)
                curveTo(3.032f, 1.617f, 2.398f, 1.617f, 2.008f, 2.008f)
                close()
            }
        }.build()

        return _FlashOff!!
    }

@Suppress("ObjectPropertyName")
private var _FlashOff: ImageVector? = null
