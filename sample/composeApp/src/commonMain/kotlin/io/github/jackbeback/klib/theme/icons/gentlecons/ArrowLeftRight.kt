package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowLeftRight: ImageVector
    get() {
        if (_ArrowLeftRight != null) {
            return _ArrowLeftRight!!
        }
        _ArrowLeftRight = ImageVector.Builder(
            name = "ArrowLeftRight",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(16.136f, 18.293f)
                curveTo(16.526f, 18.683f, 17.16f, 18.683f, 17.55f, 18.293f)
                lineTo(22.438f, 13.401f)
                curveTo(23.218f, 12.619f, 23.218f, 11.354f, 22.437f, 10.573f)
                lineTo(17.546f, 5.682f)
                curveTo(17.156f, 5.292f, 16.523f, 5.292f, 16.132f, 5.682f)
                curveTo(15.742f, 6.073f, 15.742f, 6.706f, 16.132f, 7.097f)
                lineTo(20.318f, 11.282f)
                curveTo(20.708f, 11.673f, 20.708f, 12.306f, 20.318f, 12.696f)
                lineTo(16.136f, 16.879f)
                curveTo(15.745f, 17.269f, 15.745f, 17.902f, 16.136f, 18.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7.887f, 5.682f)
                curveTo(7.496f, 5.292f, 6.863f, 5.292f, 6.473f, 5.682f)
                lineTo(1.585f, 10.575f)
                curveTo(0.805f, 11.356f, 0.805f, 12.622f, 1.586f, 13.402f)
                lineTo(6.476f, 18.293f)
                curveTo(6.867f, 18.683f, 7.5f, 18.683f, 7.89f, 18.293f)
                curveTo(8.281f, 17.902f, 8.281f, 17.269f, 7.89f, 16.879f)
                lineTo(3.705f, 12.693f)
                curveTo(3.314f, 12.302f, 3.314f, 11.669f, 3.705f, 11.279f)
                lineTo(7.887f, 7.097f)
                curveTo(8.277f, 6.706f, 8.277f, 6.073f, 7.887f, 5.682f)
                close()
            }
        }.build()

        return _ArrowLeftRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeftRight: ImageVector? = null
