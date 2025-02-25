package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Move: ImageVector
    get() {
        if (_Move != null) {
            return _Move!!
        }
        _Move = ImageVector.Builder(
            name = "Move",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(22f, 6f)
                curveTo(22.552f, 6f, 23f, 6.448f, 23f, 7f)
                curveTo(23f, 7.552f, 22.552f, 8f, 22f, 8f)
                horizontalLineTo(2f)
                curveTo(1.448f, 8f, 1f, 7.552f, 1f, 7f)
                curveTo(1f, 6.448f, 1.448f, 6f, 2f, 6f)
                lineTo(22f, 6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(22f, 11f)
                curveTo(22.552f, 11f, 23f, 11.448f, 23f, 12f)
                curveTo(23f, 12.552f, 22.552f, 13f, 22f, 13f)
                horizontalLineTo(2f)
                curveTo(1.448f, 13f, 1f, 12.552f, 1f, 12f)
                curveTo(1f, 11.448f, 1.448f, 11f, 2f, 11f)
                horizontalLineTo(22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(23f, 17f)
                curveTo(23f, 16.448f, 22.552f, 16f, 22f, 16f)
                horizontalLineTo(2f)
                curveTo(1.448f, 16f, 1f, 16.448f, 1f, 17f)
                curveTo(1f, 17.552f, 1.448f, 18f, 2f, 18f)
                horizontalLineTo(22f)
                curveTo(22.552f, 18f, 23f, 17.552f, 23f, 17f)
                close()
            }
        }.build()

        return _Move!!
    }

@Suppress("ObjectPropertyName")
private var _Move: ImageVector? = null
