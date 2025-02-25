package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Text: ImageVector
    get() {
        if (_Text != null) {
            return _Text!!
        }
        _Text = ImageVector.Builder(
            name = "Text",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 4f)
                curveTo(2f, 2.895f, 2.895f, 2f, 4f, 2f)
                horizontalLineTo(20f)
                curveTo(21.105f, 2f, 22f, 2.895f, 22f, 4f)
                verticalLineTo(7f)
                curveTo(22f, 7.552f, 21.552f, 8f, 21f, 8f)
                curveTo(20.448f, 8f, 20f, 7.552f, 20f, 7f)
                verticalLineTo(5f)
                curveTo(20f, 4.448f, 19.552f, 4f, 19f, 4f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                curveTo(17.552f, 20f, 18f, 20.448f, 18f, 21f)
                curveTo(18f, 21.552f, 17.552f, 22f, 17f, 22f)
                horizontalLineTo(7f)
                curveTo(6.448f, 22f, 6f, 21.552f, 6f, 21f)
                curveTo(6f, 20.448f, 6.448f, 20f, 7f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                curveTo(4.448f, 4f, 4f, 4.448f, 4f, 5f)
                verticalLineTo(7f)
                curveTo(4f, 7.552f, 3.552f, 8f, 3f, 8f)
                curveTo(2.448f, 8f, 2f, 7.552f, 2f, 7f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _Text!!
    }

@Suppress("ObjectPropertyName")
private var _Text: ImageVector? = null
