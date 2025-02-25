package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Bell: ImageVector
    get() {
        if (_Bell != null) {
            return _Bell!!
        }
        _Bell = ImageVector.Builder(
            name = "Bell",
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
                moveTo(9.002f, 17f)
                horizontalLineTo(5.606f)
                curveTo(4.348f, 17f, 3.719f, 17f, 3.586f, 16.902f)
                curveTo(3.438f, 16.792f, 3.401f, 16.728f, 3.385f, 16.544f)
                curveTo(3.371f, 16.38f, 3.756f, 15.749f, 4.528f, 14.487f)
                curveTo(5.324f, 13.184f, 6f, 11.286f, 6f, 8.6f)
                curveTo(6f, 7.115f, 6.632f, 5.69f, 7.758f, 4.64f)
                curveTo(8.883f, 3.59f, 10.409f, 3f, 12f, 3f)
                curveTo(13.592f, 3f, 15.118f, 3.59f, 16.243f, 4.64f)
                curveTo(17.368f, 5.69f, 18f, 7.115f, 18f, 8.6f)
                curveTo(18f, 11.286f, 18.677f, 13.184f, 19.473f, 14.487f)
                curveTo(20.244f, 15.749f, 20.63f, 16.38f, 20.615f, 16.544f)
                curveTo(20.599f, 16.728f, 20.563f, 16.792f, 20.414f, 16.902f)
                curveTo(20.282f, 17f, 19.653f, 17f, 18.394f, 17f)
                horizontalLineTo(15f)
                moveTo(9.002f, 17f)
                lineTo(9f, 18f)
                curveTo(9f, 19.657f, 10.344f, 21f, 12f, 21f)
                curveTo(13.657f, 21f, 15f, 19.657f, 15f, 18f)
                verticalLineTo(17f)
                moveTo(9.002f, 17f)
                horizontalLineTo(15f)
            }
        }.build()

        return _Bell!!
    }

@Suppress("ObjectPropertyName")
private var _Bell: ImageVector? = null
