package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Menu: ImageVector
    get() {
        if (_Menu != null) {
            return _Menu!!
        }
        _Menu = ImageVector.Builder(
            name = "Menu",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(1f, 12f)
                curveTo(1f, 11.448f, 1.448f, 11f, 2f, 11f)
                horizontalLineTo(22f)
                curveTo(22.552f, 11f, 23f, 11.448f, 23f, 12f)
                curveTo(23f, 12.552f, 22.552f, 13f, 22f, 13f)
                horizontalLineTo(2f)
                curveTo(1.448f, 13f, 1f, 12.552f, 1f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(1f, 4f)
                curveTo(1f, 3.448f, 1.448f, 3f, 2f, 3f)
                horizontalLineTo(22f)
                curveTo(22.552f, 3f, 23f, 3.448f, 23f, 4f)
                curveTo(23f, 4.552f, 22.552f, 5f, 22f, 5f)
                horizontalLineTo(2f)
                curveTo(1.448f, 5f, 1f, 4.552f, 1f, 4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(1f, 20f)
                curveTo(1f, 19.448f, 1.448f, 19f, 2f, 19f)
                horizontalLineTo(22f)
                curveTo(22.552f, 19f, 23f, 19.448f, 23f, 20f)
                curveTo(23f, 20.552f, 22.552f, 21f, 22f, 21f)
                horizontalLineTo(2f)
                curveTo(1.448f, 21f, 1f, 20.552f, 1f, 20f)
                close()
            }
        }.build()

        return _Menu!!
    }

@Suppress("ObjectPropertyName")
private var _Menu: ImageVector? = null
