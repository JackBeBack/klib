package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowRight: ImageVector
    get() {
        if (_ArrowRight != null) {
            return _ArrowRight!!
        }
        _ArrowRight = ImageVector.Builder(
            name = "ArrowRight",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(16.315f, 16.668f)
                curveTo(15.925f, 17.059f, 15.925f, 17.692f, 16.315f, 18.082f)
                curveTo(16.706f, 18.473f, 17.339f, 18.473f, 17.729f, 18.082f)
                lineTo(22.395f, 13.417f)
                curveTo(23.176f, 12.636f, 23.176f, 11.369f, 22.395f, 10.588f)
                lineTo(17.727f, 5.92f)
                curveTo(17.336f, 5.529f, 16.703f, 5.529f, 16.312f, 5.92f)
                curveTo(15.922f, 6.31f, 15.922f, 6.944f, 16.312f, 7.334f)
                lineTo(19.979f, 11f)
                lineTo(2f, 11f)
                curveTo(1.448f, 11f, 1f, 11.448f, 1f, 12f)
                curveTo(1f, 12.552f, 1.448f, 13f, 2f, 13f)
                lineTo(19.983f, 13f)
                lineTo(16.315f, 16.668f)
                close()
            }
        }.build()

        return _ArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRight: ImageVector? = null
