package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CalendarHeart: ImageVector
    get() {
        if (_CalendarHeart != null) {
            return _CalendarHeart!!
        }
        _CalendarHeart = ImageVector.Builder(
            name = "CalendarHeart",
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
                moveTo(3f, 9f)
                horizontalLineTo(21f)
                moveTo(7f, 3f)
                verticalLineTo(5f)
                moveTo(17f, 3f)
                verticalLineTo(5f)
                moveTo(11.998f, 12.712f)
                curveTo(11.298f, 11.933f, 10.131f, 11.723f, 9.254f, 12.437f)
                curveTo(8.377f, 13.15f, 8.254f, 14.343f, 8.942f, 15.187f)
                curveTo(9.331f, 15.663f, 10.255f, 16.498f, 10.985f, 17.135f)
                curveTo(11.332f, 17.437f, 11.505f, 17.588f, 11.715f, 17.65f)
                curveTo(11.893f, 17.703f, 12.102f, 17.703f, 12.281f, 17.65f)
                curveTo(12.49f, 17.588f, 12.663f, 17.437f, 13.01f, 17.135f)
                curveTo(13.74f, 16.498f, 14.664f, 15.663f, 15.053f, 15.187f)
                curveTo(15.741f, 14.343f, 15.633f, 13.143f, 14.741f, 12.437f)
                curveTo(13.849f, 11.731f, 12.697f, 11.933f, 11.998f, 12.712f)
                close()
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

        return _CalendarHeart!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarHeart: ImageVector? = null
