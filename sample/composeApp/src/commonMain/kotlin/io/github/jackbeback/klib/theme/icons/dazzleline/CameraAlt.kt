package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CameraAlt: ImageVector
    get() {
        if (_CameraAlt != null) {
            return _CameraAlt!!
        }
        _CameraAlt = ImageVector.Builder(
            name = "CameraAlt",
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
                moveTo(3f, 4f)
                horizontalLineTo(8f)
                moveTo(3f, 11f)
                horizontalLineTo(9.764f)
                moveTo(14.236f, 11f)
                horizontalLineTo(21f)
                moveTo(21f, 7.2f)
                verticalLineTo(16.8f)
                curveTo(21f, 17.92f, 21f, 18.48f, 20.782f, 18.908f)
                curveTo(20.59f, 19.284f, 20.284f, 19.59f, 19.908f, 19.782f)
                curveTo(19.48f, 20f, 18.92f, 20f, 17.8f, 20f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 20f, 4.52f, 20f, 4.092f, 19.782f)
                curveTo(3.716f, 19.59f, 3.41f, 19.284f, 3.218f, 18.908f)
                curveTo(3f, 18.48f, 3f, 17.92f, 3f, 16.8f)
                verticalLineTo(10.2f)
                curveTo(3f, 9.08f, 3f, 8.52f, 3.218f, 8.092f)
                curveTo(3.41f, 7.716f, 3.716f, 7.41f, 4.092f, 7.218f)
                curveTo(4.52f, 7f, 5.08f, 7f, 6.2f, 7f)
                horizontalLineTo(7.675f)
                curveTo(8.164f, 7f, 8.408f, 7f, 8.638f, 6.945f)
                curveTo(8.843f, 6.896f, 9.038f, 6.815f, 9.217f, 6.705f)
                curveTo(9.418f, 6.582f, 9.591f, 6.409f, 9.937f, 6.063f)
                lineTo(11.063f, 4.937f)
                curveTo(11.409f, 4.591f, 11.582f, 4.418f, 11.783f, 4.295f)
                curveTo(11.962f, 4.185f, 12.158f, 4.104f, 12.361f, 4.055f)
                curveTo(12.592f, 4f, 12.836f, 4f, 13.325f, 4f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 4f, 19.48f, 4f, 19.908f, 4.218f)
                curveTo(20.284f, 4.41f, 20.59f, 4.716f, 20.782f, 5.092f)
                curveTo(21f, 5.52f, 21f, 6.08f, 21f, 7.2f)
                close()
                moveTo(15f, 13f)
                curveTo(15f, 14.657f, 13.657f, 16f, 12f, 16f)
                curveTo(10.343f, 16f, 9f, 14.657f, 9f, 13f)
                curveTo(9f, 11.343f, 10.343f, 10f, 12f, 10f)
                curveTo(13.657f, 10f, 15f, 11.343f, 15f, 13f)
                close()
            }
        }.build()

        return _CameraAlt!!
    }

@Suppress("ObjectPropertyName")
private var _CameraAlt: ImageVector? = null
