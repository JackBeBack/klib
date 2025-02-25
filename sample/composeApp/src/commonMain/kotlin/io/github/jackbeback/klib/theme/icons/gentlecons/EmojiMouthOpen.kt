package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.EmojiMouthOpen: ImageVector
    get() {
        if (_EmojiMouthOpen != null) {
            return _EmojiMouthOpen!!
        }
        _EmojiMouthOpen = ImageVector.Builder(
            name = "EmojiMouthOpen",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 19f)
                curveTo(13.657f, 19f, 15f, 17.657f, 15f, 16f)
                curveTo(15f, 14.343f, 13.657f, 13f, 12f, 13f)
                curveTo(10.343f, 13f, 9f, 14.343f, 9f, 16f)
                curveTo(9f, 17.657f, 10.343f, 19f, 12f, 19f)
                close()
                moveTo(12f, 17.103f)
                curveTo(11.391f, 17.103f, 10.897f, 16.609f, 10.897f, 16f)
                curveTo(10.897f, 15.391f, 11.391f, 14.897f, 12f, 14.897f)
                curveTo(12.609f, 14.897f, 13.103f, 15.391f, 13.103f, 16f)
                curveTo(13.103f, 16.609f, 12.609f, 17.103f, 12f, 17.103f)
                close()
            }
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

        return _EmojiMouthOpen!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiMouthOpen: ImageVector? = null
