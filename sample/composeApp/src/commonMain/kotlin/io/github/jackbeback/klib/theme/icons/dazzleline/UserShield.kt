package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.UserShield: ImageVector
    get() {
        if (_UserShield != null) {
            return _UserShield!!
        }
        _UserShield = ImageVector.Builder(
            name = "UserShield",
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
                moveTo(11f, 21f)
                horizontalLineTo(4f)
                curveTo(4f, 17.473f, 6.608f, 14.556f, 10f, 14.071f)
                moveTo(19.873f, 15.204f)
                curveTo(19.804f, 15.208f, 19.736f, 15.21f, 19.667f, 15.21f)
                curveTo(18.642f, 15.21f, 17.708f, 14.752f, 17f, 14f)
                curveTo(16.292f, 14.752f, 15.358f, 15.21f, 14.333f, 15.21f)
                curveTo(14.264f, 15.21f, 14.196f, 15.208f, 14.127f, 15.204f)
                curveTo(14.044f, 15.585f, 14f, 15.986f, 14f, 16.398f)
                curveTo(14f, 18.612f, 15.275f, 20.472f, 17f, 21f)
                curveTo(18.725f, 20.472f, 20f, 18.612f, 20f, 16.398f)
                curveTo(20f, 15.986f, 19.956f, 15.585f, 19.873f, 15.204f)
                close()
                moveTo(15f, 7f)
                curveTo(15f, 9.209f, 13.209f, 11f, 11f, 11f)
                curveTo(8.791f, 11f, 7f, 9.209f, 7f, 7f)
                curveTo(7f, 4.791f, 8.791f, 3f, 11f, 3f)
                curveTo(13.209f, 3f, 15f, 4.791f, 15f, 7f)
                close()
            }
        }.build()

        return _UserShield!!
    }

@Suppress("ObjectPropertyName")
private var _UserShield: ImageVector? = null
