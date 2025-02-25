package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.EmojiAngry: ImageVector
    get() {
        if (_EmojiAngry != null) {
            return _EmojiAngry!!
        }
        _EmojiAngry = ImageVector.Builder(
            name = "EmojiAngry",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(15.109f, 16.459f)
                curveTo(15.36f, 16.944f, 15.955f, 17.139f, 16.445f, 16.894f)
                curveTo(16.939f, 16.647f, 17.139f, 16.047f, 16.892f, 15.553f)
                curveTo(16.81f, 15.388f, 16.705f, 15.234f, 16.594f, 15.087f)
                curveTo(16.412f, 14.844f, 16.136f, 14.53f, 15.747f, 14.219f)
                curveTo(14.958f, 13.587f, 13.741f, 13f, 11.998f, 13f)
                curveTo(10.255f, 13f, 9.037f, 13.587f, 8.248f, 14.219f)
                curveTo(7.86f, 14.53f, 7.584f, 14.844f, 7.401f, 15.087f)
                curveTo(7.29f, 15.235f, 7.19f, 15.389f, 7.104f, 15.552f)
                curveTo(6.859f, 16.039f, 7.063f, 16.65f, 7.55f, 16.894f)
                curveTo(8.041f, 17.139f, 8.636f, 16.944f, 8.886f, 16.459f)
                curveTo(8.9f, 16.434f, 9.088f, 16.108f, 9.497f, 15.781f)
                curveTo(9.958f, 15.413f, 10.741f, 15f, 11.998f, 15f)
                curveTo(13.255f, 15f, 14.038f, 15.413f, 14.498f, 15.781f)
                curveTo(14.907f, 16.108f, 15.095f, 16.434f, 15.109f, 16.459f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6.293f, 7.293f)
                curveTo(6.683f, 6.902f, 7.317f, 6.902f, 7.707f, 7.293f)
                lineTo(9.707f, 9.293f)
                curveTo(10.098f, 9.683f, 10.098f, 10.317f, 9.707f, 10.707f)
                curveTo(9.317f, 11.098f, 8.683f, 11.098f, 8.293f, 10.707f)
                lineTo(6.293f, 8.707f)
                curveTo(5.902f, 8.317f, 5.902f, 7.683f, 6.293f, 7.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(17.707f, 8.707f)
                curveTo(18.098f, 8.317f, 18.098f, 7.683f, 17.707f, 7.293f)
                curveTo(17.317f, 6.902f, 16.683f, 6.902f, 16.293f, 7.293f)
                lineTo(14.293f, 9.293f)
                curveTo(13.902f, 9.683f, 13.902f, 10.317f, 14.293f, 10.707f)
                curveTo(14.683f, 11.098f, 15.317f, 11.098f, 15.707f, 10.707f)
                lineTo(17.707f, 8.707f)
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

        return _EmojiAngry!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiAngry: ImageVector? = null
