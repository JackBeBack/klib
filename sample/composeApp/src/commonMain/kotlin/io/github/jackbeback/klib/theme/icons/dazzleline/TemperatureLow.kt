package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TemperatureLow: ImageVector
    get() {
        if (_TemperatureLow != null) {
            return _TemperatureLow!!
        }
        _TemperatureLow = ImageVector.Builder(
            name = "TemperatureLow",
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
                moveTo(8f, 16f)
                curveTo(7.448f, 16f, 7f, 16.448f, 7f, 17f)
                curveTo(7f, 17.552f, 7.448f, 18f, 8f, 18f)
                curveTo(8.552f, 18f, 9f, 17.552f, 9f, 17f)
                curveTo(9f, 16.448f, 8.552f, 16f, 8f, 16f)
                close()
                moveTo(8f, 16f)
                lineTo(8.007f, 12f)
                moveTo(8f, 17f)
                lineTo(8.007f, 17.007f)
                moveTo(20f, 5f)
                curveTo(20f, 6.105f, 19.105f, 7f, 18f, 7f)
                curveTo(16.895f, 7f, 16f, 6.105f, 16f, 5f)
                curveTo(16f, 3.895f, 16.895f, 3f, 18f, 3f)
                curveTo(19.105f, 3f, 20f, 3.895f, 20f, 5f)
                close()
                moveTo(12f, 17f)
                curveTo(12f, 19.209f, 10.209f, 21f, 8f, 21f)
                curveTo(5.791f, 21f, 4f, 19.209f, 4f, 17f)
                curveTo(4f, 15.985f, 4.378f, 15.059f, 5f, 14.354f)
                lineTo(5f, 6f)
                curveTo(5f, 4.343f, 6.343f, 3f, 8f, 3f)
                curveTo(9.657f, 3f, 11f, 4.343f, 11f, 6f)
                verticalLineTo(14.354f)
                curveTo(11.622f, 15.059f, 12f, 15.985f, 12f, 17f)
                close()
            }
        }.build()

        return _TemperatureLow!!
    }

@Suppress("ObjectPropertyName")
private var _TemperatureLow: ImageVector? = null
