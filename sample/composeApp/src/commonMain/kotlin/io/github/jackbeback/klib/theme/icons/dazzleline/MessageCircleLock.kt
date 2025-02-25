package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MessageCircleLock: ImageVector
    get() {
        if (_MessageCircleLock != null) {
            return _MessageCircleLock!!
        }
        _MessageCircleLock = ImageVector.Builder(
            name = "MessageCircleLock",
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
                moveTo(10f, 12f)
                verticalLineTo(11f)
                curveTo(10f, 9.895f, 10.895f, 9f, 12f, 9f)
                curveTo(13.105f, 9f, 14f, 9.895f, 14f, 11f)
                verticalLineTo(12f)
                moveTo(21.004f, 12f)
                curveTo(21.004f, 16.971f, 16.975f, 21f, 12.004f, 21f)
                curveTo(9.967f, 21f, 3.005f, 21f, 3.005f, 21f)
                curveTo(3.005f, 21f, 4.564f, 17.256f, 3.94f, 16.001f)
                curveTo(3.341f, 14.796f, 3.004f, 13.437f, 3.004f, 12f)
                curveTo(3.004f, 7.029f, 7.033f, 3f, 12.004f, 3f)
                curveTo(16.975f, 3f, 21.004f, 7.029f, 21.004f, 12f)
                close()
                moveTo(10.5f, 15f)
                horizontalLineTo(13.5f)
                curveTo(13.966f, 15f, 14.199f, 15f, 14.383f, 14.924f)
                curveTo(14.628f, 14.822f, 14.822f, 14.628f, 14.924f, 14.383f)
                curveTo(15f, 14.199f, 15f, 13.966f, 15f, 13.5f)
                curveTo(15f, 13.034f, 15f, 12.801f, 14.924f, 12.617f)
                curveTo(14.822f, 12.372f, 14.628f, 12.178f, 14.383f, 12.076f)
                curveTo(14.199f, 12f, 13.966f, 12f, 13.5f, 12f)
                horizontalLineTo(10.5f)
                curveTo(10.034f, 12f, 9.801f, 12f, 9.617f, 12.076f)
                curveTo(9.372f, 12.178f, 9.178f, 12.372f, 9.076f, 12.617f)
                curveTo(9f, 12.801f, 9f, 13.034f, 9f, 13.5f)
                curveTo(9f, 13.966f, 9f, 14.199f, 9.076f, 14.383f)
                curveTo(9.178f, 14.628f, 9.372f, 14.822f, 9.617f, 14.924f)
                curveTo(9.801f, 15f, 10.034f, 15f, 10.5f, 15f)
                close()
            }
        }.build()

        return _MessageCircleLock!!
    }

@Suppress("ObjectPropertyName")
private var _MessageCircleLock: ImageVector? = null
