package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowNext: ImageVector
    get() {
        if (_ArrowNext != null) {
            return _ArrowNext!!
        }
        _ArrowNext = ImageVector.Builder(
            name = "ArrowNext",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7.821f, 20.731f)
                curveTo(8.211f, 21.122f, 8.844f, 21.122f, 9.235f, 20.731f)
                lineTo(15.879f, 14.087f)
                curveTo(17.051f, 12.915f, 17.051f, 11.017f, 15.88f, 9.845f)
                lineTo(9.31f, 3.27f)
                curveTo(8.919f, 2.879f, 8.286f, 2.879f, 7.895f, 3.27f)
                curveTo(7.505f, 3.66f, 7.505f, 4.293f, 7.895f, 4.684f)
                lineTo(14.467f, 11.256f)
                curveTo(14.858f, 11.646f, 14.858f, 12.28f, 14.467f, 12.67f)
                lineTo(7.821f, 19.317f)
                curveTo(7.43f, 19.708f, 7.43f, 20.341f, 7.821f, 20.731f)
                close()
            }
        }.build()

        return _ArrowNext!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowNext: ImageVector? = null
