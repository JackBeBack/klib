package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.EmojiSick: ImageVector
    get() {
        if (_EmojiSick != null) {
            return _EmojiSick!!
        }
        _EmojiSick = ImageVector.Builder(
            name = "EmojiSick",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(8.5f, 11f)
                curveTo(9.328f, 11f, 10f, 10.328f, 10f, 9.5f)
                curveTo(10f, 8.672f, 9.328f, 8f, 8.5f, 8f)
                curveTo(7.672f, 8f, 7f, 8.672f, 7f, 9.5f)
                curveTo(7f, 10.328f, 7.672f, 11f, 8.5f, 11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(17f, 9.5f)
                curveTo(17f, 10.328f, 16.328f, 11f, 15.5f, 11f)
                curveTo(14.672f, 11f, 14f, 10.328f, 14f, 9.5f)
                curveTo(14f, 8.672f, 14.672f, 8f, 15.5f, 8f)
                curveTo(16.328f, 8f, 17f, 8.672f, 17f, 9.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6.553f, 15.894f)
                curveTo(7.038f, 16.137f, 7.626f, 15.948f, 7.881f, 15.473f)
                curveTo(8.11f, 15.113f, 8.605f, 15f, 9f, 15f)
                curveTo(9.447f, 15f, 9.618f, 15.114f, 9.941f, 15.329f)
                lineTo(9.945f, 15.332f)
                curveTo(10.37f, 15.615f, 10.949f, 16f, 12f, 16f)
                curveTo(13.051f, 16f, 13.63f, 15.615f, 14.055f, 15.332f)
                lineTo(14.059f, 15.329f)
                curveTo(14.382f, 15.114f, 14.553f, 15f, 15f, 15f)
                curveTo(15.395f, 15f, 15.89f, 15.113f, 16.119f, 15.473f)
                curveTo(16.374f, 15.948f, 16.962f, 16.137f, 17.447f, 15.894f)
                curveTo(17.929f, 15.654f, 18.134f, 15.029f, 17.892f, 14.548f)
                curveTo(17.845f, 14.456f, 17.793f, 14.37f, 17.698f, 14.244f)
                curveTo(17.586f, 14.094f, 17.419f, 13.905f, 17.187f, 13.719f)
                curveTo(16.71f, 13.337f, 15.993f, 13f, 15f, 13f)
                curveTo(13.949f, 13f, 13.37f, 13.385f, 12.945f, 13.668f)
                lineTo(12.941f, 13.671f)
                curveTo(12.618f, 13.886f, 12.447f, 14f, 12f, 14f)
                curveTo(11.553f, 14f, 11.382f, 13.886f, 11.059f, 13.671f)
                lineTo(11.055f, 13.668f)
                curveTo(10.63f, 13.385f, 10.051f, 13f, 9f, 13f)
                curveTo(8.007f, 13f, 7.29f, 13.337f, 6.813f, 13.719f)
                curveTo(6.581f, 13.905f, 6.414f, 14.094f, 6.302f, 14.244f)
                curveTo(6.206f, 14.371f, 6.154f, 14.457f, 6.107f, 14.551f)
                curveTo(5.864f, 15.034f, 6.069f, 15.653f, 6.553f, 15.894f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 23f)
                curveTo(18.075f, 23f, 23f, 18.075f, 23f, 12f)
                curveTo(23f, 5.925f, 18.075f, 1f, 12f, 1f)
                curveTo(5.925f, 1f, 1f, 5.925f, 1f, 12f)
                curveTo(1f, 18.075f, 5.925f, 23f, 12f, 23f)
                close()
                moveTo(12f, 20.993f)
                curveTo(7.033f, 20.993f, 3.007f, 16.967f, 3.007f, 12f)
                curveTo(3.007f, 7.033f, 7.033f, 3.007f, 12f, 3.007f)
                curveTo(16.967f, 3.007f, 20.993f, 7.033f, 20.993f, 12f)
                curveTo(20.993f, 16.967f, 16.967f, 20.993f, 12f, 20.993f)
                close()
            }
        }.build()

        return _EmojiSick!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiSick: ImageVector? = null
