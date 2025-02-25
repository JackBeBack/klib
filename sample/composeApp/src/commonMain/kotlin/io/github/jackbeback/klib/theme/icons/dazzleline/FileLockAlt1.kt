package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FileLockAlt1: ImageVector
    get() {
        if (_FileLockAlt1 != null) {
            return _FileLockAlt1!!
        }
        _FileLockAlt1 = ImageVector.Builder(
            name = "FileLockAlt1",
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
                moveTo(12f, 3f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 3f, 5.52f, 3f, 5.092f, 3.218f)
                curveTo(4.716f, 3.41f, 4.41f, 3.716f, 4.218f, 4.092f)
                curveTo(4f, 4.52f, 4f, 5.08f, 4f, 6.2f)
                verticalLineTo(17.8f)
                curveTo(4f, 18.92f, 4f, 19.48f, 4.218f, 19.908f)
                curveTo(4.41f, 20.284f, 4.716f, 20.59f, 5.092f, 20.782f)
                curveTo(5.52f, 21f, 6.08f, 21f, 7.2f, 21f)
                horizontalLineTo(9f)
                moveTo(12f, 3f)
                lineTo(18f, 9f)
                moveTo(12f, 3f)
                verticalLineTo(7.4f)
                curveTo(12f, 7.96f, 12f, 8.24f, 12.109f, 8.454f)
                curveTo(12.205f, 8.642f, 12.358f, 8.795f, 12.546f, 8.891f)
                curveTo(12.76f, 9f, 13.04f, 9f, 13.6f, 9f)
                horizontalLineTo(18f)
                moveTo(18f, 9f)
                verticalLineTo(10f)
                moveTo(19f, 18.004f)
                verticalLineTo(17f)
                curveTo(19f, 15.895f, 18.105f, 15f, 17f, 15f)
                curveTo(15.895f, 15f, 15f, 15.895f, 15f, 17f)
                verticalLineTo(18.004f)
                moveTo(15.5f, 21f)
                horizontalLineTo(18.5f)
                curveTo(18.966f, 21f, 19.199f, 21f, 19.383f, 20.924f)
                curveTo(19.628f, 20.822f, 19.822f, 20.628f, 19.924f, 20.383f)
                curveTo(20f, 20.199f, 20f, 19.966f, 20f, 19.5f)
                curveTo(20f, 19.034f, 20f, 18.801f, 19.924f, 18.617f)
                curveTo(19.822f, 18.372f, 19.628f, 18.178f, 19.383f, 18.076f)
                curveTo(19.199f, 18f, 18.966f, 18f, 18.5f, 18f)
                horizontalLineTo(15.5f)
                curveTo(15.034f, 18f, 14.801f, 18f, 14.617f, 18.076f)
                curveTo(14.372f, 18.178f, 14.178f, 18.372f, 14.076f, 18.617f)
                curveTo(14f, 18.801f, 14f, 19.034f, 14f, 19.5f)
                curveTo(14f, 19.966f, 14f, 20.199f, 14.076f, 20.383f)
                curveTo(14.178f, 20.628f, 14.372f, 20.822f, 14.617f, 20.924f)
                curveTo(14.801f, 21f, 15.034f, 21f, 15.5f, 21f)
                close()
            }
        }.build()

        return _FileLockAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _FileLockAlt1: ImageVector? = null
