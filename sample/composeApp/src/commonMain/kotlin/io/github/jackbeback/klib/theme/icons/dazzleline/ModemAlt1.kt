package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ModemAlt1: ImageVector
    get() {
        if (_ModemAlt1 != null) {
            return _ModemAlt1!!
        }
        _ModemAlt1 = ImageVector.Builder(
            name = "ModemAlt1",
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
                moveTo(19f, 12f)
                lineTo(10f, 5f)
                moveTo(18f, 15f)
                horizontalLineTo(18.01f)
                moveTo(6.2f, 18f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 18f, 19.48f, 18f, 19.908f, 17.782f)
                curveTo(20.284f, 17.59f, 20.59f, 17.284f, 20.782f, 16.908f)
                curveTo(21f, 16.48f, 21f, 15.92f, 21f, 14.8f)
                verticalLineTo(13.6f)
                curveTo(21f, 13.04f, 21f, 12.76f, 20.891f, 12.546f)
                curveTo(20.795f, 12.358f, 20.642f, 12.205f, 20.454f, 12.109f)
                curveTo(20.24f, 12f, 19.96f, 12f, 19.4f, 12f)
                horizontalLineTo(4.6f)
                curveTo(4.04f, 12f, 3.76f, 12f, 3.546f, 12.109f)
                curveTo(3.358f, 12.205f, 3.205f, 12.358f, 3.109f, 12.546f)
                curveTo(3f, 12.76f, 3f, 13.04f, 3f, 13.6f)
                verticalLineTo(14.8f)
                curveTo(3f, 15.92f, 3f, 16.48f, 3.218f, 16.908f)
                curveTo(3.41f, 17.284f, 3.716f, 17.59f, 4.092f, 17.782f)
                curveTo(4.52f, 18f, 5.08f, 18f, 6.2f, 18f)
                close()
            }
        }.build()

        return _ModemAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _ModemAlt1: ImageVector? = null
