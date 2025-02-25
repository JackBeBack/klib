package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ModemAlt: ImageVector
    get() {
        if (_ModemAlt != null) {
            return _ModemAlt!!
        }
        _ModemAlt = ImageVector.Builder(
            name = "ModemAlt",
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
                moveTo(12f, 14f)
                verticalLineTo(9f)
                moveTo(6.5f, 17.5f)
                horizontalLineTo(10.5f)
                moveTo(7.416f, 11f)
                curveTo(7.148f, 10.388f, 7f, 9.712f, 7f, 9f)
                curveTo(7f, 7.875f, 7.372f, 6.836f, 8f, 6f)
                moveTo(16.584f, 11f)
                curveTo(16.852f, 10.388f, 17f, 9.712f, 17f, 9f)
                curveTo(17f, 7.875f, 16.628f, 6.836f, 16f, 6f)
                moveTo(18.708f, 3f)
                curveTo(20.133f, 4.592f, 21f, 6.695f, 21f, 9f)
                curveTo(21f, 9.687f, 20.923f, 10.357f, 20.777f, 11f)
                moveTo(5.292f, 3f)
                curveTo(3.867f, 4.592f, 3f, 6.695f, 3f, 9f)
                curveTo(3f, 9.687f, 3.077f, 10.357f, 3.223f, 11f)
                moveTo(6.2f, 21f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 21f, 19.48f, 21f, 19.908f, 20.782f)
                curveTo(20.284f, 20.59f, 20.59f, 20.284f, 20.782f, 19.908f)
                curveTo(21f, 19.48f, 21f, 18.92f, 21f, 17.8f)
                verticalLineTo(17.2f)
                curveTo(21f, 16.08f, 21f, 15.52f, 20.782f, 15.092f)
                curveTo(20.59f, 14.716f, 20.284f, 14.41f, 19.908f, 14.218f)
                curveTo(19.48f, 14f, 18.92f, 14f, 17.8f, 14f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 14f, 4.52f, 14f, 4.092f, 14.218f)
                curveTo(3.716f, 14.41f, 3.41f, 14.716f, 3.218f, 15.092f)
                curveTo(3f, 15.52f, 3f, 16.08f, 3f, 17.2f)
                verticalLineTo(17.8f)
                curveTo(3f, 18.92f, 3f, 19.48f, 3.218f, 19.908f)
                curveTo(3.41f, 20.284f, 3.716f, 20.59f, 4.092f, 20.782f)
                curveTo(4.52f, 21f, 5.08f, 21f, 6.2f, 21f)
                close()
            }
        }.build()

        return _ModemAlt!!
    }

@Suppress("ObjectPropertyName")
private var _ModemAlt: ImageVector? = null
