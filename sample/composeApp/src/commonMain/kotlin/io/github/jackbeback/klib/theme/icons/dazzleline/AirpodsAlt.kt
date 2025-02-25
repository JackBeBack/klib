package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.AirpodsAlt: ImageVector
    get() {
        if (_AirpodsAlt != null) {
            return _AirpodsAlt!!
        }
        _AirpodsAlt = ImageVector.Builder(
            name = "AirpodsAlt",
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
                moveTo(6f, 6f)
                verticalLineTo(7f)
                moveTo(18f, 6f)
                verticalLineTo(7f)
                moveTo(18.375f, 10.273f)
                curveTo(20.308f, 10.273f, 21f, 8.479f, 21f, 6.529f)
                curveTo(21f, 4.58f, 19.433f, 3f, 17.5f, 3f)
                curveTo(15.567f, 3f, 14f, 4.58f, 14f, 6.529f)
                verticalLineTo(21f)
                horizontalLineTo(17.5f)
                verticalLineTo(11.073f)
                curveTo(17.5f, 10.793f, 17.5f, 10.653f, 17.555f, 10.546f)
                curveTo(17.602f, 10.452f, 17.679f, 10.375f, 17.773f, 10.327f)
                curveTo(17.88f, 10.273f, 18.02f, 10.273f, 18.3f, 10.273f)
                horizontalLineTo(18.375f)
                close()
                moveTo(5.625f, 10.273f)
                curveTo(3.692f, 10.273f, 3f, 8.479f, 3f, 6.529f)
                curveTo(3f, 4.58f, 4.567f, 3f, 6.5f, 3f)
                curveTo(8.433f, 3f, 10f, 4.58f, 10f, 6.529f)
                verticalLineTo(21f)
                horizontalLineTo(6.5f)
                verticalLineTo(11.073f)
                curveTo(6.5f, 10.793f, 6.5f, 10.653f, 6.445f, 10.546f)
                curveTo(6.398f, 10.452f, 6.321f, 10.375f, 6.227f, 10.327f)
                curveTo(6.12f, 10.273f, 5.98f, 10.273f, 5.7f, 10.273f)
                horizontalLineTo(5.625f)
                close()
            }
        }.build()

        return _AirpodsAlt!!
    }

@Suppress("ObjectPropertyName")
private var _AirpodsAlt: ImageVector? = null
