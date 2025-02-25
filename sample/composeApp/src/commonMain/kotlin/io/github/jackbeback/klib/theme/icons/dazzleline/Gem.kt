package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Gem: ImageVector
    get() {
        if (_Gem != null) {
            return _Gem!!
        }
        _Gem = ImageVector.Builder(
            name = "Gem",
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
                moveTo(3.113f, 9f)
                horizontalLineTo(20.888f)
                moveTo(7.049f, 3.051f)
                lineTo(12f, 9f)
                lineTo(16.96f, 3.055f)
                moveTo(20.686f, 8.529f)
                lineTo(17.237f, 3.356f)
                curveTo(17.151f, 3.226f, 17.107f, 3.161f, 17.05f, 3.114f)
                curveTo(16.999f, 3.072f, 16.941f, 3.041f, 16.878f, 3.022f)
                curveTo(16.807f, 3f, 16.728f, 3f, 16.572f, 3f)
                horizontalLineTo(7.428f)
                curveTo(7.272f, 3f, 7.193f, 3f, 7.122f, 3.022f)
                curveTo(7.059f, 3.041f, 7.001f, 3.072f, 6.95f, 3.114f)
                curveTo(6.893f, 3.161f, 6.849f, 3.226f, 6.763f, 3.356f)
                lineTo(3.314f, 8.529f)
                curveTo(3.201f, 8.699f, 3.144f, 8.784f, 3.124f, 8.875f)
                curveTo(3.106f, 8.955f, 3.109f, 9.039f, 3.131f, 9.118f)
                curveTo(3.156f, 9.208f, 3.217f, 9.29f, 3.34f, 9.453f)
                lineTo(11.36f, 20.147f)
                curveTo(11.577f, 20.436f, 11.686f, 20.581f, 11.819f, 20.633f)
                curveTo(11.935f, 20.678f, 12.065f, 20.678f, 12.181f, 20.633f)
                curveTo(12.314f, 20.581f, 12.423f, 20.436f, 12.64f, 20.147f)
                lineTo(20.66f, 9.453f)
                curveTo(20.783f, 9.29f, 20.844f, 9.208f, 20.869f, 9.118f)
                curveTo(20.892f, 9.039f, 20.894f, 8.955f, 20.876f, 8.875f)
                curveTo(20.856f, 8.784f, 20.799f, 8.699f, 20.686f, 8.529f)
                close()
            }
        }.build()

        return _Gem!!
    }

@Suppress("ObjectPropertyName")
private var _Gem: ImageVector? = null
