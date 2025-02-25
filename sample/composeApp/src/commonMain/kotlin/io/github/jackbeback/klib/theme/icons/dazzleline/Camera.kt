package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Camera: ImageVector
    get() {
        if (_Camera != null) {
            return _Camera!!
        }
        _Camera = ImageVector.Builder(
            name = "Camera",
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
                moveTo(12f, 16f)
                curveTo(13.657f, 16f, 15f, 14.657f, 15f, 13f)
                curveTo(15f, 11.343f, 13.657f, 10f, 12f, 10f)
                curveTo(10.343f, 10f, 9f, 11.343f, 9f, 13f)
                curveTo(9f, 14.657f, 10.343f, 16f, 12f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 16.8f)
                verticalLineTo(9.2f)
                curveTo(3f, 8.08f, 3f, 7.52f, 3.218f, 7.092f)
                curveTo(3.41f, 6.716f, 3.716f, 6.41f, 4.092f, 6.218f)
                curveTo(4.52f, 6f, 5.08f, 6f, 6.2f, 6f)
                horizontalLineTo(7.255f)
                curveTo(7.378f, 6f, 7.439f, 6f, 7.496f, 5.994f)
                curveTo(7.792f, 5.96f, 8.057f, 5.796f, 8.22f, 5.546f)
                curveTo(8.251f, 5.498f, 8.278f, 5.443f, 8.333f, 5.333f)
                curveTo(8.443f, 5.113f, 8.498f, 5.003f, 8.561f, 4.908f)
                curveTo(8.886f, 4.409f, 9.417f, 4.081f, 10.009f, 4.013f)
                curveTo(10.122f, 4f, 10.245f, 4f, 10.491f, 4f)
                horizontalLineTo(13.509f)
                curveTo(13.755f, 4f, 13.878f, 4f, 13.991f, 4.013f)
                curveTo(14.583f, 4.081f, 15.114f, 4.409f, 15.439f, 4.908f)
                curveTo(15.502f, 5.003f, 15.557f, 5.113f, 15.667f, 5.333f)
                curveTo(15.722f, 5.443f, 15.749f, 5.498f, 15.78f, 5.546f)
                curveTo(15.943f, 5.796f, 16.208f, 5.96f, 16.504f, 5.994f)
                curveTo(16.561f, 6f, 16.622f, 6f, 16.745f, 6f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 6f, 19.48f, 6f, 19.908f, 6.218f)
                curveTo(20.284f, 6.41f, 20.59f, 6.716f, 20.782f, 7.092f)
                curveTo(21f, 7.52f, 21f, 8.08f, 21f, 9.2f)
                verticalLineTo(16.8f)
                curveTo(21f, 17.92f, 21f, 18.48f, 20.782f, 18.908f)
                curveTo(20.59f, 19.284f, 20.284f, 19.59f, 19.908f, 19.782f)
                curveTo(19.48f, 20f, 18.92f, 20f, 17.8f, 20f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 20f, 4.52f, 20f, 4.092f, 19.782f)
                curveTo(3.716f, 19.59f, 3.41f, 19.284f, 3.218f, 18.908f)
                curveTo(3f, 18.48f, 3f, 17.92f, 3f, 16.8f)
                close()
            }
        }.build()

        return _Camera!!
    }

@Suppress("ObjectPropertyName")
private var _Camera: ImageVector? = null
