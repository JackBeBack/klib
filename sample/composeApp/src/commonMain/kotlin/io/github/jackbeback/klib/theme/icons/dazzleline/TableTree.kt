package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TableTree: ImageVector
    get() {
        if (_TableTree != null) {
            return _TableTree!!
        }
        _TableTree = ImageVector.Builder(
            name = "TableTree",
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
                moveTo(10f, 17f)
                horizontalLineTo(9.2f)
                curveTo(8.08f, 17f, 7.52f, 17f, 7.092f, 16.782f)
                curveTo(6.716f, 16.59f, 6.41f, 16.284f, 6.218f, 15.908f)
                curveTo(6f, 15.48f, 6f, 14.92f, 6f, 13.8f)
                verticalLineTo(11f)
                curveTo(6f, 11.932f, 6f, 12.398f, 6.152f, 12.765f)
                curveTo(6.355f, 13.255f, 6.745f, 13.645f, 7.235f, 13.848f)
                curveTo(7.602f, 14f, 8.068f, 14f, 9f, 14f)
                moveTo(3f, 8f)
                horizontalLineTo(21f)
                moveTo(12f, 11f)
                horizontalLineTo(18f)
                moveTo(13f, 14f)
                horizontalLineTo(18f)
                moveTo(6.2f, 20f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 20f, 19.48f, 20f, 19.908f, 19.782f)
                curveTo(20.284f, 19.59f, 20.59f, 19.284f, 20.782f, 18.908f)
                curveTo(21f, 18.48f, 21f, 17.92f, 21f, 16.8f)
                verticalLineTo(7.2f)
                curveTo(21f, 6.08f, 21f, 5.52f, 20.782f, 5.092f)
                curveTo(20.59f, 4.716f, 20.284f, 4.41f, 19.908f, 4.218f)
                curveTo(19.48f, 4f, 18.92f, 4f, 17.8f, 4f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 4f, 4.52f, 4f, 4.092f, 4.218f)
                curveTo(3.716f, 4.41f, 3.41f, 4.716f, 3.218f, 5.092f)
                curveTo(3f, 5.52f, 3f, 6.08f, 3f, 7.2f)
                verticalLineTo(16.8f)
                curveTo(3f, 17.92f, 3f, 18.48f, 3.218f, 18.908f)
                curveTo(3.41f, 19.284f, 3.716f, 19.59f, 4.092f, 19.782f)
                curveTo(4.52f, 20f, 5.08f, 20f, 6.2f, 20f)
                close()
            }
        }.build()

        return _TableTree!!
    }

@Suppress("ObjectPropertyName")
private var _TableTree: ImageVector? = null
