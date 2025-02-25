package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CloudSun: ImageVector
    get() {
        if (_CloudSun != null) {
            return _CloudSun!!
        }
        _CloudSun = ImageVector.Builder(
            name = "CloudSun",
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
                moveTo(11.095f, 8.027f)
                curveTo(11.548f, 5.731f, 13.572f, 4f, 16f, 4f)
                curveTo(18.761f, 4f, 21f, 6.239f, 21f, 9f)
                curveTo(21f, 11.035f, 19.785f, 12.785f, 18.041f, 13.566f)
                moveTo(11.095f, 8.027f)
                curveTo(9.242f, 8.218f, 7.689f, 9.419f, 7f, 11f)
                curveTo(4.6f, 11.375f, 3f, 13.314f, 3f, 15.414f)
                curveTo(3f, 17.947f, 5.149f, 20f, 7.8f, 20f)
                lineTo(15f, 20f)
                curveTo(17.209f, 20f, 19f, 18.272f, 19f, 16.14f)
                curveTo(19f, 15.183f, 18.639f, 14.27f, 18.041f, 13.566f)
                moveTo(11.095f, 8.027f)
                curveTo(11.265f, 8.009f, 11.438f, 8f, 11.613f, 8f)
                curveTo(14.275f, 8f, 16.45f, 9.991f, 16.6f, 12.5f)
                curveTo(17.158f, 12.735f, 17.65f, 13.106f, 18.041f, 13.566f)
            }
        }.build()

        return _CloudSun!!
    }

@Suppress("ObjectPropertyName")
private var _CloudSun: ImageVector? = null
