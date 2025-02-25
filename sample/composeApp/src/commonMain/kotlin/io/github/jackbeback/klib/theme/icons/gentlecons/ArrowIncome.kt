package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowIncome: ImageVector
    get() {
        if (_ArrowIncome != null) {
            return _ArrowIncome!!
        }
        _ArrowIncome = ImageVector.Builder(
            name = "ArrowIncome",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(21.686f, 2.335f)
                curveTo(21.296f, 1.944f, 20.663f, 1.944f, 20.272f, 2.335f)
                lineTo(4f, 18.607f)
                verticalLineTo(12f)
                curveTo(4f, 11.448f, 3.552f, 11f, 3f, 11f)
                curveTo(2.448f, 11f, 2f, 11.448f, 2f, 12f)
                verticalLineTo(20f)
                curveTo(2f, 21.105f, 2.895f, 22f, 4f, 22f)
                horizontalLineTo(12f)
                curveTo(12.552f, 22f, 13f, 21.552f, 13f, 21f)
                curveTo(13f, 20.448f, 12.552f, 20f, 12f, 20f)
                horizontalLineTo(5.435f)
                lineTo(21.686f, 3.749f)
                curveTo(22.077f, 3.358f, 22.077f, 2.725f, 21.686f, 2.335f)
                close()
            }
        }.build()

        return _ArrowIncome!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowIncome: ImageVector? = null
