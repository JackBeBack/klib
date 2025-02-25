package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.EmojiDizzyNeutral: ImageVector
    get() {
        if (_EmojiDizzyNeutral != null) {
            return _EmojiDizzyNeutral!!
        }
        _EmojiDizzyNeutral = ImageVector.Builder(
            name = "EmojiDizzyNeutral",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(8f, 14f)
                curveTo(7.448f, 14f, 7f, 14.448f, 7f, 15f)
                curveTo(7f, 15.552f, 7.448f, 16f, 8f, 16f)
                horizontalLineTo(15.999f)
                curveTo(16.551f, 16f, 17f, 15.552f, 17f, 15f)
                curveTo(17f, 14.448f, 16.552f, 14f, 16f, 14f)
                horizontalLineTo(8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(10.704f, 7.292f)
                curveTo(10.314f, 6.903f, 9.682f, 6.903f, 9.292f, 7.292f)
                lineTo(8.497f, 8.087f)
                lineTo(7.708f, 7.297f)
                curveTo(7.318f, 6.908f, 6.686f, 6.908f, 6.296f, 7.297f)
                curveTo(5.906f, 7.687f, 5.906f, 8.319f, 6.296f, 8.709f)
                lineTo(7.085f, 9.498f)
                lineTo(6.293f, 10.29f)
                curveTo(5.903f, 10.68f, 5.902f, 11.312f, 6.293f, 11.702f)
                curveTo(6.683f, 12.092f, 7.315f, 12.092f, 7.705f, 11.702f)
                lineTo(8.497f, 10.91f)
                lineTo(9.295f, 11.708f)
                curveTo(9.685f, 12.097f, 10.318f, 12.097f, 10.708f, 11.708f)
                curveTo(11.097f, 11.318f, 11.097f, 10.686f, 10.708f, 10.296f)
                lineTo(9.91f, 9.498f)
                lineTo(10.704f, 8.704f)
                curveTo(11.094f, 8.314f, 11.094f, 7.682f, 10.704f, 7.292f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(16.292f, 7.292f)
                curveTo(16.682f, 6.903f, 17.314f, 6.903f, 17.704f, 7.292f)
                curveTo(18.094f, 7.682f, 18.094f, 8.314f, 17.704f, 8.704f)
                lineTo(16.91f, 9.498f)
                lineTo(17.708f, 10.296f)
                curveTo(18.097f, 10.686f, 18.097f, 11.318f, 17.708f, 11.708f)
                curveTo(17.317f, 12.097f, 16.685f, 12.097f, 16.295f, 11.708f)
                lineTo(15.497f, 10.91f)
                lineTo(14.705f, 11.702f)
                curveTo(14.315f, 12.092f, 13.682f, 12.092f, 13.292f, 11.702f)
                curveTo(12.903f, 11.312f, 12.903f, 10.68f, 13.292f, 10.29f)
                lineTo(14.085f, 9.498f)
                lineTo(13.296f, 8.709f)
                curveTo(12.906f, 8.319f, 12.906f, 7.687f, 13.296f, 7.297f)
                curveTo(13.686f, 6.908f, 14.318f, 6.908f, 14.708f, 7.297f)
                lineTo(15.497f, 8.087f)
                lineTo(16.292f, 7.292f)
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

        return _EmojiDizzyNeutral!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiDizzyNeutral: ImageVector? = null
