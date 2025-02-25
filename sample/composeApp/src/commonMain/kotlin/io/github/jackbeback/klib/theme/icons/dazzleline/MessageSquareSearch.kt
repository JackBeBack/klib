package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MessageSquareSearch: ImageVector
    get() {
        if (_MessageSquareSearch != null) {
            return _MessageSquareSearch!!
        }
        _MessageSquareSearch = ImageVector.Builder(
            name = "MessageSquareSearch",
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
                moveTo(13.704f, 12.704f)
                lineTo(15.479f, 14.479f)
                moveTo(21f, 20f)
                lineTo(17.676f, 18.338f)
                curveTo(17.424f, 18.212f, 17.298f, 18.149f, 17.166f, 18.104f)
                curveTo(17.048f, 18.065f, 16.928f, 18.037f, 16.805f, 18.019f)
                curveTo(16.667f, 18f, 16.526f, 18f, 16.245f, 18f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 18f, 4.52f, 18f, 4.092f, 17.782f)
                curveTo(3.716f, 17.59f, 3.41f, 17.284f, 3.218f, 16.908f)
                curveTo(3f, 16.48f, 3f, 15.92f, 3f, 14.8f)
                verticalLineTo(7.2f)
                curveTo(3f, 6.08f, 3f, 5.52f, 3.218f, 5.092f)
                curveTo(3.41f, 4.716f, 3.716f, 4.41f, 4.092f, 4.218f)
                curveTo(4.52f, 4f, 5.08f, 4f, 6.2f, 4f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 4f, 19.48f, 4f, 19.908f, 4.218f)
                curveTo(20.284f, 4.41f, 20.59f, 4.716f, 20.782f, 5.092f)
                curveTo(21f, 5.52f, 21f, 6.08f, 21f, 7.2f)
                verticalLineTo(20f)
                close()
                moveTo(14.5f, 10.5f)
                curveTo(14.5f, 8.843f, 13.157f, 7.5f, 11.5f, 7.5f)
                curveTo(9.843f, 7.5f, 8.5f, 8.843f, 8.5f, 10.5f)
                curveTo(8.5f, 12.157f, 9.843f, 13.5f, 11.5f, 13.5f)
                curveTo(13.157f, 13.5f, 14.5f, 12.157f, 14.5f, 10.5f)
                close()
            }
        }.build()

        return _MessageSquareSearch!!
    }

@Suppress("ObjectPropertyName")
private var _MessageSquareSearch: ImageVector? = null
