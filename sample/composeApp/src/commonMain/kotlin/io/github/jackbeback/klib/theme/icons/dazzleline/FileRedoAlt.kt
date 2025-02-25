package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FileRedoAlt: ImageVector
    get() {
        if (_FileRedoAlt != null) {
            return _FileRedoAlt!!
        }
        _FileRedoAlt = ImageVector.Builder(
            name = "FileRedoAlt",
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
                moveTo(9f, 17f)
                horizontalLineTo(10f)
                moveTo(9f, 13f)
                horizontalLineTo(12f)
                moveTo(9f, 9f)
                horizontalLineTo(10f)
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
                moveTo(21f, 14.5f)
                verticalLineTo(17.5f)
                horizontalLineTo(18f)
                moveTo(19.5f, 20.236f)
                curveTo(18.969f, 20.711f, 18.268f, 21f, 17.5f, 21f)
                curveTo(15.843f, 21f, 14.5f, 19.657f, 14.5f, 18f)
                curveTo(14.5f, 16.343f, 15.843f, 15f, 17.5f, 15f)
                curveTo(18.806f, 15f, 19.917f, 15.835f, 20.329f, 17f)
            }
        }.build()

        return _FileRedoAlt!!
    }

@Suppress("ObjectPropertyName")
private var _FileRedoAlt: ImageVector? = null
