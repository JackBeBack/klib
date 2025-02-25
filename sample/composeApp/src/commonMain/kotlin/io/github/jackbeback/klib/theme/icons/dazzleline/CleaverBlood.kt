package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CleaverBlood: ImageVector
    get() {
        if (_CleaverBlood != null) {
            return _CleaverBlood!!
        }
        _CleaverBlood = ImageVector.Builder(
            name = "CleaverBlood",
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
                moveTo(7.757f, 12f)
                lineTo(9.878f, 14.121f)
                moveTo(7.757f, 12f)
                lineTo(3.432f, 16.325f)
                curveTo(2.846f, 16.911f, 2.846f, 17.861f, 3.432f, 18.447f)
                curveTo(4.017f, 19.032f, 4.967f, 19.032f, 5.553f, 18.447f)
                lineTo(9.878f, 14.121f)
                moveTo(7.757f, 12f)
                lineTo(16.765f, 2.992f)
                lineTo(21.007f, 7.234f)
                moveTo(9.878f, 14.121f)
                lineTo(11.379f, 12.62f)
                lineTo(13.5f, 14.741f)
                lineTo(21.007f, 7.234f)
                moveTo(21.007f, 7.234f)
                lineTo(21f, 19.75f)
                curveTo(20.999f, 20.441f, 20.44f, 21f, 19.749f, 21f)
                curveTo(19.059f, 21f, 18.499f, 20.44f, 18.499f, 19.75f)
                verticalLineTo(18.705f)
                curveTo(18.499f, 18.014f, 17.939f, 17.455f, 17.249f, 17.455f)
                curveTo(16.559f, 17.455f, 15.999f, 18.014f, 15.999f, 18.705f)
                verticalLineTo(19.5f)
                curveTo(15.999f, 20.328f, 15.328f, 21f, 14.499f, 21f)
                curveTo(13.671f, 21f, 12.999f, 20.328f, 12.999f, 19.5f)
                verticalLineTo(14.24f)
            }
        }.build()

        return _CleaverBlood!!
    }

@Suppress("ObjectPropertyName")
private var _CleaverBlood: ImageVector? = null
