package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FilesAlt2: ImageVector
    get() {
        if (_FilesAlt2 != null) {
            return _FilesAlt2!!
        }
        _FilesAlt2 = ImageVector.Builder(
            name = "FilesAlt2",
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
                moveTo(17f, 5f)
                horizontalLineTo(10.2f)
                curveTo(9.08f, 5f, 8.52f, 5f, 8.092f, 5.218f)
                curveTo(7.716f, 5.41f, 7.41f, 5.716f, 7.218f, 6.092f)
                curveTo(7f, 6.52f, 7f, 7.08f, 7f, 8.2f)
                verticalLineTo(11.8f)
                curveTo(7f, 12.92f, 7f, 13.48f, 7.218f, 13.908f)
                curveTo(7.41f, 14.284f, 7.716f, 14.59f, 8.092f, 14.782f)
                curveTo(8.52f, 15f, 9.08f, 15f, 10.2f, 15f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 15f, 19.48f, 15f, 19.908f, 14.782f)
                curveTo(20.284f, 14.59f, 20.59f, 14.284f, 20.782f, 13.908f)
                curveTo(21f, 13.48f, 21f, 12.92f, 21f, 11.8f)
                verticalLineTo(9f)
                moveTo(17f, 5f)
                lineTo(21f, 9f)
                moveTo(17f, 5f)
                verticalLineTo(7.4f)
                curveTo(17f, 7.96f, 17f, 8.24f, 17.109f, 8.454f)
                curveTo(17.205f, 8.642f, 17.358f, 8.795f, 17.546f, 8.891f)
                curveTo(17.76f, 9f, 18.04f, 9f, 18.6f, 9f)
                horizontalLineTo(21f)
                moveTo(17f, 19f)
                horizontalLineTo(9.4f)
                curveTo(7.16f, 19f, 6.04f, 19f, 5.184f, 18.564f)
                curveTo(4.431f, 18.181f, 3.819f, 17.569f, 3.436f, 16.816f)
                curveTo(3f, 15.96f, 3f, 14.84f, 3f, 12.6f)
                verticalLineTo(9f)
            }
        }.build()

        return _FilesAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _FilesAlt2: ImageVector? = null
