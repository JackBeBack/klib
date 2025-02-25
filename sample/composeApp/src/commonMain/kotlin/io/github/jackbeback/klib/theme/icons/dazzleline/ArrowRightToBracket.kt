package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowRightToBracket: ImageVector
    get() {
        if (_ArrowRightToBracket != null) {
            return _ArrowRightToBracket!!
        }
        _ArrowRightToBracket = ImageVector.Builder(
            name = "ArrowRightToBracket",
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
                moveTo(11f, 16f)
                lineTo(15f, 12f)
                moveTo(15f, 12f)
                lineTo(11f, 8f)
                moveTo(15f, 12f)
                horizontalLineTo(3f)
                moveTo(11f, 3f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 3f, 19.48f, 3f, 19.908f, 3.217f)
                curveTo(20.284f, 3.409f, 20.59f, 3.715f, 20.782f, 4.092f)
                curveTo(21f, 4.519f, 21f, 5.079f, 21f, 6.2f)
                verticalLineTo(17.799f)
                curveTo(21f, 18.92f, 21f, 19.48f, 20.782f, 19.907f)
                curveTo(20.59f, 20.284f, 20.284f, 20.59f, 19.908f, 20.781f)
                curveTo(19.48f, 21f, 18.92f, 21f, 17.8f, 21f)
                horizontalLineTo(11f)
            }
        }.build()

        return _ArrowRightToBracket!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightToBracket: ImageVector? = null
