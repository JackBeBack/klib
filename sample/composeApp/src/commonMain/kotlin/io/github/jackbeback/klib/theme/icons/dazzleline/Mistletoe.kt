package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Mistletoe: ImageVector
    get() {
        if (_Mistletoe != null) {
            return _Mistletoe!!
        }
        _Mistletoe = ImageVector.Builder(
            name = "Mistletoe",
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
                moveTo(17.251f, 17.25f)
                lineTo(16.001f, 16f)
                moveTo(8.001f, 16.25f)
                lineTo(9.251f, 15f)
                moveTo(15.001f, 9f)
                curveTo(15.342f, 9.126f, 15.653f, 9.325f, 15.909f, 9.583f)
                moveTo(13.874f, 6f)
                curveTo(13.43f, 4.275f, 11.864f, 3f, 10f, 3f)
                curveTo(7.791f, 3f, 6f, 4.791f, 6f, 7f)
                curveTo(6f, 8.191f, 6.52f, 9.26f, 7.346f, 9.993f)
                moveTo(11f, 10.874f)
                curveTo(10.68f, 10.956f, 10.345f, 11f, 10f, 11f)
                curveTo(9.429f, 11f, 8.886f, 10.88f, 8.395f, 10.665f)
                curveTo(8.01f, 10.496f, 7.657f, 10.268f, 7.346f, 9.993f)
                moveTo(7.346f, 9.993f)
                curveTo(7.258f, 9.998f, 7.17f, 10f, 7.081f, 10f)
                curveTo(6.476f, 10f, 5.896f, 9.896f, 5.358f, 9.705f)
                verticalLineTo(11.5f)
                curveTo(5.358f, 12.974f, 4.447f, 14.234f, 3.158f, 14.751f)
                curveTo(3.906f, 15.625f, 4.358f, 16.76f, 4.358f, 18f)
                curveTo(4.358f, 19.032f, 4.045f, 19.991f, 3.51f, 20.787f)
                curveTo(4.518f, 20.283f, 5.655f, 20f, 6.858f, 20f)
                curveTo(7.956f, 20f, 8.999f, 20.236f, 9.938f, 20.66f)
                curveTo(10.436f, 19.722f, 11.223f, 18.962f, 12.18f, 18.498f)
                curveTo(12.444f, 18.37f, 12.721f, 18.265f, 13.008f, 18.184f)
                curveTo(13.073f, 16.605f, 13.627f, 15.152f, 14.522f, 13.972f)
                moveTo(19.001f, 10f)
                curveTo(19.001f, 12.209f, 17.21f, 14f, 15.001f, 14f)
                curveTo(14.839f, 14f, 14.679f, 13.99f, 14.522f, 13.972f)
                moveTo(19.001f, 10f)
                curveTo(19.001f, 7.791f, 17.21f, 6f, 15.001f, 6f)
                curveTo(12.792f, 6f, 11.001f, 7.791f, 11.001f, 10f)
                curveTo(11.001f, 11.313f, 11.633f, 12.477f, 12.61f, 13.207f)
                curveTo(13.156f, 13.615f, 13.81f, 13.887f, 14.522f, 13.972f)
                moveTo(19.001f, 10f)
                lineTo(19f, 11.5f)
                curveTo(19f, 12.974f, 19.911f, 14.234f, 21.2f, 14.75f)
                curveTo(20.452f, 15.625f, 20f, 16.76f, 20f, 18f)
                curveTo(20f, 19.032f, 20.313f, 19.991f, 20.848f, 20.787f)
                curveTo(19.841f, 20.283f, 18.704f, 20f, 17.5f, 20f)
                curveTo(16.402f, 20f, 15.36f, 20.236f, 14.42f, 20.66f)
                curveTo(13.922f, 19.722f, 13.136f, 18.962f, 12.178f, 18.498f)
            }
        }.build()

        return _Mistletoe!!
    }

@Suppress("ObjectPropertyName")
private var _Mistletoe: ImageVector? = null
