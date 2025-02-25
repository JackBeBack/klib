package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FileLock: ImageVector
    get() {
        if (_FileLock != null) {
            return _FileLock!!
        }
        _FileLock = ImageVector.Builder(
            name = "FileLock",
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
                moveTo(13f, 3f)
                horizontalLineTo(8.2f)
                curveTo(7.08f, 3f, 6.52f, 3f, 6.092f, 3.218f)
                curveTo(5.716f, 3.41f, 5.41f, 3.716f, 5.218f, 4.092f)
                curveTo(5f, 4.52f, 5f, 5.08f, 5f, 6.2f)
                verticalLineTo(17.8f)
                curveTo(5f, 18.92f, 5f, 19.48f, 5.218f, 19.908f)
                curveTo(5.41f, 20.284f, 5.716f, 20.59f, 6.092f, 20.782f)
                curveTo(6.52f, 21f, 7.08f, 21f, 8.2f, 21f)
                horizontalLineTo(15.8f)
                curveTo(16.92f, 21f, 17.48f, 21f, 17.908f, 20.782f)
                curveTo(18.284f, 20.59f, 18.59f, 20.284f, 18.782f, 19.908f)
                curveTo(19f, 19.48f, 19f, 18.92f, 19f, 17.8f)
                verticalLineTo(9f)
                moveTo(13f, 3f)
                lineTo(19f, 9f)
                moveTo(13f, 3f)
                verticalLineTo(7.4f)
                curveTo(13f, 7.96f, 13f, 8.24f, 13.109f, 8.454f)
                curveTo(13.205f, 8.642f, 13.358f, 8.795f, 13.546f, 8.891f)
                curveTo(13.76f, 9f, 14.04f, 9f, 14.6f, 9f)
                horizontalLineTo(19f)
                moveTo(14f, 15.004f)
                verticalLineTo(14f)
                curveTo(14f, 12.895f, 13.105f, 12f, 12f, 12f)
                curveTo(10.895f, 12f, 10f, 12.895f, 10f, 14f)
                verticalLineTo(15.004f)
                moveTo(10.5f, 18f)
                horizontalLineTo(13.5f)
                curveTo(13.966f, 18f, 14.199f, 18f, 14.383f, 17.924f)
                curveTo(14.628f, 17.822f, 14.822f, 17.628f, 14.924f, 17.383f)
                curveTo(15f, 17.199f, 15f, 16.966f, 15f, 16.5f)
                curveTo(15f, 16.034f, 15f, 15.801f, 14.924f, 15.617f)
                curveTo(14.822f, 15.372f, 14.628f, 15.178f, 14.383f, 15.076f)
                curveTo(14.199f, 15f, 13.966f, 15f, 13.5f, 15f)
                horizontalLineTo(10.5f)
                curveTo(10.034f, 15f, 9.801f, 15f, 9.617f, 15.076f)
                curveTo(9.372f, 15.178f, 9.178f, 15.372f, 9.076f, 15.617f)
                curveTo(9f, 15.801f, 9f, 16.034f, 9f, 16.5f)
                curveTo(9f, 16.966f, 9f, 17.199f, 9.076f, 17.383f)
                curveTo(9.178f, 17.628f, 9.372f, 17.822f, 9.617f, 17.924f)
                curveTo(9.801f, 18f, 10.034f, 18f, 10.5f, 18f)
                close()
            }
        }.build()

        return _FileLock!!
    }

@Suppress("ObjectPropertyName")
private var _FileLock: ImageVector? = null
