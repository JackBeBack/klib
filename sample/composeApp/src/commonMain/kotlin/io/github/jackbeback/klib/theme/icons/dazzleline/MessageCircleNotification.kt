package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MessageCircleNotification: ImageVector
    get() {
        if (_MessageCircleNotification != null) {
            return _MessageCircleNotification!!
        }
        _MessageCircleNotification = ImageVector.Builder(
            name = "MessageCircleNotification",
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
                moveTo(21.004f, 12f)
                curveTo(21.004f, 16.971f, 16.975f, 21f, 12.004f, 21f)
                horizontalLineTo(3.005f)
                curveTo(3.005f, 21f, 4.564f, 17.256f, 3.94f, 16.001f)
                curveTo(3.341f, 14.796f, 3.004f, 13.437f, 3.004f, 12f)
                curveTo(3.004f, 7.029f, 7.033f, 3f, 12.004f, 3f)
                moveTo(20.121f, 3.879f)
                curveTo(21.293f, 5.05f, 21.293f, 6.95f, 20.121f, 8.121f)
                curveTo(18.95f, 9.293f, 17.05f, 9.293f, 15.879f, 8.121f)
                curveTo(14.707f, 6.95f, 14.707f, 5.05f, 15.879f, 3.879f)
                curveTo(17.05f, 2.707f, 18.95f, 2.707f, 20.121f, 3.879f)
                close()
            }
        }.build()

        return _MessageCircleNotification!!
    }

@Suppress("ObjectPropertyName")
private var _MessageCircleNotification: ImageVector? = null
