package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FlipBackward: ImageVector
    get() {
        if (_FlipBackward != null) {
            return _FlipBackward!!
        }
        _FlipBackward = ImageVector.Builder(
            name = "FlipBackward",
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
                moveTo(3f, 8f)
                horizontalLineTo(16.5f)
                curveTo(18.985f, 8f, 21f, 10.015f, 21f, 12.5f)
                curveTo(21f, 14.985f, 18.985f, 17f, 16.5f, 17f)
                horizontalLineTo(3f)
                moveTo(3f, 8f)
                lineTo(6f, 5f)
                moveTo(3f, 8f)
                lineTo(6f, 11f)
            }
        }.build()

        return _FlipBackward!!
    }

@Suppress("ObjectPropertyName")
private var _FlipBackward: ImageVector? = null
