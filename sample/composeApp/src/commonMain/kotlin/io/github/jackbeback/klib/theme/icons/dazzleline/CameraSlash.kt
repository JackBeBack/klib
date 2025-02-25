package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CameraSlash: ImageVector
    get() {
        if (_CameraSlash != null) {
            return _CameraSlash!!
        }
        _CameraSlash = ImageVector.Builder(
            name = "CameraSlash",
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
                moveTo(3f, 3f)
                lineTo(6f, 6f)
                moveTo(21f, 21f)
                lineTo(19.846f, 19.822f)
                moveTo(9.742f, 4.068f)
                curveTo(9.836f, 4.043f, 9.933f, 4.024f, 10.032f, 4.013f)
                curveTo(10.145f, 4f, 10.268f, 4f, 10.514f, 4f)
                horizontalLineTo(13.533f)
                curveTo(13.779f, 4f, 13.901f, 4f, 14.015f, 4.013f)
                curveTo(14.607f, 4.081f, 15.137f, 4.409f, 15.463f, 4.908f)
                curveTo(15.525f, 5.003f, 15.58f, 5.113f, 15.69f, 5.333f)
                curveTo(15.745f, 5.443f, 15.773f, 5.498f, 15.804f, 5.546f)
                curveTo(15.966f, 5.796f, 16.232f, 5.96f, 16.528f, 5.994f)
                curveTo(16.584f, 6f, 16.646f, 6f, 16.769f, 6f)
                horizontalLineTo(17.823f)
                curveTo(18.944f, 6f, 19.504f, 6f, 19.931f, 6.218f)
                curveTo(20.308f, 6.41f, 20.614f, 6.716f, 20.806f, 7.092f)
                curveTo(21.023f, 7.52f, 21.023f, 8.08f, 21.023f, 9.2f)
                verticalLineTo(15.35f)
                moveTo(19.846f, 19.822f)
                curveTo(19.428f, 20f, 18.87f, 20f, 17.823f, 20f)
                horizontalLineTo(6.223f)
                curveTo(5.103f, 20f, 4.543f, 20f, 4.115f, 19.782f)
                curveTo(3.739f, 19.59f, 3.433f, 19.284f, 3.241f, 18.908f)
                curveTo(3.023f, 18.48f, 3.023f, 17.92f, 3.023f, 16.8f)
                verticalLineTo(9.2f)
                curveTo(3.023f, 8.08f, 3.023f, 7.52f, 3.241f, 7.092f)
                curveTo(3.433f, 6.716f, 3.739f, 6.41f, 4.115f, 6.218f)
                curveTo(4.514f, 6.015f, 5.027f, 6.001f, 6f, 6f)
                moveTo(19.846f, 19.822f)
                lineTo(14.562f, 14.562f)
                moveTo(14.562f, 14.562f)
                curveTo(14.035f, 15.424f, 13.085f, 16f, 12f, 16f)
                curveTo(10.343f, 16f, 9f, 14.657f, 9f, 13f)
                curveTo(9f, 11.915f, 9.576f, 10.965f, 10.438f, 10.438f)
                moveTo(14.562f, 14.562f)
                lineTo(10.438f, 10.438f)
                moveTo(10.438f, 10.438f)
                lineTo(6f, 6f)
            }
        }.build()

        return _CameraSlash!!
    }

@Suppress("ObjectPropertyName")
private var _CameraSlash: ImageVector? = null
