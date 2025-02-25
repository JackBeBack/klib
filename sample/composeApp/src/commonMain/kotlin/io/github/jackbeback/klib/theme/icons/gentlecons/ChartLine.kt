package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ChartLine: ImageVector
    get() {
        if (_ChartLine != null) {
            return _ChartLine!!
        }
        _ChartLine = ImageVector.Builder(
            name = "ChartLine",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(1f, 2f)
                curveTo(1f, 1.448f, 1.448f, 1f, 2f, 1f)
                curveTo(2.552f, 1f, 3f, 1.448f, 3f, 2f)
                verticalLineTo(20f)
                curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
                lineTo(22f, 21f)
                curveTo(22.552f, 21f, 23f, 21.448f, 23f, 22f)
                curveTo(23f, 22.552f, 22.552f, 23f, 22f, 23f)
                horizontalLineTo(3f)
                curveTo(1.895f, 23f, 1f, 22.105f, 1f, 21f)
                verticalLineTo(2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(19.928f, 5.371f)
                curveTo(20.134f, 4.859f, 19.884f, 4.277f, 19.371f, 4.072f)
                curveTo(18.859f, 3.866f, 18.277f, 4.116f, 18.072f, 4.629f)
                lineTo(14.822f, 12.751f)
                curveTo(14.698f, 13.063f, 14.308f, 13.166f, 14.046f, 12.956f)
                lineTo(11.081f, 10.584f)
                curveTo(10.362f, 10.009f, 9.299f, 10.212f, 8.842f, 11.011f)
                lineTo(5.132f, 17.504f)
                curveTo(4.858f, 17.983f, 5.024f, 18.594f, 5.504f, 18.868f)
                curveTo(5.983f, 19.142f, 6.594f, 18.976f, 6.868f, 18.496f)
                lineTo(9.998f, 13.019f)
                curveTo(10.151f, 12.752f, 10.505f, 12.685f, 10.745f, 12.876f)
                lineTo(13.849f, 15.36f)
                curveTo(14.635f, 15.989f, 15.805f, 15.68f, 16.179f, 14.746f)
                lineTo(19.928f, 5.371f)
                close()
            }
        }.build()

        return _ChartLine!!
    }

@Suppress("ObjectPropertyName")
private var _ChartLine: ImageVector? = null
