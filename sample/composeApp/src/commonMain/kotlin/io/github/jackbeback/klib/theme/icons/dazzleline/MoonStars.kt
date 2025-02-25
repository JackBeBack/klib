package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MoonStars: ImageVector
    get() {
        if (_MoonStars != null) {
            return _MoonStars!!
        }
        _MoonStars = ImageVector.Builder(
            name = "MoonStars",
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
                moveTo(13f, 6f)
                verticalLineTo(3f)
                moveTo(18.5f, 12f)
                verticalLineTo(7f)
                moveTo(14.5f, 4.5f)
                horizontalLineTo(11.5f)
                moveTo(21f, 9.5f)
                horizontalLineTo(16f)
                moveTo(15.555f, 16.815f)
                curveTo(16.783f, 16.815f, 17.949f, 16.551f, 19f, 16.075f)
                curveTo(17.687f, 18.979f, 14.764f, 21f, 11.37f, 21f)
                curveTo(6.747f, 21f, 3f, 17.253f, 3f, 12.63f)
                curveTo(3f, 9.236f, 5.021f, 6.313f, 7.925f, 5f)
                curveTo(7.449f, 6.051f, 7.185f, 7.217f, 7.185f, 8.445f)
                curveTo(7.185f, 13.068f, 10.932f, 16.815f, 15.555f, 16.815f)
                close()
            }
        }.build()

        return _MoonStars!!
    }

@Suppress("ObjectPropertyName")
private var _MoonStars: ImageVector? = null
