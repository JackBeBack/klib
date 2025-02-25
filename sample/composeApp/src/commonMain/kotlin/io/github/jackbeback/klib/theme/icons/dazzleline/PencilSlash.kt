package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PencilSlash: ImageVector
    get() {
        if (_PencilSlash != null) {
            return _PencilSlash!!
        }
        _PencilSlash = ImageVector.Builder(
            name = "PencilSlash",
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
                moveTo(13.325f, 7.675f)
                lineTo(17.411f, 3.589f)
                curveTo(18.192f, 2.808f, 19.458f, 2.808f, 20.239f, 3.589f)
                curveTo(21.021f, 4.37f, 21.021f, 5.636f, 20.239f, 6.417f)
                lineTo(16.153f, 10.503f)
                moveTo(10.5f, 10.5f)
                lineTo(6.103f, 14.897f)
                curveTo(5.505f, 15.495f, 5.206f, 15.794f, 4.954f, 16.128f)
                curveTo(4.731f, 16.424f, 4.535f, 16.74f, 4.37f, 17.073f)
                curveTo(4.184f, 17.447f, 4.051f, 17.848f, 3.783f, 18.65f)
                lineTo(3f, 21f)
                lineTo(5.434f, 20.06f)
                curveTo(6.141f, 19.787f, 6.495f, 19.65f, 6.826f, 19.472f)
                curveTo(7.12f, 19.314f, 7.4f, 19.132f, 7.663f, 18.927f)
                curveTo(7.96f, 18.697f, 8.228f, 18.429f, 8.764f, 17.893f)
                lineTo(13.328f, 13.328f)
                moveTo(9.657f, 17f)
                horizontalLineTo(7f)
                lineTo(7f, 14f)
                moveTo(3f, 3f)
                lineTo(21f, 21f)
            }
        }.build()

        return _PencilSlash!!
    }

@Suppress("ObjectPropertyName")
private var _PencilSlash: ImageVector? = null
