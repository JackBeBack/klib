package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TurnOff: ImageVector
    get() {
        if (_TurnOff != null) {
            return _TurnOff!!
        }
        _TurnOff = ImageVector.Builder(
            name = "TurnOff",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(16f, 6.07f)
                curveTo(18.391f, 7.453f, 20f, 10.039f, 20f, 13f)
                curveTo(20f, 17.418f, 16.418f, 21f, 12f, 21f)
                curveTo(7.582f, 21f, 4f, 17.418f, 4f, 13f)
                curveTo(4f, 10.039f, 5.609f, 7.453f, 8f, 6.07f)
                moveTo(12f, 3f)
                verticalLineTo(13f)
            }
        }.build()

        return _TurnOff!!
    }

@Suppress("ObjectPropertyName")
private var _TurnOff: ImageVector? = null
