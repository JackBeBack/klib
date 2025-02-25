package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LaptopAlt2: ImageVector
    get() {
        if (_LaptopAlt2 != null) {
            return _LaptopAlt2!!
        }
        _LaptopAlt2 = ImageVector.Builder(
            name = "LaptopAlt2",
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
                moveTo(21f, 16f)
                verticalLineTo(7.2f)
                curveTo(21f, 6.08f, 21f, 5.52f, 20.782f, 5.092f)
                curveTo(20.59f, 4.716f, 20.284f, 4.41f, 19.908f, 4.218f)
                curveTo(19.48f, 4f, 18.92f, 4f, 17.8f, 4f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 4f, 4.52f, 4f, 4.092f, 4.218f)
                curveTo(3.716f, 4.41f, 3.41f, 4.716f, 3.218f, 5.092f)
                curveTo(3f, 5.52f, 3f, 6.08f, 3f, 7.2f)
                verticalLineTo(16f)
                moveTo(4.667f, 20f)
                horizontalLineTo(19.333f)
                curveTo(19.953f, 20f, 20.263f, 20f, 20.518f, 19.932f)
                curveTo(21.208f, 19.747f, 21.747f, 19.208f, 21.932f, 18.518f)
                curveTo(22f, 18.263f, 22f, 17.953f, 22f, 17.333f)
                curveTo(22f, 17.023f, 22f, 16.868f, 21.966f, 16.741f)
                curveTo(21.874f, 16.396f, 21.604f, 16.126f, 21.259f, 16.034f)
                curveTo(21.132f, 16f, 20.977f, 16f, 20.667f, 16f)
                horizontalLineTo(3.333f)
                curveTo(3.023f, 16f, 2.868f, 16f, 2.741f, 16.034f)
                curveTo(2.396f, 16.126f, 2.127f, 16.396f, 2.034f, 16.741f)
                curveTo(2f, 16.868f, 2f, 17.023f, 2f, 17.333f)
                curveTo(2f, 17.953f, 2f, 18.263f, 2.068f, 18.518f)
                curveTo(2.253f, 19.208f, 2.792f, 19.747f, 3.482f, 19.932f)
                curveTo(3.737f, 20f, 4.047f, 20f, 4.667f, 20f)
                close()
            }
        }.build()

        return _LaptopAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _LaptopAlt2: ImageVector? = null
