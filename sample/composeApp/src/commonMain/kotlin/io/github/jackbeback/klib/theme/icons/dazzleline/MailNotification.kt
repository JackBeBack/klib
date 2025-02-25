package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MailNotification: ImageVector
    get() {
        if (_MailNotification != null) {
            return _MailNotification!!
        }
        _MailNotification = ImageVector.Builder(
            name = "MailNotification",
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
                moveTo(13f, 5f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 5f, 4.52f, 5f, 4.092f, 5.218f)
                curveTo(3.716f, 5.41f, 3.41f, 5.716f, 3.218f, 6.092f)
                curveTo(3f, 6.52f, 3f, 7.08f, 3f, 8.2f)
                verticalLineTo(15.8f)
                curveTo(3f, 16.92f, 3f, 17.48f, 3.218f, 17.908f)
                curveTo(3.41f, 18.284f, 3.716f, 18.59f, 4.092f, 18.782f)
                curveTo(4.52f, 19f, 5.08f, 19f, 6.2f, 19f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 19f, 19.48f, 19f, 19.908f, 18.782f)
                curveTo(20.284f, 18.59f, 20.59f, 18.284f, 20.782f, 17.908f)
                curveTo(21f, 17.48f, 21f, 16.92f, 21f, 15.8f)
                verticalLineTo(13f)
                moveTo(3f, 8f)
                lineTo(8.45f, 11.634f)
                curveTo(9.733f, 12.489f, 10.374f, 12.916f, 11.067f, 13.082f)
                curveTo(11.68f, 13.229f, 12.32f, 13.229f, 12.933f, 13.082f)
                curveTo(13.626f, 12.916f, 14.267f, 12.489f, 15.55f, 11.634f)
                moveTo(22f, 6.5f)
                curveTo(22f, 7.881f, 20.881f, 9f, 19.5f, 9f)
                curveTo(18.119f, 9f, 17f, 7.881f, 17f, 6.5f)
                curveTo(17f, 5.119f, 18.119f, 4f, 19.5f, 4f)
                curveTo(20.881f, 4f, 22f, 5.119f, 22f, 6.5f)
                close()
            }
        }.build()

        return _MailNotification!!
    }

@Suppress("ObjectPropertyName")
private var _MailNotification: ImageVector? = null
