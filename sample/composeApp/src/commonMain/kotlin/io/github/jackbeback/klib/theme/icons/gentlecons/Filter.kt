package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Filter: ImageVector
    get() {
        if (_Filter != null) {
            return _Filter!!
        }
        _Filter = ImageVector.Builder(
            name = "Filter",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.267f, 6.242f)
                curveTo(2.206f, 4.41f, 3.502f, 1f, 6.26f, 1f)
                horizontalLineTo(17.74f)
                curveTo(20.498f, 1f, 21.795f, 4.41f, 19.733f, 6.242f)
                lineTo(15.336f, 10.151f)
                curveTo(15.122f, 10.34f, 15f, 10.613f, 15f, 10.898f)
                verticalLineTo(21.086f)
                curveTo(15f, 22.868f, 12.846f, 23.76f, 11.586f, 22.5f)
                lineTo(9.586f, 20.5f)
                curveTo(9.211f, 20.125f, 9f, 19.616f, 9f, 19.086f)
                verticalLineTo(10.898f)
                curveTo(9f, 10.613f, 8.878f, 10.34f, 8.664f, 10.151f)
                lineTo(4.267f, 6.242f)
                close()
                moveTo(6.26f, 3f)
                curveTo(5.341f, 3f, 4.909f, 4.137f, 5.596f, 4.747f)
                lineTo(9.993f, 8.656f)
                curveTo(10.634f, 9.225f, 11f, 10.041f, 11f, 10.898f)
                verticalLineTo(19.086f)
                lineTo(13f, 21.086f)
                verticalLineTo(10.898f)
                curveTo(13f, 10.041f, 13.366f, 9.225f, 14.007f, 8.656f)
                lineTo(18.404f, 4.747f)
                curveTo(19.091f, 4.137f, 18.659f, 3f, 17.74f, 3f)
                horizontalLineTo(6.26f)
                close()
            }
        }.build()

        return _Filter!!
    }

@Suppress("ObjectPropertyName")
private var _Filter: ImageVector? = null
