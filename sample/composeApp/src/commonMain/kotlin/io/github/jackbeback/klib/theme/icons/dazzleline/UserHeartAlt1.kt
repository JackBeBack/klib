package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.UserHeartAlt1: ImageVector
    get() {
        if (_UserHeartAlt1 != null) {
            return _UserHeartAlt1!!
        }
        _UserHeartAlt1 = ImageVector.Builder(
            name = "UserHeartAlt1",
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
                moveTo(4f, 21f)
                curveTo(4f, 17.473f, 6.608f, 14.556f, 10f, 14.071f)
                moveTo(16.498f, 16.212f)
                curveTo(15.798f, 15.433f, 14.631f, 15.223f, 13.754f, 15.937f)
                curveTo(12.877f, 16.65f, 12.754f, 17.843f, 13.443f, 18.687f)
                curveTo(13.831f, 19.163f, 14.755f, 19.998f, 15.485f, 20.635f)
                curveTo(15.832f, 20.937f, 16.005f, 21.088f, 16.215f, 21.15f)
                curveTo(16.393f, 21.203f, 16.602f, 21.203f, 16.781f, 21.15f)
                curveTo(16.99f, 21.088f, 17.163f, 20.937f, 17.51f, 20.635f)
                curveTo(18.24f, 19.998f, 19.164f, 19.163f, 19.553f, 18.687f)
                curveTo(20.241f, 17.843f, 20.133f, 16.643f, 19.241f, 15.937f)
                curveTo(18.349f, 15.231f, 17.197f, 15.433f, 16.498f, 16.212f)
                close()
                moveTo(15f, 7f)
                curveTo(15f, 9.209f, 13.209f, 11f, 11f, 11f)
                curveTo(8.791f, 11f, 7f, 9.209f, 7f, 7f)
                curveTo(7f, 4.791f, 8.791f, 3f, 11f, 3f)
                curveTo(13.209f, 3f, 15f, 4.791f, 15f, 7f)
                close()
            }
        }.build()

        return _UserHeartAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _UserHeartAlt1: ImageVector? = null
