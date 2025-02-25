package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.RotateCw: ImageVector
    get() {
        if (_RotateCw != null) {
            return _RotateCw!!
        }
        _RotateCw = ImageVector.Builder(
            name = "RotateCw",
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
                moveTo(11.5f, 20.5f)
                curveTo(6.806f, 20.5f, 3f, 16.694f, 3f, 12f)
                curveTo(3f, 7.306f, 6.806f, 3.5f, 11.5f, 3.5f)
                curveTo(16.194f, 3.5f, 20f, 7.306f, 20f, 12f)
                curveTo(20f, 13.543f, 19.589f, 14.991f, 18.87f, 16.238f)
                moveTo(22.5f, 15f)
                lineTo(18.87f, 16.238f)
                moveTo(17.175f, 12.383f)
                lineTo(18.529f, 16.354f)
                lineTo(18.87f, 16.238f)
            }
        }.build()

        return _RotateCw!!
    }

@Suppress("ObjectPropertyName")
private var _RotateCw: ImageVector? = null
