package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FileSlash: ImageVector
    get() {
        if (_FileSlash != null) {
            return _FileSlash!!
        }
        _FileSlash = ImageVector.Builder(
            name = "FileSlash",
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
                moveTo(3f, 3f)
                lineTo(21f, 21f)
                moveTo(5f, 5f)
                verticalLineTo(17.8f)
                curveTo(5f, 18.92f, 5f, 19.48f, 5.218f, 19.908f)
                curveTo(5.41f, 20.284f, 5.716f, 20.59f, 6.092f, 20.782f)
                curveTo(6.52f, 21f, 7.08f, 21f, 8.2f, 21f)
                horizontalLineTo(17f)
                curveTo(18.105f, 21f, 19f, 20.105f, 19f, 19f)
                moveTo(19f, 9f)
                lineTo(13f, 3f)
                moveTo(19f, 9f)
                horizontalLineTo(14.6f)
                curveTo(14.04f, 9f, 13.76f, 9f, 13.546f, 8.891f)
                curveTo(13.358f, 8.795f, 13.205f, 8.642f, 13.109f, 8.454f)
                curveTo(13f, 8.24f, 13f, 7.96f, 13f, 7.4f)
                verticalLineTo(3f)
                moveTo(19f, 9f)
                verticalLineTo(14f)
                moveTo(13f, 3f)
                horizontalLineTo(8.5f)
            }
        }.build()

        return _FileSlash!!
    }

@Suppress("ObjectPropertyName")
private var _FileSlash: ImageVector? = null
