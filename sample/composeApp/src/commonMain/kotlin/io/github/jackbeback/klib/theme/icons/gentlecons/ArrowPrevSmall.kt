package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowPrevSmall: ImageVector
    get() {
        if (_ArrowPrevSmall != null) {
            return _ArrowPrevSmall!!
        }
        _ArrowPrevSmall = ImageVector.Builder(
            name = "ArrowPrevSmall",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(14.289f, 5.707f)
                curveTo(13.899f, 5.317f, 13.266f, 5.317f, 12.875f, 5.707f)
                lineTo(7.988f, 10.599f)
                curveTo(7.207f, 11.38f, 7.208f, 12.646f, 7.988f, 13.427f)
                lineTo(12.879f, 18.317f)
                curveTo(13.269f, 18.708f, 13.902f, 18.708f, 14.293f, 18.317f)
                curveTo(14.684f, 17.927f, 14.684f, 17.294f, 14.293f, 16.903f)
                lineTo(10.107f, 12.717f)
                curveTo(9.717f, 12.327f, 9.717f, 11.694f, 10.107f, 11.303f)
                lineTo(14.289f, 7.121f)
                curveTo(14.68f, 6.731f, 14.68f, 6.098f, 14.289f, 5.707f)
                close()
            }
        }.build()

        return _ArrowPrevSmall!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowPrevSmall: ImageVector? = null
