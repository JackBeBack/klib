package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Boombox: ImageVector
    get() {
        if (_Boombox != null) {
            return _Boombox!!
        }
        _Boombox = ImageVector.Builder(
            name = "Boombox",
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
                moveTo(19f, 10f)
                verticalLineTo(7.2f)
                curveTo(19f, 6.08f, 19f, 5.52f, 18.782f, 5.092f)
                curveTo(18.59f, 4.716f, 18.284f, 4.41f, 17.908f, 4.218f)
                curveTo(17.48f, 4f, 16.92f, 4f, 15.8f, 4f)
                horizontalLineTo(8.2f)
                curveTo(7.08f, 4f, 6.52f, 4f, 6.092f, 4.218f)
                curveTo(5.716f, 4.41f, 5.41f, 4.716f, 5.218f, 5.092f)
                curveTo(5f, 5.52f, 5f, 6.08f, 5f, 7.2f)
                verticalLineTo(10f)
                moveTo(9f, 10f)
                verticalLineTo(8f)
                moveTo(12f, 10f)
                verticalLineTo(8f)
                moveTo(15f, 10f)
                verticalLineTo(8f)
                moveTo(6.2f, 20f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 20f, 19.48f, 20f, 19.908f, 19.782f)
                curveTo(20.284f, 19.59f, 20.59f, 19.284f, 20.782f, 18.908f)
                curveTo(21f, 18.48f, 21f, 17.92f, 21f, 16.8f)
                verticalLineTo(13.2f)
                curveTo(21f, 12.08f, 21f, 11.52f, 20.782f, 11.092f)
                curveTo(20.59f, 10.716f, 20.284f, 10.41f, 19.908f, 10.218f)
                curveTo(19.48f, 10f, 18.92f, 10f, 17.8f, 10f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 10f, 4.52f, 10f, 4.092f, 10.218f)
                curveTo(3.716f, 10.41f, 3.41f, 10.716f, 3.218f, 11.092f)
                curveTo(3f, 11.52f, 3f, 12.08f, 3f, 13.2f)
                verticalLineTo(16.8f)
                curveTo(3f, 17.92f, 3f, 18.48f, 3.218f, 18.908f)
                curveTo(3.41f, 19.284f, 3.716f, 19.59f, 4.092f, 19.782f)
                curveTo(4.52f, 20f, 5.08f, 20f, 6.2f, 20f)
                close()
                moveTo(10f, 15f)
                curveTo(10f, 16.105f, 9.105f, 17f, 8f, 17f)
                curveTo(6.895f, 17f, 6f, 16.105f, 6f, 15f)
                curveTo(6f, 13.895f, 6.895f, 13f, 8f, 13f)
                curveTo(9.105f, 13f, 10f, 13.895f, 10f, 15f)
                close()
                moveTo(18f, 15f)
                curveTo(18f, 16.105f, 17.105f, 17f, 16f, 17f)
                curveTo(14.895f, 17f, 14f, 16.105f, 14f, 15f)
                curveTo(14f, 13.895f, 14.895f, 13f, 16f, 13f)
                curveTo(17.105f, 13f, 18f, 13.895f, 18f, 15f)
                close()
            }
        }.build()

        return _Boombox!!
    }

@Suppress("ObjectPropertyName")
private var _Boombox: ImageVector? = null
