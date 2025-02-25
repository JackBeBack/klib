package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TemperatureSnow: ImageVector
    get() {
        if (_TemperatureSnow != null) {
            return _TemperatureSnow!!
        }
        _TemperatureSnow = ImageVector.Builder(
            name = "TemperatureSnow",
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
                moveTo(15.13f, 3f)
                verticalLineTo(5f)
                moveTo(15.13f, 5f)
                verticalLineTo(9.985f)
                moveTo(15.13f, 5f)
                lineTo(14.13f, 4f)
                moveTo(15.13f, 5f)
                lineTo(16.13f, 4f)
                moveTo(15.13f, 9.985f)
                verticalLineTo(10.015f)
                moveTo(15.13f, 9.985f)
                lineTo(13.5f, 9.044f)
                moveTo(15.13f, 9.985f)
                lineTo(15.156f, 10f)
                moveTo(15.13f, 10.015f)
                verticalLineTo(15f)
                moveTo(15.13f, 10.015f)
                lineTo(15.156f, 10f)
                moveTo(15.13f, 10.015f)
                lineTo(13.5f, 10.956f)
                moveTo(15.13f, 15f)
                verticalLineTo(17f)
                moveTo(15.13f, 15f)
                lineTo(14.13f, 16f)
                moveTo(15.13f, 15f)
                lineTo(16.13f, 16f)
                moveTo(15.156f, 10f)
                lineTo(19.4f, 12.45f)
                moveTo(15.156f, 10f)
                lineTo(19.4f, 7.55f)
                moveTo(19.4f, 12.45f)
                lineTo(21.219f, 13.5f)
                moveTo(19.4f, 12.45f)
                lineTo(19.912f, 14.362f)
                moveTo(19.4f, 12.45f)
                lineTo(21.312f, 11.938f)
                moveTo(21.218f, 6.5f)
                lineTo(19.4f, 7.55f)
                moveTo(19.4f, 7.55f)
                lineTo(19.912f, 5.638f)
                moveTo(19.4f, 7.55f)
                lineTo(21.312f, 8.062f)
                moveTo(7f, 16f)
                curveTo(6.448f, 16f, 6f, 16.448f, 6f, 17f)
                curveTo(6f, 17.552f, 6.448f, 18f, 7f, 18f)
                curveTo(7.552f, 18f, 8f, 17.552f, 8f, 17f)
                curveTo(8f, 16.448f, 7.552f, 16f, 7f, 16f)
                close()
                moveTo(7f, 16f)
                lineTo(7.007f, 14f)
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

        return _TemperatureSnow!!
    }

@Suppress("ObjectPropertyName")
private var _TemperatureSnow: ImageVector? = null
