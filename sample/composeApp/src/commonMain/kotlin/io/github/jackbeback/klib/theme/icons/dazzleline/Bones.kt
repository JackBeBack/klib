package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Bones: ImageVector
    get() {
        if (_Bones != null) {
            return _Bones!!
        }
        _Bones = ImageVector.Builder(
            name = "Bones",
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
                moveTo(11.999f, 9.453f)
                lineTo(9.462f, 6.916f)
                curveTo(9.915f, 6.504f, 10.2f, 5.91f, 10.2f, 5.25f)
                curveTo(10.2f, 4.007f, 9.193f, 3f, 7.95f, 3f)
                curveTo(6.707f, 3f, 5.7f, 4.007f, 5.7f, 5.25f)
                curveTo(5.7f, 5.425f, 5.72f, 5.594f, 5.757f, 5.757f)
                curveTo(5.594f, 5.72f, 5.425f, 5.7f, 5.25f, 5.7f)
                curveTo(4.007f, 5.7f, 3f, 6.707f, 3f, 7.95f)
                curveTo(3f, 9.193f, 4.007f, 10.2f, 5.25f, 10.2f)
                curveTo(5.91f, 10.2f, 6.503f, 9.916f, 6.915f, 9.463f)
                lineTo(9.452f, 12f)
                moveTo(14.546f, 12f)
                lineTo(17.084f, 14.537f)
                curveTo(17.496f, 14.084f, 18.09f, 13.8f, 18.75f, 13.8f)
                curveTo(19.993f, 13.8f, 21f, 14.807f, 21f, 16.05f)
                curveTo(21f, 17.293f, 19.993f, 18.3f, 18.75f, 18.3f)
                curveTo(18.576f, 18.3f, 18.406f, 18.28f, 18.243f, 18.243f)
                curveTo(18.28f, 18.406f, 18.3f, 18.576f, 18.3f, 18.75f)
                curveTo(18.3f, 19.993f, 17.293f, 21f, 16.05f, 21f)
                curveTo(14.807f, 21f, 13.8f, 19.993f, 13.8f, 18.75f)
                curveTo(13.8f, 18.09f, 14.084f, 17.496f, 14.537f, 17.084f)
                lineTo(12.004f, 14.542f)
                moveTo(14.536f, 6.916f)
                lineTo(6.915f, 14.537f)
                curveTo(6.503f, 14.084f, 5.91f, 13.8f, 5.25f, 13.8f)
                curveTo(4.007f, 13.8f, 3f, 14.807f, 3f, 16.05f)
                curveTo(3f, 17.293f, 4.007f, 18.3f, 5.25f, 18.3f)
                curveTo(5.425f, 18.3f, 5.594f, 18.28f, 5.757f, 18.243f)
                curveTo(5.72f, 18.406f, 5.7f, 18.576f, 5.7f, 18.75f)
                curveTo(5.7f, 19.993f, 6.707f, 21f, 7.95f, 21f)
                curveTo(9.193f, 21f, 10.2f, 19.993f, 10.2f, 18.75f)
                curveTo(10.2f, 18.09f, 9.915f, 17.496f, 9.462f, 17.084f)
                lineTo(17.084f, 9.463f)
                curveTo(17.495f, 9.916f, 18.09f, 10.2f, 18.75f, 10.2f)
                curveTo(19.993f, 10.2f, 21f, 9.193f, 21f, 7.95f)
                curveTo(21f, 6.707f, 19.993f, 5.7f, 18.75f, 5.7f)
                curveTo(18.576f, 5.7f, 18.406f, 5.72f, 18.243f, 5.757f)
                curveTo(18.28f, 5.594f, 18.3f, 5.425f, 18.3f, 5.25f)
                curveTo(18.3f, 4.007f, 17.293f, 3f, 16.05f, 3f)
                curveTo(14.807f, 3f, 13.8f, 4.007f, 13.8f, 5.25f)
                curveTo(13.8f, 5.91f, 14.084f, 6.504f, 14.536f, 6.916f)
                close()
            }
        }.build()

        return _Bones!!
    }

@Suppress("ObjectPropertyName")
private var _Bones: ImageVector? = null
