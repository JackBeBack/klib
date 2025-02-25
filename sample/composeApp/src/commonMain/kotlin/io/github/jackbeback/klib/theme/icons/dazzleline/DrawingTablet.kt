package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DrawingTablet: ImageVector
    get() {
        if (_DrawingTablet != null) {
            return _DrawingTablet!!
        }
        _DrawingTablet = ImageVector.Builder(
            name = "DrawingTablet",
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
                moveTo(7f, 9f)
                verticalLineTo(15f)
                moveTo(21f, 14f)
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
                horizontalLineTo(12f)
                moveTo(12f, 13f)
                horizontalLineTo(12.798f)
                curveTo(13.243f, 13f, 13.465f, 13f, 13.677f, 13.046f)
                curveTo(13.864f, 13.087f, 14.045f, 13.155f, 14.213f, 13.248f)
                curveTo(14.403f, 13.352f, 14.57f, 13.499f, 14.905f, 13.792f)
                lineTo(20.865f, 19.007f)
                curveTo(21.479f, 19.544f, 21.511f, 20.489f, 20.934f, 21.066f)
                curveTo(20.408f, 21.592f, 19.566f, 21.62f, 19.007f, 21.131f)
                lineTo(13.093f, 15.956f)
                curveTo(12.691f, 15.604f, 12.49f, 15.428f, 12.345f, 15.216f)
                curveTo(12.217f, 15.027f, 12.123f, 14.818f, 12.065f, 14.598f)
                curveTo(12f, 14.349f, 12f, 14.082f, 12f, 13.548f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _DrawingTablet!!
    }

@Suppress("ObjectPropertyName")
private var _DrawingTablet: ImageVector? = null
