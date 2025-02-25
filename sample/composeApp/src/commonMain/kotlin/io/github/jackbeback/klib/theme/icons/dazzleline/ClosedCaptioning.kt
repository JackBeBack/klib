package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ClosedCaptioning: ImageVector
    get() {
        if (_ClosedCaptioning != null) {
            return _ClosedCaptioning!!
        }
        _ClosedCaptioning = ImageVector.Builder(
            name = "ClosedCaptioning",
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
                moveTo(10.5f, 10.175f)
                curveTo(10.076f, 9.755f, 9.518f, 9.5f, 8.908f, 9.5f)
                curveTo(7.578f, 9.5f, 6.5f, 10.709f, 6.5f, 12.2f)
                curveTo(6.5f, 13.691f, 7.578f, 14.9f, 8.908f, 14.9f)
                curveTo(9.518f, 14.9f, 10.076f, 14.645f, 10.5f, 14.225f)
                moveTo(17.5f, 10.175f)
                curveTo(17.076f, 9.755f, 16.518f, 9.5f, 15.908f, 9.5f)
                curveTo(14.578f, 9.5f, 13.5f, 10.709f, 13.5f, 12.2f)
                curveTo(13.5f, 13.691f, 14.578f, 14.9f, 15.908f, 14.9f)
                curveTo(16.518f, 14.9f, 17.076f, 14.645f, 17.5f, 14.225f)
                moveTo(6.2f, 19f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 19f, 19.48f, 19f, 19.908f, 18.782f)
                curveTo(20.284f, 18.59f, 20.59f, 18.284f, 20.782f, 17.908f)
                curveTo(21f, 17.48f, 21f, 16.92f, 21f, 15.8f)
                verticalLineTo(8.2f)
                curveTo(21f, 7.08f, 21f, 6.52f, 20.782f, 6.092f)
                curveTo(20.59f, 5.716f, 20.284f, 5.41f, 19.908f, 5.218f)
                curveTo(19.48f, 5f, 18.92f, 5f, 17.8f, 5f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 5f, 4.52f, 5f, 4.092f, 5.218f)
                curveTo(3.716f, 5.41f, 3.41f, 5.716f, 3.218f, 6.092f)
                curveTo(3f, 6.52f, 3f, 7.08f, 3f, 8.2f)
                verticalLineTo(15.8f)
                curveTo(3f, 16.92f, 3f, 17.48f, 3.218f, 17.908f)
                curveTo(3.41f, 18.284f, 3.716f, 18.59f, 4.092f, 18.782f)
                curveTo(4.52f, 19f, 5.08f, 19f, 6.2f, 19f)
                close()
            }
        }.build()

        return _ClosedCaptioning!!
    }

@Suppress("ObjectPropertyName")
private var _ClosedCaptioning: ImageVector? = null
