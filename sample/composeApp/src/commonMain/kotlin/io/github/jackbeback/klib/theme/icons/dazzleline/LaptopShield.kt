package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LaptopShield: ImageVector
    get() {
        if (_LaptopShield != null) {
            return _LaptopShield!!
        }
        _LaptopShield = ImageVector.Builder(
            name = "LaptopShield",
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
                moveTo(13f, 4f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 4f, 19.48f, 4f, 19.908f, 4.218f)
                curveTo(20.284f, 4.41f, 20.59f, 4.716f, 20.782f, 5.092f)
                curveTo(21f, 5.52f, 21f, 6.08f, 21f, 7.2f)
                verticalLineTo(16f)
                moveTo(3f, 16f)
                verticalLineTo(14f)
                moveTo(8.873f, 4.204f)
                curveTo(8.804f, 4.208f, 8.736f, 4.21f, 8.667f, 4.21f)
                curveTo(7.642f, 4.21f, 6.708f, 3.752f, 6f, 3f)
                curveTo(5.292f, 3.752f, 4.358f, 4.21f, 3.333f, 4.21f)
                curveTo(3.264f, 4.21f, 3.196f, 4.208f, 3.127f, 4.204f)
                curveTo(3.044f, 4.585f, 3f, 4.985f, 3f, 5.398f)
                curveTo(3f, 7.612f, 4.275f, 9.472f, 6f, 10f)
                curveTo(7.725f, 9.472f, 9f, 7.612f, 9f, 5.398f)
                curveTo(9f, 4.985f, 8.956f, 4.585f, 8.873f, 4.204f)
                close()
                moveTo(2f, 16f)
                horizontalLineTo(22f)
                verticalLineTo(16.8f)
                curveTo(22f, 17.92f, 22f, 18.48f, 21.782f, 18.908f)
                curveTo(21.59f, 19.284f, 21.284f, 19.59f, 20.908f, 19.782f)
                curveTo(20.48f, 20f, 19.92f, 20f, 18.8f, 20f)
                horizontalLineTo(5.2f)
                curveTo(4.08f, 20f, 3.52f, 20f, 3.092f, 19.782f)
                curveTo(2.716f, 19.59f, 2.41f, 19.284f, 2.218f, 18.908f)
                curveTo(2f, 18.48f, 2f, 17.92f, 2f, 16.8f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _LaptopShield!!
    }

@Suppress("ObjectPropertyName")
private var _LaptopShield: ImageVector? = null
