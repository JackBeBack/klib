package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChartNetwork: ImageVector
    get() {
        if (_ChartNetwork != null) {
            return _ChartNetwork!!
        }
        _ChartNetwork = ImageVector.Builder(
            name = "ChartNetwork",
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
                moveTo(9f, 13f)
                curveTo(9f, 15.209f, 10.791f, 17f, 13f, 17f)
                curveTo(14.105f, 17f, 15.105f, 16.552f, 15.828f, 15.828f)
                moveTo(9f, 13f)
                horizontalLineTo(5f)
                moveTo(9f, 13f)
                curveTo(9f, 11.448f, 9.884f, 10.102f, 11.176f, 9.439f)
                moveTo(5f, 13f)
                curveTo(5f, 13.552f, 4.552f, 14f, 4f, 14f)
                curveTo(3.448f, 14f, 3f, 13.552f, 3f, 13f)
                curveTo(3f, 12.448f, 3.448f, 12f, 4f, 12f)
                curveTo(4.552f, 12f, 5f, 12.448f, 5f, 13f)
                close()
                moveTo(19.293f, 6.707f)
                curveTo(19.112f, 6.526f, 19f, 6.276f, 19f, 6f)
                curveTo(19f, 5.448f, 19.448f, 5f, 20f, 5f)
                curveTo(20.552f, 5f, 21f, 5.448f, 21f, 6f)
                curveTo(21f, 6.552f, 20.552f, 7f, 20f, 7f)
                curveTo(19.724f, 7f, 19.474f, 6.888f, 19.293f, 6.707f)
                close()
                moveTo(19.293f, 6.707f)
                lineTo(15.828f, 10.172f)
                moveTo(9.371f, 4.929f)
                curveTo(9.74f, 4.781f, 10f, 4.421f, 10f, 4f)
                curveTo(10f, 3.448f, 9.552f, 3f, 9f, 3f)
                curveTo(8.448f, 3f, 8f, 3.448f, 8f, 4f)
                curveTo(8f, 4.552f, 8.448f, 5f, 9f, 5f)
                curveTo(9.131f, 5f, 9.257f, 4.975f, 9.371f, 4.929f)
                close()
                moveTo(9.371f, 4.929f)
                lineTo(11.176f, 9.439f)
                moveTo(15.828f, 15.828f)
                curveTo(16.552f, 15.105f, 17f, 14.105f, 17f, 13f)
                curveTo(17f, 11.895f, 16.552f, 10.895f, 15.828f, 10.172f)
                moveTo(15.828f, 15.828f)
                lineTo(19.293f, 19.293f)
                moveTo(19.293f, 19.293f)
                curveTo(19.112f, 19.474f, 19f, 19.724f, 19f, 20f)
                curveTo(19f, 20.552f, 19.448f, 21f, 20f, 21f)
                curveTo(20.552f, 21f, 21f, 20.552f, 21f, 20f)
                curveTo(21f, 19.448f, 20.552f, 19f, 20f, 19f)
                curveTo(19.724f, 19f, 19.474f, 19.112f, 19.293f, 19.293f)
                close()
                moveTo(15.828f, 10.172f)
                curveTo(15.105f, 9.448f, 14.105f, 9f, 13f, 9f)
                curveTo(12.343f, 9f, 11.723f, 9.158f, 11.176f, 9.439f)
            }
        }.build()

        return _ChartNetwork!!
    }

@Suppress("ObjectPropertyName")
private var _ChartNetwork: ImageVector? = null
