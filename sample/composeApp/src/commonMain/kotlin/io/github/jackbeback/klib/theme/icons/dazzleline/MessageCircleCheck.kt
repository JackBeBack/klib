package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MessageCircleCheck: ImageVector
    get() {
        if (_MessageCircleCheck != null) {
            return _MessageCircleCheck!!
        }
        _MessageCircleCheck = ImageVector.Builder(
            name = "MessageCircleCheck",
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
                moveTo(9f, 12.222f)
                lineTo(10.846f, 14f)
                lineTo(15f, 10f)
                moveTo(21.004f, 12f)
                curveTo(21.004f, 16.971f, 16.975f, 21f, 12.004f, 21f)
                curveTo(9.967f, 21f, 3.005f, 21f, 3.005f, 21f)
                curveTo(3.005f, 21f, 4.564f, 17.256f, 3.94f, 16.001f)
                curveTo(3.341f, 14.796f, 3.004f, 13.437f, 3.004f, 12f)
                curveTo(3.004f, 7.029f, 7.033f, 3f, 12.004f, 3f)
                curveTo(16.975f, 3f, 21.004f, 7.029f, 21.004f, 12f)
                close()
            }
        }.build()

        return _MessageCircleCheck!!
    }

@Suppress("ObjectPropertyName")
private var _MessageCircleCheck: ImageVector? = null
