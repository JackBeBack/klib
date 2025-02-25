package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CalendarCircleMinus: ImageVector
    get() {
        if (_CalendarCircleMinus != null) {
            return _CalendarCircleMinus!!
        }
        _CalendarCircleMinus = ImageVector.Builder(
            name = "CalendarCircleMinus",
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
                moveTo(17f, 11f)
                curveTo(14.239f, 11f, 12f, 13.239f, 12f, 16f)
                curveTo(12f, 18.761f, 14.239f, 21f, 17f, 21f)
                curveTo(19.761f, 21f, 22f, 18.761f, 22f, 16f)
                curveTo(22f, 13.239f, 19.761f, 11f, 17f, 11f)
                close()
                moveTo(17f, 11f)
                verticalLineTo(9f)
                moveTo(15f, 16f)
                horizontalLineTo(19f)
                moveTo(2f, 9f)
                verticalLineTo(15.8f)
                curveTo(2f, 16.92f, 2f, 17.48f, 2.218f, 17.908f)
                curveTo(2.41f, 18.284f, 2.716f, 18.59f, 3.092f, 18.782f)
                curveTo(3.52f, 19f, 4.08f, 19f, 5.2f, 19f)
                horizontalLineTo(13f)
                moveTo(2f, 9f)
                verticalLineTo(8.2f)
                curveTo(2f, 7.08f, 2f, 6.52f, 2.218f, 6.092f)
                curveTo(2.41f, 5.716f, 2.716f, 5.41f, 3.092f, 5.218f)
                curveTo(3.52f, 5f, 4.08f, 5f, 5.2f, 5f)
                horizontalLineTo(13.8f)
                curveTo(14.92f, 5f, 15.48f, 5f, 15.908f, 5.218f)
                curveTo(16.284f, 5.41f, 16.59f, 5.716f, 16.782f, 6.092f)
                curveTo(17f, 6.52f, 17f, 7.08f, 17f, 8.2f)
                verticalLineTo(9f)
                moveTo(2f, 9f)
                horizontalLineTo(17f)
                moveTo(5f, 3f)
                verticalLineTo(5f)
                moveTo(14f, 3f)
                verticalLineTo(5f)
            }
        }.build()

        return _CalendarCircleMinus!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarCircleMinus: ImageVector? = null
