package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MapPinAlt: ImageVector
    get() {
        if (_MapPinAlt != null) {
            return _MapPinAlt!!
        }
        _MapPinAlt = ImageVector.Builder(
            name = "MapPinAlt",
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
                moveTo(5.7f, 15f)
                curveTo(4.034f, 15.635f, 3f, 16.521f, 3f, 17.5f)
                curveTo(3f, 19.433f, 7.029f, 21f, 12f, 21f)
                curveTo(16.971f, 21f, 21f, 19.433f, 21f, 17.5f)
                curveTo(21f, 16.521f, 19.966f, 15.635f, 18.3f, 15f)
                moveTo(12f, 9f)
                horizontalLineTo(12.01f)
                moveTo(18f, 9f)
                curveTo(18f, 13.064f, 13.5f, 15f, 12f, 18f)
                curveTo(10.5f, 15f, 6f, 13.064f, 6f, 9f)
                curveTo(6f, 5.686f, 8.686f, 3f, 12f, 3f)
                curveTo(15.314f, 3f, 18f, 5.686f, 18f, 9f)
                close()
                moveTo(13f, 9f)
                curveTo(13f, 9.552f, 12.552f, 10f, 12f, 10f)
                curveTo(11.448f, 10f, 11f, 9.552f, 11f, 9f)
                curveTo(11f, 8.448f, 11.448f, 8f, 12f, 8f)
                curveTo(12.552f, 8f, 13f, 8.448f, 13f, 9f)
                close()
            }
        }.build()

        return _MapPinAlt!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinAlt: ImageVector? = null
