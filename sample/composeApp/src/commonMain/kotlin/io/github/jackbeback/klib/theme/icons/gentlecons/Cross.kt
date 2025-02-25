package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Cross: ImageVector
    get() {
        if (_Cross != null) {
            return _Cross!!
        }
        _Cross = ImageVector.Builder(
            name = "Cross",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6.995f, 7.006f)
                curveTo(6.604f, 7.397f, 6.604f, 8.03f, 6.995f, 8.421f)
                lineTo(10.58f, 12.006f)
                lineTo(6.995f, 15.591f)
                curveTo(6.604f, 15.981f, 6.604f, 16.615f, 6.995f, 17.005f)
                curveTo(7.385f, 17.396f, 8.019f, 17.396f, 8.409f, 17.005f)
                lineTo(11.994f, 13.42f)
                lineTo(15.579f, 17.005f)
                curveTo(15.97f, 17.396f, 16.603f, 17.396f, 16.994f, 17.005f)
                curveTo(17.384f, 16.615f, 17.384f, 15.981f, 16.994f, 15.591f)
                lineTo(13.408f, 12.006f)
                lineTo(16.994f, 8.421f)
                curveTo(17.384f, 8.03f, 17.384f, 7.397f, 16.994f, 7.006f)
                curveTo(16.603f, 6.616f, 15.97f, 6.616f, 15.579f, 7.006f)
                lineTo(11.994f, 10.592f)
                lineTo(8.409f, 7.006f)
                curveTo(8.019f, 6.616f, 7.385f, 6.616f, 6.995f, 7.006f)
                close()
            }
        }.build()

        return _Cross!!
    }

@Suppress("ObjectPropertyName")
private var _Cross: ImageVector? = null
