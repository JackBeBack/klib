package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Medium: ImageVector
    get() {
        if (_Medium != null) {
            return _Medium!!
        }
        _Medium = ImageVector.Builder(
            name = "Medium",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(13f, 12f)
                curveTo(13f, 15.314f, 10.314f, 18f, 7f, 18f)
                curveTo(3.686f, 18f, 1f, 15.314f, 1f, 12f)
                curveTo(1f, 8.686f, 3.686f, 6f, 7f, 6f)
                curveTo(10.314f, 6f, 13f, 8.686f, 13f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(23f, 12f)
                curveTo(23f, 14.761f, 22.552f, 17f, 22f, 17f)
                curveTo(21.448f, 17f, 21f, 14.761f, 21f, 12f)
                curveTo(21f, 9.239f, 21.448f, 7f, 22f, 7f)
                curveTo(22.552f, 7f, 23f, 9.239f, 23f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(17f, 18f)
                curveTo(18.657f, 18f, 20f, 15.314f, 20f, 12f)
                curveTo(20f, 8.686f, 18.657f, 6f, 17f, 6f)
                curveTo(15.343f, 6f, 14f, 8.686f, 14f, 12f)
                curveTo(14f, 15.314f, 15.343f, 18f, 17f, 18f)
                close()
            }
        }.build()

        return _Medium!!
    }

@Suppress("ObjectPropertyName")
private var _Medium: ImageVector? = null
