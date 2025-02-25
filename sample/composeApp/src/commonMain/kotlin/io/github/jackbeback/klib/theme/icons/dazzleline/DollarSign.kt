package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DollarSign: ImageVector
    get() {
        if (_DollarSign != null) {
            return _DollarSign!!
        }
        _DollarSign = ImageVector.Builder(
            name = "DollarSign",
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
                moveTo(18f, 8.5f)
                verticalLineTo(8.354f)
                curveTo(18f, 6.502f, 16.498f, 5f, 14.646f, 5f)
                horizontalLineTo(9.5f)
                curveTo(7.567f, 5f, 6f, 6.567f, 6f, 8.5f)
                curveTo(6f, 10.433f, 7.567f, 12f, 9.5f, 12f)
                horizontalLineTo(14.5f)
                curveTo(16.433f, 12f, 18f, 13.567f, 18f, 15.5f)
                curveTo(18f, 17.433f, 16.433f, 19f, 14.5f, 19f)
                horizontalLineTo(9.427f)
                curveTo(7.534f, 19f, 6f, 17.466f, 6f, 15.573f)
                verticalLineTo(15.5f)
                moveTo(12f, 3f)
                verticalLineTo(21f)
            }
        }.build()

        return _DollarSign!!
    }

@Suppress("ObjectPropertyName")
private var _DollarSign: ImageVector? = null
