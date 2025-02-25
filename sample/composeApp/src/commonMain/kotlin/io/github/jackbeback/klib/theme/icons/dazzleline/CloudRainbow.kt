package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CloudRainbow: ImageVector
    get() {
        if (_CloudRainbow != null) {
            return _CloudRainbow!!
        }
        _CloudRainbow = ImageVector.Builder(
            name = "CloudRainbow",
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
                moveTo(21f, 9f)
                curveTo(19.353f, 9f, 17.892f, 9.796f, 16.981f, 11.025f)
                moveTo(21f, 6f)
                curveTo(18.58f, 6f, 16.41f, 7.075f, 14.943f, 8.773f)
                moveTo(21f, 3f)
                curveTo(17.133f, 3f, 13.731f, 4.996f, 11.77f, 8.014f)
                moveTo(11.77f, 8.014f)
                curveTo(9.727f, 8.162f, 8.003f, 9.489f, 7.25f, 11.25f)
                curveTo(4.7f, 11.656f, 3f, 13.757f, 3f, 16.031f)
                curveTo(3f, 18.775f, 5.283f, 21f, 8.1f, 21f)
                lineTo(15.75f, 21f)
                curveTo(18.097f, 21f, 20f, 19.128f, 20f, 16.819f)
                curveTo(20f, 15.104f, 18.951f, 13.52f, 17.45f, 12.875f)
                curveTo(17.412f, 12.218f, 17.247f, 11.594f, 16.981f, 11.025f)
                moveTo(11.77f, 8.014f)
                curveTo(11.896f, 8.005f, 12.023f, 8f, 12.151f, 8f)
                curveTo(13.175f, 8f, 14.132f, 8.283f, 14.943f, 8.773f)
                moveTo(14.943f, 8.773f)
                curveTo(15.83f, 9.309f, 16.544f, 10.093f, 16.981f, 11.025f)
            }
        }.build()

        return _CloudRainbow!!
    }

@Suppress("ObjectPropertyName")
private var _CloudRainbow: ImageVector? = null
