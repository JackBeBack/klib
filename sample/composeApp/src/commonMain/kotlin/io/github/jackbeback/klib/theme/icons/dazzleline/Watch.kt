package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Watch: ImageVector
    get() {
        if (_Watch != null) {
            return _Watch!!
        }
        _Watch = ImageVector.Builder(
            name = "Watch",
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
                moveTo(6f, 17f)
                curveTo(6f, 17f, 6f, 21f, 9f, 21f)
                horizontalLineTo(15f)
                curveTo(12f, 21f, 12f, 17f, 12f, 17f)
                moveTo(6f, 7f)
                curveTo(6f, 7f, 6f, 3f, 9f, 3f)
                horizontalLineTo(15f)
                curveTo(12f, 3f, 12f, 7f, 12f, 7f)
                moveTo(15f, 3.003f)
                curveTo(15f, 3.003f, 20f, 2.554f, 20f, 12f)
                curveTo(20f, 21.446f, 15f, 20.997f, 15f, 20.997f)
                moveTo(9f, 10f)
                verticalLineTo(12f)
                lineTo(10.5f, 13.5f)
                moveTo(7.2f, 17f)
                horizontalLineTo(10.8f)
                curveTo(11.92f, 17f, 12.48f, 17f, 12.908f, 16.782f)
                curveTo(13.284f, 16.59f, 13.59f, 16.284f, 13.782f, 15.908f)
                curveTo(14f, 15.48f, 14f, 14.92f, 14f, 13.8f)
                verticalLineTo(10.2f)
                curveTo(14f, 9.08f, 14f, 8.52f, 13.782f, 8.092f)
                curveTo(13.59f, 7.716f, 13.284f, 7.41f, 12.908f, 7.218f)
                curveTo(12.48f, 7f, 11.92f, 7f, 10.8f, 7f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 7f, 5.52f, 7f, 5.092f, 7.218f)
                curveTo(4.716f, 7.41f, 4.41f, 7.716f, 4.218f, 8.092f)
                curveTo(4f, 8.52f, 4f, 9.08f, 4f, 10.2f)
                verticalLineTo(13.8f)
                curveTo(4f, 14.92f, 4f, 15.48f, 4.218f, 15.908f)
                curveTo(4.41f, 16.284f, 4.716f, 16.59f, 5.092f, 16.782f)
                curveTo(5.52f, 17f, 6.08f, 17f, 7.2f, 17f)
                close()
            }
        }.build()

        return _Watch!!
    }

@Suppress("ObjectPropertyName")
private var _Watch: ImageVector? = null
