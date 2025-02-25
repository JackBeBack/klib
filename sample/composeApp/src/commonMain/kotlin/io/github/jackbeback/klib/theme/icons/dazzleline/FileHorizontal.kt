package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FileHorizontal: ImageVector
    get() {
        if (_FileHorizontal != null) {
            return _FileHorizontal!!
        }
        _FileHorizontal = ImageVector.Builder(
            name = "FileHorizontal",
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
                moveTo(21f, 11f)
                verticalLineTo(15.8f)
                curveTo(21f, 16.92f, 21f, 17.48f, 20.782f, 17.908f)
                curveTo(20.59f, 18.284f, 20.284f, 18.59f, 19.908f, 18.782f)
                curveTo(19.48f, 19f, 18.92f, 19f, 17.8f, 19f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 19f, 4.52f, 19f, 4.092f, 18.782f)
                curveTo(3.716f, 18.59f, 3.41f, 18.284f, 3.218f, 17.908f)
                curveTo(3f, 17.48f, 3f, 16.92f, 3f, 15.8f)
                verticalLineTo(8.2f)
                curveTo(3f, 7.08f, 3f, 6.52f, 3.218f, 6.092f)
                curveTo(3.41f, 5.716f, 3.716f, 5.41f, 4.092f, 5.218f)
                curveTo(4.52f, 5f, 5.08f, 5f, 6.2f, 5f)
                horizontalLineTo(15f)
                moveTo(21f, 11f)
                lineTo(15f, 5f)
                moveTo(21f, 11f)
                horizontalLineTo(16.6f)
                curveTo(16.04f, 11f, 15.76f, 11f, 15.546f, 10.891f)
                curveTo(15.358f, 10.795f, 15.205f, 10.642f, 15.109f, 10.454f)
                curveTo(15f, 10.24f, 15f, 9.96f, 15f, 9.4f)
                verticalLineTo(5f)
            }
        }.build()

        return _FileHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _FileHorizontal: ImageVector? = null
