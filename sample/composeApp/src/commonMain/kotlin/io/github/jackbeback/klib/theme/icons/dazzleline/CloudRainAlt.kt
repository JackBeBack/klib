package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CloudRainAlt: ImageVector
    get() {
        if (_CloudRainAlt != null) {
            return _CloudRainAlt!!
        }
        _CloudRainAlt = ImageVector.Builder(
            name = "CloudRainAlt",
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
                moveTo(4f, 14.752f)
                curveTo(3.37f, 13.877f, 3f, 12.806f, 3f, 11.649f)
                curveTo(3f, 9.2f, 4.8f, 6.938f, 7.5f, 6.5f)
                curveTo(8.347f, 4.486f, 10.351f, 3f, 12.689f, 3f)
                curveTo(15.684f, 3f, 18.132f, 5.323f, 18.3f, 8.25f)
                curveTo(19.889f, 8.945f, 21f, 10.65f, 21f, 12.497f)
                curveTo(21f, 13.569f, 20.625f, 14.554f, 20f, 15.328f)
                moveTo(12.5f, 13f)
                lineTo(10.5f, 21.001f)
                moveTo(8.5f, 12f)
                lineTo(6.5f, 20.001f)
                moveTo(16.5f, 12f)
                lineTo(14.5f, 20.001f)
            }
        }.build()

        return _CloudRainAlt!!
    }

@Suppress("ObjectPropertyName")
private var _CloudRainAlt: ImageVector? = null
