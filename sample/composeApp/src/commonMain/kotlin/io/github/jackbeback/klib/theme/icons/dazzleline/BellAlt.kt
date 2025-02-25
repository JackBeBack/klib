package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BellAlt: ImageVector
    get() {
        if (_BellAlt != null) {
            return _BellAlt!!
        }
        _BellAlt = ImageVector.Builder(
            name = "BellAlt",
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
                moveTo(12.001f, 5f)
                curveTo(13.433f, 5f, 14.807f, 5.506f, 15.819f, 6.406f)
                curveTo(16.832f, 7.306f, 17.401f, 8.527f, 17.401f, 9.8f)
                curveTo(17.401f, 11.769f, 17.846f, 13.244f, 18.423f, 14.328f)
                curveTo(19.161f, 15.713f, 19.529f, 16.406f, 19.509f, 16.564f)
                curveTo(19.485f, 16.749f, 19.454f, 16.8f, 19.303f, 16.907f)
                curveTo(19.173f, 17f, 18.525f, 17f, 17.231f, 17f)
                horizontalLineTo(6.771f)
                curveTo(5.476f, 17f, 4.829f, 17f, 4.699f, 16.907f)
                curveTo(4.547f, 16.8f, 4.517f, 16.749f, 4.493f, 16.564f)
                curveTo(4.472f, 16.406f, 4.841f, 15.713f, 5.579f, 14.328f)
                curveTo(6.156f, 13.244f, 6.601f, 11.769f, 6.601f, 9.8f)
                curveTo(6.601f, 8.527f, 7.17f, 7.306f, 8.183f, 6.406f)
                curveTo(9.195f, 5.506f, 10.569f, 5f, 12.001f, 5f)
                close()
                moveTo(12.001f, 5f)
                verticalLineTo(3f)
                moveTo(9.355f, 20f)
                curveTo(10.061f, 20.623f, 10.989f, 21.002f, 12.005f, 21.002f)
                curveTo(13.021f, 21.002f, 13.949f, 20.623f, 14.655f, 20f)
            }
        }.build()

        return _BellAlt!!
    }

@Suppress("ObjectPropertyName")
private var _BellAlt: ImageVector? = null
