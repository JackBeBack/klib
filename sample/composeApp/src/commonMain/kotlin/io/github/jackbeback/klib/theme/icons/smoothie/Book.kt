package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.Book: ImageVector
    get() {
        if (_Book != null) {
            return _Book!!
        }
        _Book = ImageVector.Builder(
            name = "Book",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-24f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 6.909f)
                curveTo(10.9f, 5.509f, 9.204f, 4.109f, 5.001f, 4.006f)
                curveTo(4.725f, 3.999f, 4.5f, 4.224f, 4.5f, 4.5f)
                curveTo(4.5f, 6.548f, 4.5f, 14.303f, 4.5f, 16.597f)
                curveTo(4.5f, 16.873f, 4.725f, 17.09f, 5.001f, 17.099f)
                curveTo(9.204f, 17.236f, 10.9f, 19.1f, 12f, 20.5f)
                moveTo(12f, 6.909f)
                curveTo(13.1f, 5.509f, 14.796f, 4.109f, 18.999f, 4.006f)
                curveTo(19.275f, 3.999f, 19.5f, 4.218f, 19.5f, 4.495f)
                curveTo(19.5f, 6.784f, 19.5f, 14.306f, 19.5f, 16.596f)
                curveTo(19.5f, 16.872f, 19.275f, 17.09f, 18.999f, 17.099f)
                curveTo(14.796f, 17.236f, 13.1f, 19.1f, 12f, 20.5f)
                moveTo(12f, 6.909f)
                lineTo(12f, 20.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.235f, 6f)
                horizontalLineTo(21.5f)
                curveTo(21.776f, 6f, 22f, 6.224f, 22f, 6.5f)
                verticalLineTo(19.539f)
                curveTo(22f, 19.944f, 21.523f, 20.212f, 21.153f, 20.048f)
                curveTo(20.358f, 19.695f, 19.031f, 19.263f, 17.294f, 19.263f)
                curveTo(14.353f, 19.263f, 12f, 21f, 12f, 21f)
                curveTo(12f, 21f, 9.647f, 19.263f, 6.706f, 19.263f)
                curveTo(4.968f, 19.263f, 3.642f, 19.695f, 2.846f, 20.048f)
                curveTo(2.477f, 20.212f, 2f, 19.944f, 2f, 19.539f)
                verticalLineTo(6.5f)
                curveTo(2f, 6.224f, 2.224f, 6f, 2.5f, 6f)
                horizontalLineTo(4.765f)
            }
        }.build()

        return _Book!!
    }

@Suppress("ObjectPropertyName")
private var _Book: ImageVector? = null
