package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Pencil: ImageVector
    get() {
        if (_Pencil != null) {
            return _Pencil!!
        }
        _Pencil = ImageVector.Builder(
            name = "Pencil",
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
                moveTo(9.657f, 17f)
                lineTo(7f, 17f)
                lineTo(7f, 14f)
                moveTo(6.102f, 14.897f)
                lineTo(17.411f, 3.589f)
                curveTo(18.192f, 2.808f, 19.458f, 2.808f, 20.239f, 3.589f)
                curveTo(21.02f, 4.37f, 21.02f, 5.636f, 20.239f, 6.417f)
                lineTo(8.764f, 17.893f)
                curveTo(8.228f, 18.429f, 7.96f, 18.697f, 7.663f, 18.927f)
                curveTo(7.4f, 19.132f, 7.119f, 19.314f, 6.826f, 19.472f)
                curveTo(6.495f, 19.65f, 6.141f, 19.787f, 5.434f, 20.06f)
                lineTo(3f, 21f)
                lineTo(3.783f, 18.65f)
                curveTo(4.05f, 17.848f, 4.184f, 17.447f, 4.37f, 17.073f)
                curveTo(4.535f, 16.74f, 4.731f, 16.424f, 4.954f, 16.128f)
                curveTo(5.206f, 15.794f, 5.505f, 15.495f, 6.102f, 14.897f)
                close()
            }
        }.build()

        return _Pencil!!
    }

@Suppress("ObjectPropertyName")
private var _Pencil: ImageVector? = null
