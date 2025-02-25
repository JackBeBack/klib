package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Music: ImageVector
    get() {
        if (_Music != null) {
            return _Music!!
        }
        _Music = ImageVector.Builder(
            name = "Music",
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
                moveTo(9f, 19f)
                curveTo(9f, 20.105f, 7.657f, 21f, 6f, 21f)
                curveTo(4.343f, 21f, 3f, 20.105f, 3f, 19f)
                curveTo(3f, 17.895f, 4.343f, 17f, 6f, 17f)
                curveTo(7.657f, 17f, 9f, 17.895f, 9f, 19f)
                close()
                moveTo(9f, 19f)
                verticalLineTo(5f)
                lineTo(21f, 3f)
                verticalLineTo(17f)
                moveTo(21f, 17f)
                curveTo(21f, 18.105f, 19.657f, 19f, 18f, 19f)
                curveTo(16.343f, 19f, 15f, 18.105f, 15f, 17f)
                curveTo(15f, 15.895f, 16.343f, 15f, 18f, 15f)
                curveTo(19.657f, 15f, 21f, 15.895f, 21f, 17f)
                close()
                moveTo(9f, 9f)
                lineTo(21f, 7f)
            }
        }.build()

        return _Music!!
    }

@Suppress("ObjectPropertyName")
private var _Music: ImageVector? = null
