package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Shuffle: ImageVector
    get() {
        if (_Shuffle != null) {
            return _Shuffle!!
        }
        _Shuffle = ImageVector.Builder(
            name = "Shuffle",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(17.448f, 2.034f)
                curveTo(17.838f, 1.643f, 18.472f, 1.643f, 18.862f, 2.033f)
                lineTo(21.415f, 4.585f)
                curveTo(22.196f, 5.366f, 22.196f, 6.632f, 21.415f, 7.414f)
                lineTo(18.868f, 9.961f)
                curveTo(18.477f, 10.351f, 17.844f, 10.351f, 17.453f, 9.961f)
                curveTo(17.063f, 9.57f, 17.063f, 8.937f, 17.453f, 8.547f)
                lineTo(19f, 7f)
                horizontalLineTo(14.236f)
                curveTo(13.857f, 7f, 13.511f, 7.214f, 13.342f, 7.553f)
                lineTo(11.895f, 10.445f)
                lineTo(10.77f, 8.224f)
                lineTo(11.553f, 6.658f)
                curveTo(12.061f, 5.642f, 13.1f, 5f, 14.236f, 5f)
                horizontalLineTo(19f)
                lineTo(17.448f, 3.448f)
                curveTo(17.057f, 3.057f, 17.058f, 2.424f, 17.448f, 2.034f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(17.448f, 14.034f)
                curveTo(17.838f, 13.643f, 18.472f, 13.643f, 18.862f, 14.033f)
                lineTo(21.415f, 16.585f)
                curveTo(22.196f, 17.366f, 22.196f, 18.632f, 21.415f, 19.414f)
                lineTo(18.868f, 21.961f)
                curveTo(18.477f, 22.351f, 17.844f, 22.351f, 17.453f, 21.961f)
                curveTo(17.063f, 21.57f, 17.063f, 20.937f, 17.453f, 20.547f)
                lineTo(19f, 19f)
                horizontalLineTo(14.236f)
                curveTo(13.1f, 19f, 12.061f, 18.358f, 11.553f, 17.342f)
                lineTo(6.658f, 7.553f)
                curveTo(6.489f, 7.214f, 6.143f, 7f, 5.764f, 7f)
                horizontalLineTo(3f)
                curveTo(2.448f, 7f, 2f, 6.552f, 2f, 6f)
                curveTo(2f, 5.448f, 2.448f, 5f, 3f, 5f)
                horizontalLineTo(5.764f)
                curveTo(6.9f, 5f, 7.939f, 5.642f, 8.447f, 6.658f)
                lineTo(13.342f, 16.447f)
                curveTo(13.511f, 16.786f, 13.857f, 17f, 14.236f, 17f)
                horizontalLineTo(19f)
                lineTo(17.448f, 15.448f)
                curveTo(17.057f, 15.057f, 17.058f, 14.424f, 17.448f, 14.034f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(8.123f, 13.518f)
                lineTo(9.249f, 15.739f)
                lineTo(8.447f, 17.342f)
                curveTo(7.939f, 18.358f, 6.9f, 19f, 5.764f, 19f)
                horizontalLineTo(3f)
                curveTo(2.448f, 19f, 2f, 18.552f, 2f, 18f)
                curveTo(2f, 17.448f, 2.448f, 17f, 3f, 17f)
                horizontalLineTo(5.764f)
                curveTo(6.143f, 17f, 6.489f, 16.786f, 6.658f, 16.447f)
                lineTo(8.123f, 13.518f)
                close()
            }
        }.build()

        return _Shuffle!!
    }

@Suppress("ObjectPropertyName")
private var _Shuffle: ImageVector? = null
