package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowUpRightFromSquare: ImageVector
    get() {
        if (_ArrowUpRightFromSquare != null) {
            return _ArrowUpRightFromSquare!!
        }
        _ArrowUpRightFromSquare = ImageVector.Builder(
            name = "ArrowUpRightFromSquare",
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
                moveTo(20f, 4f)
                lineTo(12f, 12f)
                moveTo(20f, 4f)
                verticalLineTo(8.5f)
                moveTo(20f, 4f)
                horizontalLineTo(15.5f)
                moveTo(19f, 12.5f)
                verticalLineTo(16.8f)
                curveTo(19f, 17.92f, 19f, 18.48f, 18.782f, 18.908f)
                curveTo(18.59f, 19.284f, 18.284f, 19.59f, 17.908f, 19.782f)
                curveTo(17.48f, 20f, 16.92f, 20f, 15.8f, 20f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 20f, 5.52f, 20f, 5.092f, 19.782f)
                curveTo(4.716f, 19.59f, 4.41f, 19.284f, 4.218f, 18.908f)
                curveTo(4f, 18.48f, 4f, 17.92f, 4f, 16.8f)
                verticalLineTo(8.2f)
                curveTo(4f, 7.08f, 4f, 6.52f, 4.218f, 6.092f)
                curveTo(4.41f, 5.716f, 4.716f, 5.41f, 5.092f, 5.218f)
                curveTo(5.52f, 5f, 6.08f, 5f, 7.2f, 5f)
                horizontalLineTo(11.5f)
            }
        }.build()

        return _ArrowUpRightFromSquare!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpRightFromSquare: ImageVector? = null
