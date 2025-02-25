package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Hexagon: ImageVector
    get() {
        if (_Hexagon != null) {
            return _Hexagon!!
        }
        _Hexagon = ImageVector.Builder(
            name = "Hexagon",
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
                moveTo(12.8f, 21.538f)
                curveTo(12.509f, 21.706f, 12.363f, 21.791f, 12.208f, 21.823f)
                curveTo(12.071f, 21.853f, 11.929f, 21.853f, 11.792f, 21.823f)
                curveTo(11.637f, 21.791f, 11.491f, 21.706f, 11.2f, 21.538f)
                lineTo(4.14f, 17.462f)
                curveTo(3.848f, 17.294f, 3.703f, 17.21f, 3.597f, 17.092f)
                curveTo(3.503f, 16.988f, 3.432f, 16.865f, 3.389f, 16.732f)
                curveTo(3.34f, 16.581f, 3.34f, 16.413f, 3.34f, 16.076f)
                verticalLineTo(7.924f)
                curveTo(3.34f, 7.587f, 3.34f, 7.419f, 3.389f, 7.268f)
                curveTo(3.432f, 7.135f, 3.503f, 7.012f, 3.597f, 6.908f)
                curveTo(3.703f, 6.791f, 3.848f, 6.706f, 4.14f, 6.538f)
                lineTo(11.2f, 2.462f)
                curveTo(11.491f, 2.294f, 11.637f, 2.21f, 11.792f, 2.177f)
                curveTo(11.929f, 2.148f, 12.071f, 2.148f, 12.208f, 2.177f)
                curveTo(12.363f, 2.21f, 12.509f, 2.294f, 12.8f, 2.462f)
                lineTo(19.86f, 6.538f)
                curveTo(20.152f, 6.706f, 20.298f, 6.791f, 20.403f, 6.908f)
                curveTo(20.497f, 7.012f, 20.568f, 7.135f, 20.611f, 7.268f)
                curveTo(20.66f, 7.419f, 20.66f, 7.587f, 20.66f, 7.924f)
                verticalLineTo(16.076f)
                curveTo(20.66f, 16.413f, 20.66f, 16.581f, 20.611f, 16.732f)
                curveTo(20.568f, 16.865f, 20.497f, 16.988f, 20.403f, 17.092f)
                curveTo(20.298f, 17.21f, 20.152f, 17.294f, 19.86f, 17.462f)
                lineTo(12.8f, 21.538f)
                close()
            }
        }.build()

        return _Hexagon!!
    }

@Suppress("ObjectPropertyName")
private var _Hexagon: ImageVector? = null
