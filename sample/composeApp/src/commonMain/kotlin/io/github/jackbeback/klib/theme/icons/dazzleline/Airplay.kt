package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Airplay: ImageVector
    get() {
        if (_Airplay != null) {
            return _Airplay!!
        }
        _Airplay = ImageVector.Builder(
            name = "Airplay",
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
                moveTo(5f, 16.987f)
                curveTo(4.673f, 16.97f, 4.439f, 16.932f, 4.235f, 16.848f)
                curveTo(3.745f, 16.645f, 3.355f, 16.255f, 3.152f, 15.765f)
                curveTo(3f, 15.398f, 3f, 14.932f, 3f, 14f)
                verticalLineTo(7.2f)
                curveTo(3f, 6.08f, 3f, 5.52f, 3.218f, 5.092f)
                curveTo(3.41f, 4.716f, 3.716f, 4.41f, 4.092f, 4.218f)
                curveTo(4.52f, 4f, 5.08f, 4f, 6.2f, 4f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 4f, 19.48f, 4f, 19.908f, 4.218f)
                curveTo(20.284f, 4.41f, 20.59f, 4.716f, 20.782f, 5.092f)
                curveTo(21f, 5.52f, 21f, 6.08f, 21f, 7.2f)
                verticalLineTo(14f)
                curveTo(21f, 14.932f, 21f, 15.398f, 20.848f, 15.765f)
                curveTo(20.645f, 16.255f, 20.255f, 16.645f, 19.765f, 16.848f)
                curveTo(19.562f, 16.932f, 19.327f, 16.97f, 19f, 16.987f)
                moveTo(9.141f, 20f)
                horizontalLineTo(14.859f)
                curveTo(15.424f, 20f, 15.706f, 20f, 15.837f, 19.875f)
                curveTo(15.95f, 19.767f, 16.01f, 19.604f, 15.999f, 19.438f)
                curveTo(15.985f, 19.246f, 15.785f, 19.022f, 15.386f, 18.575f)
                lineTo(12.527f, 15.374f)
                curveTo(12.343f, 15.167f, 12.25f, 15.064f, 12.144f, 15.026f)
                curveTo(12.05f, 14.991f, 11.95f, 14.991f, 11.856f, 15.026f)
                curveTo(11.75f, 15.064f, 11.657f, 15.167f, 11.473f, 15.374f)
                lineTo(8.614f, 18.575f)
                curveTo(8.215f, 19.022f, 8.015f, 19.246f, 8.001f, 19.438f)
                curveTo(7.99f, 19.604f, 8.05f, 19.767f, 8.163f, 19.875f)
                curveTo(8.294f, 20f, 8.576f, 20f, 9.141f, 20f)
                close()
            }
        }.build()

        return _Airplay!!
    }

@Suppress("ObjectPropertyName")
private var _Airplay: ImageVector? = null
