package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TicketSimple: ImageVector
    get() {
        if (_TicketSimple != null) {
            return _TicketSimple!!
        }
        _TicketSimple = ImageVector.Builder(
            name = "TicketSimple",
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
                moveTo(5f, 12f)
                curveTo(5f, 10.694f, 4.165f, 9.583f, 3f, 9.171f)
                verticalLineTo(7.6f)
                curveTo(3f, 7.04f, 3f, 6.76f, 3.109f, 6.546f)
                curveTo(3.205f, 6.358f, 3.358f, 6.205f, 3.546f, 6.109f)
                curveTo(3.76f, 6f, 4.04f, 6f, 4.6f, 6f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 6f, 20.24f, 6f, 20.454f, 6.109f)
                curveTo(20.642f, 6.205f, 20.795f, 6.358f, 20.891f, 6.546f)
                curveTo(21f, 6.76f, 21f, 7.04f, 21f, 7.6f)
                verticalLineTo(9.171f)
                curveTo(19.835f, 9.583f, 19f, 10.694f, 19f, 12f)
                curveTo(19f, 13.306f, 19.835f, 14.417f, 21f, 14.829f)
                verticalLineTo(16.4f)
                curveTo(21f, 16.96f, 21f, 17.24f, 20.891f, 17.454f)
                curveTo(20.795f, 17.642f, 20.642f, 17.795f, 20.454f, 17.891f)
                curveTo(20.24f, 18f, 19.96f, 18f, 19.4f, 18f)
                horizontalLineTo(4.6f)
                curveTo(4.04f, 18f, 3.76f, 18f, 3.546f, 17.891f)
                curveTo(3.358f, 17.795f, 3.205f, 17.642f, 3.109f, 17.454f)
                curveTo(3f, 17.24f, 3f, 16.96f, 3f, 16.4f)
                verticalLineTo(14.83f)
                curveTo(4.165f, 14.418f, 5f, 13.306f, 5f, 12f)
                close()
            }
        }.build()

        return _TicketSimple!!
    }

@Suppress("ObjectPropertyName")
private var _TicketSimple: ImageVector? = null
