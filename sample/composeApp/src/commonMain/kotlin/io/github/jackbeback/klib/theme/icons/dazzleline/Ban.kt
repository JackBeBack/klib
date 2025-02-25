package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Ban: ImageVector
    get() {
        if (_Ban != null) {
            return _Ban!!
        }
        _Ban = ImageVector.Builder(
            name = "Ban",
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
                moveTo(18.364f, 18.364f)
                curveTo(19.993f, 16.735f, 21f, 14.485f, 21f, 12f)
                curveTo(21f, 7.029f, 16.971f, 3f, 12f, 3f)
                curveTo(9.515f, 3f, 7.265f, 4.007f, 5.636f, 5.636f)
                moveTo(18.364f, 18.364f)
                curveTo(16.735f, 19.993f, 14.485f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 9.515f, 4.007f, 7.265f, 5.636f, 5.636f)
                moveTo(18.364f, 18.364f)
                lineTo(5.636f, 5.636f)
            }
        }.build()

        return _Ban!!
    }

@Suppress("ObjectPropertyName")
private var _Ban: ImageVector? = null
