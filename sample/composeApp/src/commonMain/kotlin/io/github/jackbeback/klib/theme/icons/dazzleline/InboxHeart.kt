package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.InboxHeart: ImageVector
    get() {
        if (_InboxHeart != null) {
            return _InboxHeart!!
        }
        _InboxHeart = ImageVector.Builder(
            name = "InboxHeart",
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
                moveTo(4f, 14f)
                horizontalLineTo(6.675f)
                curveTo(7.164f, 14f, 7.408f, 14f, 7.638f, 14.055f)
                curveTo(7.843f, 14.104f, 8.038f, 14.185f, 8.217f, 14.295f)
                curveTo(8.418f, 14.418f, 8.591f, 14.591f, 8.937f, 14.937f)
                lineTo(9.063f, 15.063f)
                curveTo(9.409f, 15.409f, 9.582f, 15.582f, 9.783f, 15.705f)
                curveTo(9.962f, 15.815f, 10.158f, 15.896f, 10.361f, 15.945f)
                curveTo(10.592f, 16f, 10.836f, 16f, 11.325f, 16f)
                horizontalLineTo(12.675f)
                curveTo(13.164f, 16f, 13.408f, 16f, 13.639f, 15.945f)
                curveTo(13.842f, 15.896f, 14.038f, 15.815f, 14.217f, 15.705f)
                curveTo(14.418f, 15.582f, 14.591f, 15.409f, 14.937f, 15.063f)
                lineTo(15.063f, 14.937f)
                curveTo(15.409f, 14.591f, 15.582f, 14.418f, 15.783f, 14.295f)
                curveTo(15.962f, 14.185f, 16.157f, 14.104f, 16.361f, 14.055f)
                curveTo(16.592f, 14f, 16.836f, 14f, 17.326f, 14f)
                horizontalLineTo(20f)
                moveTo(11.998f, 8.593f)
                curveTo(11.398f, 7.944f, 10.398f, 7.769f, 9.646f, 8.364f)
                curveTo(8.895f, 8.958f, 8.789f, 9.952f, 9.379f, 10.656f)
                curveTo(9.69f, 11.026f, 10.401f, 11.658f, 11.003f, 12.172f)
                curveTo(11.343f, 12.461f, 11.512f, 12.606f, 11.719f, 12.666f)
                curveTo(11.894f, 12.717f, 12.101f, 12.717f, 12.277f, 12.666f)
                curveTo(12.483f, 12.606f, 12.653f, 12.461f, 12.992f, 12.172f)
                curveTo(13.595f, 11.658f, 14.306f, 11.026f, 14.617f, 10.656f)
                curveTo(15.207f, 9.952f, 15.114f, 8.952f, 14.349f, 8.364f)
                curveTo(13.585f, 7.776f, 12.598f, 7.944f, 11.998f, 8.593f)
                close()
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

        return _InboxHeart!!
    }

@Suppress("ObjectPropertyName")
private var _InboxHeart: ImageVector? = null
