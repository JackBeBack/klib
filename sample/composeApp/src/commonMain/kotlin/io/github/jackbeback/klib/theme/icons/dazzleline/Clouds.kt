package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Clouds: ImageVector
    get() {
        if (_Clouds != null) {
            return _Clouds!!
        }
        _Clouds = ImageVector.Builder(
            name = "Clouds",
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
                moveTo(5.388f, 12.702f)
                curveTo(3.985f, 12.124f, 3f, 10.764f, 3f, 9.178f)
                curveTo(3f, 7.429f, 4.3f, 5.813f, 6.25f, 5.5f)
                curveTo(6.862f, 4.062f, 8.309f, 3f, 9.998f, 3f)
                curveTo(12.161f, 3f, 13.929f, 4.659f, 14.05f, 6.75f)
                curveTo(14.872f, 7.105f, 15.517f, 7.831f, 15.817f, 8.699f)
                moveTo(5.388f, 12.702f)
                curveTo(4.509f, 13.594f, 4f, 14.787f, 4f, 16.031f)
                curveTo(4f, 18.775f, 6.283f, 21f, 9.1f, 21f)
                lineTo(16.75f, 21f)
                curveTo(19.097f, 21f, 21f, 19.128f, 21f, 16.819f)
                curveTo(21f, 15.104f, 19.951f, 13.52f, 18.45f, 12.875f)
                curveTo(18.346f, 11.09f, 17.313f, 9.548f, 15.817f, 8.699f)
                moveTo(5.388f, 12.702f)
                curveTo(6.116f, 11.965f, 7.096f, 11.434f, 8.25f, 11.25f)
                curveTo(9.05f, 9.38f, 10.943f, 8f, 13.151f, 8f)
                curveTo(14.123f, 8f, 15.033f, 8.255f, 15.817f, 8.699f)
            }
        }.build()

        return _Clouds!!
    }

@Suppress("ObjectPropertyName")
private var _Clouds: ImageVector? = null
