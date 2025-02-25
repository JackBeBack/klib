package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LaptopSearch: ImageVector
    get() {
        if (_LaptopSearch != null) {
            return _LaptopSearch!!
        }
        _LaptopSearch = ImageVector.Builder(
            name = "LaptopSearch",
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
                moveTo(7.27f, 7.27f)
                lineTo(8.5f, 8.5f)
                moveTo(12.5f, 4f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 4f, 19.48f, 4f, 19.908f, 4.218f)
                curveTo(20.284f, 4.41f, 20.59f, 4.716f, 20.782f, 5.092f)
                curveTo(21f, 5.52f, 21f, 6.08f, 21f, 7.2f)
                verticalLineTo(16f)
                moveTo(3f, 16f)
                verticalLineTo(12.5f)
                moveTo(8f, 5.5f)
                curveTo(8f, 6.881f, 6.881f, 8f, 5.5f, 8f)
                curveTo(4.119f, 8f, 3f, 6.881f, 3f, 5.5f)
                curveTo(3f, 4.119f, 4.119f, 3f, 5.5f, 3f)
                curveTo(6.881f, 3f, 8f, 4.119f, 8f, 5.5f)
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

        return _LaptopSearch!!
    }

@Suppress("ObjectPropertyName")
private var _LaptopSearch: ImageVector? = null
