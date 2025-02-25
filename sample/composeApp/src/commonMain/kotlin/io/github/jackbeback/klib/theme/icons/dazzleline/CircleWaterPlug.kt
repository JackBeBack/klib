package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CircleWaterPlug: ImageVector
    get() {
        if (_CircleWaterPlug != null) {
            return _CircleWaterPlug!!
        }
        _CircleWaterPlug = ImageVector.Builder(
            name = "CircleWaterPlug",
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
                moveTo(14f, 12f)
                horizontalLineTo(8f)
                verticalLineTo(13.8f)
                curveTo(8f, 14.92f, 8f, 15.48f, 8.218f, 15.908f)
                curveTo(8.41f, 16.284f, 8.716f, 16.59f, 9.092f, 16.782f)
                curveTo(9.52f, 17f, 10.08f, 17f, 11.2f, 17f)
                horizontalLineTo(13f)
                curveTo(13.932f, 17f, 14.398f, 17f, 14.765f, 16.848f)
                curveTo(15.255f, 16.645f, 15.645f, 16.255f, 15.848f, 15.765f)
                curveTo(16f, 15.398f, 16f, 14.932f, 16f, 14f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                close()
                moveTo(14f, 12f)
                verticalLineTo(9f)
                moveTo(10f, 9f)
                verticalLineTo(12f)
                moveTo(12f, 21f)
                verticalLineTo(17f)
                moveTo(12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(12.168f, 3f, 12.335f, 3.005f, 12.5f, 3.014f)
                moveTo(12f, 21f)
                curveTo(16.633f, 21f, 20.448f, 17.5f, 20.945f, 13f)
                moveTo(22f, 6.018f)
                curveTo(22f, 7.665f, 20.657f, 9f, 19f, 9f)
                curveTo(17.343f, 9f, 16f, 7.665f, 16f, 6.018f)
                curveTo(16f, 5.261f, 16.682f, 4.428f, 17.148f, 3.902f)
                curveTo(17.698f, 3.283f, 18.991f, 2f, 18.991f, 2f)
                curveTo(18.991f, 2f, 20.349f, 3.283f, 20.898f, 3.902f)
                curveTo(21.365f, 4.428f, 22f, 5.261f, 22f, 6.018f)
                close()
            }
        }.build()

        return _CircleWaterPlug!!
    }

@Suppress("ObjectPropertyName")
private var _CircleWaterPlug: ImageVector? = null
