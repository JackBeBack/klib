package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.VolumeMin: ImageVector
    get() {
        if (_VolumeMin != null) {
            return _VolumeMin!!
        }
        _VolumeMin = ImageVector.Builder(
            name = "VolumeMin",
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
                moveTo(18f, 9f)
                curveTo(18.628f, 9.836f, 19f, 10.875f, 19f, 12f)
                curveTo(19f, 13.126f, 18.628f, 14.164f, 18f, 15f)
                moveTo(6.6f, 9f)
                horizontalLineTo(7.501f)
                curveTo(8.052f, 9f, 8.328f, 9f, 8.583f, 8.931f)
                curveTo(8.809f, 8.871f, 9.023f, 8.77f, 9.214f, 8.636f)
                curveTo(9.43f, 8.484f, 9.607f, 8.272f, 9.96f, 7.849f)
                lineTo(12.585f, 4.698f)
                curveTo(13.021f, 4.175f, 13.239f, 3.913f, 13.429f, 3.886f)
                curveTo(13.594f, 3.863f, 13.76f, 3.923f, 13.871f, 4.046f)
                curveTo(14f, 4.189f, 14f, 4.529f, 14f, 5.21f)
                verticalLineTo(18.79f)
                curveTo(14f, 19.471f, 14f, 19.811f, 13.871f, 19.954f)
                curveTo(13.76f, 20.078f, 13.594f, 20.138f, 13.429f, 20.114f)
                curveTo(13.239f, 20.087f, 13.021f, 19.825f, 12.585f, 19.303f)
                lineTo(9.96f, 16.152f)
                curveTo(9.607f, 15.728f, 9.43f, 15.517f, 9.214f, 15.365f)
                curveTo(9.023f, 15.23f, 8.809f, 15.13f, 8.583f, 15.069f)
                curveTo(8.328f, 15f, 8.052f, 15f, 7.501f, 15f)
                horizontalLineTo(6.6f)
                curveTo(6.04f, 15f, 5.76f, 15f, 5.546f, 14.891f)
                curveTo(5.358f, 14.795f, 5.205f, 14.642f, 5.109f, 14.454f)
                curveTo(5f, 14.24f, 5f, 13.96f, 5f, 13.4f)
                verticalLineTo(10.6f)
                curveTo(5f, 10.04f, 5f, 9.76f, 5.109f, 9.546f)
                curveTo(5.205f, 9.358f, 5.358f, 9.205f, 5.546f, 9.109f)
                curveTo(5.76f, 9f, 6.04f, 9f, 6.6f, 9f)
                close()
            }
        }.build()

        return _VolumeMin!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeMin: ImageVector? = null
