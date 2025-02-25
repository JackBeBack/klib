package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.EmojiCry: ImageVector
    get() {
        if (_EmojiCry != null) {
            return _EmojiCry!!
        }
        _EmojiCry = ImageVector.Builder(
            name = "EmojiCry",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(10f, 9.5f)
                curveTo(10f, 10.328f, 9.328f, 11f, 8.5f, 11f)
                curveTo(7.672f, 11f, 7f, 10.328f, 7f, 9.5f)
                curveTo(7f, 8.672f, 7.672f, 8f, 8.5f, 8f)
                curveTo(9.328f, 8f, 10f, 8.672f, 10f, 9.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(15.5f, 11f)
                curveTo(16.328f, 11f, 17f, 10.328f, 17f, 9.5f)
                curveTo(17f, 8.672f, 16.328f, 8f, 15.5f, 8f)
                curveTo(14.672f, 8f, 14f, 8.672f, 14f, 9.5f)
                curveTo(14f, 10.328f, 14.672f, 11f, 15.5f, 11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(14.434f, 15.199f)
                curveTo(13.871f, 15.011f, 13.057f, 15f, 12f, 15f)
                curveTo(11.448f, 15f, 11f, 14.552f, 11f, 14f)
                curveTo(11f, 13.448f, 11.448f, 13f, 12f, 13f)
                lineTo(12.095f, 13f)
                curveTo(13.022f, 13f, 14.16f, 12.999f, 15.066f, 13.301f)
                curveTo(15.564f, 13.467f, 16.069f, 13.746f, 16.446f, 14.23f)
                curveTo(16.828f, 14.722f, 17f, 15.327f, 17f, 16f)
                curveTo(17f, 16.552f, 16.552f, 17f, 16f, 17f)
                curveTo(15.448f, 17f, 15f, 16.552f, 15f, 16f)
                curveTo(15f, 15.673f, 14.922f, 15.528f, 14.867f, 15.458f)
                curveTo(14.806f, 15.379f, 14.686f, 15.283f, 14.434f, 15.199f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(8.5f, 12f)
                curveTo(8f, 12f, 7f, 14f, 7f, 14.5f)
                curveTo(7f, 15f, 7.5f, 16f, 8.5f, 16f)
                curveTo(9.5f, 16f, 10f, 15f, 10f, 14.5f)
                curveTo(10f, 14f, 9f, 12f, 8.5f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
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
        }.build()

        return _EmojiCry!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiCry: ImageVector? = null
