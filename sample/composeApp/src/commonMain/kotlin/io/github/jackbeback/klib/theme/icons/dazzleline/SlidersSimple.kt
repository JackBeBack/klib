package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SlidersSimple: ImageVector
    get() {
        if (_SlidersSimple != null) {
            return _SlidersSimple!!
        }
        _SlidersSimple = ImageVector.Builder(
            name = "SlidersSimple",
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
                moveTo(8f, 8.5f)
                curveTo(8f, 9.881f, 6.881f, 11f, 5.5f, 11f)
                curveTo(4.119f, 11f, 3f, 9.881f, 3f, 8.5f)
                curveTo(3f, 7.119f, 4.119f, 6f, 5.5f, 6f)
                curveTo(6.881f, 6f, 8f, 7.119f, 8f, 8.5f)
                close()
                moveTo(8f, 8.5f)
                horizontalLineTo(21f)
                moveTo(16f, 15.5f)
                curveTo(16f, 16.881f, 17.119f, 18f, 18.5f, 18f)
                curveTo(19.881f, 18f, 21f, 16.881f, 21f, 15.5f)
                curveTo(21f, 14.119f, 19.881f, 13f, 18.5f, 13f)
                curveTo(17.119f, 13f, 16f, 14.119f, 16f, 15.5f)
                close()
                moveTo(16f, 15.5f)
                horizontalLineTo(3f)
            }
        }.build()

        return _SlidersSimple!!
    }

@Suppress("ObjectPropertyName")
private var _SlidersSimple: ImageVector? = null
