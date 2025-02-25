package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowOutcome: ImageVector
    get() {
        if (_ArrowOutcome != null) {
            return _ArrowOutcome!!
        }
        _ArrowOutcome = ImageVector.Builder(
            name = "ArrowOutcome",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(12f, 4f)
                curveTo(11.448f, 4f, 11f, 3.552f, 11f, 3f)
                curveTo(11f, 2.448f, 11.448f, 2f, 12f, 2f)
                lineTo(20f, 2f)
                curveTo(21.105f, 2f, 22f, 2.895f, 22f, 4f)
                verticalLineTo(12f)
                curveTo(22f, 12.552f, 21.552f, 13f, 21f, 13f)
                curveTo(20.448f, 13f, 20f, 12.552f, 20f, 12f)
                verticalLineTo(5.393f)
                lineTo(3.728f, 21.666f)
                curveTo(3.337f, 22.056f, 2.704f, 22.056f, 2.314f, 21.666f)
                curveTo(1.923f, 21.275f, 1.923f, 20.642f, 2.314f, 20.251f)
                lineTo(18.565f, 4f)
                lineTo(12f, 4f)
                close()
            }
        }.build()

        return _ArrowOutcome!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowOutcome: ImageVector? = null
