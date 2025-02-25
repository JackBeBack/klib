package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.AtSign: ImageVector
    get() {
        if (_AtSign != null) {
            return _AtSign!!
        }
        _AtSign = ImageVector.Builder(
            name = "AtSign",
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
                moveTo(17.401f, 19.2f)
                curveTo(15.896f, 20.33f, 14.026f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                verticalLineTo(13.5f)
                curveTo(21f, 14.881f, 19.881f, 16f, 18.5f, 16f)
                curveTo(17.119f, 16f, 16f, 14.881f, 16f, 13.5f)
                verticalLineTo(8f)
                moveTo(16f, 12f)
                curveTo(16f, 14.209f, 14.209f, 16f, 12f, 16f)
                curveTo(9.791f, 16f, 8f, 14.209f, 8f, 12f)
                curveTo(8f, 9.791f, 9.791f, 8f, 12f, 8f)
                curveTo(14.209f, 8f, 16f, 9.791f, 16f, 12f)
                close()
            }
        }.build()

        return _AtSign!!
    }

@Suppress("ObjectPropertyName")
private var _AtSign: ImageVector? = null
