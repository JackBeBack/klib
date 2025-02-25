package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Cctv: ImageVector
    get() {
        if (_Cctv != null) {
            return _Cctv!!
        }
        _Cctv = ImageVector.Builder(
            name = "Cctv",
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
                moveTo(3.23f, 15.602f)
                verticalLineTo(19.602f)
                moveTo(3.23f, 17.602f)
                horizontalLineTo(6.11f)
                curveTo(6.514f, 17.602f, 6.715f, 17.602f, 6.888f, 17.536f)
                curveTo(7.041f, 17.477f, 7.177f, 17.382f, 7.285f, 17.258f)
                curveTo(7.406f, 17.118f, 7.475f, 16.928f, 7.613f, 16.549f)
                lineTo(9.23f, 12.102f)
                moveTo(16.23f, 14.102f)
                lineTo(17.967f, 14.97f)
                curveTo(18.414f, 15.194f, 18.638f, 15.306f, 18.858f, 15.312f)
                curveTo(19.052f, 15.318f, 19.244f, 15.267f, 19.41f, 15.166f)
                curveTo(19.598f, 15.051f, 19.737f, 14.843f, 20.014f, 14.427f)
                lineTo(20.225f, 14.11f)
                curveTo(20.573f, 13.589f, 20.746f, 13.328f, 20.767f, 13.069f)
                curveTo(20.785f, 12.842f, 20.725f, 12.615f, 20.596f, 12.427f)
                curveTo(20.45f, 12.212f, 20.17f, 12.072f, 19.609f, 11.792f)
                lineTo(19.23f, 11.602f)
                moveTo(4.09f, 7.628f)
                lineTo(5.961f, 4.42f)
                curveTo(6.232f, 3.957f, 6.367f, 3.725f, 6.561f, 3.597f)
                curveTo(6.731f, 3.483f, 6.933f, 3.425f, 7.137f, 3.43f)
                curveTo(7.37f, 3.436f, 7.608f, 3.56f, 8.084f, 3.808f)
                lineTo(15.979f, 7.927f)
                curveTo(16.726f, 8.317f, 17.1f, 8.512f, 17.245f, 8.788f)
                curveTo(17.372f, 9.03f, 17.396f, 9.312f, 17.309f, 9.571f)
                curveTo(17.21f, 9.867f, 16.873f, 10.12f, 16.199f, 10.626f)
                lineTo(13.022f, 13.009f)
                curveTo(12.734f, 13.224f, 12.591f, 13.332f, 12.431f, 13.383f)
                curveTo(12.29f, 13.429f, 12.141f, 13.442f, 11.994f, 13.423f)
                curveTo(11.828f, 13.401f, 11.667f, 13.32f, 11.346f, 13.16f)
                lineTo(4.757f, 9.865f)
                curveTo(4.226f, 9.6f, 3.961f, 9.467f, 3.816f, 9.263f)
                curveTo(3.689f, 9.083f, 3.624f, 8.867f, 3.632f, 8.647f)
                curveTo(3.642f, 8.397f, 3.791f, 8.141f, 4.09f, 7.628f)
                close()
            }
        }.build()

        return _Cctv!!
    }

@Suppress("ObjectPropertyName")
private var _Cctv: ImageVector? = null
