package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowUpFromBracket: ImageVector
    get() {
        if (_ArrowUpFromBracket != null) {
            return _ArrowUpFromBracket!!
        }
        _ArrowUpFromBracket = ImageVector.Builder(
            name = "ArrowUpFromBracket",
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
                moveTo(16f, 7f)
                lineTo(12f, 3f)
                moveTo(12f, 3f)
                lineTo(8f, 7f)
                moveTo(12f, 3f)
                verticalLineTo(15f)
                moveTo(21f, 11f)
                verticalLineTo(17.799f)
                curveTo(21f, 18.919f, 21f, 19.479f, 20.782f, 19.907f)
                curveTo(20.59f, 20.284f, 20.284f, 20.59f, 19.908f, 20.781f)
                curveTo(19.48f, 20.999f, 18.92f, 20.999f, 17.8f, 20.999f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 20.999f, 4.52f, 20.999f, 4.092f, 20.781f)
                curveTo(3.716f, 20.59f, 3.41f, 20.284f, 3.218f, 19.907f)
                curveTo(3f, 19.479f, 3f, 18.919f, 3f, 17.799f)
                verticalLineTo(11f)
            }
        }.build()

        return _ArrowUpFromBracket!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpFromBracket: ImageVector? = null
