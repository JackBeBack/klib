package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CloudSnowAlt: ImageVector
    get() {
        if (_CloudSnowAlt != null) {
            return _CloudSnowAlt!!
        }
        _CloudSnowAlt = ImageVector.Builder(
            name = "CloudSnowAlt",
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
                moveTo(9.5f, 15f)
                horizontalLineTo(9.51f)
                moveTo(15.5f, 15f)
                horizontalLineTo(15.51f)
                moveTo(9.5f, 19f)
                horizontalLineTo(9.51f)
                moveTo(12.5f, 17f)
                horizontalLineTo(12.51f)
                moveTo(12.5f, 21f)
                horizontalLineTo(12.51f)
                moveTo(15.5f, 19f)
                horizontalLineTo(15.51f)
                moveTo(6f, 16.444f)
                curveTo(4.222f, 15.568f, 3f, 13.75f, 3f, 11.649f)
                curveTo(3f, 9.2f, 4.8f, 6.938f, 7.5f, 6.5f)
                curveTo(8.347f, 4.486f, 10.351f, 3f, 12.689f, 3f)
                curveTo(15.684f, 3f, 18.132f, 5.323f, 18.3f, 8.25f)
                curveTo(19.889f, 8.945f, 21f, 10.65f, 21f, 12.497f)
                curveTo(21f, 14.058f, 20.206f, 15.434f, 19f, 16.242f)
            }
        }.build()

        return _CloudSnowAlt!!
    }

@Suppress("ObjectPropertyName")
private var _CloudSnowAlt: ImageVector? = null
