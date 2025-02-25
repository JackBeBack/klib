package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Calendars: ImageVector
    get() {
        if (_Calendars != null) {
            return _Calendars!!
        }
        _Calendars = ImageVector.Builder(
            name = "Calendars",
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
                moveTo(7f, 8f)
                horizontalLineTo(21f)
                moveTo(11f, 3f)
                verticalLineTo(4f)
                moveTo(17f, 3f)
                verticalLineTo(4f)
                moveTo(18f, 21f)
                horizontalLineTo(7.8f)
                curveTo(6.12f, 21f, 5.28f, 21f, 4.638f, 20.673f)
                curveTo(4.074f, 20.385f, 3.615f, 19.927f, 3.327f, 19.362f)
                curveTo(3f, 18.72f, 3f, 17.88f, 3f, 16.2f)
                verticalLineTo(6f)
                moveTo(10.2f, 17f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 17f, 19.48f, 17f, 19.908f, 16.782f)
                curveTo(20.284f, 16.59f, 20.59f, 16.284f, 20.782f, 15.908f)
                curveTo(21f, 15.48f, 21f, 14.92f, 21f, 13.8f)
                verticalLineTo(7.2f)
                curveTo(21f, 6.08f, 21f, 5.52f, 20.782f, 5.092f)
                curveTo(20.59f, 4.716f, 20.284f, 4.41f, 19.908f, 4.218f)
                curveTo(19.48f, 4f, 18.92f, 4f, 17.8f, 4f)
                horizontalLineTo(10.2f)
                curveTo(9.08f, 4f, 8.52f, 4f, 8.092f, 4.218f)
                curveTo(7.716f, 4.41f, 7.41f, 4.716f, 7.218f, 5.092f)
                curveTo(7f, 5.52f, 7f, 6.08f, 7f, 7.2f)
                verticalLineTo(13.8f)
                curveTo(7f, 14.92f, 7f, 15.48f, 7.218f, 15.908f)
                curveTo(7.41f, 16.284f, 7.716f, 16.59f, 8.092f, 16.782f)
                curveTo(8.52f, 17f, 9.08f, 17f, 10.2f, 17f)
                close()
            }
        }.build()

        return _Calendars!!
    }

@Suppress("ObjectPropertyName")
private var _Calendars: ImageVector? = null
