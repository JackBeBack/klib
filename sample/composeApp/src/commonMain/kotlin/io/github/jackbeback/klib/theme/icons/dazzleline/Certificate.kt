package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Certificate: ImageVector
    get() {
        if (_Certificate != null) {
            return _Certificate!!
        }
        _Certificate = ImageVector.Builder(
            name = "Certificate",
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
                lineTo(13.91f, 4.871f)
                lineTo(16.5f, 4.206f)
                lineTo(17.218f, 6.782f)
                lineTo(19.794f, 7.5f)
                lineTo(19.128f, 10.09f)
                lineTo(21f, 12f)
                lineTo(19.128f, 13.91f)
                lineTo(19.794f, 16.5f)
                lineTo(17.218f, 17.218f)
                lineTo(16.5f, 19.794f)
                lineTo(13.91f, 19.128f)
                lineTo(12f, 21f)
                lineTo(10.09f, 19.128f)
                lineTo(7.5f, 19.794f)
                lineTo(6.782f, 17.218f)
                lineTo(4.206f, 16.5f)
                lineTo(4.871f, 13.91f)
                lineTo(3f, 12f)
                lineTo(4.871f, 10.09f)
                lineTo(4.206f, 7.5f)
                lineTo(6.782f, 6.782f)
                lineTo(7.5f, 4.206f)
                lineTo(10.09f, 4.871f)
                lineTo(12f, 3f)
                close()
            }
        }.build()

        return _Certificate!!
    }

@Suppress("ObjectPropertyName")
private var _Certificate: ImageVector? = null
