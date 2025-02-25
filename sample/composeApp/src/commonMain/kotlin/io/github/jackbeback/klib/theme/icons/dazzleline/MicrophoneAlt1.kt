package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MicrophoneAlt1: ImageVector
    get() {
        if (_MicrophoneAlt1 != null) {
            return _MicrophoneAlt1!!
        }
        _MicrophoneAlt1 = ImageVector.Builder(
            name = "MicrophoneAlt1",
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
                moveTo(19f, 10f)
                verticalLineTo(12f)
                curveTo(19f, 15.866f, 15.866f, 19f, 12f, 19f)
                moveTo(5f, 10f)
                verticalLineTo(12f)
                curveTo(5f, 15.866f, 8.134f, 19f, 12f, 19f)
                moveTo(12f, 19f)
                verticalLineTo(22f)
                moveTo(8f, 22f)
                horizontalLineTo(16f)
                moveTo(12f, 15f)
                curveTo(10.343f, 15f, 9f, 13.657f, 9f, 12f)
                verticalLineTo(5f)
                curveTo(9f, 3.343f, 10.343f, 2f, 12f, 2f)
                curveTo(13.657f, 2f, 15f, 3.343f, 15f, 5f)
                verticalLineTo(12f)
                curveTo(15f, 13.657f, 13.657f, 15f, 12f, 15f)
                close()
            }
        }.build()

        return _MicrophoneAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneAlt1: ImageVector? = null
