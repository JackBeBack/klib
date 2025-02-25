package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LocationPinSlash: ImageVector
    get() {
        if (_LocationPinSlash != null) {
            return _LocationPinSlash!!
        }
        _LocationPinSlash = ImageVector.Builder(
            name = "LocationPinSlash",
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
                moveTo(9.197f, 3.6f)
                curveTo(10.056f, 3.214f, 11.003f, 3f, 12f, 3f)
                curveTo(15.866f, 3f, 19f, 6.224f, 19f, 10.2f)
                curveTo(19f, 11.128f, 18.809f, 12.015f, 18.473f, 12.875f)
                moveTo(16.344f, 16.343f)
                curveTo(15.098f, 17.887f, 13.549f, 19.407f, 12f, 21f)
                curveTo(8.5f, 17.4f, 5f, 14.176f, 5f, 10.2f)
                curveTo(5f, 8.714f, 5.437f, 7.334f, 6.187f, 6.187f)
                moveTo(3f, 3f)
                lineTo(21f, 21f)
            }
        }.build()

        return _LocationPinSlash!!
    }

@Suppress("ObjectPropertyName")
private var _LocationPinSlash: ImageVector? = null
