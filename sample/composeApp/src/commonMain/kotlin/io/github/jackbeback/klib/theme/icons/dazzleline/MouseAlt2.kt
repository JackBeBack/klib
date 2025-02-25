package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MouseAlt2: ImageVector
    get() {
        if (_MouseAlt2 != null) {
            return _MouseAlt2!!
        }
        _MouseAlt2 = ImageVector.Builder(
            name = "MouseAlt2",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(12f, 7f)
                verticalLineTo(9f)
                moveTo(17.332f, 16.011f)
                lineTo(17.812f, 8.814f)
                curveTo(17.819f, 8.709f, 17.823f, 8.656f, 17.825f, 8.606f)
                curveTo(17.901f, 6.987f, 17.187f, 5.432f, 15.909f, 4.433f)
                curveTo(15.87f, 4.403f, 15.828f, 4.371f, 15.744f, 4.308f)
                curveTo(15.606f, 4.205f, 15.538f, 4.154f, 15.475f, 4.109f)
                curveTo(13.394f, 2.63f, 10.605f, 2.63f, 8.524f, 4.109f)
                curveTo(8.461f, 4.154f, 8.393f, 4.205f, 8.256f, 4.308f)
                curveTo(8.171f, 4.371f, 8.129f, 4.403f, 8.09f, 4.433f)
                curveTo(6.813f, 5.432f, 6.099f, 6.987f, 6.174f, 8.606f)
                curveTo(6.177f, 8.656f, 6.18f, 8.709f, 6.187f, 8.814f)
                lineTo(6.667f, 16.011f)
                curveTo(6.854f, 18.819f, 9.186f, 21f, 12f, 21f)
                curveTo(14.813f, 21f, 17.145f, 18.819f, 17.332f, 16.011f)
                close()
            }
        }.build()

        return _MouseAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _MouseAlt2: ImageVector? = null
