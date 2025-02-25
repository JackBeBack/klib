package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MessageCircleImage: ImageVector
    get() {
        if (_MessageCircleImage != null) {
            return _MessageCircleImage!!
        }
        _MessageCircleImage = ImageVector.Builder(
            name = "MessageCircleImage",
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
                moveTo(3.005f, 21f)
                lineTo(16f, 8f)
                lineTo(21.002f, 12.17f)
                moveTo(3.005f, 21f)
                curveTo(3.005f, 21f, 9.967f, 21f, 12.004f, 21f)
                curveTo(16.918f, 21f, 20.912f, 17.062f, 21.002f, 12.17f)
                moveTo(3.005f, 21f)
                curveTo(3.005f, 21f, 4.564f, 17.256f, 3.94f, 16.001f)
                curveTo(3.341f, 14.796f, 3.004f, 13.437f, 3.004f, 12f)
                curveTo(3.004f, 7.029f, 7.033f, 3f, 12.004f, 3f)
                curveTo(16.975f, 3f, 21.004f, 7.029f, 21.004f, 12f)
                curveTo(21.004f, 12.057f, 21.003f, 12.113f, 21.002f, 12.17f)
                moveTo(11f, 13.002f)
                lineTo(7.5f, 10f)
                lineTo(3.268f, 14.174f)
            }
        }.build()

        return _MessageCircleImage!!
    }

@Suppress("ObjectPropertyName")
private var _MessageCircleImage: ImageVector? = null
