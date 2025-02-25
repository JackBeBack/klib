package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Connect: ImageVector
    get() {
        if (_Connect != null) {
            return _Connect!!
        }
        _Connect = ImageVector.Builder(
            name = "Connect",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(14f, 10f)
                curveTo(14f, 9.448f, 13.552f, 9f, 13f, 9f)
                horizontalLineTo(12.5f)
                curveTo(9.462f, 9f, 7f, 11.462f, 7f, 14.5f)
                curveTo(7f, 17.538f, 9.462f, 20f, 12.5f, 20f)
                horizontalLineTo(17.5f)
                curveTo(20.538f, 20f, 23f, 17.538f, 23f, 14.5f)
                curveTo(23f, 12.009f, 21.344f, 9.905f, 19.073f, 9.228f)
                curveTo(18.51f, 9.06f, 18f, 9.529f, 18f, 10.117f)
                verticalLineTo(10.168f)
                curveTo(18f, 10.666f, 18.375f, 11.073f, 18.834f, 11.263f)
                curveTo(20.105f, 11.788f, 21f, 13.04f, 21f, 14.5f)
                curveTo(21f, 16.433f, 19.433f, 18f, 17.5f, 18f)
                horizontalLineTo(12.5f)
                curveTo(10.567f, 18f, 9f, 16.433f, 9f, 14.5f)
                curveTo(9f, 12.567f, 10.567f, 11f, 12.5f, 11f)
                horizontalLineTo(13f)
                curveTo(13.552f, 11f, 14f, 10.552f, 14f, 10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11.5f, 4f)
                curveTo(14.538f, 4f, 17f, 6.462f, 17f, 9.5f)
                curveTo(17f, 12.538f, 14.538f, 15f, 11.5f, 15f)
                horizontalLineTo(11f)
                curveTo(10.448f, 15f, 10f, 14.552f, 10f, 14f)
                curveTo(10f, 13.448f, 10.448f, 13f, 11f, 13f)
                horizontalLineTo(11.5f)
                curveTo(13.433f, 13f, 15f, 11.433f, 15f, 9.5f)
                curveTo(15f, 7.567f, 13.433f, 6f, 11.5f, 6f)
                horizontalLineTo(6.5f)
                curveTo(4.567f, 6f, 3f, 7.567f, 3f, 9.5f)
                curveTo(3f, 10.96f, 3.895f, 12.212f, 5.166f, 12.737f)
                curveTo(5.625f, 12.926f, 6f, 13.334f, 6f, 13.832f)
                verticalLineTo(13.883f)
                curveTo(6f, 14.471f, 5.49f, 14.94f, 4.927f, 14.772f)
                curveTo(2.656f, 14.095f, 1f, 11.991f, 1f, 9.5f)
                curveTo(1f, 6.462f, 3.462f, 4f, 6.5f, 4f)
                horizontalLineTo(11.5f)
                close()
            }
        }.build()

        return _Connect!!
    }

@Suppress("ObjectPropertyName")
private var _Connect: ImageVector? = null
