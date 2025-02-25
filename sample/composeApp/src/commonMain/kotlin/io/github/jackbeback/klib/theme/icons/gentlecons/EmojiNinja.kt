package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.EmojiNinja: ImageVector
    get() {
        if (_EmojiNinja != null) {
            return _EmojiNinja!!
        }
        _EmojiNinja = ImageVector.Builder(
            name = "EmojiNinja",
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
                moveTo(8f, 15f)
                curveTo(7.448f, 15f, 7f, 15.448f, 7f, 16f)
                curveTo(7f, 16.552f, 7.448f, 17f, 8f, 17f)
                horizontalLineTo(15.999f)
                curveTo(16.552f, 17f, 17f, 16.552f, 17f, 16f)
                curveTo(17f, 15.448f, 16.552f, 15f, 16f, 15f)
                horizontalLineTo(8f)
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
                moveTo(3.007f, 12f)
                curveTo(3.007f, 10.15f, 3.566f, 8.43f, 4.524f, 7f)
                horizontalLineTo(19.476f)
                curveTo(20.434f, 8.43f, 20.993f, 10.15f, 20.993f, 12f)
                horizontalLineTo(3.007f)
                close()
                moveTo(20.77f, 14f)
                curveTo(19.861f, 18.004f, 16.279f, 20.993f, 12f, 20.993f)
                curveTo(7.721f, 20.993f, 4.139f, 18.004f, 3.23f, 14f)
                horizontalLineTo(20.77f)
                close()
                moveTo(12f, 3.007f)
                curveTo(14.139f, 3.007f, 16.103f, 3.753f, 17.646f, 5f)
                horizontalLineTo(6.354f)
                curveTo(7.897f, 3.753f, 9.861f, 3.007f, 12f, 3.007f)
                close()
            }
        }.build()

        return _EmojiNinja!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiNinja: ImageVector? = null
