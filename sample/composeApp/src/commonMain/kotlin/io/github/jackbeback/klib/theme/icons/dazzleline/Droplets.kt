package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Droplets: ImageVector
    get() {
        if (_Droplets != null) {
            return _Droplets!!
        }
        _Droplets = ImageVector.Builder(
            name = "Droplets",
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
                moveTo(21f, 14.7f)
                curveTo(21f, 18.179f, 19.044f, 21f, 15.5f, 21f)
                curveTo(11.956f, 21f, 10f, 18.179f, 10f, 14.7f)
                curveTo(10f, 11.221f, 15.5f, 3f, 15.5f, 3f)
                curveTo(15.5f, 3f, 21f, 11.221f, 21f, 14.7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 8.2f)
                curveTo(8f, 9.746f, 7.111f, 11f, 5.5f, 11f)
                curveTo(3.889f, 11f, 3f, 9.746f, 3f, 8.2f)
                curveTo(3f, 6.654f, 5.5f, 3f, 5.5f, 3f)
                curveTo(5.5f, 3f, 8f, 6.654f, 8f, 8.2f)
                close()
            }
        }.build()

        return _Droplets!!
    }

@Suppress("ObjectPropertyName")
private var _Droplets: ImageVector? = null
