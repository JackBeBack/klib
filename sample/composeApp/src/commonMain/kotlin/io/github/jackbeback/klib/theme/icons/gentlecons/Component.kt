package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Component: ImageVector
    get() {
        if (_Component != null) {
            return _Component!!
        }
        _Component = ImageVector.Builder(
            name = "Component",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11.646f, 1.354f)
                lineTo(7.854f, 5.146f)
                curveTo(7.658f, 5.342f, 7.658f, 5.658f, 7.854f, 5.854f)
                lineTo(11.646f, 9.646f)
                curveTo(11.842f, 9.842f, 12.158f, 9.842f, 12.354f, 9.646f)
                lineTo(16.146f, 5.854f)
                curveTo(16.342f, 5.658f, 16.342f, 5.342f, 16.146f, 5.146f)
                lineTo(12.354f, 1.354f)
                curveTo(12.158f, 1.158f, 11.842f, 1.158f, 11.646f, 1.354f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11.646f, 14.354f)
                lineTo(7.854f, 18.146f)
                curveTo(7.658f, 18.342f, 7.658f, 18.658f, 7.854f, 18.854f)
                lineTo(11.646f, 22.646f)
                curveTo(11.842f, 22.842f, 12.158f, 22.842f, 12.354f, 22.646f)
                lineTo(16.146f, 18.854f)
                curveTo(16.342f, 18.658f, 16.342f, 18.342f, 16.146f, 18.146f)
                lineTo(12.354f, 14.354f)
                curveTo(12.158f, 14.158f, 11.842f, 14.158f, 11.646f, 14.354f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(1.354f, 11.646f)
                lineTo(5.147f, 7.854f)
                curveTo(5.342f, 7.658f, 5.658f, 7.658f, 5.854f, 7.854f)
                lineTo(9.646f, 11.646f)
                curveTo(9.842f, 11.842f, 9.842f, 12.158f, 9.646f, 12.354f)
                lineTo(5.854f, 16.146f)
                curveTo(5.658f, 16.342f, 5.342f, 16.342f, 5.147f, 16.146f)
                lineTo(1.354f, 12.354f)
                curveTo(1.158f, 12.158f, 1.158f, 11.842f, 1.354f, 11.646f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(18.146f, 7.854f)
                lineTo(14.354f, 11.646f)
                curveTo(14.158f, 11.842f, 14.158f, 12.158f, 14.354f, 12.354f)
                lineTo(18.146f, 16.146f)
                curveTo(18.342f, 16.342f, 18.658f, 16.342f, 18.854f, 16.146f)
                lineTo(22.646f, 12.354f)
                curveTo(22.842f, 12.158f, 22.842f, 11.842f, 22.646f, 11.646f)
                lineTo(18.854f, 7.854f)
                curveTo(18.658f, 7.658f, 18.342f, 7.658f, 18.146f, 7.854f)
                close()
            }
        }.build()

        return _Component!!
    }

@Suppress("ObjectPropertyName")
private var _Component: ImageVector? = null
