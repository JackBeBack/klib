package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.EmojiLaugh: ImageVector
    get() {
        if (_EmojiLaugh != null) {
            return _EmojiLaugh!!
        }
        _EmojiLaugh = ImageVector.Builder(
            name = "EmojiLaugh",
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
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.2f, 13f)
                curveTo(7.561f, 13f, 6.944f, 13.536f, 7.017f, 14.294f)
                curveTo(7.061f, 14.749f, 7.232f, 15.788f, 7.955f, 16.734f)
                curveTo(8.717f, 17.731f, 9.999f, 18.5f, 12f, 18.5f)
                curveTo(14.001f, 18.5f, 15.283f, 17.731f, 16.045f, 16.734f)
                curveTo(16.768f, 15.788f, 16.94f, 14.749f, 16.983f, 14.294f)
                curveTo(17.056f, 13.536f, 16.438f, 13f, 15.8f, 13f)
                horizontalLineTo(8.2f)
                close()
                moveTo(9.544f, 15.519f)
                curveTo(9.415f, 15.351f, 9.317f, 15.173f, 9.241f, 15f)
                horizontalLineTo(14.759f)
                curveTo(14.683f, 15.173f, 14.585f, 15.351f, 14.456f, 15.519f)
                curveTo(14.098f, 15.988f, 13.422f, 16.5f, 12f, 16.5f)
                curveTo(10.578f, 16.5f, 9.902f, 15.988f, 9.544f, 15.519f)
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

        return _EmojiLaugh!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiLaugh: ImageVector? = null
