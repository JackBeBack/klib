package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CalendarPen: ImageVector
    get() {
        if (_CalendarPen != null) {
            return _CalendarPen!!
        }
        _CalendarPen = ImageVector.Builder(
            name = "CalendarPen",
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
                moveTo(8f, 16.5f)
                lineTo(10.025f, 16.095f)
                curveTo(10.201f, 16.06f, 10.29f, 16.042f, 10.372f, 16.01f)
                curveTo(10.445f, 15.981f, 10.515f, 15.944f, 10.579f, 15.899f)
                curveTo(10.652f, 15.848f, 10.715f, 15.785f, 10.843f, 15.657f)
                lineTo(15f, 11.5f)
                curveTo(15.552f, 10.948f, 15.552f, 10.052f, 15f, 9.5f)
                curveTo(14.448f, 8.948f, 13.552f, 8.948f, 13f, 9.5f)
                lineTo(8.843f, 13.657f)
                curveTo(8.715f, 13.785f, 8.652f, 13.848f, 8.601f, 13.921f)
                curveTo(8.556f, 13.985f, 8.519f, 14.055f, 8.49f, 14.128f)
                curveTo(8.458f, 14.21f, 8.44f, 14.299f, 8.405f, 14.475f)
                lineTo(8f, 16.5f)
                close()
            }
        }.build()

        return _CalendarPen!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarPen: ImageVector? = null
