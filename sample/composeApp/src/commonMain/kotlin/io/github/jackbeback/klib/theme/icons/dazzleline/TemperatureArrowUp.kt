package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TemperatureArrowUp: ImageVector
    get() {
        if (_TemperatureArrowUp != null) {
            return _TemperatureArrowUp!!
        }
        _TemperatureArrowUp = ImageVector.Builder(
            name = "TemperatureArrowUp",
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
                moveTo(18f, 3f)
                verticalLineTo(21f)
                moveTo(18f, 3f)
                lineTo(15f, 6f)
                moveTo(18f, 3f)
                lineTo(21f, 6f)
                moveTo(7f, 16f)
                curveTo(6.448f, 16f, 6f, 16.448f, 6f, 17f)
                curveTo(6f, 17.552f, 6.448f, 18f, 7f, 18f)
                curveTo(7.552f, 18f, 8f, 17.552f, 8f, 17f)
                curveTo(8f, 16.448f, 7.552f, 16f, 7f, 16f)
                close()
                moveTo(7f, 16f)
                verticalLineTo(12f)
                moveTo(7f, 17f)
                lineTo(7.007f, 17.007f)
                moveTo(11f, 17f)
                curveTo(11f, 19.209f, 9.209f, 21f, 7f, 21f)
                curveTo(4.791f, 21f, 3f, 19.209f, 3f, 17f)
                curveTo(3f, 15.985f, 3.378f, 15.059f, 4f, 14.354f)
                lineTo(4f, 6f)
                curveTo(4f, 4.343f, 5.343f, 3f, 7f, 3f)
                curveTo(8.657f, 3f, 10f, 4.343f, 10f, 6f)
                verticalLineTo(14.354f)
                curveTo(10.622f, 15.059f, 11f, 15.985f, 11f, 17f)
                close()
            }
        }.build()

        return _TemperatureArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _TemperatureArrowUp: ImageVector? = null
