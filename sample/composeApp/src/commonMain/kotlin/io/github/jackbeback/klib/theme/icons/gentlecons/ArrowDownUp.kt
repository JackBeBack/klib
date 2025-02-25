package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowDownUp: ImageVector
    get() {
        if (_ArrowDownUp != null) {
            return _ArrowDownUp!!
        }
        _ArrowDownUp = ImageVector.Builder(
            name = "ArrowDownUp",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(5.707f, 16.136f)
                curveTo(5.317f, 16.526f, 5.317f, 17.16f, 5.707f, 17.55f)
                lineTo(10.599f, 22.438f)
                curveTo(11.38f, 23.218f, 12.646f, 23.218f, 13.427f, 22.437f)
                lineTo(18.317f, 17.546f)
                curveTo(18.708f, 17.156f, 18.708f, 16.523f, 18.317f, 16.132f)
                curveTo(17.927f, 15.742f, 17.294f, 15.742f, 16.903f, 16.132f)
                lineTo(12.718f, 20.318f)
                curveTo(12.327f, 20.708f, 11.694f, 20.708f, 11.303f, 20.318f)
                lineTo(7.121f, 16.136f)
                curveTo(6.731f, 15.745f, 6.098f, 15.745f, 5.707f, 16.136f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(18.317f, 7.887f)
                curveTo(18.708f, 7.496f, 18.708f, 6.863f, 18.317f, 6.473f)
                lineTo(13.425f, 1.585f)
                curveTo(12.644f, 0.805f, 11.378f, 0.805f, 10.597f, 1.586f)
                lineTo(5.707f, 6.476f)
                curveTo(5.317f, 6.867f, 5.317f, 7.5f, 5.707f, 7.89f)
                curveTo(6.098f, 8.281f, 6.731f, 8.281f, 7.121f, 7.89f)
                lineTo(11.307f, 3.705f)
                curveTo(11.698f, 3.314f, 12.331f, 3.314f, 12.721f, 3.705f)
                lineTo(16.903f, 7.887f)
                curveTo(17.294f, 8.277f, 17.927f, 8.277f, 18.317f, 7.887f)
                close()
            }
        }.build()

        return _ArrowDownUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownUp: ImageVector? = null
