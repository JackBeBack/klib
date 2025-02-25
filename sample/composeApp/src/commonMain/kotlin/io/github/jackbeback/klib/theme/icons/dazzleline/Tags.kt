package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Tags: ImageVector
    get() {
        if (_Tags != null) {
            return _Tags!!
        }
        _Tags = ImageVector.Builder(
            name = "Tags",
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
                moveTo(8.5f, 3f)
                horizontalLineTo(11.512f)
                curveTo(12.245f, 3f, 12.612f, 3f, 12.958f, 3.083f)
                curveTo(13.264f, 3.156f, 13.556f, 3.278f, 13.825f, 3.442f)
                curveTo(14.128f, 3.628f, 14.387f, 3.887f, 14.906f, 4.406f)
                lineTo(20.5f, 10f)
                moveTo(7.55f, 10.05f)
                horizontalLineTo(7.56f)
                moveTo(9.512f, 6f)
                horizontalLineTo(8.3f)
                curveTo(6.62f, 6f, 5.78f, 6f, 5.138f, 6.327f)
                curveTo(4.574f, 6.615f, 4.115f, 7.074f, 3.827f, 7.638f)
                curveTo(3.5f, 8.28f, 3.5f, 9.12f, 3.5f, 10.8f)
                verticalLineTo(12.012f)
                curveTo(3.5f, 12.745f, 3.5f, 13.112f, 3.583f, 13.458f)
                curveTo(3.656f, 13.764f, 3.778f, 14.056f, 3.942f, 14.325f)
                curveTo(4.128f, 14.628f, 4.387f, 14.887f, 4.906f, 15.406f)
                lineTo(8.106f, 18.606f)
                curveTo(9.294f, 19.794f, 9.888f, 20.388f, 10.573f, 20.611f)
                curveTo(11.175f, 20.806f, 11.825f, 20.806f, 12.427f, 20.611f)
                curveTo(13.112f, 20.388f, 13.706f, 19.794f, 14.894f, 18.606f)
                lineTo(16.106f, 17.394f)
                curveTo(17.294f, 16.206f, 17.888f, 15.612f, 18.111f, 14.927f)
                curveTo(18.306f, 14.325f, 18.306f, 13.675f, 18.111f, 13.073f)
                curveTo(17.888f, 12.388f, 17.294f, 11.794f, 16.106f, 10.606f)
                lineTo(12.906f, 7.406f)
                curveTo(12.387f, 6.887f, 12.128f, 6.628f, 11.825f, 6.442f)
                curveTo(11.556f, 6.278f, 11.264f, 6.156f, 10.958f, 6.083f)
                curveTo(10.612f, 6f, 10.245f, 6f, 9.512f, 6f)
                close()
                moveTo(8.05f, 10.05f)
                curveTo(8.05f, 10.326f, 7.826f, 10.55f, 7.55f, 10.55f)
                curveTo(7.274f, 10.55f, 7.05f, 10.326f, 7.05f, 10.05f)
                curveTo(7.05f, 9.774f, 7.274f, 9.55f, 7.55f, 9.55f)
                curveTo(7.826f, 9.55f, 8.05f, 9.774f, 8.05f, 10.05f)
                close()
            }
        }.build()

        return _Tags!!
    }

@Suppress("ObjectPropertyName")
private var _Tags: ImageVector? = null
