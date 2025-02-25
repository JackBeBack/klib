package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DrawSquareT: ImageVector
    get() {
        if (_DrawSquareT != null) {
            return _DrawSquareT!!
        }
        _DrawSquareT = ImageVector.Builder(
            name = "DrawSquareT",
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
                moveTo(17f, 19f)
                curveTo(17f, 20.105f, 17.895f, 21f, 19f, 21f)
                curveTo(20.105f, 21f, 21f, 20.105f, 21f, 19f)
                curveTo(21f, 17.895f, 20.105f, 17f, 19f, 17f)
                moveTo(17f, 19f)
                curveTo(17f, 17.895f, 17.895f, 17f, 19f, 17f)
                moveTo(17f, 19f)
                horizontalLineTo(7f)
                moveTo(19f, 17f)
                verticalLineTo(7f)
                moveTo(7f, 19f)
                curveTo(7f, 20.105f, 6.105f, 21f, 5f, 21f)
                curveTo(3.895f, 21f, 3f, 20.105f, 3f, 19f)
                curveTo(3f, 17.895f, 3.895f, 17f, 5f, 17f)
                moveTo(7f, 19f)
                curveTo(7f, 17.895f, 6.105f, 17f, 5f, 17f)
                moveTo(5f, 17f)
                verticalLineTo(7f)
                moveTo(5f, 7f)
                curveTo(3.895f, 7f, 3f, 6.105f, 3f, 5f)
                curveTo(3f, 3.895f, 3.895f, 3f, 5f, 3f)
                curveTo(6.105f, 3f, 7f, 3.895f, 7f, 5f)
                moveTo(5f, 7f)
                curveTo(6.105f, 7f, 7f, 6.105f, 7f, 5f)
                moveTo(7f, 5f)
                horizontalLineTo(17f)
                moveTo(19f, 7f)
                curveTo(17.895f, 7f, 17f, 6.105f, 17f, 5f)
                moveTo(19f, 7f)
                curveTo(20.105f, 7f, 21f, 6.105f, 21f, 5f)
                curveTo(21f, 3.895f, 20.105f, 3f, 19f, 3f)
                curveTo(17.895f, 3f, 17f, 3.895f, 17f, 5f)
                moveTo(12f, 15f)
                verticalLineTo(9f)
                moveTo(9f, 9f)
                horizontalLineTo(15f)
            }
        }.build()

        return _DrawSquareT!!
    }

@Suppress("ObjectPropertyName")
private var _DrawSquareT: ImageVector? = null
