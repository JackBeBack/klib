package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FileShield: ImageVector
    get() {
        if (_FileShield != null) {
            return _FileShield!!
        }
        _FileShield = ImageVector.Builder(
            name = "FileShield",
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
                horizontalLineTo(15.8f)
                curveTo(16.92f, 21f, 17.48f, 21f, 17.908f, 20.782f)
                curveTo(18.284f, 20.59f, 18.59f, 20.284f, 18.782f, 19.908f)
                curveTo(19f, 19.48f, 19f, 18.92f, 19f, 17.8f)
                verticalLineTo(9f)
                moveTo(13f, 3f)
                lineTo(19f, 9f)
                moveTo(13f, 3f)
                verticalLineTo(7.4f)
                curveTo(13f, 7.96f, 13f, 8.24f, 13.109f, 8.454f)
                curveTo(13.205f, 8.642f, 13.358f, 8.795f, 13.546f, 8.891f)
                curveTo(13.76f, 9f, 14.04f, 9f, 14.6f, 9f)
                horizontalLineTo(19f)
                moveTo(15f, 12.21f)
                curveTo(14.932f, 12.214f, 14.736f, 12.21f, 14.667f, 12.21f)
                curveTo(13.642f, 12.21f, 12.708f, 11.752f, 12f, 11f)
                curveTo(11.292f, 11.752f, 10.358f, 12.21f, 9.333f, 12.21f)
                curveTo(9.264f, 12.21f, 9.068f, 12.214f, 9f, 12.21f)
                curveTo(9f, 12.21f, 9f, 12.986f, 9f, 13.398f)
                curveTo(9f, 15.612f, 10.275f, 17.472f, 12f, 18f)
                curveTo(13.725f, 17.472f, 15f, 15.612f, 15f, 13.398f)
                curveTo(15f, 12.986f, 15f, 12.21f, 15f, 12.21f)
                close()
            }
        }.build()

        return _FileShield!!
    }

@Suppress("ObjectPropertyName")
private var _FileShield: ImageVector? = null
