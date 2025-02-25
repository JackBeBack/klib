package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Mp3Player: ImageVector
    get() {
        if (_Mp3Player != null) {
            return _Mp3Player!!
        }
        _Mp3Player = ImageVector.Builder(
            name = "Mp3Player",
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
                moveTo(5f, 9f)
                horizontalLineTo(19f)
                moveTo(8.2f, 21f)
                horizontalLineTo(15.8f)
                curveTo(16.92f, 21f, 17.48f, 21f, 17.908f, 20.782f)
                curveTo(18.284f, 20.59f, 18.59f, 20.284f, 18.782f, 19.908f)
                curveTo(19f, 19.48f, 19f, 18.92f, 19f, 17.8f)
                verticalLineTo(6.2f)
                curveTo(19f, 5.08f, 19f, 4.52f, 18.782f, 4.092f)
                curveTo(18.59f, 3.716f, 18.284f, 3.41f, 17.908f, 3.218f)
                curveTo(17.48f, 3f, 16.92f, 3f, 15.8f, 3f)
                horizontalLineTo(8.2f)
                curveTo(7.08f, 3f, 6.52f, 3f, 6.092f, 3.218f)
                curveTo(5.716f, 3.41f, 5.41f, 3.716f, 5.218f, 4.092f)
                curveTo(5f, 4.52f, 5f, 5.08f, 5f, 6.2f)
                verticalLineTo(17.8f)
                curveTo(5f, 18.92f, 5f, 19.48f, 5.218f, 19.908f)
                curveTo(5.41f, 20.284f, 5.716f, 20.59f, 6.092f, 20.782f)
                curveTo(6.52f, 21f, 7.08f, 21f, 8.2f, 21f)
                close()
                moveTo(15f, 15f)
                curveTo(15f, 16.657f, 13.657f, 18f, 12f, 18f)
                curveTo(10.343f, 18f, 9f, 16.657f, 9f, 15f)
                curveTo(9f, 13.343f, 10.343f, 12f, 12f, 12f)
                curveTo(13.657f, 12f, 15f, 13.343f, 15f, 15f)
                close()
            }
        }.build()

        return _Mp3Player!!
    }

@Suppress("ObjectPropertyName")
private var _Mp3Player: ImageVector? = null
