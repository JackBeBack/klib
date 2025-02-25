package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HalloweenCalendar: ImageVector
    get() {
        if (_HalloweenCalendar != null) {
            return _HalloweenCalendar!!
        }
        _HalloweenCalendar = ImageVector.Builder(
            name = "HalloweenCalendar",
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
                moveTo(7f, 16f)
                lineTo(8f, 17.5f)
                lineTo(9.5f, 16.5f)
                lineTo(10.5f, 18f)
                lineTo(12f, 16.5f)
                lineTo(13.5f, 18f)
                lineTo(14.5f, 16.5f)
                lineTo(16f, 17.5f)
                lineTo(17f, 16f)
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
                moveTo(17.743f, 7.757f)
                curveTo(18.719f, 8.734f, 18.561f, 10.475f, 17.389f, 11.646f)
                curveTo(16.218f, 12.818f, 14.476f, 12.976f, 13.5f, 12f)
                lineTo(17.743f, 7.757f)
                close()
                moveTo(6.257f, 7.757f)
                curveTo(5.281f, 8.734f, 5.439f, 10.475f, 6.611f, 11.646f)
                curveTo(7.782f, 12.818f, 9.524f, 12.976f, 10.5f, 12f)
                lineTo(6.257f, 7.757f)
                close()
            }
        }.build()

        return _HalloweenCalendar!!
    }

@Suppress("ObjectPropertyName")
private var _HalloweenCalendar: ImageVector? = null
