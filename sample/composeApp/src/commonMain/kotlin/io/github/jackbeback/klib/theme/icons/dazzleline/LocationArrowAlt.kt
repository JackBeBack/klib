package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LocationArrowAlt: ImageVector
    get() {
        if (_LocationArrowAlt != null) {
            return _LocationArrowAlt!!
        }
        _LocationArrowAlt = ImageVector.Builder(
            name = "LocationArrowAlt",
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
                moveTo(10.979f, 4.27f)
                lineTo(4.592f, 18.464f)
                curveTo(4.102f, 19.552f, 3.858f, 20.096f, 3.961f, 20.415f)
                curveTo(4.05f, 20.691f, 4.271f, 20.904f, 4.551f, 20.984f)
                curveTo(4.873f, 21.075f, 5.408f, 20.811f, 6.478f, 20.283f)
                lineTo(11.292f, 17.906f)
                curveTo(11.552f, 17.777f, 11.682f, 17.713f, 11.818f, 17.688f)
                curveTo(11.939f, 17.665f, 12.062f, 17.665f, 12.183f, 17.688f)
                curveTo(12.319f, 17.713f, 12.449f, 17.777f, 12.709f, 17.906f)
                lineTo(17.523f, 20.283f)
                curveTo(18.593f, 20.811f, 19.128f, 21.075f, 19.451f, 20.984f)
                curveTo(19.73f, 20.904f, 19.951f, 20.691f, 20.04f, 20.415f)
                curveTo(20.143f, 20.096f, 19.899f, 19.552f, 19.409f, 18.464f)
                lineTo(13.022f, 4.27f)
                curveTo(12.698f, 3.55f, 12.536f, 3.19f, 12.311f, 3.078f)
                curveTo(12.115f, 2.982f, 11.886f, 2.982f, 11.69f, 3.078f)
                curveTo(11.465f, 3.19f, 11.303f, 3.55f, 10.979f, 4.27f)
                close()
            }
        }.build()

        return _LocationArrowAlt!!
    }

@Suppress("ObjectPropertyName")
private var _LocationArrowAlt: ImageVector? = null
