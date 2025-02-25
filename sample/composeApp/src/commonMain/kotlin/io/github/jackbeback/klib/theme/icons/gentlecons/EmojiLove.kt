package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.EmojiLove: ImageVector
    get() {
        if (_EmojiLove != null) {
            return _EmojiLove!!
        }
        _EmojiLove = ImageVector.Builder(
            name = "EmojiLove",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(8.889f, 14.541f)
                curveTo(8.638f, 14.056f, 8.043f, 13.861f, 7.553f, 14.106f)
                curveTo(7.059f, 14.353f, 6.859f, 14.953f, 7.106f, 15.447f)
                curveTo(7.188f, 15.612f, 7.293f, 15.766f, 7.403f, 15.913f)
                curveTo(7.586f, 16.156f, 7.862f, 16.47f, 8.251f, 16.781f)
                curveTo(9.04f, 17.413f, 10.257f, 18f, 12f, 18f)
                curveTo(13.743f, 18f, 14.96f, 17.413f, 15.75f, 16.781f)
                curveTo(16.138f, 16.47f, 16.414f, 16.156f, 16.597f, 15.913f)
                curveTo(16.708f, 15.765f, 16.808f, 15.611f, 16.894f, 15.448f)
                curveTo(17.139f, 14.961f, 16.935f, 14.35f, 16.447f, 14.106f)
                curveTo(15.957f, 13.861f, 15.362f, 14.056f, 15.112f, 14.541f)
                curveTo(15.098f, 14.566f, 14.91f, 14.892f, 14.5f, 15.219f)
                curveTo(14.04f, 15.588f, 13.257f, 16f, 12f, 16f)
                curveTo(10.743f, 16f, 9.96f, 15.588f, 9.5f, 15.219f)
                curveTo(9.091f, 14.892f, 8.903f, 14.566f, 8.889f, 14.541f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6.5f, 7f)
                curveTo(5f, 7f, 5f, 8.667f, 5f, 8.667f)
                curveTo(5f, 10f, 7.5f, 12f, 8f, 12f)
                curveTo(8.5f, 12f, 11f, 10f, 11f, 8.667f)
                curveTo(11f, 8.667f, 11f, 7f, 9.5f, 7f)
                curveTo(8f, 7f, 8f, 9f, 8f, 9f)
                curveTo(8f, 9f, 8f, 7f, 6.5f, 7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(13f, 8.667f)
                curveTo(13f, 8.667f, 13f, 7f, 14.5f, 7f)
                curveTo(16f, 7f, 16f, 9f, 16f, 9f)
                curveTo(16f, 9f, 16f, 7f, 17.5f, 7f)
                curveTo(19f, 7f, 19f, 8.667f, 19f, 8.667f)
                curveTo(19f, 10f, 16.5f, 12f, 16f, 12f)
                curveTo(15.5f, 12f, 13f, 10f, 13f, 8.667f)
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

        return _EmojiLove!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiLove: ImageVector? = null
