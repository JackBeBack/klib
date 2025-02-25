package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.RouteArrow: ImageVector
    get() {
        if (_RouteArrow != null) {
            return _RouteArrow!!
        }
        _RouteArrow = ImageVector.Builder(
            name = "RouteArrow",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(16.208f, 18.707f)
                curveTo(15.818f, 19.098f, 15.184f, 19.098f, 14.794f, 18.707f)
                curveTo(14.403f, 18.317f, 14.403f, 17.683f, 14.794f, 17.293f)
                lineTo(18.087f, 14f)
                horizontalLineTo(5f)
                curveTo(3.895f, 14f, 3f, 13.105f, 3f, 12f)
                verticalLineTo(6f)
                curveTo(3f, 5.448f, 3.448f, 5f, 4f, 5f)
                curveTo(4.552f, 5f, 5f, 5.448f, 5f, 6f)
                verticalLineTo(11f)
                curveTo(5f, 11.552f, 5.448f, 12f, 6f, 12f)
                lineTo(17.986f, 12f)
                lineTo(14.794f, 8.808f)
                curveTo(14.403f, 8.417f, 14.403f, 7.784f, 14.794f, 7.393f)
                curveTo(15.184f, 7.003f, 15.818f, 7.003f, 16.208f, 7.393f)
                lineTo(20.451f, 11.636f)
                curveTo(20.744f, 11.929f, 20.927f, 12.29f, 21f, 12.668f)
                curveTo(21.122f, 13.299f, 20.939f, 13.976f, 20.451f, 14.465f)
                lineTo(16.208f, 18.707f)
                close()
            }
        }.build()

        return _RouteArrow!!
    }

@Suppress("ObjectPropertyName")
private var _RouteArrow: ImageVector? = null
