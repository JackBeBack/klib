package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CameraAlt1: ImageVector
    get() {
        if (_CameraAlt1 != null) {
            return _CameraAlt1!!
        }
        _CameraAlt1 = ImageVector.Builder(
            name = "CameraAlt1",
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
                moveTo(7f, 6f)
                verticalLineTo(20f)
                moveTo(19f, 6f)
                curveTo(19f, 5.068f, 19f, 4.602f, 18.848f, 4.235f)
                curveTo(18.645f, 3.745f, 18.255f, 3.355f, 17.765f, 3.152f)
                curveTo(17.398f, 3f, 16.932f, 3f, 16f, 3f)
                curveTo(15.068f, 3f, 14.602f, 3f, 14.235f, 3.152f)
                curveTo(13.745f, 3.355f, 13.355f, 3.745f, 13.152f, 4.235f)
                curveTo(13f, 4.602f, 13f, 5.068f, 13f, 6f)
                moveTo(17f, 13f)
                curveTo(17f, 14.657f, 15.657f, 16f, 14f, 16f)
                curveTo(12.343f, 16f, 11f, 14.657f, 11f, 13f)
                curveTo(11f, 11.343f, 12.343f, 10f, 14f, 10f)
                curveTo(15.657f, 10f, 17f, 11.343f, 17f, 13f)
                close()
                moveTo(6.2f, 20f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 20f, 19.48f, 20f, 19.908f, 19.782f)
                curveTo(20.284f, 19.59f, 20.59f, 19.284f, 20.782f, 18.908f)
                curveTo(21f, 18.48f, 21f, 17.92f, 21f, 16.8f)
                verticalLineTo(9.2f)
                curveTo(21f, 8.08f, 21f, 7.52f, 20.782f, 7.092f)
                curveTo(20.59f, 6.716f, 20.284f, 6.41f, 19.908f, 6.218f)
                curveTo(19.48f, 6f, 18.92f, 6f, 17.8f, 6f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 6f, 4.52f, 6f, 4.092f, 6.218f)
                curveTo(3.716f, 6.41f, 3.41f, 6.716f, 3.218f, 7.092f)
                curveTo(3f, 7.52f, 3f, 8.08f, 3f, 9.2f)
                verticalLineTo(16.8f)
                curveTo(3f, 17.92f, 3f, 18.48f, 3.218f, 18.908f)
                curveTo(3.41f, 19.284f, 3.716f, 19.59f, 4.092f, 19.782f)
                curveTo(4.52f, 20f, 5.08f, 20f, 6.2f, 20f)
                close()
            }
        }.build()

        return _CameraAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _CameraAlt1: ImageVector? = null
