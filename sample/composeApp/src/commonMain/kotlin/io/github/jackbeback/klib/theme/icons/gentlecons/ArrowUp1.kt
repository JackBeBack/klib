package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowUp1: ImageVector
    get() {
        if (_ArrowUp1 != null) {
            return _ArrowUp1!!
        }
        _ArrowUp1 = ImageVector.Builder(
            name = "ArrowUp1",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7.332f, 7.685f)
                curveTo(6.941f, 8.075f, 6.308f, 8.075f, 5.918f, 7.685f)
                curveTo(5.527f, 7.294f, 5.527f, 6.661f, 5.918f, 6.27f)
                lineTo(10.583f, 1.605f)
                curveTo(11.364f, 0.824f, 12.631f, 0.824f, 13.412f, 1.605f)
                lineTo(18.08f, 6.273f)
                curveTo(18.471f, 6.664f, 18.471f, 7.297f, 18.08f, 7.687f)
                curveTo(17.69f, 8.078f, 17.056f, 8.078f, 16.666f, 7.687f)
                lineTo(13f, 4.021f)
                verticalLineTo(22f)
                curveTo(13f, 22.552f, 12.552f, 23f, 12f, 23f)
                curveTo(11.448f, 23f, 11f, 22.552f, 11f, 22f)
                verticalLineTo(4.017f)
                lineTo(7.332f, 7.685f)
                close()
            }
        }.build()

        return _ArrowUp1!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUp1: ImageVector? = null
