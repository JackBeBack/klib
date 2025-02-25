package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DrawSquare: ImageVector
    get() {
        if (_DrawSquare != null) {
            return _DrawSquare!!
        }
        _DrawSquare = ImageVector.Builder(
            name = "DrawSquare",
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
                moveTo(16f, 18.5f)
                curveTo(16f, 19.881f, 17.119f, 21f, 18.5f, 21f)
                curveTo(19.881f, 21f, 21f, 19.881f, 21f, 18.5f)
                curveTo(21f, 17.119f, 19.881f, 16f, 18.5f, 16f)
                moveTo(16f, 18.5f)
                curveTo(16f, 17.119f, 17.119f, 16f, 18.5f, 16f)
                moveTo(16f, 18.5f)
                horizontalLineTo(8f)
                moveTo(18.5f, 16f)
                verticalLineTo(8f)
                moveTo(8f, 18.5f)
                curveTo(8f, 19.881f, 6.881f, 21f, 5.5f, 21f)
                curveTo(4.119f, 21f, 3f, 19.881f, 3f, 18.5f)
                curveTo(3f, 17.119f, 4.119f, 16f, 5.5f, 16f)
                moveTo(8f, 18.5f)
                curveTo(8f, 17.119f, 6.881f, 16f, 5.5f, 16f)
                moveTo(5.5f, 16f)
                verticalLineTo(8f)
                moveTo(5.5f, 8f)
                curveTo(4.119f, 8f, 3f, 6.881f, 3f, 5.5f)
                curveTo(3f, 4.119f, 4.119f, 3f, 5.5f, 3f)
                curveTo(6.881f, 3f, 8f, 4.119f, 8f, 5.5f)
                moveTo(5.5f, 8f)
                curveTo(6.881f, 8f, 8f, 6.881f, 8f, 5.5f)
                moveTo(8f, 5.5f)
                horizontalLineTo(16f)
                moveTo(18.5f, 8f)
                curveTo(17.119f, 8f, 16f, 6.881f, 16f, 5.5f)
                moveTo(18.5f, 8f)
                curveTo(19.881f, 8f, 21f, 6.881f, 21f, 5.5f)
                curveTo(21f, 4.119f, 19.881f, 3f, 18.5f, 3f)
                curveTo(17.119f, 3f, 16f, 4.119f, 16f, 5.5f)
            }
        }.build()

        return _DrawSquare!!
    }

@Suppress("ObjectPropertyName")
private var _DrawSquare: ImageVector? = null
