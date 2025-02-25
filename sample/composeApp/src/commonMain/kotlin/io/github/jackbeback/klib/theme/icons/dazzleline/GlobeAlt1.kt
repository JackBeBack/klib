package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GlobeAlt1: ImageVector
    get() {
        if (_GlobeAlt1 != null) {
            return _GlobeAlt1!!
        }
        _GlobeAlt1 = ImageVector.Builder(
            name = "GlobeAlt1",
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
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                moveTo(21f, 12f)
                curveTo(21f, 7.029f, 16.971f, 3f, 12f, 3f)
                moveTo(21f, 12f)
                curveTo(21f, 13.657f, 16.971f, 15f, 12f, 15f)
                curveTo(7.029f, 15f, 3f, 13.657f, 3f, 12f)
                moveTo(21f, 12f)
                curveTo(21f, 10.343f, 16.971f, 9f, 12f, 9f)
                curveTo(7.029f, 9f, 3f, 10.343f, 3f, 12f)
                moveTo(12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                moveTo(12f, 21f)
                curveTo(10.343f, 21f, 9f, 16.971f, 9f, 12f)
                curveTo(9f, 7.029f, 10.343f, 3f, 12f, 3f)
                moveTo(12f, 21f)
                curveTo(13.657f, 21f, 15f, 16.971f, 15f, 12f)
                curveTo(15f, 7.029f, 13.657f, 3f, 12f, 3f)
                moveTo(3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
            }
        }.build()

        return _GlobeAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _GlobeAlt1: ImageVector? = null
