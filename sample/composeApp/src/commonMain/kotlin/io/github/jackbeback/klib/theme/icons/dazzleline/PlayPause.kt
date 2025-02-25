package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PlayPause: ImageVector
    get() {
        if (_PlayPause != null) {
            return _PlayPause!!
        }
        _PlayPause = ImageVector.Builder(
            name = "PlayPause",
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
                moveTo(15f, 5f)
                verticalLineTo(19f)
                moveTo(21f, 5f)
                verticalLineTo(19f)
                moveTo(3f, 7.206f)
                verticalLineTo(16.794f)
                curveTo(3f, 17.8f, 3f, 18.302f, 3.199f, 18.535f)
                curveTo(3.371f, 18.737f, 3.63f, 18.844f, 3.895f, 18.824f)
                curveTo(4.2f, 18.8f, 4.556f, 18.444f, 5.267f, 17.733f)
                lineTo(10.061f, 12.939f)
                curveTo(10.39f, 12.61f, 10.554f, 12.446f, 10.616f, 12.257f)
                curveTo(10.67f, 12.09f, 10.67f, 11.91f, 10.616f, 11.743f)
                curveTo(10.554f, 11.554f, 10.39f, 11.39f, 10.061f, 11.061f)
                lineTo(5.267f, 6.267f)
                curveTo(4.556f, 5.556f, 4.2f, 5.2f, 3.895f, 5.176f)
                curveTo(3.63f, 5.156f, 3.371f, 5.263f, 3.199f, 5.465f)
                curveTo(3f, 5.698f, 3f, 6.2f, 3f, 7.206f)
                close()
            }
        }.build()

        return _PlayPause!!
    }

@Suppress("ObjectPropertyName")
private var _PlayPause: ImageVector? = null
