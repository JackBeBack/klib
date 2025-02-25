package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LaptopWired: ImageVector
    get() {
        if (_LaptopWired != null) {
            return _LaptopWired!!
        }
        _LaptopWired = ImageVector.Builder(
            name = "LaptopWired",
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
                moveTo(15f, 18f)
                curveTo(15f, 19.657f, 13.657f, 21f, 12f, 21f)
                curveTo(10.343f, 21f, 9f, 19.657f, 9f, 18f)
                moveTo(15f, 18f)
                curveTo(15f, 16.343f, 13.657f, 15f, 12f, 15f)
                moveTo(15f, 18f)
                horizontalLineTo(21f)
                moveTo(9f, 18f)
                curveTo(9f, 16.343f, 10.343f, 15f, 12f, 15f)
                moveTo(9f, 18f)
                horizontalLineTo(3f)
                moveTo(12f, 15f)
                verticalLineTo(12f)
                moveTo(4f, 12f)
                horizontalLineTo(20f)
                moveTo(18f, 12f)
                verticalLineTo(6.2f)
                curveTo(18f, 5.08f, 18f, 4.52f, 17.782f, 4.092f)
                curveTo(17.59f, 3.716f, 17.284f, 3.41f, 16.908f, 3.218f)
                curveTo(16.48f, 3f, 15.92f, 3f, 14.8f, 3f)
                horizontalLineTo(9.2f)
                curveTo(8.08f, 3f, 7.52f, 3f, 7.092f, 3.218f)
                curveTo(6.716f, 3.41f, 6.41f, 3.716f, 6.218f, 4.092f)
                curveTo(6f, 4.52f, 6f, 5.08f, 6f, 6.2f)
                verticalLineTo(12f)
            }
        }.build()

        return _LaptopWired!!
    }

@Suppress("ObjectPropertyName")
private var _LaptopWired: ImageVector? = null
