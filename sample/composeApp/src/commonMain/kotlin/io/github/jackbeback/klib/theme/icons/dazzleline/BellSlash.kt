package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BellSlash: ImageVector
    get() {
        if (_BellSlash != null) {
            return _BellSlash!!
        }
        _BellSlash = ImageVector.Builder(
            name = "BellSlash",
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
                moveTo(3f, 3f)
                lineTo(21f, 21f)
                moveTo(9.377f, 3.563f)
                curveTo(10.187f, 3.196f, 11.083f, 3f, 12f, 3f)
                curveTo(13.591f, 3f, 15.117f, 3.59f, 16.243f, 4.64f)
                curveTo(17.368f, 5.69f, 18f, 7.115f, 18f, 8.6f)
                curveTo(18f, 10.357f, 18.289f, 11.776f, 18.712f, 12.912f)
                moveTo(17f, 17f)
                horizontalLineTo(15f)
                moveTo(6.453f, 6.465f)
                curveTo(6.157f, 7.135f, 6f, 7.86f, 6f, 8.6f)
                curveTo(6f, 11.286f, 5.324f, 13.184f, 4.527f, 14.487f)
                curveTo(3.756f, 15.749f, 3.371f, 16.38f, 3.385f, 16.544f)
                curveTo(3.401f, 16.728f, 3.437f, 16.792f, 3.586f, 16.902f)
                curveTo(3.718f, 17f, 4.348f, 17f, 5.606f, 17f)
                horizontalLineTo(9f)
                moveTo(9f, 17f)
                verticalLineTo(18f)
                curveTo(9f, 19.657f, 10.343f, 21f, 12f, 21f)
                curveTo(13.657f, 21f, 15f, 19.657f, 15f, 18f)
                verticalLineTo(17f)
                moveTo(9f, 17f)
                horizontalLineTo(15f)
            }
        }.build()

        return _BellSlash!!
    }

@Suppress("ObjectPropertyName")
private var _BellSlash: ImageVector? = null
