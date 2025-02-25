package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SunHaze: ImageVector
    get() {
        if (_SunHaze != null) {
            return _SunHaze!!
        }
        _SunHaze = ImageVector.Builder(
            name = "SunHaze",
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
                moveTo(3f, 11f)
                lineTo(5.823f, 9.79f)
                curveTo(6.062f, 9.688f, 6.181f, 9.637f, 6.256f, 9.551f)
                curveTo(6.322f, 9.476f, 6.364f, 9.383f, 6.376f, 9.284f)
                curveTo(6.39f, 9.171f, 6.349f, 9.048f, 6.267f, 8.802f)
                lineTo(5.653f, 6.959f)
                curveTo(5.442f, 6.325f, 5.336f, 6.009f, 5.411f, 5.793f)
                curveTo(5.476f, 5.606f, 5.62f, 5.457f, 5.805f, 5.387f)
                curveTo(6.018f, 5.306f, 6.338f, 5.402f, 6.978f, 5.593f)
                lineTo(8.65f, 6.095f)
                curveTo(9.128f, 6.239f, 9.367f, 6.31f, 9.585f, 6.279f)
                curveTo(9.777f, 6.252f, 9.957f, 6.169f, 10.103f, 6.041f)
                curveTo(10.268f, 5.896f, 10.37f, 5.668f, 10.572f, 5.212f)
                lineTo(11.02f, 4.204f)
                curveTo(11.331f, 3.506f, 11.486f, 3.157f, 11.702f, 3.05f)
                curveTo(11.89f, 2.956f, 12.11f, 2.956f, 12.298f, 3.05f)
                curveTo(12.514f, 3.157f, 12.669f, 3.506f, 12.98f, 4.204f)
                lineTo(13.428f, 5.212f)
                curveTo(13.63f, 5.668f, 13.732f, 5.896f, 13.897f, 6.041f)
                curveTo(14.043f, 6.169f, 14.223f, 6.252f, 14.415f, 6.279f)
                curveTo(14.633f, 6.31f, 14.872f, 6.239f, 15.35f, 6.095f)
                lineTo(17.022f, 5.593f)
                curveTo(17.662f, 5.402f, 17.982f, 5.306f, 18.195f, 5.387f)
                curveTo(18.38f, 5.457f, 18.524f, 5.606f, 18.589f, 5.793f)
                curveTo(18.664f, 6.009f, 18.558f, 6.325f, 18.347f, 6.959f)
                lineTo(17.733f, 8.802f)
                curveTo(17.651f, 9.048f, 17.61f, 9.171f, 17.624f, 9.284f)
                curveTo(17.636f, 9.383f, 17.678f, 9.476f, 17.744f, 9.551f)
                curveTo(17.819f, 9.637f, 17.938f, 9.688f, 18.177f, 9.79f)
                lineTo(21f, 11f)
                moveTo(10f, 11f)
                curveTo(10f, 9.895f, 10.895f, 9f, 12f, 9f)
                curveTo(13.105f, 9f, 14f, 9.895f, 14f, 11f)
                moveTo(13f, 21f)
                horizontalLineTo(21f)
                moveTo(17f, 15f)
                horizontalLineTo(21f)
                moveTo(5f, 15f)
                horizontalLineTo(13f)
                moveTo(3f, 18f)
                horizontalLineTo(19f)
                moveTo(5f, 21f)
                horizontalLineTo(9f)
            }
        }.build()

        return _SunHaze!!
    }

@Suppress("ObjectPropertyName")
private var _SunHaze: ImageVector? = null
