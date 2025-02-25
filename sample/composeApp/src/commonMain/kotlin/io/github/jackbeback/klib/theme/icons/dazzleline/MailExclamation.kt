package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MailExclamation: ImageVector
    get() {
        if (_MailExclamation != null) {
            return _MailExclamation!!
        }
        _MailExclamation = ImageVector.Builder(
            name = "MailExclamation",
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
                moveTo(19f, 15f)
                verticalLineTo(18f)
                moveTo(19f, 21f)
                horizontalLineTo(19.01f)
                moveTo(15f, 19f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 19f, 4.52f, 19f, 4.092f, 18.782f)
                curveTo(3.716f, 18.59f, 3.41f, 18.284f, 3.218f, 17.908f)
                curveTo(3f, 17.48f, 3f, 16.92f, 3f, 15.8f)
                verticalLineTo(8.2f)
                curveTo(3f, 7.08f, 3f, 6.52f, 3.218f, 6.092f)
                curveTo(3.41f, 5.716f, 3.716f, 5.41f, 4.092f, 5.218f)
                curveTo(4.52f, 5f, 5.08f, 5f, 6.2f, 5f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 5f, 19.48f, 5f, 19.908f, 5.218f)
                curveTo(20.284f, 5.41f, 20.59f, 5.716f, 20.782f, 6.092f)
                curveTo(21f, 6.52f, 21f, 7.08f, 21f, 8.2f)
                verticalLineTo(11.5f)
                moveTo(20.607f, 8.262f)
                lineTo(15.55f, 11.634f)
                curveTo(14.267f, 12.489f, 13.625f, 12.917f, 12.932f, 13.083f)
                curveTo(12.319f, 13.229f, 11.68f, 13.229f, 11.068f, 13.083f)
                curveTo(10.374f, 12.917f, 9.733f, 12.489f, 8.45f, 11.634f)
                lineTo(3.147f, 8.099f)
            }
        }.build()

        return _MailExclamation!!
    }

@Suppress("ObjectPropertyName")
private var _MailExclamation: ImageVector? = null
