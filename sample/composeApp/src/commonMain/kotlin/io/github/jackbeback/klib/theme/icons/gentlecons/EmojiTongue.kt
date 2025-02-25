package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.EmojiTongue: ImageVector
    get() {
        if (_EmojiTongue != null) {
            return _EmojiTongue!!
        }
        _EmojiTongue = ImageVector.Builder(
            name = "EmojiTongue",
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
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.011f, 13f)
                horizontalLineTo(13.989f)
                curveTo(13.997f, 13f, 14.005f, 13f, 14.013f, 13f)
                horizontalLineTo(15.999f)
                curveTo(16.551f, 13f, 17f, 13.448f, 17f, 14f)
                curveTo(17f, 14.552f, 16.552f, 15f, 16f, 15f)
                horizontalLineTo(15.041f)
                curveTo(15.04f, 15.469f, 15.016f, 16.054f, 14.926f, 16.648f)
                curveTo(14.824f, 17.33f, 14.625f, 18.119f, 14.206f, 18.764f)
                curveTo(13.758f, 19.453f, 13.033f, 20f, 12f, 20f)
                curveTo(10.967f, 20f, 10.242f, 19.453f, 9.794f, 18.764f)
                curveTo(9.376f, 18.119f, 9.176f, 17.33f, 9.074f, 16.648f)
                curveTo(8.984f, 16.054f, 8.96f, 15.469f, 8.959f, 15f)
                horizontalLineTo(8.001f)
                curveTo(7.449f, 15f, 7f, 14.552f, 7f, 14f)
                curveTo(7f, 13.448f, 7.448f, 13f, 8f, 13f)
                horizontalLineTo(9.987f)
                curveTo(9.995f, 13f, 10.003f, 13f, 10.011f, 13f)
                close()
                moveTo(10.959f, 15f)
                curveTo(10.96f, 15.402f, 10.981f, 15.882f, 11.052f, 16.352f)
                curveTo(11.137f, 16.92f, 11.281f, 17.381f, 11.471f, 17.674f)
                curveTo(11.633f, 17.922f, 11.783f, 18f, 12f, 18f)
                curveTo(12.217f, 18f, 12.367f, 17.922f, 12.529f, 17.674f)
                curveTo(12.719f, 17.381f, 12.863f, 16.92f, 12.949f, 16.352f)
                curveTo(13.019f, 15.882f, 13.04f, 15.402f, 13.041f, 15f)
                horizontalLineTo(10.959f)
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

        return _EmojiTongue!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiTongue: ImageVector? = null
