package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FilesAlt1: ImageVector
    get() {
        if (_FilesAlt1 != null) {
            return _FilesAlt1!!
        }
        _FilesAlt1 = ImageVector.Builder(
            name = "FilesAlt1",
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
                moveTo(17f, 15f)
                verticalLineTo(15.8f)
                curveTo(17f, 16.92f, 17f, 17.48f, 16.782f, 17.908f)
                curveTo(16.59f, 18.284f, 16.284f, 18.59f, 15.908f, 18.782f)
                curveTo(15.48f, 19f, 14.92f, 19f, 13.8f, 19f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 19f, 4.52f, 19f, 4.092f, 18.782f)
                curveTo(3.716f, 18.59f, 3.41f, 18.284f, 3.218f, 17.908f)
                curveTo(3f, 17.48f, 3f, 16.92f, 3f, 15.8f)
                verticalLineTo(12.2f)
                curveTo(3f, 11.08f, 3f, 10.52f, 3.218f, 10.092f)
                curveTo(3.41f, 9.716f, 3.716f, 9.41f, 4.092f, 9.218f)
                curveTo(4.52f, 9f, 5.08f, 9f, 6.2f, 9f)
                horizontalLineTo(7f)
                moveTo(16f, 5f)
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
                verticalLineTo(10f)
                moveTo(16f, 5f)
                lineTo(21f, 10f)
                moveTo(16f, 5f)
                verticalLineTo(8.4f)
                curveTo(16f, 8.96f, 16f, 9.24f, 16.109f, 9.454f)
                curveTo(16.205f, 9.642f, 16.358f, 9.795f, 16.546f, 9.891f)
                curveTo(16.76f, 10f, 17.04f, 10f, 17.6f, 10f)
                horizontalLineTo(21f)
            }
        }.build()

        return _FilesAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _FilesAlt1: ImageVector? = null
