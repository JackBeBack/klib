package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TemperatureSun: ImageVector
    get() {
        if (_TemperatureSun != null) {
            return _TemperatureSun!!
        }
        _TemperatureSun = ImageVector.Builder(
            name = "TemperatureSun",
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
                moveTo(14.497f, 5f)
                lineTo(15.464f, 7.065f)
                curveTo(15.573f, 7.294f, 15.628f, 7.409f, 15.714f, 7.479f)
                curveTo(15.79f, 7.541f, 15.883f, 7.58f, 15.981f, 7.59f)
                curveTo(16.092f, 7.601f, 16.212f, 7.558f, 16.452f, 7.474f)
                lineTo(18.077f, 6.9f)
                curveTo(18.582f, 6.722f, 18.834f, 6.633f, 19f, 6.691f)
                curveTo(19.144f, 6.741f, 19.257f, 6.854f, 19.308f, 6.998f)
                curveTo(19.365f, 7.164f, 19.276f, 7.416f, 19.098f, 7.921f)
                lineTo(18.524f, 9.546f)
                curveTo(18.44f, 9.786f, 18.397f, 9.906f, 18.408f, 10.017f)
                curveTo(18.418f, 10.115f, 18.457f, 10.208f, 18.519f, 10.284f)
                curveTo(18.59f, 10.37f, 18.704f, 10.425f, 18.933f, 10.535f)
                lineTo(20.489f, 11.278f)
                curveTo(20.972f, 11.509f, 21.213f, 11.625f, 21.289f, 11.783f)
                curveTo(21.356f, 11.92f, 21.356f, 12.08f, 21.289f, 12.217f)
                curveTo(21.213f, 12.375f, 20.972f, 12.491f, 20.489f, 12.722f)
                lineTo(18.933f, 13.465f)
                curveTo(18.704f, 13.575f, 18.59f, 13.63f, 18.519f, 13.716f)
                curveTo(18.457f, 13.792f, 18.418f, 13.885f, 18.408f, 13.983f)
                curveTo(18.397f, 14.094f, 18.44f, 14.214f, 18.524f, 14.453f)
                lineTo(19.098f, 16.079f)
                curveTo(19.276f, 16.584f, 19.365f, 16.836f, 19.308f, 17.002f)
                curveTo(19.257f, 17.146f, 19.144f, 17.259f, 19f, 17.309f)
                curveTo(18.834f, 17.367f, 18.582f, 17.278f, 18.077f, 17.1f)
                lineTo(16.017f, 16.373f)
                curveTo(15.927f, 16.341f, 15.882f, 16.325f, 15.835f, 16.318f)
                curveTo(15.794f, 16.311f, 15.752f, 16.31f, 15.711f, 16.314f)
                curveTo(15.664f, 16.319f, 15.618f, 16.332f, 15.526f, 16.359f)
                lineTo(14.997f, 16.514f)
                moveTo(13.998f, 14f)
                curveTo(14.362f, 14f, 14.703f, 13.903f, 14.997f, 13.733f)
                curveTo(15.595f, 13.387f, 15.998f, 12.741f, 15.998f, 12f)
                curveTo(15.998f, 11.259f, 15.595f, 10.613f, 14.997f, 10.267f)
                curveTo(14.703f, 10.097f, 14.362f, 10f, 13.998f, 10f)
                moveTo(6.998f, 16f)
                curveTo(7.55f, 16f, 7.998f, 16.448f, 7.998f, 17f)
                curveTo(7.998f, 17.552f, 7.55f, 18f, 6.998f, 18f)
                curveTo(6.446f, 18f, 5.998f, 17.552f, 5.998f, 17f)
                curveTo(5.998f, 16.448f, 6.446f, 16f, 6.998f, 16f)
                close()
                moveTo(6.998f, 16f)
                lineTo(6.991f, 10.5f)
                moveTo(6.998f, 17f)
                lineTo(6.991f, 17.007f)
                moveTo(2.998f, 17f)
                curveTo(2.998f, 19.209f, 4.789f, 21f, 6.998f, 21f)
                curveTo(9.207f, 21f, 10.998f, 19.209f, 10.998f, 17f)
                curveTo(10.998f, 15.985f, 10.62f, 15.059f, 9.998f, 14.354f)
                verticalLineTo(6f)
                curveTo(9.998f, 4.343f, 8.655f, 3f, 6.998f, 3f)
                curveTo(5.341f, 3f, 3.998f, 4.343f, 3.998f, 6f)
                verticalLineTo(14.354f)
                curveTo(3.376f, 15.059f, 2.998f, 15.985f, 2.998f, 17f)
                close()
            }
        }.build()

        return _TemperatureSun!!
    }

@Suppress("ObjectPropertyName")
private var _TemperatureSun: ImageVector? = null
