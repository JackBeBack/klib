package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MessageSquareNotification: ImageVector
    get() {
        if (_MessageSquareNotification != null) {
            return _MessageSquareNotification!!
        }
        _MessageSquareNotification = ImageVector.Builder(
            name = "MessageSquareNotification",
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
                moveTo(3f, 13f)
                verticalLineTo(14.8f)
                curveTo(3f, 15.92f, 3f, 16.48f, 3.218f, 16.908f)
                curveTo(3.41f, 17.284f, 3.716f, 17.59f, 4.092f, 17.782f)
                curveTo(4.52f, 18f, 5.08f, 18f, 6.2f, 18f)
                horizontalLineTo(16.245f)
                curveTo(16.526f, 18f, 16.667f, 18f, 16.805f, 18.019f)
                curveTo(16.928f, 18.037f, 17.048f, 18.065f, 17.166f, 18.104f)
                curveTo(17.298f, 18.149f, 17.424f, 18.212f, 17.676f, 18.338f)
                lineTo(21f, 20f)
                verticalLineTo(7.2f)
                curveTo(21f, 6.08f, 21f, 5.52f, 20.782f, 5.092f)
                curveTo(20.59f, 4.716f, 20.284f, 4.41f, 19.908f, 4.218f)
                curveTo(19.48f, 4f, 18.92f, 4f, 17.8f, 4f)
                horizontalLineTo(13f)
                moveTo(8.121f, 3.879f)
                curveTo(9.293f, 5.05f, 9.293f, 6.95f, 8.121f, 8.121f)
                curveTo(6.95f, 9.293f, 5.05f, 9.293f, 3.879f, 8.121f)
                curveTo(2.707f, 6.95f, 2.707f, 5.05f, 3.879f, 3.879f)
                curveTo(5.05f, 2.707f, 6.95f, 2.707f, 8.121f, 3.879f)
                close()
            }
        }.build()

        return _MessageSquareNotification!!
    }

@Suppress("ObjectPropertyName")
private var _MessageSquareNotification: ImageVector? = null
