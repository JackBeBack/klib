package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MessageCircleChat: ImageVector
    get() {
        if (_MessageCircleChat != null) {
            return _MessageCircleChat!!
        }
        _MessageCircleChat = ImageVector.Builder(
            name = "MessageCircleChat",
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
                moveTo(19.4f, 18f)
                curveTo(19.784f, 17.25f, 20f, 16.4f, 20f, 15.5f)
                curveTo(20f, 12.462f, 17.538f, 10f, 14.5f, 10f)
                curveTo(11.462f, 10f, 9f, 12.462f, 9f, 15.5f)
                curveTo(9f, 18.538f, 11.462f, 21f, 14.5f, 21f)
                lineTo(21f, 21f)
                curveTo(21f, 21f, 20f, 20f, 19.414f, 18.029f)
                moveTo(18.85f, 12f)
                curveTo(18.948f, 11.515f, 19f, 11.014f, 19f, 10.5f)
                curveTo(19f, 6.358f, 15.642f, 3f, 11.5f, 3f)
                curveTo(7.358f, 3f, 4f, 6.358f, 4f, 10.5f)
                curveTo(4f, 11.377f, 4.15f, 12.218f, 4.427f, 13f)
                curveTo(5.501f, 16.012f, 3f, 18f, 3f, 18f)
                horizontalLineTo(9.5f)
            }
        }.build()

        return _MessageCircleChat!!
    }

@Suppress("ObjectPropertyName")
private var _MessageCircleChat: ImageVector? = null
