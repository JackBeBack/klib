package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MicrophoneSlash: ImageVector
    get() {
        if (_MicrophoneSlash != null) {
            return _MicrophoneSlash!!
        }
        _MicrophoneSlash = ImageVector.Builder(
            name = "MicrophoneSlash",
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
                moveTo(15f, 9.4f)
                verticalLineTo(5f)
                curveTo(15f, 3.343f, 13.657f, 2f, 12f, 2f)
                curveTo(10.822f, 2f, 9.803f, 2.679f, 9.312f, 3.666f)
                moveTo(12f, 19f)
                verticalLineTo(22f)
                moveTo(8f, 22f)
                horizontalLineTo(16f)
                moveTo(3f, 3f)
                lineTo(21f, 21f)
                moveTo(5f, 10f)
                curveTo(5f, 10f, 3.501f, 19f, 12.04f, 19f)
                curveTo(14.51f, 19f, 16.133f, 18.247f, 17.193f, 17.177f)
                moveTo(19.032f, 13f)
                curveTo(19.236f, 11.348f, 19f, 10f, 19f, 10f)
                moveTo(15f, 6f)
                horizontalLineTo(13f)
                moveTo(12f, 15f)
                curveTo(10.343f, 15f, 9f, 13.657f, 9f, 12f)
                verticalLineTo(9f)
                lineTo(14.123f, 14.12f)
                curveTo(13.58f, 14.664f, 12.829f, 15f, 12f, 15f)
                close()
            }
        }.build()

        return _MicrophoneSlash!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneSlash: ImageVector? = null
