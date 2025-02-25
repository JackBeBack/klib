package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.VolumeOff: ImageVector
    get() {
        if (_VolumeOff != null) {
            return _VolumeOff!!
        }
        _VolumeOff = ImageVector.Builder(
            name = "VolumeOff",
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
                moveTo(10.001f, 9f)
                horizontalLineTo(9.1f)
                curveTo(8.54f, 9f, 8.26f, 9f, 8.046f, 9.109f)
                curveTo(7.858f, 9.205f, 7.705f, 9.358f, 7.609f, 9.546f)
                curveTo(7.5f, 9.76f, 7.5f, 10.04f, 7.5f, 10.6f)
                verticalLineTo(13.4f)
                curveTo(7.5f, 13.96f, 7.5f, 14.24f, 7.609f, 14.454f)
                curveTo(7.705f, 14.642f, 7.858f, 14.795f, 8.046f, 14.891f)
                curveTo(8.26f, 15f, 8.54f, 15f, 9.1f, 15f)
                horizontalLineTo(10.001f)
                curveTo(10.552f, 15f, 10.828f, 15f, 11.083f, 15.068f)
                curveTo(11.309f, 15.129f, 11.523f, 15.229f, 11.714f, 15.364f)
                curveTo(11.931f, 15.516f, 12.107f, 15.728f, 12.46f, 16.151f)
                lineTo(15.085f, 19.302f)
                curveTo(15.521f, 19.825f, 15.739f, 20.087f, 15.929f, 20.114f)
                curveTo(16.094f, 20.137f, 16.26f, 20.077f, 16.371f, 19.954f)
                curveTo(16.5f, 19.811f, 16.5f, 19.471f, 16.5f, 18.79f)
                verticalLineTo(5.209f)
                curveTo(16.5f, 4.529f, 16.5f, 4.189f, 16.371f, 4.046f)
                curveTo(16.26f, 3.922f, 16.094f, 3.862f, 15.929f, 3.886f)
                curveTo(15.739f, 3.913f, 15.521f, 4.175f, 15.085f, 4.697f)
                lineTo(12.46f, 7.848f)
                curveTo(12.107f, 8.272f, 11.931f, 8.483f, 11.714f, 8.635f)
                curveTo(11.523f, 8.77f, 11.309f, 8.87f, 11.083f, 8.931f)
                curveTo(10.828f, 9f, 10.552f, 9f, 10.001f, 9f)
                close()
            }
        }.build()

        return _VolumeOff!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeOff: ImageVector? = null
