package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GearAlt: ImageVector
    get() {
        if (_GearAlt != null) {
            return _GearAlt!!
        }
        _GearAlt = ImageVector.Builder(
            name = "GearAlt",
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
                moveTo(18.763f, 13.794f)
                lineTo(20.029f, 16.022f)
                curveTo(19.879f, 16.316f, 19.711f, 16.605f, 19.524f, 16.887f)
                curveTo(19.338f, 17.17f, 19.139f, 17.438f, 18.928f, 17.692f)
                lineTo(16.438f, 17.414f)
                curveTo(15.771f, 17.961f, 15.003f, 18.387f, 14.165f, 18.659f)
                lineTo(13f, 20.945f)
                curveTo(12.672f, 20.981f, 12.338f, 21f, 12f, 21f)
                curveTo(11.662f, 21f, 11.328f, 20.981f, 11f, 20.945f)
                lineTo(9.833f, 18.658f)
                curveTo(8.994f, 18.385f, 8.225f, 17.958f, 7.559f, 17.411f)
                lineTo(5.054f, 17.691f)
                curveTo(4.843f, 17.437f, 4.644f, 17.169f, 4.458f, 16.887f)
                curveTo(4.272f, 16.605f, 4.104f, 16.316f, 3.953f, 16.022f)
                lineTo(5.226f, 13.781f)
                curveTo(5.078f, 13.214f, 5f, 12.614f, 5f, 12f)
                curveTo(5f, 11.375f, 5.082f, 10.769f, 5.236f, 10.192f)
                lineTo(3.954f, 7.936f)
                curveTo(4.104f, 7.642f, 4.272f, 7.353f, 4.458f, 7.071f)
                curveTo(4.644f, 6.789f, 4.843f, 6.52f, 5.054f, 6.266f)
                lineTo(7.609f, 6.553f)
                curveTo(8.268f, 6.021f, 9.016f, 5.607f, 9.84f, 5.34f)
                moveTo(9.836f, 5.34f)
                lineTo(11f, 3.055f)
                curveTo(11.328f, 3.019f, 11.662f, 3f, 12f, 3f)
                curveTo(12.338f, 3f, 12.672f, 3.019f, 13f, 3.055f)
                lineTo(14.164f, 5.34f)
                curveTo(14.988f, 5.607f, 15.739f, 6.018f, 16.398f, 6.551f)
                lineTo(18.927f, 6.267f)
                curveTo(19.139f, 6.521f, 19.338f, 6.789f, 19.524f, 7.071f)
                curveTo(19.71f, 7.353f, 19.878f, 7.642f, 20.028f, 7.936f)
                lineTo(18.759f, 10.17f)
                moveTo(18.759f, 10.173f)
                curveTo(18.916f, 10.756f, 19f, 11.368f, 19f, 12f)
                curveTo(19f, 12.622f, 18.919f, 13.224f, 18.767f, 13.797f)
                moveTo(15f, 12f)
                curveTo(15f, 13.657f, 13.657f, 15f, 12f, 15f)
                curveTo(10.343f, 15f, 9f, 13.657f, 9f, 12f)
                curveTo(9f, 10.343f, 10.343f, 9f, 12f, 9f)
                curveTo(13.657f, 9f, 15f, 10.343f, 15f, 12f)
                close()
            }
        }.build()

        return _GearAlt!!
    }

@Suppress("ObjectPropertyName")
private var _GearAlt: ImageVector? = null
