package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.EmojiSmile: ImageVector
    get() {
        if (_EmojiSmile != null) {
            return _EmojiSmile!!
        }
        _EmojiSmile = ImageVector.Builder(
            name = "EmojiSmile",
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
                moveTo(8.889f, 13.541f)
                curveTo(8.638f, 13.056f, 8.043f, 12.861f, 7.553f, 13.106f)
                curveTo(7.059f, 13.353f, 6.859f, 13.953f, 7.106f, 14.447f)
                curveTo(7.188f, 14.612f, 7.293f, 14.766f, 7.403f, 14.913f)
                curveTo(7.586f, 15.156f, 7.862f, 15.47f, 8.251f, 15.781f)
                curveTo(9.04f, 16.413f, 10.257f, 17f, 12f, 17f)
                curveTo(13.743f, 17f, 14.96f, 16.413f, 15.75f, 15.781f)
                curveTo(16.138f, 15.47f, 16.414f, 15.156f, 16.597f, 14.913f)
                curveTo(16.708f, 14.765f, 16.808f, 14.611f, 16.894f, 14.448f)
                curveTo(17.139f, 13.961f, 16.935f, 13.35f, 16.447f, 13.106f)
                curveTo(15.957f, 12.861f, 15.362f, 13.056f, 15.112f, 13.541f)
                curveTo(15.098f, 13.566f, 14.91f, 13.892f, 14.5f, 14.219f)
                curveTo(14.04f, 14.588f, 13.257f, 15f, 12f, 15f)
                curveTo(10.743f, 15f, 9.96f, 14.588f, 9.5f, 14.219f)
                curveTo(9.091f, 13.892f, 8.903f, 13.566f, 8.889f, 13.541f)
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

        return _EmojiSmile!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiSmile: ImageVector? = null
