package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.RotateCcw: ImageVector
    get() {
        if (_RotateCcw != null) {
            return _RotateCcw!!
        }
        _RotateCcw = ImageVector.Builder(
            name = "RotateCcw",
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
                moveTo(12.5f, 20.5f)
                curveTo(17.194f, 20.5f, 21f, 16.694f, 21f, 12f)
                curveTo(21f, 7.306f, 17.194f, 3.5f, 12.5f, 3.5f)
                curveTo(7.806f, 3.5f, 4f, 7.306f, 4f, 12f)
                curveTo(4f, 13.543f, 4.411f, 14.991f, 5.13f, 16.238f)
                moveTo(1.5f, 15f)
                lineTo(5.13f, 16.238f)
                moveTo(6.825f, 12.383f)
                lineTo(5.471f, 16.354f)
                lineTo(5.13f, 16.238f)
            }
        }.build()

        return _RotateCcw!!
    }

@Suppress("ObjectPropertyName")
private var _RotateCcw: ImageVector? = null
