package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Video: ImageVector
    get() {
        if (_Video != null) {
            return _Video!!
        }
        _Video = ImageVector.Builder(
            name = "Video",
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
                moveTo(16f, 10f)
                lineTo(18.577f, 8.454f)
                curveTo(19.37f, 7.978f, 19.767f, 7.74f, 20.093f, 7.771f)
                curveTo(20.377f, 7.797f, 20.637f, 7.944f, 20.806f, 8.174f)
                curveTo(21f, 8.438f, 21f, 8.901f, 21f, 9.826f)
                verticalLineTo(14.174f)
                curveTo(21f, 15.099f, 21f, 15.561f, 20.806f, 15.826f)
                curveTo(20.637f, 16.056f, 20.377f, 16.203f, 20.093f, 16.229f)
                curveTo(19.767f, 16.26f, 19.37f, 16.022f, 18.577f, 15.546f)
                lineTo(16f, 14f)
                moveTo(6.2f, 18f)
                horizontalLineTo(12.8f)
                curveTo(13.92f, 18f, 14.48f, 18f, 14.908f, 17.782f)
                curveTo(15.284f, 17.59f, 15.59f, 17.284f, 15.782f, 16.908f)
                curveTo(16f, 16.48f, 16f, 15.92f, 16f, 14.8f)
                verticalLineTo(9.2f)
                curveTo(16f, 8.08f, 16f, 7.52f, 15.782f, 7.092f)
                curveTo(15.59f, 6.716f, 15.284f, 6.41f, 14.908f, 6.218f)
                curveTo(14.48f, 6f, 13.92f, 6f, 12.8f, 6f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 6f, 4.52f, 6f, 4.092f, 6.218f)
                curveTo(3.716f, 6.41f, 3.41f, 6.716f, 3.218f, 7.092f)
                curveTo(3f, 7.52f, 3f, 8.08f, 3f, 9.2f)
                verticalLineTo(14.8f)
                curveTo(3f, 15.92f, 3f, 16.48f, 3.218f, 16.908f)
                curveTo(3.41f, 17.284f, 3.716f, 17.59f, 4.092f, 17.782f)
                curveTo(4.52f, 18f, 5.08f, 18f, 6.2f, 18f)
                close()
            }
        }.build()

        return _Video!!
    }

@Suppress("ObjectPropertyName")
private var _Video: ImageVector? = null
