package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowRightFromBracket: ImageVector
    get() {
        if (_ArrowRightFromBracket != null) {
            return _ArrowRightFromBracket!!
        }
        _ArrowRightFromBracket = ImageVector.Builder(
            name = "ArrowRightFromBracket",
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
                moveTo(17f, 16f)
                lineTo(21f, 12f)
                moveTo(21f, 12f)
                lineTo(17f, 8f)
                moveTo(21f, 12f)
                horizontalLineTo(9f)
                moveTo(13f, 21f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 21f, 4.52f, 21f, 4.092f, 20.781f)
                curveTo(3.716f, 20.59f, 3.41f, 20.284f, 3.218f, 19.907f)
                curveTo(3f, 19.48f, 3f, 18.92f, 3f, 17.799f)
                verticalLineTo(6.2f)
                curveTo(3f, 5.079f, 3f, 4.519f, 3.218f, 4.092f)
                curveTo(3.41f, 3.715f, 3.716f, 3.409f, 4.092f, 3.217f)
                curveTo(4.52f, 3f, 5.08f, 3f, 6.2f, 3f)
                lineTo(13f, 3f)
            }
        }.build()

        return _ArrowRightFromBracket!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightFromBracket: ImageVector? = null
