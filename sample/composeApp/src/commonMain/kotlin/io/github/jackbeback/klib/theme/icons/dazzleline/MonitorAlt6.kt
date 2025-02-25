package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MonitorAlt6: ImageVector
    get() {
        if (_MonitorAlt6 != null) {
            return _MonitorAlt6!!
        }
        _MonitorAlt6 = ImageVector.Builder(
            name = "MonitorAlt6",
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
                moveTo(7f, 21f)
                horizontalLineTo(9f)
                moveTo(9f, 21f)
                horizontalLineTo(15f)
                moveTo(9f, 21f)
                verticalLineTo(17.326f)
                moveTo(15f, 21f)
                horizontalLineTo(17f)
                moveTo(15f, 21f)
                lineTo(15f, 17.326f)
                moveTo(3f, 6.598f)
                verticalLineTo(14.402f)
                curveTo(3f, 15.057f, 3f, 15.576f, 3.021f, 15.992f)
                curveTo(3.05f, 16.573f, 3.12f, 16.955f, 3.287f, 17.232f)
                curveTo(3.556f, 17.677f, 3.905f, 17.952f, 4.401f, 18.107f)
                curveTo(4.932f, 18.274f, 5.754f, 18.074f, 7.4f, 17.674f)
                curveTo(8.922f, 17.303f, 10.598f, 17f, 12f, 17f)
                curveTo(13.402f, 17f, 15.078f, 17.303f, 16.601f, 17.674f)
                curveTo(18.246f, 18.074f, 19.068f, 18.274f, 19.599f, 18.107f)
                curveTo(20.095f, 17.952f, 20.444f, 17.677f, 20.712f, 17.232f)
                curveTo(20.88f, 16.955f, 20.95f, 16.573f, 20.979f, 15.992f)
                curveTo(21f, 15.576f, 21f, 15.057f, 21f, 14.402f)
                verticalLineTo(6.598f)
                curveTo(21f, 5.029f, 21f, 4.244f, 20.712f, 3.767f)
                curveTo(20.444f, 3.322f, 20.095f, 3.048f, 19.599f, 2.892f)
                curveTo(19.068f, 2.726f, 18.246f, 2.926f, 16.601f, 3.326f)
                curveTo(15.078f, 3.696f, 13.402f, 4f, 12f, 4f)
                curveTo(10.598f, 4f, 8.922f, 3.696f, 7.4f, 3.326f)
                curveTo(5.754f, 2.926f, 4.932f, 2.726f, 4.401f, 2.892f)
                curveTo(3.905f, 3.048f, 3.556f, 3.322f, 3.287f, 3.767f)
                curveTo(3f, 4.244f, 3f, 5.029f, 3f, 6.598f)
                close()
            }
        }.build()

        return _MonitorAlt6!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorAlt6: ImageVector? = null
