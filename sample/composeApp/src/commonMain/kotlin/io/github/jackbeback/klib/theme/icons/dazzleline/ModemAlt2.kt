package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ModemAlt2: ImageVector
    get() {
        if (_ModemAlt2 != null) {
            return _ModemAlt2!!
        }
        _ModemAlt2 = ImageVector.Builder(
            name = "ModemAlt2",
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
                moveTo(18f, 14.5f)
                horizontalLineTo(18.01f)
                moveTo(14f, 14.5f)
                horizontalLineTo(14.01f)
                moveTo(6f, 14.5f)
                horizontalLineTo(8f)
                moveTo(5f, 18f)
                verticalLineTo(20f)
                moveTo(6f, 4f)
                verticalLineTo(11f)
                moveTo(12f, 4f)
                verticalLineTo(11f)
                moveTo(18f, 4f)
                lineTo(18.01f, 11f)
                moveTo(19f, 18f)
                verticalLineTo(20f)
                moveTo(5.2f, 18f)
                horizontalLineTo(18.8f)
                curveTo(19.92f, 18f, 20.48f, 18f, 20.908f, 17.782f)
                curveTo(21.284f, 17.59f, 21.59f, 17.284f, 21.782f, 16.908f)
                curveTo(22f, 16.48f, 22f, 15.92f, 22f, 14.8f)
                verticalLineTo(12.6f)
                curveTo(22f, 12.04f, 22f, 11.76f, 21.891f, 11.546f)
                curveTo(21.795f, 11.358f, 21.642f, 11.205f, 21.454f, 11.109f)
                curveTo(21.24f, 11f, 20.96f, 11f, 20.4f, 11f)
                horizontalLineTo(3.6f)
                curveTo(3.04f, 11f, 2.76f, 11f, 2.546f, 11.109f)
                curveTo(2.358f, 11.205f, 2.205f, 11.358f, 2.109f, 11.546f)
                curveTo(2f, 11.76f, 2f, 12.04f, 2f, 12.6f)
                verticalLineTo(14.8f)
                curveTo(2f, 15.92f, 2f, 16.48f, 2.218f, 16.908f)
                curveTo(2.41f, 17.284f, 2.716f, 17.59f, 3.092f, 17.782f)
                curveTo(3.52f, 18f, 4.08f, 18f, 5.2f, 18f)
                close()
            }
        }.build()

        return _ModemAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _ModemAlt2: ImageVector? = null
