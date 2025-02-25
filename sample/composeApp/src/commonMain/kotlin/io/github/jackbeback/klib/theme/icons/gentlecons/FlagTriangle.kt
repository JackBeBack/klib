package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.FlagTriangle: ImageVector
    get() {
        if (_FlagTriangle != null) {
            return _FlagTriangle!!
        }
        _FlagTriangle = ImageVector.Builder(
            name = "FlagTriangle",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 1f)
                curveTo(4.448f, 1f, 4f, 1.448f, 4f, 2f)
                verticalLineTo(22f)
                curveTo(4f, 22.552f, 4.448f, 23f, 5f, 23f)
                curveTo(5.552f, 23f, 6f, 22.552f, 6f, 22f)
                verticalLineTo(15.693f)
                lineTo(18.854f, 10.873f)
                curveTo(20.585f, 10.224f, 20.585f, 7.776f, 18.854f, 7.127f)
                lineTo(6f, 2.307f)
                verticalLineTo(2f)
                curveTo(6f, 1.448f, 5.552f, 1f, 5f, 1f)
                close()
                moveTo(6f, 4.443f)
                verticalLineTo(13.557f)
                lineTo(17.653f, 9.187f)
                curveTo(17.826f, 9.122f, 17.826f, 8.878f, 17.653f, 8.813f)
                lineTo(6f, 4.443f)
                close()
            }
        }.build()

        return _FlagTriangle!!
    }

@Suppress("ObjectPropertyName")
private var _FlagTriangle: ImageVector? = null
