package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MicrophoneAlt: ImageVector
    get() {
        if (_MicrophoneAlt != null) {
            return _MicrophoneAlt!!
        }
        _MicrophoneAlt = ImageVector.Builder(
            name = "MicrophoneAlt",
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
                moveTo(20f, 12f)
                verticalLineTo(13f)
                curveTo(20f, 17.418f, 16.418f, 21f, 12f, 21f)
                curveTo(7.582f, 21f, 4f, 17.418f, 4f, 13f)
                verticalLineTo(12f)
                moveTo(12f, 17f)
                curveTo(9.791f, 17f, 8f, 15.209f, 8f, 13f)
                verticalLineTo(7f)
                curveTo(8f, 4.791f, 9.791f, 3f, 12f, 3f)
                curveTo(14.209f, 3f, 16f, 4.791f, 16f, 7f)
                verticalLineTo(13f)
                curveTo(16f, 15.209f, 14.209f, 17f, 12f, 17f)
                close()
            }
        }.build()

        return _MicrophoneAlt!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneAlt: ImageVector? = null
