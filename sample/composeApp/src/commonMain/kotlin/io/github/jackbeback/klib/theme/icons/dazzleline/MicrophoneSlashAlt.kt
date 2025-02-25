package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MicrophoneSlashAlt: ImageVector
    get() {
        if (_MicrophoneSlashAlt != null) {
            return _MicrophoneSlashAlt!!
        }
        _MicrophoneSlashAlt = ImageVector.Builder(
            name = "MicrophoneSlashAlt",
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
                moveTo(16f, 10.4f)
                verticalLineTo(7f)
                curveTo(16f, 4.791f, 14.209f, 3f, 12f, 3f)
                curveTo(11.041f, 3f, 10.16f, 3.338f, 9.471f, 3.901f)
                moveTo(4f, 12f)
                verticalLineTo(13f)
                curveTo(4f, 17.418f, 7.582f, 21f, 12f, 21f)
                curveTo(14.465f, 21f, 16.67f, 19.885f, 18.138f, 18.132f)
                moveTo(3f, 3f)
                lineTo(21f, 21f)
                moveTo(12f, 17f)
                curveTo(9.791f, 17f, 8f, 15.209f, 8f, 13f)
                verticalLineTo(8f)
                lineTo(15.281f, 15.288f)
                curveTo(14.559f, 16.323f, 13.358f, 17f, 12f, 17f)
                close()
            }
        }.build()

        return _MicrophoneSlashAlt!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneSlashAlt: ImageVector? = null
