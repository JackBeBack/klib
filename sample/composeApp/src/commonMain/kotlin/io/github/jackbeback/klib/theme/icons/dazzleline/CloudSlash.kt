package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CloudSlash: ImageVector
    get() {
        if (_CloudSlash != null) {
            return _CloudSlash!!
        }
        _CloudSlash = ImageVector.Builder(
            name = "CloudSlash",
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
                moveTo(18.522f, 18.521f)
                curveTo(17.914f, 18.827f, 17.227f, 19f, 16.5f, 19f)
                lineTo(8.4f, 19f)
                curveTo(5.418f, 19f, 3f, 16.604f, 3f, 13.649f)
                curveTo(3f, 11.2f, 4.8f, 8.938f, 7.5f, 8.5f)
                curveTo(7.597f, 8.27f, 7.708f, 8.048f, 7.834f, 7.833f)
                moveTo(10.902f, 5.3f)
                curveTo(11.464f, 5.106f, 12.064f, 5f, 12.689f, 5f)
                curveTo(15.684f, 5f, 18.132f, 7.323f, 18.3f, 10.25f)
                curveTo(19.889f, 10.945f, 21f, 12.65f, 21f, 14.497f)
                curveTo(21f, 14.78f, 20.974f, 15.057f, 20.924f, 15.325f)
                moveTo(3f, 3f)
                lineTo(21f, 21f)
            }
        }.build()

        return _CloudSlash!!
    }

@Suppress("ObjectPropertyName")
private var _CloudSlash: ImageVector? = null
