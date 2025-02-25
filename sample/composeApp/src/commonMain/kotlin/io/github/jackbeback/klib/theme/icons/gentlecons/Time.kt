package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Time: ImageVector
    get() {
        if (_Time != null) {
            return _Time!!
        }
        _Time = ImageVector.Builder(
            name = "Time",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
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
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(12f, 5f)
                curveTo(11.448f, 5f, 11f, 5.448f, 11f, 6f)
                verticalLineTo(12.467f)
                curveTo(11f, 12.467f, 11f, 12.727f, 11.127f, 12.924f)
                curveTo(11.212f, 13.09f, 11.344f, 13.234f, 11.517f, 13.335f)
                lineTo(16.137f, 16.002f)
                curveTo(16.615f, 16.278f, 17.227f, 16.114f, 17.503f, 15.636f)
                curveTo(17.779f, 15.158f, 17.615f, 14.546f, 17.137f, 14.27f)
                lineTo(13f, 11.881f)
                verticalLineTo(6f)
                curveTo(13f, 5.448f, 12.552f, 5f, 12f, 5f)
                close()
            }
        }.build()

        return _Time!!
    }

@Suppress("ObjectPropertyName")
private var _Time: ImageVector? = null
