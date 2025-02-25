package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MailboxAlt: ImageVector
    get() {
        if (_MailboxAlt != null) {
            return _MailboxAlt!!
        }
        _MailboxAlt = ImageVector.Builder(
            name = "MailboxAlt",
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
                moveTo(7f, 6f)
                horizontalLineTo(17.2f)
                curveTo(18.88f, 6f, 19.72f, 6f, 20.362f, 6.327f)
                curveTo(20.927f, 6.615f, 21.385f, 7.074f, 21.673f, 7.638f)
                curveTo(22f, 8.28f, 22f, 9.12f, 22f, 10.8f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                moveTo(7f, 6f)
                curveTo(9.209f, 6f, 11f, 7.791f, 11f, 10f)
                verticalLineTo(18f)
                moveTo(7f, 6f)
                curveTo(4.791f, 6f, 3f, 7.791f, 3f, 10f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                moveTo(17f, 3f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                moveTo(10f, 18f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                moveTo(7f, 12f)
                horizontalLineTo(7.01f)
            }
        }.build()

        return _MailboxAlt!!
    }

@Suppress("ObjectPropertyName")
private var _MailboxAlt: ImageVector? = null
