package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TemperatureList: ImageVector
    get() {
        if (_TemperatureList != null) {
            return _TemperatureList!!
        }
        _TemperatureList = ImageVector.Builder(
            name = "TemperatureList",
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
                moveTo(15f, 4f)
                horizontalLineTo(20f)
                moveTo(15f, 8f)
                horizontalLineTo(20f)
                moveTo(17f, 12f)
                horizontalLineTo(20f)
                moveTo(8f, 16f)
                curveTo(7.448f, 16f, 7f, 16.448f, 7f, 17f)
                curveTo(7f, 17.552f, 7.448f, 18f, 8f, 18f)
                curveTo(8.552f, 18f, 9f, 17.552f, 9f, 17f)
                curveTo(9f, 16.448f, 8.552f, 16f, 8f, 16f)
                close()
                moveTo(8f, 16f)
                verticalLineTo(9f)
                moveTo(8f, 17f)
                lineTo(8.007f, 17.007f)
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

        return _TemperatureList!!
    }

@Suppress("ObjectPropertyName")
private var _TemperatureList: ImageVector? = null
