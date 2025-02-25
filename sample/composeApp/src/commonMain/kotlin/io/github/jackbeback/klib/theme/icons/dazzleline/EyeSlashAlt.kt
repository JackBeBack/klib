package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.EyeSlashAlt: ImageVector
    get() {
        if (_EyeSlashAlt != null) {
            return _EyeSlashAlt!!
        }
        _EyeSlashAlt = ImageVector.Builder(
            name = "EyeSlashAlt",
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
                moveTo(9.61f, 9.607f)
                curveTo(8.055f, 10.455f, 7f, 12.104f, 7f, 14f)
                curveTo(7f, 16.761f, 9.239f, 19f, 12f, 19f)
                curveTo(13.897f, 19f, 15.547f, 17.944f, 16.394f, 16.388f)
                moveTo(21f, 14f)
                curveTo(21f, 9.029f, 16.971f, 5f, 12f, 5f)
                curveTo(11.558f, 5f, 11.124f, 5.032f, 10.699f, 5.093f)
                moveTo(3f, 14f)
                curveTo(3f, 11.007f, 4.461f, 8.355f, 6.709f, 6.719f)
                moveTo(3f, 3f)
                lineTo(21f, 21f)
            }
        }.build()

        return _EyeSlashAlt!!
    }

@Suppress("ObjectPropertyName")
private var _EyeSlashAlt: ImageVector? = null
