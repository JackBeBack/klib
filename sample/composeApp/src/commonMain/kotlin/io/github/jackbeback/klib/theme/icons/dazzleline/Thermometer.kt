package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Thermometer: ImageVector
    get() {
        if (_Thermometer != null) {
            return _Thermometer!!
        }
        _Thermometer = ImageVector.Builder(
            name = "Thermometer",
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
                moveTo(7f, 17f)
                horizontalLineTo(8.349f)
                curveTo(9.327f, 17f, 9.817f, 17f, 10.277f, 16.889f)
                curveTo(10.685f, 16.792f, 11.075f, 16.63f, 11.433f, 16.411f)
                curveTo(11.837f, 16.163f, 12.183f, 15.817f, 12.875f, 15.125f)
                lineTo(20f, 8f)
                curveTo(21.105f, 6.895f, 21.105f, 5.105f, 20f, 4f)
                curveTo(18.895f, 2.895f, 17.105f, 2.895f, 16f, 4f)
                lineTo(8.875f, 11.125f)
                curveTo(8.183f, 11.817f, 7.837f, 12.163f, 7.589f, 12.567f)
                curveTo(7.37f, 12.925f, 7.209f, 13.315f, 7.111f, 13.723f)
                curveTo(7f, 14.184f, 7f, 14.673f, 7f, 15.651f)
                verticalLineTo(17f)
                close()
                moveTo(7f, 17f)
                lineTo(3f, 21f)
                moveTo(9.5f, 10.5f)
                lineTo(11f, 12f)
                moveTo(12f, 8f)
                lineTo(13.5f, 9.5f)
                moveTo(14.5f, 5.5f)
                lineTo(16f, 7f)
            }
        }.build()

        return _Thermometer!!
    }

@Suppress("ObjectPropertyName")
private var _Thermometer: ImageVector? = null
