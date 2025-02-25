package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Checkmark: ImageVector
    get() {
        if (_Checkmark != null) {
            return _Checkmark!!
        }
        _Checkmark = ImageVector.Builder(
            name = "Checkmark",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(22.705f, 4.954f)
                curveTo(22.314f, 4.564f, 21.681f, 4.564f, 21.291f, 4.954f)
                lineTo(8.727f, 17.518f)
                curveTo(8.336f, 17.908f, 7.703f, 17.908f, 7.313f, 17.518f)
                lineTo(2.714f, 12.919f)
                curveTo(2.323f, 12.528f, 1.69f, 12.528f, 1.3f, 12.919f)
                curveTo(0.909f, 13.309f, 0.909f, 13.943f, 1.3f, 14.333f)
                lineTo(5.904f, 18.929f)
                curveTo(7.076f, 20.099f, 8.974f, 20.098f, 10.144f, 18.927f)
                lineTo(22.705f, 6.368f)
                curveTo(23.095f, 5.978f, 23.095f, 5.345f, 22.705f, 4.954f)
                close()
            }
        }.build()

        return _Checkmark!!
    }

@Suppress("ObjectPropertyName")
private var _Checkmark: ImageVector? = null
