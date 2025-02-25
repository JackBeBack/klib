package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Campground: ImageVector
    get() {
        if (_Campground != null) {
            return _Campground!!
        }
        _Campground = ImageVector.Builder(
            name = "Campground",
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
                moveTo(15f, 3f)
                lineTo(3f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                lineTo(9f, 3f)
                moveTo(12f, 15f)
                lineTo(16f, 21f)
                horizontalLineTo(8f)
                lineTo(12f, 15f)
                close()
            }
        }.build()

        return _Campground!!
    }

@Suppress("ObjectPropertyName")
private var _Campground: ImageVector? = null
