package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MessageSquareChat: ImageVector
    get() {
        if (_MessageSquareChat != null) {
            return _MessageSquareChat!!
        }
        _MessageSquareChat = ImageVector.Builder(
            name = "MessageSquareChat",
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
                moveTo(18f, 9f)
                verticalLineTo(7.2f)
                curveTo(18f, 6.08f, 18f, 5.52f, 17.782f, 5.092f)
                curveTo(17.59f, 4.716f, 17.284f, 4.41f, 16.908f, 4.218f)
                curveTo(16.48f, 4f, 15.92f, 4f, 14.8f, 4f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 4f, 5.52f, 4f, 5.092f, 4.218f)
                curveTo(4.716f, 4.41f, 4.41f, 4.716f, 4.218f, 5.092f)
                curveTo(4f, 5.52f, 4f, 6.08f, 4f, 7.2f)
                verticalLineTo(18f)
                lineTo(8f, 16f)
                moveTo(20f, 20f)
                lineTo(17.806f, 18.537f)
                curveTo(17.507f, 18.338f, 17.357f, 18.238f, 17.195f, 18.167f)
                curveTo(17.051f, 18.104f, 16.9f, 18.059f, 16.745f, 18.031f)
                curveTo(16.571f, 18f, 16.391f, 18f, 16.031f, 18f)
                horizontalLineTo(11.2f)
                curveTo(10.08f, 18f, 9.52f, 18f, 9.092f, 17.782f)
                curveTo(8.716f, 17.59f, 8.41f, 17.284f, 8.218f, 16.908f)
                curveTo(8f, 16.48f, 8f, 15.92f, 8f, 14.8f)
                verticalLineTo(12.2f)
                curveTo(8f, 11.08f, 8f, 10.52f, 8.218f, 10.092f)
                curveTo(8.41f, 9.716f, 8.716f, 9.41f, 9.092f, 9.218f)
                curveTo(9.52f, 9f, 10.08f, 9f, 11.2f, 9f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 9f, 18.48f, 9f, 18.908f, 9.218f)
                curveTo(19.284f, 9.41f, 19.59f, 9.716f, 19.782f, 10.092f)
                curveTo(20f, 10.52f, 20f, 11.08f, 20f, 12.2f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _MessageSquareChat!!
    }

@Suppress("ObjectPropertyName")
private var _MessageSquareChat: ImageVector? = null
