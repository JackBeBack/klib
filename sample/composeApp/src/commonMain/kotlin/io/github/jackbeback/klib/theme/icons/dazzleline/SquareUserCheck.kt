package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SquareUserCheck: ImageVector
    get() {
        if (_SquareUserCheck != null) {
            return _SquareUserCheck!!
        }
        _SquareUserCheck = ImageVector.Builder(
            name = "SquareUserCheck",
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
                moveTo(15f, 18f)
                lineTo(17f, 20f)
                lineTo(21f, 16f)
                moveTo(11f, 20f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 20f, 5.52f, 20f, 5.092f, 19.782f)
                curveTo(4.716f, 19.59f, 4.41f, 19.284f, 4.218f, 18.908f)
                curveTo(4f, 18.48f, 4f, 17.92f, 4f, 16.8f)
                verticalLineTo(7.2f)
                curveTo(4f, 6.08f, 4f, 5.52f, 4.218f, 5.092f)
                curveTo(4.41f, 4.716f, 4.716f, 4.41f, 5.092f, 4.218f)
                curveTo(5.52f, 4f, 6.08f, 4f, 7.2f, 4f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 4f, 18.48f, 4f, 18.908f, 4.218f)
                curveTo(19.284f, 4.41f, 19.59f, 4.716f, 19.782f, 5.092f)
                curveTo(20f, 5.52f, 20f, 6.08f, 20f, 7.2f)
                verticalLineTo(12f)
                moveTo(7f, 20f)
                curveTo(7f, 19.657f, 7.034f, 19.323f, 7.1f, 19f)
                curveTo(7.563f, 16.718f, 9.581f, 15f, 12f, 15f)
                moveTo(14f, 10f)
                curveTo(14f, 11.105f, 13.105f, 12f, 12f, 12f)
                curveTo(10.895f, 12f, 10f, 11.105f, 10f, 10f)
                curveTo(10f, 8.895f, 10.895f, 8f, 12f, 8f)
                curveTo(13.105f, 8f, 14f, 8.895f, 14f, 10f)
                close()
            }
        }.build()

        return _SquareUserCheck!!
    }

@Suppress("ObjectPropertyName")
private var _SquareUserCheck: ImageVector? = null
