package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.AlignCenter: ImageVector
    get() {
        if (_AlignCenter != null) {
            return _AlignCenter!!
        }
        _AlignCenter = ImageVector.Builder(
            name = "AlignCenter",
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
                moveTo(3f, 6f)
                horizontalLineTo(21f)
                moveTo(3f, 14f)
                horizontalLineTo(21f)
                moveTo(17f, 10f)
                horizontalLineTo(7f)
                moveTo(17f, 18f)
                horizontalLineTo(7f)
            }
        }.build()

        return _AlignCenter!!
    }

@Suppress("ObjectPropertyName")
private var _AlignCenter: ImageVector? = null
