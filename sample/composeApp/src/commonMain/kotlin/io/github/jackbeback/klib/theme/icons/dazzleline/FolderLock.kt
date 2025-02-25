package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FolderLock: ImageVector
    get() {
        if (_FolderLock != null) {
            return _FolderLock!!
        }
        _FolderLock = ImageVector.Builder(
            name = "FolderLock",
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
                moveTo(14f, 13f)
                verticalLineTo(12f)
                curveTo(14f, 10.895f, 13.105f, 10f, 12f, 10f)
                curveTo(10.895f, 10f, 10f, 10.895f, 10f, 12f)
                verticalLineTo(13f)
                moveTo(10.5f, 16f)
                horizontalLineTo(13.5f)
                curveTo(13.966f, 16f, 14.199f, 16f, 14.383f, 15.924f)
                curveTo(14.628f, 15.822f, 14.822f, 15.628f, 14.924f, 15.383f)
                curveTo(15f, 15.199f, 15f, 14.966f, 15f, 14.5f)
                curveTo(15f, 14.034f, 15f, 13.801f, 14.924f, 13.617f)
                curveTo(14.822f, 13.372f, 14.628f, 13.178f, 14.383f, 13.076f)
                curveTo(14.199f, 13f, 13.966f, 13f, 13.5f, 13f)
                horizontalLineTo(10.5f)
                curveTo(10.034f, 13f, 9.801f, 13f, 9.617f, 13.076f)
                curveTo(9.372f, 13.178f, 9.178f, 13.372f, 9.076f, 13.617f)
                curveTo(9f, 13.801f, 9f, 14.034f, 9f, 14.5f)
                curveTo(9f, 14.966f, 9f, 15.199f, 9.076f, 15.383f)
                curveTo(9.178f, 15.628f, 9.372f, 15.822f, 9.617f, 15.924f)
                curveTo(9.801f, 16f, 10.034f, 16f, 10.5f, 16f)
                close()
                moveTo(12.063f, 6.063f)
                lineTo(11.937f, 5.937f)
                curveTo(11.591f, 5.591f, 11.418f, 5.418f, 11.217f, 5.295f)
                curveTo(11.038f, 5.185f, 10.842f, 5.104f, 10.639f, 5.055f)
                curveTo(10.408f, 5f, 10.164f, 5f, 9.675f, 5f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 5f, 4.52f, 5f, 4.092f, 5.218f)
                curveTo(3.716f, 5.41f, 3.41f, 5.716f, 3.218f, 6.092f)
                curveTo(3f, 6.52f, 3f, 7.08f, 3f, 8.2f)
                verticalLineTo(15.8f)
                curveTo(3f, 16.92f, 3f, 17.48f, 3.218f, 17.908f)
                curveTo(3.41f, 18.284f, 3.716f, 18.59f, 4.092f, 18.782f)
                curveTo(4.52f, 19f, 5.08f, 19f, 6.2f, 19f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 19f, 19.48f, 19f, 19.908f, 18.782f)
                curveTo(20.284f, 18.59f, 20.59f, 18.284f, 20.782f, 17.908f)
                curveTo(21f, 17.48f, 21f, 16.92f, 21f, 15.8f)
                verticalLineTo(10.2f)
                curveTo(21f, 9.08f, 21f, 8.52f, 20.782f, 8.092f)
                curveTo(20.59f, 7.716f, 20.284f, 7.41f, 19.908f, 7.218f)
                curveTo(19.48f, 7f, 18.92f, 7f, 17.8f, 7f)
                horizontalLineTo(14.325f)
                curveTo(13.836f, 7f, 13.592f, 7f, 13.361f, 6.945f)
                curveTo(13.158f, 6.896f, 12.962f, 6.815f, 12.783f, 6.705f)
                curveTo(12.582f, 6.582f, 12.409f, 6.409f, 12.063f, 6.063f)
                close()
            }
        }.build()

        return _FolderLock!!
    }

@Suppress("ObjectPropertyName")
private var _FolderLock: ImageVector? = null
