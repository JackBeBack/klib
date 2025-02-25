package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HalloweenCalendarAlt: ImageVector
    get() {
        if (_HalloweenCalendarAlt != null) {
            return _HalloweenCalendarAlt!!
        }
        _HalloweenCalendarAlt = ImageVector.Builder(
            name = "HalloweenCalendarAlt",
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
                moveTo(7f, 3f)
                verticalLineTo(5f)
                moveTo(17f, 3f)
                verticalLineTo(5f)
                moveTo(16f, 18f)
                verticalLineTo(16.2f)
                curveTo(16f, 15.08f, 16f, 14.52f, 16.218f, 14.092f)
                curveTo(16.41f, 13.716f, 16.716f, 13.41f, 17.092f, 13.218f)
                curveTo(17.52f, 13f, 18.08f, 13f, 19.2f, 13f)
                horizontalLineTo(21f)
                lineTo(16f, 18f)
                close()
                moveTo(16f, 18f)
                horizontalLineTo(3f)
                moveTo(7f, 9f)
                horizontalLineTo(17f)
                moveTo(7f, 13f)
                lineTo(8f, 14f)
                lineTo(10f, 12f)
                moveTo(6.2f, 21f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 21f, 19.48f, 21f, 19.908f, 20.782f)
                curveTo(20.284f, 20.59f, 20.59f, 20.284f, 20.782f, 19.908f)
                curveTo(21f, 19.48f, 21f, 18.92f, 21f, 17.8f)
                verticalLineTo(8.2f)
                curveTo(21f, 7.08f, 21f, 6.52f, 20.782f, 6.092f)
                curveTo(20.59f, 5.716f, 20.284f, 5.41f, 19.908f, 5.218f)
                curveTo(19.48f, 5f, 18.92f, 5f, 17.8f, 5f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 5f, 4.52f, 5f, 4.092f, 5.218f)
                curveTo(3.716f, 5.41f, 3.41f, 5.716f, 3.218f, 6.092f)
                curveTo(3f, 6.52f, 3f, 7.08f, 3f, 8.2f)
                verticalLineTo(17.8f)
                curveTo(3f, 18.92f, 3f, 19.48f, 3.218f, 19.908f)
                curveTo(3.41f, 20.284f, 3.716f, 20.59f, 4.092f, 20.782f)
                curveTo(4.52f, 21f, 5.08f, 21f, 6.2f, 21f)
                close()
            }
        }.build()

        return _HalloweenCalendarAlt!!
    }

@Suppress("ObjectPropertyName")
private var _HalloweenCalendarAlt: ImageVector? = null
