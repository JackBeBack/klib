package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Gift: ImageVector
    get() {
        if (_Gift != null) {
            return _Gift!!
        }
        _Gift = ImageVector.Builder(
            name = "Gift",
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
                moveTo(12f, 7f)
                verticalLineTo(20f)
                moveTo(12f, 7f)
                horizontalLineTo(8.464f)
                curveTo(7.943f, 7f, 7.444f, 6.789f, 7.075f, 6.414f)
                curveTo(6.707f, 6.039f, 6.5f, 5.53f, 6.5f, 5f)
                curveTo(6.5f, 4.47f, 6.707f, 3.961f, 7.075f, 3.586f)
                curveTo(7.444f, 3.211f, 7.943f, 3f, 8.464f, 3f)
                curveTo(11.214f, 3f, 12f, 7f, 12f, 7f)
                close()
                moveTo(12f, 7f)
                horizontalLineTo(15.536f)
                curveTo(16.057f, 7f, 16.556f, 6.789f, 16.925f, 6.414f)
                curveTo(17.293f, 6.039f, 17.5f, 5.53f, 17.5f, 5f)
                curveTo(17.5f, 4.47f, 17.293f, 3.961f, 16.925f, 3.586f)
                curveTo(16.556f, 3.211f, 16.057f, 3f, 15.536f, 3f)
                curveTo(12.786f, 3f, 12f, 7f, 12f, 7f)
                close()
                moveTo(5f, 12f)
                horizontalLineTo(19f)
                verticalLineTo(17.8f)
                curveTo(19f, 18.92f, 19f, 19.48f, 18.782f, 19.908f)
                curveTo(18.59f, 20.284f, 18.284f, 20.59f, 17.908f, 20.782f)
                curveTo(17.48f, 21f, 16.92f, 21f, 15.8f, 21f)
                horizontalLineTo(8.2f)
                curveTo(7.08f, 21f, 6.52f, 21f, 6.092f, 20.782f)
                curveTo(5.716f, 20.59f, 5.41f, 20.284f, 5.218f, 19.908f)
                curveTo(5f, 19.48f, 5f, 18.92f, 5f, 17.8f)
                verticalLineTo(12f)
                close()
                moveTo(4.6f, 12f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 12f, 20.24f, 12f, 20.454f, 11.891f)
                curveTo(20.642f, 11.795f, 20.795f, 11.642f, 20.891f, 11.454f)
                curveTo(21f, 11.24f, 21f, 10.96f, 21f, 10.4f)
                verticalLineTo(8.6f)
                curveTo(21f, 8.04f, 21f, 7.76f, 20.891f, 7.546f)
                curveTo(20.795f, 7.358f, 20.642f, 7.205f, 20.454f, 7.109f)
                curveTo(20.24f, 7f, 19.96f, 7f, 19.4f, 7f)
                horizontalLineTo(4.6f)
                curveTo(4.04f, 7f, 3.76f, 7f, 3.546f, 7.109f)
                curveTo(3.358f, 7.205f, 3.205f, 7.358f, 3.109f, 7.546f)
                curveTo(3f, 7.76f, 3f, 8.04f, 3f, 8.6f)
                verticalLineTo(10.4f)
                curveTo(3f, 10.96f, 3f, 11.24f, 3.109f, 11.454f)
                curveTo(3.205f, 11.642f, 3.358f, 11.795f, 3.546f, 11.891f)
                curveTo(3.76f, 12f, 4.04f, 12f, 4.6f, 12f)
                close()
            }
        }.build()

        return _Gift!!
    }

@Suppress("ObjectPropertyName")
private var _Gift: ImageVector? = null
