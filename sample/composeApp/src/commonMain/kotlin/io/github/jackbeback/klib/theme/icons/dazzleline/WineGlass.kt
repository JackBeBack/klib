package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.WineGlass: ImageVector
    get() {
        if (_WineGlass != null) {
            return _WineGlass!!
        }
        _WineGlass = ImageVector.Builder(
            name = "WineGlass",
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
                moveTo(12f, 13f)
                verticalLineTo(21f)
                moveTo(12f, 13f)
                curveTo(15.314f, 13f, 18f, 10.314f, 18f, 7f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                curveTo(6f, 10.314f, 8.686f, 13f, 12f, 13f)
                close()
                moveTo(8f, 21f)
                horizontalLineTo(16f)
            }
        }.build()

        return _WineGlass!!
    }

@Suppress("ObjectPropertyName")
private var _WineGlass: ImageVector? = null
