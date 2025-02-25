package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Mailbox: ImageVector
    get() {
        if (_Mailbox != null) {
            return _Mailbox!!
        }
        _Mailbox = ImageVector.Builder(
            name = "Mailbox",
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
                moveTo(12f, 21f)
                verticalLineTo(18f)
                moveTo(7f, 12f)
                horizontalLineTo(10f)
                moveTo(17.5f, 6f)
                horizontalLineTo(7.8f)
                curveTo(6.12f, 6f, 5.28f, 6f, 4.638f, 6.327f)
                curveTo(4.074f, 6.615f, 3.615f, 7.074f, 3.327f, 7.638f)
                curveTo(3f, 8.28f, 3f, 9.12f, 3f, 10.8f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                moveTo(17.5f, 6f)
                curveTo(19.433f, 6f, 21f, 7.567f, 21f, 9.5f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                moveTo(17.5f, 6f)
                curveTo(15.567f, 6f, 14f, 7.567f, 14f, 9.5f)
                verticalLineTo(18f)
                moveTo(15f, 3f)
                horizontalLineTo(12f)
                verticalLineTo(6f)
            }
        }.build()

        return _Mailbox!!
    }

@Suppress("ObjectPropertyName")
private var _Mailbox: ImageVector? = null
