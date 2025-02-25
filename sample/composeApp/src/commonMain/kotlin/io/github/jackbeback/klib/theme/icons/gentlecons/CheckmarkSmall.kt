package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.CheckmarkSmall: ImageVector
    get() {
        if (_CheckmarkSmall != null) {
            return _CheckmarkSmall!!
        }
        _CheckmarkSmall = ImageVector.Builder(
            name = "CheckmarkSmall",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(19f, 7.342f)
                curveTo(18.61f, 6.951f, 17.976f, 6.951f, 17.586f, 7.342f)
                lineTo(10.341f, 14.587f)
                curveTo(9.95f, 14.977f, 9.317f, 14.977f, 8.926f, 14.587f)
                lineTo(6.385f, 12.046f)
                curveTo(5.995f, 11.655f, 5.361f, 11.655f, 4.971f, 12.046f)
                curveTo(4.58f, 12.436f, 4.58f, 13.069f, 4.971f, 13.46f)
                lineTo(7.518f, 16f)
                curveTo(8.69f, 17.169f, 10.587f, 17.168f, 11.757f, 15.997f)
                lineTo(19f, 8.756f)
                curveTo(19.39f, 8.366f, 19.39f, 7.732f, 19f, 7.342f)
                close()
            }
        }.build()

        return _CheckmarkSmall!!
    }

@Suppress("ObjectPropertyName")
private var _CheckmarkSmall: ImageVector? = null
