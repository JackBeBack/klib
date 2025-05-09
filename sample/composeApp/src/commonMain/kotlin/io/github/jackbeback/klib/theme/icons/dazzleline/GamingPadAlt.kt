package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GamingPadAlt: ImageVector
    get() {
        if (_GamingPadAlt != null) {
            return _GamingPadAlt!!
        }
        _GamingPadAlt = ImageVector.Builder(
            name = "GamingPadAlt",
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
                moveTo(6f, 12f)
                horizontalLineTo(10f)
                moveTo(8f, 10f)
                verticalLineTo(14f)
                moveTo(16f, 13f)
                horizontalLineTo(16.01f)
                moveTo(18f, 11f)
                horizontalLineTo(18.01f)
                moveTo(5.2f, 18f)
                horizontalLineTo(18.8f)
                curveTo(19.92f, 18f, 20.48f, 18f, 20.908f, 17.782f)
                curveTo(21.284f, 17.59f, 21.59f, 17.284f, 21.782f, 16.908f)
                curveTo(22f, 16.48f, 22f, 15.92f, 22f, 14.8f)
                verticalLineTo(9.2f)
                curveTo(22f, 8.08f, 22f, 7.52f, 21.782f, 7.092f)
                curveTo(21.59f, 6.716f, 21.284f, 6.41f, 20.908f, 6.218f)
                curveTo(20.48f, 6f, 19.92f, 6f, 18.8f, 6f)
                horizontalLineTo(5.2f)
                curveTo(4.08f, 6f, 3.52f, 6f, 3.092f, 6.218f)
                curveTo(2.716f, 6.41f, 2.41f, 6.716f, 2.218f, 7.092f)
                curveTo(2f, 7.52f, 2f, 8.08f, 2f, 9.2f)
                verticalLineTo(14.8f)
                curveTo(2f, 15.92f, 2f, 16.48f, 2.218f, 16.908f)
                curveTo(2.41f, 17.284f, 2.716f, 17.59f, 3.092f, 17.782f)
                curveTo(3.52f, 18f, 4.08f, 18f, 5.2f, 18f)
                close()
            }
        }.build()

        return _GamingPadAlt!!
    }

@Suppress("ObjectPropertyName")
private var _GamingPadAlt: ImageVector? = null
