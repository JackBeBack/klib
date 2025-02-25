package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TemperatureFull: ImageVector
    get() {
        if (_TemperatureFull != null) {
            return _TemperatureFull!!
        }
        _TemperatureFull = ImageVector.Builder(
            name = "TemperatureFull",
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
                moveTo(12f, 16f)
                curveTo(11.448f, 16f, 11f, 16.448f, 11f, 17f)
                curveTo(11f, 17.552f, 11.448f, 18f, 12f, 18f)
                curveTo(12.552f, 18f, 13f, 17.552f, 13f, 17f)
                curveTo(13f, 16.448f, 12.552f, 16f, 12f, 16f)
                close()
                moveTo(12f, 16f)
                verticalLineTo(6f)
                moveTo(12f, 17f)
                lineTo(12.007f, 17.007f)
                moveTo(16f, 17f)
                curveTo(16f, 19.209f, 14.209f, 21f, 12f, 21f)
                curveTo(9.791f, 21f, 8f, 19.209f, 8f, 17f)
                curveTo(8f, 15.985f, 8.378f, 15.059f, 9f, 14.354f)
                lineTo(9f, 6f)
                curveTo(9f, 4.343f, 10.343f, 3f, 12f, 3f)
                curveTo(13.657f, 3f, 15f, 4.343f, 15f, 6f)
                verticalLineTo(14.354f)
                curveTo(15.622f, 15.059f, 16f, 15.985f, 16f, 17f)
                close()
            }
        }.build()

        return _TemperatureFull!!
    }

@Suppress("ObjectPropertyName")
private var _TemperatureFull: ImageVector? = null
