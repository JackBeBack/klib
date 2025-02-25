package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FolderImage: ImageVector
    get() {
        if (_FolderImage != null) {
            return _FolderImage!!
        }
        _FolderImage = ImageVector.Builder(
            name = "FolderImage",
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
                moveTo(13.614f, 15.347f)
                lineTo(17.865f, 10.977f)
                lineTo(21f, 13.984f)
                moveTo(6.965f, 19f)
                lineTo(11.969f, 13.977f)
                lineTo(17.973f, 19f)
                moveTo(9.969f, 9.977f)
                curveTo(9.969f, 11.081f, 9.073f, 11.977f, 7.969f, 11.977f)
                curveTo(6.864f, 11.977f, 5.969f, 11.081f, 5.969f, 9.977f)
                curveTo(5.969f, 8.872f, 6.864f, 7.977f, 7.969f, 7.977f)
                curveTo(9.073f, 7.977f, 9.969f, 8.872f, 9.969f, 9.977f)
                close()
                moveTo(12.063f, 6.063f)
                lineTo(11.937f, 5.937f)
                curveTo(11.591f, 5.591f, 11.418f, 5.418f, 11.217f, 5.295f)
                curveTo(11.038f, 5.185f, 10.842f, 5.104f, 10.639f, 5.055f)
                curveTo(10.408f, 5f, 10.164f, 5f, 9.675f, 5f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 5f, 4.52f, 5f, 4.092f, 5.218f)
                curveTo(3.716f, 5.41f, 3.41f, 5.716f, 3.218f, 6.092f)
                curveTo(3f, 6.52f, 3f, 7.08f, 3f, 8.2f)
                verticalLineTo(15.8f)
                curveTo(3f, 16.92f, 3f, 17.48f, 3.218f, 17.908f)
                curveTo(3.41f, 18.284f, 3.716f, 18.59f, 4.092f, 18.782f)
                curveTo(4.52f, 19f, 5.08f, 19f, 6.2f, 19f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 19f, 19.48f, 19f, 19.908f, 18.782f)
                curveTo(20.284f, 18.59f, 20.59f, 18.284f, 20.782f, 17.908f)
                curveTo(21f, 17.48f, 21f, 16.92f, 21f, 15.8f)
                verticalLineTo(10.2f)
                curveTo(21f, 9.08f, 21f, 8.52f, 20.782f, 8.092f)
                curveTo(20.59f, 7.716f, 20.284f, 7.41f, 19.908f, 7.218f)
                curveTo(19.48f, 7f, 18.92f, 7f, 17.8f, 7f)
                horizontalLineTo(14.325f)
                curveTo(13.836f, 7f, 13.592f, 7f, 13.361f, 6.945f)
                curveTo(13.158f, 6.896f, 12.962f, 6.815f, 12.783f, 6.705f)
                curveTo(12.582f, 6.582f, 12.409f, 6.409f, 12.063f, 6.063f)
                close()
            }
        }.build()

        return _FolderImage!!
    }

@Suppress("ObjectPropertyName")
private var _FolderImage: ImageVector? = null
