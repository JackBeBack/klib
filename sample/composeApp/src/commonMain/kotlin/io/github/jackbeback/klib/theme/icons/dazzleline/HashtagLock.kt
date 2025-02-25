package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HashtagLock: ImageVector
    get() {
        if (_HashtagLock != null) {
            return _HashtagLock!!
        }
        _HashtagLock = ImageVector.Builder(
            name = "HashtagLock",
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
                moveTo(8f, 3f)
                lineTo(7f, 9f)
                moveTo(7f, 9f)
                lineTo(6f, 15f)
                moveTo(7f, 9f)
                horizontalLineTo(4f)
                moveTo(7f, 9f)
                horizontalLineTo(13f)
                moveTo(6f, 15f)
                lineTo(5f, 21f)
                moveTo(6f, 15f)
                horizontalLineTo(3f)
                moveTo(6f, 15f)
                horizontalLineTo(12f)
                moveTo(13f, 9f)
                horizontalLineTo(16f)
                moveTo(13f, 9f)
                lineTo(14f, 3f)
                moveTo(13f, 9f)
                lineTo(12f, 15f)
                moveTo(12f, 15f)
                lineTo(11f, 21f)
                moveTo(16f, 18f)
                verticalLineTo(17f)
                curveTo(16f, 15.895f, 16.895f, 15f, 18f, 15f)
                curveTo(19.105f, 15f, 20f, 15.895f, 20f, 17f)
                verticalLineTo(18f)
                moveTo(16.5f, 21f)
                horizontalLineTo(19.5f)
                curveTo(19.966f, 21f, 20.199f, 21f, 20.383f, 20.924f)
                curveTo(20.628f, 20.822f, 20.822f, 20.628f, 20.924f, 20.383f)
                curveTo(21f, 20.199f, 21f, 19.966f, 21f, 19.5f)
                curveTo(21f, 19.034f, 21f, 18.801f, 20.924f, 18.617f)
                curveTo(20.822f, 18.372f, 20.628f, 18.178f, 20.383f, 18.076f)
                curveTo(20.199f, 18f, 19.966f, 18f, 19.5f, 18f)
                horizontalLineTo(16.5f)
                curveTo(16.034f, 18f, 15.801f, 18f, 15.617f, 18.076f)
                curveTo(15.372f, 18.178f, 15.178f, 18.372f, 15.076f, 18.617f)
                curveTo(15f, 18.801f, 15f, 19.034f, 15f, 19.5f)
                curveTo(15f, 19.966f, 15f, 20.199f, 15.076f, 20.383f)
                curveTo(15.178f, 20.628f, 15.372f, 20.822f, 15.617f, 20.924f)
                curveTo(15.801f, 21f, 16.034f, 21f, 16.5f, 21f)
                close()
            }
        }.build()

        return _HashtagLock!!
    }

@Suppress("ObjectPropertyName")
private var _HashtagLock: ImageVector? = null
