package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowNextSmall: ImageVector
    get() {
        if (_ArrowNextSmall != null) {
            return _ArrowNextSmall!!
        }
        _ArrowNextSmall = ImageVector.Builder(
            name = "ArrowNextSmall",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(9.711f, 18.293f)
                curveTo(10.101f, 18.683f, 10.734f, 18.683f, 11.125f, 18.293f)
                lineTo(16.012f, 13.401f)
                curveTo(16.793f, 12.62f, 16.792f, 11.354f, 16.012f, 10.573f)
                lineTo(11.121f, 5.683f)
                curveTo(10.731f, 5.292f, 10.098f, 5.292f, 9.707f, 5.683f)
                curveTo(9.317f, 6.073f, 9.317f, 6.706f, 9.707f, 7.097f)
                lineTo(13.893f, 11.282f)
                curveTo(14.283f, 11.673f, 14.283f, 12.306f, 13.893f, 12.697f)
                lineTo(9.711f, 16.879f)
                curveTo(9.32f, 17.269f, 9.32f, 17.902f, 9.711f, 18.293f)
                close()
            }
        }.build()

        return _ArrowNextSmall!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowNextSmall: ImageVector? = null
