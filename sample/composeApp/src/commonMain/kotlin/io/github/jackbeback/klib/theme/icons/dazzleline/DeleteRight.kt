package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DeleteRight: ImageVector
    get() {
        if (_DeleteRight != null) {
            return _DeleteRight!!
        }
        _DeleteRight = ImageVector.Builder(
            name = "DeleteRight",
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
                moveTo(7f, 9.5f)
                lineTo(12f, 14.5f)
                moveTo(12f, 9.5f)
                lineTo(7f, 14.5f)
                moveTo(19.492f, 13.955f)
                lineTo(16.561f, 17.755f)
                curveTo(16.208f, 18.212f, 16.032f, 18.44f, 15.811f, 18.605f)
                curveTo(15.615f, 18.75f, 15.394f, 18.859f, 15.158f, 18.925f)
                curveTo(14.893f, 19f, 14.604f, 19f, 14.027f, 19f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 19f, 4.52f, 19f, 4.092f, 18.782f)
                curveTo(3.716f, 18.59f, 3.41f, 18.284f, 3.218f, 17.908f)
                curveTo(3f, 17.48f, 3f, 16.92f, 3f, 15.8f)
                verticalLineTo(8.2f)
                curveTo(3f, 7.08f, 3f, 6.52f, 3.218f, 6.092f)
                curveTo(3.41f, 5.716f, 3.716f, 5.41f, 4.092f, 5.218f)
                curveTo(4.52f, 5f, 5.08f, 5f, 6.2f, 5f)
                horizontalLineTo(14.027f)
                curveTo(14.604f, 5f, 14.893f, 5f, 15.158f, 5.075f)
                curveTo(15.394f, 5.141f, 15.615f, 5.249f, 15.811f, 5.395f)
                curveTo(16.032f, 5.56f, 16.208f, 5.788f, 16.561f, 6.245f)
                lineTo(19.492f, 10.045f)
                curveTo(20.032f, 10.745f, 20.302f, 11.095f, 20.405f, 11.48f)
                curveTo(20.497f, 11.821f, 20.497f, 12.179f, 20.405f, 12.52f)
                curveTo(20.302f, 12.905f, 20.032f, 13.255f, 19.492f, 13.955f)
                close()
            }
        }.build()

        return _DeleteRight!!
    }

@Suppress("ObjectPropertyName")
private var _DeleteRight: ImageVector? = null
