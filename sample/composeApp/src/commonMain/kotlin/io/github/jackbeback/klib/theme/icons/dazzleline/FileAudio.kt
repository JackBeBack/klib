package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FileAudio: ImageVector
    get() {
        if (_FileAudio != null) {
            return _FileAudio!!
        }
        _FileAudio = ImageVector.Builder(
            name = "FileAudio",
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
                moveTo(19f, 9f)
                verticalLineTo(17.8f)
                curveTo(19f, 18.92f, 19f, 19.48f, 18.782f, 19.908f)
                curveTo(18.59f, 20.284f, 18.284f, 20.59f, 17.908f, 20.782f)
                curveTo(17.48f, 21f, 16.92f, 21f, 15.8f, 21f)
                horizontalLineTo(8.2f)
                curveTo(7.08f, 21f, 6.52f, 21f, 6.092f, 20.782f)
                curveTo(5.716f, 20.59f, 5.41f, 20.284f, 5.218f, 19.908f)
                curveTo(5f, 19.48f, 5f, 18.92f, 5f, 17.8f)
                verticalLineTo(6.2f)
                curveTo(5f, 5.08f, 5f, 4.52f, 5.218f, 4.092f)
                curveTo(5.41f, 3.716f, 5.716f, 3.41f, 6.092f, 3.218f)
                curveTo(6.52f, 3f, 7.08f, 3f, 8.2f, 3f)
                horizontalLineTo(13f)
                moveTo(19f, 9f)
                lineTo(13f, 3f)
                moveTo(19f, 9f)
                horizontalLineTo(16.2f)
                curveTo(15.08f, 9f, 14.52f, 9f, 14.092f, 8.782f)
                curveTo(13.716f, 8.59f, 13.41f, 8.284f, 13.218f, 7.908f)
                curveTo(13f, 7.48f, 13f, 6.92f, 13f, 5.8f)
                verticalLineTo(3f)
                moveTo(14.5f, 13f)
                curveTo(15.114f, 13.491f, 15.5f, 14.205f, 15.5f, 15f)
                curveTo(15.5f, 15.795f, 15.114f, 16.509f, 14.5f, 17f)
                moveTo(8.5f, 14f)
                horizontalLineTo(9.833f)
                lineTo(11.5f, 12f)
                verticalLineTo(18f)
                lineTo(9.833f, 16f)
                horizontalLineTo(8.5f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _FileAudio!!
    }

@Suppress("ObjectPropertyName")
private var _FileAudio: ImageVector? = null
