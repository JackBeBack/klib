package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PenNibSlash: ImageVector
    get() {
        if (_PenNibSlash != null) {
            return _PenNibSlash!!
        }
        _PenNibSlash = ImageVector.Builder(
            name = "PenNibSlash",
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
                moveTo(13f, 6f)
                lineTo(14.869f, 4.131f)
                curveTo(15.265f, 3.735f, 15.463f, 3.537f, 15.691f, 3.463f)
                curveTo(15.892f, 3.398f, 16.108f, 3.398f, 16.309f, 3.463f)
                curveTo(16.537f, 3.537f, 16.735f, 3.735f, 17.131f, 4.131f)
                lineTo(19.869f, 6.869f)
                curveTo(20.265f, 7.265f, 20.463f, 7.463f, 20.537f, 7.691f)
                curveTo(20.602f, 7.892f, 20.602f, 8.108f, 20.537f, 8.309f)
                curveTo(20.463f, 8.537f, 20.265f, 8.735f, 19.869f, 9.131f)
                lineTo(18f, 11f)
                moveTo(13f, 6f)
                lineTo(11.95f, 6.3f)
                moveTo(13f, 6f)
                lineTo(18f, 11f)
                moveTo(3f, 21f)
                lineTo(5.636f, 9.576f)
                curveTo(5.732f, 9.163f, 5.779f, 8.956f, 5.861f, 8.775f)
                curveTo(6.047f, 8.364f, 6.366f, 8.028f, 6.767f, 7.822f)
                curveTo(6.943f, 7.731f, 7.147f, 7.672f, 7.556f, 7.556f)
                moveTo(3f, 21f)
                lineTo(14.424f, 18.364f)
                curveTo(14.837f, 18.268f, 15.044f, 18.221f, 15.225f, 18.139f)
                curveTo(15.636f, 17.953f, 15.972f, 17.634f, 16.178f, 17.233f)
                curveTo(16.27f, 17.057f, 16.328f, 16.853f, 16.444f, 16.444f)
                moveTo(3f, 21f)
                lineTo(8.439f, 15.561f)
                moveTo(18f, 11f)
                lineTo(17.7f, 12.05f)
                moveTo(3f, 3f)
                lineTo(21f, 21f)
                moveTo(11f, 14.5f)
                curveTo(11f, 15.328f, 10.328f, 16f, 9.5f, 16f)
                curveTo(8.672f, 16f, 8f, 15.328f, 8f, 14.5f)
                curveTo(8f, 13.672f, 8.672f, 13f, 9.5f, 13f)
                curveTo(10.328f, 13f, 11f, 13.672f, 11f, 14.5f)
                close()
            }
        }.build()

        return _PenNibSlash!!
    }

@Suppress("ObjectPropertyName")
private var _PenNibSlash: ImageVector? = null
