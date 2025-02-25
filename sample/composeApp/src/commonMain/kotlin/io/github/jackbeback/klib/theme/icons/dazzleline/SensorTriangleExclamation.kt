package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SensorTriangleExclamation: ImageVector
    get() {
        if (_SensorTriangleExclamation != null) {
            return _SensorTriangleExclamation!!
        }
        _SensorTriangleExclamation = ImageVector.Builder(
            name = "SensorTriangleExclamation",
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
                moveTo(15.246f, 13f)
                verticalLineTo(15f)
                moveTo(15.246f, 18f)
                horizontalLineTo(15.256f)
                moveTo(8f, 8f)
                verticalLineTo(12f)
                moveTo(5.5f, 19.92f)
                curveTo(5.347f, 19.889f, 5.214f, 19.844f, 5.092f, 19.782f)
                curveTo(4.716f, 19.59f, 4.41f, 19.284f, 4.218f, 18.908f)
                curveTo(4f, 18.48f, 4f, 17.92f, 4f, 16.8f)
                verticalLineTo(7.2f)
                curveTo(4f, 6.08f, 4f, 5.52f, 4.218f, 5.092f)
                curveTo(4.41f, 4.716f, 4.716f, 4.41f, 5.092f, 4.218f)
                curveTo(5.52f, 4f, 6.08f, 4f, 7.2f, 4f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 4f, 18.48f, 4f, 18.908f, 4.218f)
                curveTo(19.284f, 4.41f, 19.59f, 4.716f, 19.782f, 5.092f)
                curveTo(20f, 5.52f, 20f, 6.08f, 20f, 7.2f)
                verticalLineTo(7.5f)
                moveTo(13.424f, 21f)
                horizontalLineTo(17.068f)
                curveTo(18.783f, 21f, 19.64f, 21f, 20.156f, 20.639f)
                curveTo(20.607f, 20.324f, 20.908f, 19.837f, 20.988f, 19.292f)
                curveTo(21.08f, 18.669f, 20.697f, 17.902f, 19.93f, 16.369f)
                lineTo(18.108f, 12.724f)
                curveTo(17.187f, 10.882f, 16.726f, 9.961f, 16.103f, 9.665f)
                curveTo(15.561f, 9.408f, 14.931f, 9.408f, 14.389f, 9.665f)
                curveTo(13.766f, 9.961f, 13.305f, 10.882f, 12.384f, 12.724f)
                lineTo(10.561f, 16.369f)
                curveTo(9.795f, 17.902f, 9.411f, 18.669f, 9.503f, 19.292f)
                curveTo(9.584f, 19.837f, 9.885f, 20.324f, 10.336f, 20.639f)
                curveTo(10.852f, 21f, 11.709f, 21f, 13.424f, 21f)
                close()
            }
        }.build()

        return _SensorTriangleExclamation!!
    }

@Suppress("ObjectPropertyName")
private var _SensorTriangleExclamation: ImageVector? = null
