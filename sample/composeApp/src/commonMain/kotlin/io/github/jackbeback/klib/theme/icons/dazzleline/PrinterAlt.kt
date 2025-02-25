package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PrinterAlt: ImageVector
    get() {
        if (_PrinterAlt != null) {
            return _PrinterAlt!!
        }
        _PrinterAlt = ImageVector.Builder(
            name = "PrinterAlt",
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
                moveTo(17f, 6f)
                verticalLineTo(4.6f)
                curveTo(17f, 4.04f, 17f, 3.76f, 16.891f, 3.546f)
                curveTo(16.795f, 3.358f, 16.642f, 3.205f, 16.454f, 3.109f)
                curveTo(16.24f, 3f, 15.96f, 3f, 15.4f, 3f)
                horizontalLineTo(8.6f)
                curveTo(8.04f, 3f, 7.76f, 3f, 7.546f, 3.109f)
                curveTo(7.358f, 3.205f, 7.205f, 3.358f, 7.109f, 3.546f)
                curveTo(7f, 3.76f, 7f, 4.04f, 7f, 4.6f)
                verticalLineTo(6f)
                moveTo(3f, 13f)
                horizontalLineTo(21f)
                moveTo(18f, 9.5f)
                horizontalLineTo(18.01f)
                moveTo(15f, 9.5f)
                horizontalLineTo(15.01f)
                moveTo(6f, 9.5f)
                horizontalLineTo(9f)
                moveTo(18f, 21f)
                verticalLineTo(16f)
                horizontalLineTo(16.945f)
                curveTo(16.499f, 16f, 16.276f, 16f, 16.066f, 16.046f)
                curveTo(15.798f, 16.104f, 15.545f, 16.217f, 15.322f, 16.377f)
                curveTo(15.148f, 16.503f, 14.998f, 16.668f, 14.7f, 17f)
                curveTo(14.401f, 17.332f, 14.252f, 17.497f, 14.078f, 17.623f)
                curveTo(13.855f, 17.783f, 13.602f, 17.896f, 13.334f, 17.954f)
                curveTo(13.124f, 18f, 12.901f, 18f, 12.455f, 18f)
                horizontalLineTo(11.545f)
                curveTo(11.099f, 18f, 10.876f, 18f, 10.666f, 17.954f)
                curveTo(10.398f, 17.896f, 10.145f, 17.783f, 9.922f, 17.623f)
                curveTo(9.748f, 17.497f, 9.599f, 17.332f, 9.3f, 17f)
                curveTo(9.002f, 16.668f, 8.852f, 16.503f, 8.678f, 16.377f)
                curveTo(8.455f, 16.217f, 8.202f, 16.104f, 7.934f, 16.046f)
                curveTo(7.724f, 16f, 7.501f, 16f, 7.055f, 16f)
                horizontalLineTo(6f)
                verticalLineTo(21f)
                moveTo(18f, 21f)
                curveTo(17.935f, 21f, 17.869f, 21f, 17.8f, 21f)
                horizontalLineTo(6.2f)
                curveTo(6.131f, 21f, 6.065f, 21f, 6f, 21f)
                moveTo(18f, 21f)
                curveTo(18.988f, 20.999f, 19.506f, 20.987f, 19.908f, 20.782f)
                curveTo(20.284f, 20.59f, 20.59f, 20.284f, 20.782f, 19.908f)
                curveTo(21f, 19.48f, 21f, 18.92f, 21f, 17.8f)
                verticalLineTo(10.8f)
                curveTo(21f, 9.12f, 21f, 8.28f, 20.673f, 7.638f)
                curveTo(20.385f, 7.074f, 19.927f, 6.615f, 19.362f, 6.327f)
                curveTo(18.72f, 6f, 17.88f, 6f, 16.2f, 6f)
                horizontalLineTo(7.8f)
                curveTo(6.12f, 6f, 5.28f, 6f, 4.638f, 6.327f)
                curveTo(4.074f, 6.615f, 3.615f, 7.074f, 3.327f, 7.638f)
                curveTo(3f, 8.28f, 3f, 9.12f, 3f, 10.8f)
                verticalLineTo(17.8f)
                curveTo(3f, 18.92f, 3f, 19.48f, 3.218f, 19.908f)
                curveTo(3.41f, 20.284f, 3.716f, 20.59f, 4.092f, 20.782f)
                curveTo(4.494f, 20.987f, 5.012f, 20.999f, 6f, 21f)
            }
        }.build()

        return _PrinterAlt!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterAlt: ImageVector? = null
