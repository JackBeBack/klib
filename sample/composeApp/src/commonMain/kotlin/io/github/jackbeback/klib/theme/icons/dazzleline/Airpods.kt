package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Airpods: ImageVector
    get() {
        if (_Airpods != null) {
            return _Airpods!!
        }
        _Airpods = ImageVector.Builder(
            name = "Airpods",
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
                moveTo(14f, 13f)
                verticalLineTo(6.529f)
                curveTo(14f, 4.58f, 15.567f, 3f, 17.5f, 3f)
                curveTo(19.433f, 3f, 21f, 4.58f, 21f, 6.529f)
                curveTo(21f, 8.479f, 20.308f, 10.273f, 18.375f, 10.273f)
                horizontalLineTo(18.3f)
                curveTo(18.02f, 10.273f, 17.88f, 10.273f, 17.773f, 10.327f)
                curveTo(17.679f, 10.375f, 17.602f, 10.452f, 17.555f, 10.546f)
                curveTo(17.5f, 10.653f, 17.5f, 10.793f, 17.5f, 11.073f)
                verticalLineTo(13f)
                moveTo(10f, 13f)
                verticalLineTo(6.529f)
                curveTo(10f, 4.58f, 8.433f, 3f, 6.5f, 3f)
                curveTo(4.567f, 3f, 3f, 4.58f, 3f, 6.529f)
                curveTo(3f, 8.479f, 3.692f, 10.273f, 5.625f, 10.273f)
                horizontalLineTo(5.7f)
                curveTo(5.98f, 10.273f, 6.12f, 10.273f, 6.227f, 10.327f)
                curveTo(6.321f, 10.375f, 6.398f, 10.452f, 6.445f, 10.546f)
                curveTo(6.5f, 10.653f, 6.5f, 10.793f, 6.5f, 11.073f)
                verticalLineTo(13f)
                moveTo(6f, 6f)
                verticalLineTo(7f)
                moveTo(18f, 6f)
                verticalLineTo(7f)
                moveTo(9.667f, 21f)
                horizontalLineTo(14.333f)
                curveTo(15.883f, 21f, 16.658f, 21f, 17.294f, 20.83f)
                curveTo(19.02f, 20.367f, 20.367f, 19.02f, 20.83f, 17.294f)
                curveTo(21f, 16.658f, 21f, 15.883f, 21f, 14.333f)
                curveTo(21f, 14.023f, 21f, 13.868f, 20.966f, 13.741f)
                curveTo(20.874f, 13.396f, 20.604f, 13.127f, 20.259f, 13.034f)
                curveTo(20.132f, 13f, 19.977f, 13f, 19.667f, 13f)
                horizontalLineTo(4.333f)
                curveTo(4.023f, 13f, 3.868f, 13f, 3.741f, 13.034f)
                curveTo(3.396f, 13.127f, 3.127f, 13.396f, 3.034f, 13.741f)
                curveTo(3f, 13.868f, 3f, 14.023f, 3f, 14.333f)
                curveTo(3f, 15.883f, 3f, 16.658f, 3.17f, 17.294f)
                curveTo(3.633f, 19.02f, 4.98f, 20.367f, 6.706f, 20.83f)
                curveTo(7.342f, 21f, 8.117f, 21f, 9.667f, 21f)
                close()
            }
        }.build()

        return _Airpods!!
    }

@Suppress("ObjectPropertyName")
private var _Airpods: ImageVector? = null
