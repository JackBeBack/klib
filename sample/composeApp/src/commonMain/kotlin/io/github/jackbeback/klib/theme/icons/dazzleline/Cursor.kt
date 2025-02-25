package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Cursor: ImageVector
    get() {
        if (_Cursor != null) {
            return _Cursor!!
        }
        _Cursor = ImageVector.Builder(
            name = "Cursor",
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
                moveTo(12.527f, 12.532f)
                lineTo(20f, 20f)
                moveTo(19.012f, 9.819f)
                lineTo(12.808f, 12.373f)
                curveTo(12.694f, 12.42f, 12.638f, 12.443f, 12.59f, 12.478f)
                curveTo(12.547f, 12.509f, 12.509f, 12.547f, 12.478f, 12.59f)
                curveTo(12.443f, 12.638f, 12.42f, 12.694f, 12.373f, 12.808f)
                lineTo(9.819f, 19.012f)
                curveTo(9.566f, 19.626f, 9.439f, 19.934f, 9.267f, 20.017f)
                curveTo(9.119f, 20.089f, 8.944f, 20.083f, 8.801f, 20.001f)
                curveTo(8.635f, 19.906f, 8.53f, 19.591f, 8.32f, 18.96f)
                lineTo(3.506f, 4.518f)
                curveTo(3.343f, 4.029f, 3.262f, 3.785f, 3.32f, 3.623f)
                curveTo(3.37f, 3.481f, 3.481f, 3.37f, 3.623f, 3.32f)
                curveTo(3.785f, 3.262f, 4.029f, 3.343f, 4.518f, 3.506f)
                lineTo(18.96f, 8.32f)
                curveTo(19.591f, 8.53f, 19.906f, 8.635f, 20.001f, 8.801f)
                curveTo(20.083f, 8.944f, 20.089f, 9.119f, 20.017f, 9.267f)
                curveTo(19.934f, 9.439f, 19.626f, 9.566f, 19.012f, 9.819f)
                close()
            }
        }.build()

        return _Cursor!!
    }

@Suppress("ObjectPropertyName")
private var _Cursor: ImageVector? = null
