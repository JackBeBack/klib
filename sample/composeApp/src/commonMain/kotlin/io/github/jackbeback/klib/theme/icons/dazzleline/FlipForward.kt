package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FlipForward: ImageVector
    get() {
        if (_FlipForward != null) {
            return _FlipForward!!
        }
        _FlipForward = ImageVector.Builder(
            name = "FlipForward",
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
                moveTo(21f, 8f)
                horizontalLineTo(7.5f)
                curveTo(5.015f, 8f, 3f, 10.015f, 3f, 12.5f)
                curveTo(3f, 14.985f, 5.015f, 17f, 7.5f, 17f)
                horizontalLineTo(21f)
                moveTo(21f, 8f)
                lineTo(18f, 5f)
                moveTo(21f, 8f)
                lineTo(18f, 11f)
            }
        }.build()

        return _FlipForward!!
    }

@Suppress("ObjectPropertyName")
private var _FlipForward: ImageVector? = null
