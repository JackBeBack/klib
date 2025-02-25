package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Play: ImageVector
    get() {
        if (_Play != null) {
            return _Play!!
        }
        _Play = ImageVector.Builder(
            name = "Play",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.658f, 9.286f)
                curveTo(18.098f, 10.186f, 18.818f, 10.636f, 19.065f, 11.212f)
                curveTo(19.28f, 11.715f, 19.28f, 12.285f, 19.065f, 12.788f)
                curveTo(18.818f, 13.364f, 18.098f, 13.814f, 16.658f, 14.714f)
                lineTo(9.896f, 18.94f)
                curveTo(8.298f, 19.939f, 7.499f, 20.438f, 6.84f, 20.385f)
                curveTo(6.265f, 20.339f, 5.738f, 20.047f, 5.394f, 19.584f)
                curveTo(5f, 19.053f, 5f, 18.111f, 5f, 16.226f)
                verticalLineTo(7.774f)
                curveTo(5f, 5.889f, 5f, 4.947f, 5.394f, 4.416f)
                curveTo(5.738f, 3.953f, 6.265f, 3.661f, 6.84f, 3.615f)
                curveTo(7.499f, 3.562f, 8.298f, 4.061f, 9.896f, 5.06f)
                lineTo(16.658f, 9.286f)
                close()
            }
        }.build()

        return _Play!!
    }

@Suppress("ObjectPropertyName")
private var _Play: ImageVector? = null
