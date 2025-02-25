package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FilesAlt: ImageVector
    get() {
        if (_FilesAlt != null) {
            return _FilesAlt!!
        }
        _FilesAlt = ImageVector.Builder(
            name = "FilesAlt",
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
                moveTo(19f, 7f)
                verticalLineTo(13.8f)
                curveTo(19f, 14.92f, 19f, 15.48f, 18.782f, 15.908f)
                curveTo(18.59f, 16.284f, 18.284f, 16.59f, 17.908f, 16.782f)
                curveTo(17.48f, 17f, 16.92f, 17f, 15.8f, 17f)
                horizontalLineTo(12.2f)
                curveTo(11.08f, 17f, 10.52f, 17f, 10.092f, 16.782f)
                curveTo(9.716f, 16.59f, 9.41f, 16.284f, 9.218f, 15.908f)
                curveTo(9f, 15.48f, 9f, 14.92f, 9f, 13.8f)
                verticalLineTo(6.2f)
                curveTo(9f, 5.08f, 9f, 4.52f, 9.218f, 4.092f)
                curveTo(9.41f, 3.716f, 9.716f, 3.41f, 10.092f, 3.218f)
                curveTo(10.52f, 3f, 11.08f, 3f, 12.2f, 3f)
                horizontalLineTo(15f)
                moveTo(19f, 7f)
                lineTo(15f, 3f)
                moveTo(19f, 7f)
                horizontalLineTo(16.6f)
                curveTo(16.04f, 7f, 15.76f, 7f, 15.546f, 6.891f)
                curveTo(15.358f, 6.795f, 15.205f, 6.642f, 15.109f, 6.454f)
                curveTo(15f, 6.24f, 15f, 5.96f, 15f, 5.4f)
                verticalLineTo(3f)
                moveTo(5f, 7f)
                verticalLineTo(14.6f)
                curveTo(5f, 16.84f, 5f, 17.96f, 5.436f, 18.816f)
                curveTo(5.819f, 19.569f, 6.431f, 20.181f, 7.184f, 20.564f)
                curveTo(8.04f, 21f, 9.16f, 21f, 11.4f, 21f)
                horizontalLineTo(15f)
            }
        }.build()

        return _FilesAlt!!
    }

@Suppress("ObjectPropertyName")
private var _FilesAlt: ImageVector? = null
