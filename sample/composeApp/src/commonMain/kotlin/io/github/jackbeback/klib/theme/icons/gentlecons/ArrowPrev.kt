package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowPrev: ImageVector
    get() {
        if (_ArrowPrev != null) {
            return _ArrowPrev!!
        }
        _ArrowPrev = ImageVector.Builder(
            name = "ArrowPrev",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(16.18f, 3.269f)
                curveTo(15.789f, 2.878f, 15.156f, 2.878f, 14.765f, 3.269f)
                lineTo(8.121f, 9.913f)
                curveTo(6.95f, 11.085f, 6.949f, 12.983f, 8.12f, 14.155f)
                lineTo(14.69f, 20.73f)
                curveTo(15.081f, 21.121f, 15.714f, 21.121f, 16.104f, 20.73f)
                curveTo(16.495f, 20.34f, 16.495f, 19.707f, 16.104f, 19.316f)
                lineTo(9.532f, 12.744f)
                curveTo(9.142f, 12.354f, 9.142f, 11.72f, 9.532f, 11.33f)
                lineTo(16.18f, 4.683f)
                curveTo(16.57f, 4.292f, 16.57f, 3.659f, 16.18f, 3.269f)
                close()
            }
        }.build()

        return _ArrowPrev!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowPrev: ImageVector? = null
