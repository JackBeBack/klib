package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Sunset: ImageVector
    get() {
        if (_Sunset != null) {
            return _Sunset!!
        }
        _Sunset = ImageVector.Builder(
            name = "Sunset",
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
                moveTo(6f, 12f)
                lineTo(5f, 11f)
                moveTo(18f, 12f)
                lineTo(19f, 11f)
                moveTo(3f, 18f)
                horizontalLineTo(21f)
                moveTo(5f, 21f)
                horizontalLineTo(19f)
                moveTo(7f, 18f)
                curveTo(7f, 15.239f, 9.239f, 13f, 12f, 13f)
                curveTo(14.761f, 13f, 17f, 15.239f, 17f, 18f)
                moveTo(12f, 3f)
                verticalLineTo(10f)
                moveTo(12f, 10f)
                lineTo(15f, 7f)
                moveTo(12f, 10f)
                lineTo(9f, 7f)
            }
        }.build()

        return _Sunset!!
    }

@Suppress("ObjectPropertyName")
private var _Sunset: ImageVector? = null
