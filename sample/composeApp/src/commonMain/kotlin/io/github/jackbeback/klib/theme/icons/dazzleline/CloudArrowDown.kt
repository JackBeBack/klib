package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CloudArrowDown: ImageVector
    get() {
        if (_CloudArrowDown != null) {
            return _CloudArrowDown!!
        }
        _CloudArrowDown = ImageVector.Builder(
            name = "CloudArrowDown",
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
                moveTo(5.256f, 16f)
                curveTo(3.89f, 15.029f, 3f, 13.442f, 3f, 11.649f)
                curveTo(3f, 9.2f, 4.8f, 6.938f, 7.5f, 6.5f)
                curveTo(8.347f, 4.486f, 10.351f, 3f, 12.689f, 3f)
                curveTo(15.684f, 3f, 18.132f, 5.323f, 18.3f, 8.25f)
                curveTo(19.889f, 8.945f, 21f, 10.65f, 21f, 12.497f)
                curveTo(21f, 14.058f, 20.206f, 15.434f, 19f, 16.242f)
                moveTo(12f, 21f)
                verticalLineTo(11f)
                moveTo(12f, 21f)
                lineTo(9f, 18f)
                moveTo(12f, 21f)
                lineTo(15f, 18f)
            }
        }.build()

        return _CloudArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _CloudArrowDown: ImageVector? = null
