package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Yuan: ImageVector
    get() {
        if (_Yuan != null) {
            return _Yuan!!
        }
        _Yuan = ImageVector.Builder(
            name = "Yuan",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6.8f, 2.4f)
                curveTo(6.469f, 1.958f, 5.842f, 1.869f, 5.4f, 2.2f)
                curveTo(4.958f, 2.531f, 4.869f, 3.158f, 5.2f, 3.6f)
                lineTo(10.75f, 11f)
                horizontalLineTo(7f)
                curveTo(6.448f, 11f, 6f, 11.448f, 6f, 12f)
                curveTo(6f, 12.552f, 6.448f, 13f, 7f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                curveTo(11f, 21.552f, 11.448f, 22f, 12f, 22f)
                curveTo(12.552f, 22f, 13f, 21.552f, 13f, 21f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                curveTo(17.552f, 13f, 18f, 12.552f, 18f, 12f)
                curveTo(18f, 11.448f, 17.552f, 11f, 17f, 11f)
                horizontalLineTo(13.25f)
                lineTo(18.8f, 3.6f)
                curveTo(19.131f, 3.158f, 19.042f, 2.531f, 18.6f, 2.2f)
                curveTo(18.158f, 1.869f, 17.531f, 1.958f, 17.2f, 2.4f)
                lineTo(12f, 9.333f)
                lineTo(6.8f, 2.4f)
                close()
            }
        }.build()

        return _Yuan!!
    }

@Suppress("ObjectPropertyName")
private var _Yuan: ImageVector? = null
