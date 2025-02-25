package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Clone: ImageVector
    get() {
        if (_Clone != null) {
            return _Clone!!
        }
        _Clone = ImageVector.Builder(
            name = "Clone",
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
                moveTo(8f, 8f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 8f, 5.52f, 8f, 5.092f, 8.218f)
                curveTo(4.716f, 8.41f, 4.41f, 8.716f, 4.218f, 9.092f)
                curveTo(4f, 9.52f, 4f, 10.08f, 4f, 11.2f)
                verticalLineTo(16.8f)
                curveTo(4f, 17.92f, 4f, 18.48f, 4.218f, 18.908f)
                curveTo(4.41f, 19.284f, 4.716f, 19.59f, 5.092f, 19.782f)
                curveTo(5.52f, 20f, 6.08f, 20f, 7.2f, 20f)
                horizontalLineTo(12.8f)
                curveTo(13.92f, 20f, 14.48f, 20f, 14.908f, 19.782f)
                curveTo(15.284f, 19.59f, 15.59f, 19.284f, 15.782f, 18.908f)
                curveTo(16f, 18.48f, 16f, 17.92f, 16f, 16.8f)
                verticalLineTo(16f)
                moveTo(11.2f, 16f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 16f, 18.48f, 16f, 18.908f, 15.782f)
                curveTo(19.284f, 15.59f, 19.59f, 15.284f, 19.782f, 14.908f)
                curveTo(20f, 14.48f, 20f, 13.92f, 20f, 12.8f)
                verticalLineTo(7.2f)
                curveTo(20f, 6.08f, 20f, 5.52f, 19.782f, 5.092f)
                curveTo(19.59f, 4.716f, 19.284f, 4.41f, 18.908f, 4.218f)
                curveTo(18.48f, 4f, 17.92f, 4f, 16.8f, 4f)
                horizontalLineTo(11.2f)
                curveTo(10.08f, 4f, 9.52f, 4f, 9.092f, 4.218f)
                curveTo(8.716f, 4.41f, 8.41f, 4.716f, 8.218f, 5.092f)
                curveTo(8f, 5.52f, 8f, 6.08f, 8f, 7.2f)
                verticalLineTo(12.8f)
                curveTo(8f, 13.92f, 8f, 14.48f, 8.218f, 14.908f)
                curveTo(8.41f, 15.284f, 8.716f, 15.59f, 9.092f, 15.782f)
                curveTo(9.52f, 16f, 10.08f, 16f, 11.2f, 16f)
                close()
            }
        }.build()

        return _Clone!!
    }

@Suppress("ObjectPropertyName")
private var _Clone: ImageVector? = null
