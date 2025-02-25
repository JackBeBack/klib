package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.FolderBlock: ImageVector
    get() {
        if (_FolderBlock != null) {
            return _FolderBlock!!
        }
        _FolderBlock = ImageVector.Builder(
            name = "FolderBlock",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(1f, 4f)
                curveTo(1f, 2.343f, 2.343f, 1f, 4f, 1f)
                horizontalLineTo(7.764f)
                curveTo(8.9f, 1f, 9.939f, 1.642f, 10.447f, 2.658f)
                lineTo(11.342f, 4.447f)
                curveTo(11.511f, 4.786f, 11.857f, 5f, 12.236f, 5f)
                horizontalLineTo(20f)
                curveTo(21.657f, 5f, 23f, 6.343f, 23f, 8f)
                verticalLineTo(13.101f)
                curveTo(22.426f, 12.515f, 21.75f, 12.03f, 21f, 11.674f)
                verticalLineTo(8f)
                curveTo(21f, 7.448f, 20.552f, 7f, 20f, 7f)
                horizontalLineTo(12.236f)
                curveTo(11.1f, 7f, 10.061f, 6.358f, 9.553f, 5.342f)
                lineTo(8.658f, 3.553f)
                curveTo(8.489f, 3.214f, 8.143f, 3f, 7.764f, 3f)
                horizontalLineTo(4f)
                curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
                verticalLineTo(20f)
                curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
                horizontalLineTo(11.674f)
                curveTo(12.03f, 21.75f, 12.515f, 22.426f, 13.101f, 23f)
                horizontalLineTo(4f)
                curveTo(2.343f, 23f, 1f, 21.657f, 1f, 20f)
                verticalLineTo(4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(24f, 18f)
                curveTo(24f, 21.314f, 21.314f, 24f, 18f, 24f)
                curveTo(14.686f, 24f, 12f, 21.314f, 12f, 18f)
                curveTo(12f, 14.686f, 14.686f, 12f, 18f, 12f)
                curveTo(21.314f, 12f, 24f, 14.686f, 24f, 18f)
                close()
                moveTo(13.982f, 18f)
                curveTo(13.982f, 20.219f, 15.781f, 22.018f, 18f, 22.018f)
                curveTo(18.747f, 22.018f, 19.446f, 21.814f, 20.045f, 21.459f)
                lineTo(14.541f, 15.955f)
                curveTo(14.186f, 16.554f, 13.982f, 17.253f, 13.982f, 18f)
                close()
                moveTo(22.018f, 18f)
                curveTo(22.018f, 18.747f, 21.814f, 19.446f, 21.459f, 20.045f)
                lineTo(15.955f, 14.541f)
                curveTo(16.554f, 14.186f, 17.253f, 13.982f, 18f, 13.982f)
                curveTo(20.219f, 13.982f, 22.018f, 15.781f, 22.018f, 18f)
                close()
            }
        }.build()

        return _FolderBlock!!
    }

@Suppress("ObjectPropertyName")
private var _FolderBlock: ImageVector? = null
