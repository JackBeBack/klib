package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SquareList: ImageVector
    get() {
        if (_SquareList != null) {
            return _SquareList!!
        }
        _SquareList = ImageVector.Builder(
            name = "SquareList",
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
                moveTo(11f, 8f)
                lineTo(16f, 8.001f)
                moveTo(11f, 12f)
                lineTo(16f, 12f)
                moveTo(11f, 16f)
                lineTo(16f, 16f)
                moveTo(8f, 16f)
                horizontalLineTo(8.01f)
                moveTo(8f, 12f)
                horizontalLineTo(8.01f)
                moveTo(8f, 8f)
                horizontalLineTo(8.01f)
                moveTo(7.2f, 4f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 4f, 18.48f, 4f, 18.908f, 4.218f)
                curveTo(19.284f, 4.41f, 19.59f, 4.716f, 19.782f, 5.092f)
                curveTo(20f, 5.52f, 20f, 6.08f, 20f, 7.2f)
                verticalLineTo(16.8f)
                curveTo(20f, 17.92f, 20f, 18.48f, 19.782f, 18.908f)
                curveTo(19.59f, 19.284f, 19.284f, 19.59f, 18.908f, 19.782f)
                curveTo(18.48f, 20f, 17.92f, 20f, 16.8f, 20f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 20f, 5.52f, 20f, 5.092f, 19.782f)
                curveTo(4.716f, 19.59f, 4.41f, 19.284f, 4.218f, 18.908f)
                curveTo(4f, 18.48f, 4f, 17.92f, 4f, 16.8f)
                verticalLineTo(7.2f)
                curveTo(4f, 6.08f, 4f, 5.52f, 4.218f, 5.092f)
                curveTo(4.41f, 4.716f, 4.716f, 4.41f, 5.092f, 4.218f)
                curveTo(5.52f, 4f, 6.08f, 4f, 7.2f, 4f)
                close()
            }
        }.build()

        return _SquareList!!
    }

@Suppress("ObjectPropertyName")
private var _SquareList: ImageVector? = null
