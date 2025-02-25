package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SwitchVertical: ImageVector
    get() {
        if (_SwitchVertical != null) {
            return _SwitchVertical!!
        }
        _SwitchVertical = ImageVector.Builder(
            name = "SwitchVertical",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 6f)
                lineTo(7f, 3f)
                moveTo(7f, 3f)
                lineTo(4f, 6f)
                moveTo(7f, 3f)
                verticalLineTo(17f)
                moveTo(14f, 18f)
                lineTo(17f, 21f)
                moveTo(17f, 21f)
                lineTo(20f, 18f)
                moveTo(17f, 21f)
                verticalLineTo(7f)
            }
        }.build()

        return _SwitchVertical!!
    }

@Suppress("ObjectPropertyName")
private var _SwitchVertical: ImageVector? = null
