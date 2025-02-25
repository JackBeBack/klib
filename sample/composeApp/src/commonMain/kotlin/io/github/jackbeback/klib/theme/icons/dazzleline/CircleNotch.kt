package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CircleNotch: ImageVector
    get() {
        if (_CircleNotch != null) {
            return _CircleNotch!!
        }
        _CircleNotch = ImageVector.Builder(
            name = "CircleNotch",
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
                moveTo(9f, 3.512f)
                curveTo(5.504f, 4.748f, 3f, 8.081f, 3f, 12f)
                curveTo(3f, 16.971f, 7.029f, 21f, 12f, 21f)
                curveTo(16.971f, 21f, 21f, 16.971f, 21f, 12f)
                curveTo(21f, 8.081f, 18.496f, 4.748f, 15f, 3.512f)
            }
        }.build()

        return _CircleNotch!!
    }

@Suppress("ObjectPropertyName")
private var _CircleNotch: ImageVector? = null
