package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LaptopLock: ImageVector
    get() {
        if (_LaptopLock != null) {
            return _LaptopLock!!
        }
        _LaptopLock = ImageVector.Builder(
            name = "LaptopLock",
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
                moveTo(8f, 6.004f)
                verticalLineTo(5f)
                curveTo(8f, 3.895f, 7.105f, 3f, 6f, 3f)
                curveTo(4.895f, 3f, 4f, 3.895f, 4f, 5f)
                verticalLineTo(6.004f)
                moveTo(12f, 4f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 4f, 19.48f, 4f, 19.908f, 4.218f)
                curveTo(20.284f, 4.41f, 20.59f, 4.716f, 20.782f, 5.092f)
                curveTo(21f, 5.52f, 21f, 6.08f, 21f, 7.2f)
                verticalLineTo(16f)
                moveTo(3f, 16f)
                verticalLineTo(13f)
                moveTo(4.5f, 9f)
                horizontalLineTo(7.5f)
                curveTo(7.966f, 9f, 8.199f, 9f, 8.383f, 8.924f)
                curveTo(8.628f, 8.822f, 8.822f, 8.628f, 8.924f, 8.383f)
                curveTo(9f, 8.199f, 9f, 7.966f, 9f, 7.5f)
                curveTo(9f, 7.034f, 9f, 6.801f, 8.924f, 6.617f)
                curveTo(8.822f, 6.372f, 8.628f, 6.178f, 8.383f, 6.076f)
                curveTo(8.199f, 6f, 7.966f, 6f, 7.5f, 6f)
                horizontalLineTo(4.5f)
                curveTo(4.034f, 6f, 3.801f, 6f, 3.617f, 6.076f)
                curveTo(3.372f, 6.178f, 3.178f, 6.372f, 3.076f, 6.617f)
                curveTo(3f, 6.801f, 3f, 7.034f, 3f, 7.5f)
                curveTo(3f, 7.966f, 3f, 8.199f, 3.076f, 8.383f)
                curveTo(3.178f, 8.628f, 3.372f, 8.822f, 3.617f, 8.924f)
                curveTo(3.801f, 9f, 4.034f, 9f, 4.5f, 9f)
                close()
                moveTo(2f, 16f)
                horizontalLineTo(22f)
                verticalLineTo(16.8f)
                curveTo(22f, 17.92f, 22f, 18.48f, 21.782f, 18.908f)
                curveTo(21.59f, 19.284f, 21.284f, 19.59f, 20.908f, 19.782f)
                curveTo(20.48f, 20f, 19.92f, 20f, 18.8f, 20f)
                horizontalLineTo(5.2f)
                curveTo(4.08f, 20f, 3.52f, 20f, 3.092f, 19.782f)
                curveTo(2.716f, 19.59f, 2.41f, 19.284f, 2.218f, 18.908f)
                curveTo(2f, 18.48f, 2f, 17.92f, 2f, 16.8f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _LaptopLock!!
    }

@Suppress("ObjectPropertyName")
private var _LaptopLock: ImageVector? = null
