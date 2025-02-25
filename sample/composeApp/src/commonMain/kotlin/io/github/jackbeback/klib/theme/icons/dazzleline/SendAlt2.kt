package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SendAlt2: ImageVector
    get() {
        if (_SendAlt2 != null) {
            return _SendAlt2!!
        }
        _SendAlt2 = ImageVector.Builder(
            name = "SendAlt2",
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
                moveTo(20.764f, 12f)
                horizontalLineTo(10.056f)
                moveTo(3f, 8f)
                horizontalLineTo(5.5f)
                moveTo(4f, 12f)
                horizontalLineTo(5.5f)
                moveTo(4.5f, 16f)
                horizontalLineTo(5.5f)
                moveTo(9.962f, 12.49f)
                lineTo(9.07f, 15.449f)
                curveTo(8.733f, 16.569f, 8.564f, 17.129f, 8.707f, 17.463f)
                curveTo(8.832f, 17.754f, 9.087f, 17.968f, 9.394f, 18.042f)
                curveTo(9.748f, 18.126f, 10.271f, 17.865f, 11.318f, 17.341f)
                lineTo(19.138f, 13.431f)
                curveTo(20.059f, 12.97f, 20.52f, 12.74f, 20.667f, 12.429f)
                curveTo(20.796f, 12.157f, 20.796f, 11.843f, 20.667f, 11.571f)
                curveTo(20.52f, 11.26f, 20.059f, 11.03f, 19.138f, 10.569f)
                lineTo(11.307f, 6.653f)
                curveTo(10.263f, 6.132f, 9.742f, 5.871f, 9.388f, 5.955f)
                curveTo(9.081f, 6.028f, 8.826f, 6.242f, 8.701f, 6.532f)
                curveTo(8.557f, 6.866f, 8.724f, 7.425f, 9.058f, 8.542f)
                lineTo(9.963f, 11.57f)
                curveTo(10.014f, 11.741f, 10.039f, 11.827f, 10.049f, 11.914f)
                curveTo(10.058f, 11.991f, 10.058f, 12.069f, 10.049f, 12.146f)
                curveTo(10.039f, 12.233f, 10.013f, 12.319f, 9.962f, 12.49f)
                close()
            }
        }.build()

        return _SendAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _SendAlt2: ImageVector? = null
