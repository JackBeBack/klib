package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MaskFace: ImageVector
    get() {
        if (_MaskFace != null) {
            return _MaskFace!!
        }
        _MaskFace = ImageVector.Builder(
            name = "MaskFace",
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
                moveTo(6.2f, 8f)
                horizontalLineTo(4.591f)
                curveTo(4.039f, 8f, 3.764f, 8f, 3.553f, 8.106f)
                curveTo(3.359f, 8.202f, 3.202f, 8.359f, 3.106f, 8.553f)
                curveTo(3f, 8.764f, 3f, 9.039f, 3f, 9.591f)
                verticalLineTo(9.728f)
                curveTo(3f, 11.169f, 3f, 11.89f, 3.213f, 12.516f)
                curveTo(3.454f, 13.223f, 3.887f, 13.848f, 4.464f, 14.321f)
                curveTo(4.976f, 14.741f, 5.83f, 15.067f, 7.179f, 15.573f)
                moveTo(17.8f, 8f)
                horizontalLineTo(19.409f)
                curveTo(19.961f, 8f, 20.236f, 8f, 20.447f, 8.106f)
                curveTo(20.641f, 8.202f, 20.798f, 8.359f, 20.894f, 8.553f)
                curveTo(21f, 8.764f, 21f, 9.039f, 21f, 9.591f)
                verticalLineTo(9.728f)
                curveTo(21f, 11.169f, 21f, 11.89f, 20.787f, 12.516f)
                curveTo(20.546f, 13.223f, 20.113f, 13.848f, 19.536f, 14.321f)
                curveTo(19.024f, 14.741f, 18.193f, 15.036f, 16.843f, 15.542f)
                moveTo(10f, 11f)
                horizontalLineTo(14f)
                moveTo(11f, 14f)
                horizontalLineTo(13f)
                moveTo(6f, 8f)
                verticalLineTo(12f)
                curveTo(6f, 15.314f, 8.686f, 18f, 12f, 18f)
                curveTo(15.314f, 18f, 18f, 15.314f, 18f, 12f)
                verticalLineTo(8f)
                horizontalLineTo(17.803f)
                curveTo(17.216f, 8f, 16.923f, 8f, 16.639f, 7.959f)
                curveTo(16.241f, 7.901f, 15.854f, 7.784f, 15.491f, 7.612f)
                curveTo(15.232f, 7.488f, 14.988f, 7.325f, 14.5f, 7f)
                lineTo(13.832f, 6.555f)
                curveTo(13.29f, 6.193f, 12.652f, 6f, 12f, 6f)
                curveTo(11.348f, 6f, 10.71f, 6.193f, 10.168f, 6.555f)
                lineTo(9.5f, 7f)
                curveTo(9.012f, 7.325f, 8.768f, 7.488f, 8.508f, 7.612f)
                curveTo(8.146f, 7.784f, 7.759f, 7.901f, 7.361f, 7.959f)
                curveTo(7.077f, 8f, 6.784f, 8f, 6.197f, 8f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _MaskFace!!
    }

@Suppress("ObjectPropertyName")
private var _MaskFace: ImageVector? = null
