package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MessageCircleRefresh: ImageVector
    get() {
        if (_MessageCircleRefresh != null) {
            return _MessageCircleRefresh!!
        }
        _MessageCircleRefresh = ImageVector.Builder(
            name = "MessageCircleRefresh",
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
                moveTo(13.7f, 14.436f)
                curveTo(13.169f, 14.911f, 12.469f, 15.2f, 11.7f, 15.2f)
                curveTo(10.043f, 15.2f, 8.7f, 13.857f, 8.7f, 12.2f)
                curveTo(8.7f, 10.543f, 10.043f, 9.2f, 11.7f, 9.2f)
                curveTo(13.006f, 9.2f, 14.118f, 10.035f, 14.53f, 11.2f)
                moveTo(15.2f, 8.7f)
                verticalLineTo(11.7f)
                horizontalLineTo(12.2f)
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

        return _MessageCircleRefresh!!
    }

@Suppress("ObjectPropertyName")
private var _MessageCircleRefresh: ImageVector? = null
