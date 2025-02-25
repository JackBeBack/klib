package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FileHeartAlt1: ImageVector
    get() {
        if (_FileHeartAlt1 != null) {
            return _FileHeartAlt1!!
        }
        _FileHeartAlt1 = ImageVector.Builder(
            name = "FileHeartAlt1",
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
                moveTo(13f, 3f)
                horizontalLineTo(8.2f)
                curveTo(7.08f, 3f, 6.52f, 3f, 6.092f, 3.218f)
                curveTo(5.716f, 3.41f, 5.41f, 3.716f, 5.218f, 4.092f)
                curveTo(5f, 4.52f, 5f, 5.08f, 5f, 6.2f)
                verticalLineTo(17.8f)
                curveTo(5f, 18.92f, 5f, 19.48f, 5.218f, 19.908f)
                curveTo(5.41f, 20.284f, 5.716f, 20.59f, 6.092f, 20.782f)
                curveTo(6.52f, 21f, 7.08f, 21f, 8.2f, 21f)
                horizontalLineTo(11f)
                moveTo(13f, 3f)
                lineTo(19f, 9f)
                moveTo(13f, 3f)
                verticalLineTo(7.4f)
                curveTo(13f, 7.96f, 13f, 8.24f, 13.109f, 8.454f)
                curveTo(13.205f, 8.642f, 13.358f, 8.795f, 13.546f, 8.891f)
                curveTo(13.76f, 9f, 14.04f, 9f, 14.6f, 9f)
                horizontalLineTo(19f)
                moveTo(19f, 9f)
                verticalLineTo(11f)
                moveTo(17.498f, 15.712f)
                curveTo(16.798f, 14.933f, 15.631f, 14.723f, 14.754f, 15.437f)
                curveTo(13.877f, 16.15f, 13.754f, 17.343f, 14.443f, 18.187f)
                curveTo(14.831f, 18.663f, 15.755f, 19.498f, 16.485f, 20.135f)
                curveTo(16.832f, 20.437f, 17.005f, 20.588f, 17.215f, 20.65f)
                curveTo(17.393f, 20.703f, 17.602f, 20.703f, 17.781f, 20.65f)
                curveTo(17.99f, 20.588f, 18.163f, 20.437f, 18.51f, 20.135f)
                curveTo(19.24f, 19.498f, 20.164f, 18.663f, 20.553f, 18.187f)
                curveTo(21.241f, 17.343f, 21.133f, 16.143f, 20.241f, 15.437f)
                curveTo(19.349f, 14.731f, 18.197f, 14.933f, 17.498f, 15.712f)
                close()
            }
        }.build()

        return _FileHeartAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _FileHeartAlt1: ImageVector? = null
