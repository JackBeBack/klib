package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Close: ImageVector
    get() {
        if (_Close != null) {
            return _Close!!
        }
        _Close = ImageVector.Builder(
            name = "Close",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(20.746f, 3.329f)
                curveTo(20.355f, 2.938f, 19.722f, 2.938f, 19.331f, 3.329f)
                lineTo(12.037f, 10.623f)
                lineTo(4.743f, 3.329f)
                curveTo(4.352f, 2.938f, 3.719f, 2.938f, 3.329f, 3.329f)
                curveTo(2.938f, 3.719f, 2.938f, 4.352f, 3.329f, 4.743f)
                lineTo(10.623f, 12.037f)
                lineTo(3.329f, 19.331f)
                curveTo(2.938f, 19.722f, 2.938f, 20.355f, 3.329f, 20.746f)
                curveTo(3.719f, 21.136f, 4.352f, 21.136f, 4.743f, 20.746f)
                lineTo(12.037f, 13.451f)
                lineTo(19.331f, 20.746f)
                curveTo(19.722f, 21.136f, 20.355f, 21.136f, 20.746f, 20.746f)
                curveTo(21.136f, 20.355f, 21.136f, 19.722f, 20.746f, 19.331f)
                lineTo(13.451f, 12.037f)
                lineTo(20.746f, 4.743f)
                curveTo(21.136f, 4.352f, 21.136f, 3.719f, 20.746f, 3.329f)
                close()
            }
        }.build()

        return _Close!!
    }

@Suppress("ObjectPropertyName")
private var _Close: ImageVector? = null
