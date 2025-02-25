package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FilmSlash: ImageVector
    get() {
        if (_FilmSlash != null) {
            return _FilmSlash!!
        }
        _FilmSlash = ImageVector.Builder(
            name = "FilmSlash",
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
                moveTo(7f, 7f)
                verticalLineTo(20f)
                moveTo(17f, 4f)
                verticalLineTo(12f)
                horizontalLineTo(21f)
                moveTo(17f, 17f)
                verticalLineTo(20f)
                moveTo(3f, 8f)
                horizontalLineTo(7f)
                moveTo(17f, 8f)
                horizontalLineTo(21f)
                moveTo(3f, 16f)
                horizontalLineTo(7f)
                moveTo(3f, 12f)
                horizontalLineTo(12f)
                moveTo(4.176f, 4.179f)
                curveTo(4.148f, 4.191f, 4.12f, 4.204f, 4.092f, 4.218f)
                curveTo(3.716f, 4.41f, 3.41f, 4.716f, 3.218f, 5.092f)
                curveTo(3f, 5.52f, 3f, 6.08f, 3f, 7.2f)
                verticalLineTo(16.8f)
                curveTo(3f, 17.92f, 3f, 18.48f, 3.218f, 18.908f)
                curveTo(3.41f, 19.284f, 3.716f, 19.59f, 4.092f, 19.782f)
                curveTo(4.52f, 20f, 5.08f, 20f, 6.2f, 20f)
                horizontalLineTo(17.8f)
                curveTo(18.844f, 20f, 19.401f, 20f, 19.819f, 19.824f)
                moveTo(9.601f, 4f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 4f, 19.48f, 4f, 19.908f, 4.218f)
                curveTo(20.284f, 4.41f, 20.59f, 4.716f, 20.782f, 5.092f)
                curveTo(21f, 5.52f, 21f, 6.08f, 21f, 7.2f)
                verticalLineTo(15.39f)
                moveTo(3f, 3f)
                lineTo(21f, 21f)
            }
        }.build()

        return _FilmSlash!!
    }

@Suppress("ObjectPropertyName")
private var _FilmSlash: ImageVector? = null
