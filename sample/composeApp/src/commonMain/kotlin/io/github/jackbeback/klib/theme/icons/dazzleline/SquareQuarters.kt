package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SquareQuarters: ImageVector
    get() {
        if (_SquareQuarters != null) {
            return _SquareQuarters!!
        }
        _SquareQuarters = ImageVector.Builder(
            name = "SquareQuarters",
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
                moveTo(4.586f, 4.586f)
                curveTo(4.733f, 4.438f, 4.904f, 4.314f, 5.092f, 4.218f)
                curveTo(5.52f, 4f, 6.08f, 4f, 7.2f, 4f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 4f, 18.48f, 4f, 18.908f, 4.218f)
                curveTo(19.096f, 4.314f, 19.267f, 4.438f, 19.414f, 4.586f)
                moveTo(4.586f, 4.586f)
                curveTo(4.438f, 4.733f, 4.314f, 4.904f, 4.218f, 5.092f)
                curveTo(4f, 5.52f, 4f, 6.08f, 4f, 7.2f)
                verticalLineTo(16.8f)
                curveTo(4f, 17.92f, 4f, 18.48f, 4.218f, 18.908f)
                curveTo(4.314f, 19.096f, 4.438f, 19.267f, 4.586f, 19.414f)
                moveTo(4.586f, 4.586f)
                lineTo(19.414f, 19.414f)
                moveTo(19.414f, 4.586f)
                curveTo(19.562f, 4.733f, 19.686f, 4.904f, 19.782f, 5.092f)
                curveTo(20f, 5.52f, 20f, 6.08f, 20f, 7.2f)
                verticalLineTo(16.8f)
                curveTo(20f, 17.92f, 20f, 18.48f, 19.782f, 18.908f)
                curveTo(19.686f, 19.096f, 19.562f, 19.267f, 19.414f, 19.414f)
                moveTo(19.414f, 4.586f)
                lineTo(4.586f, 19.414f)
                moveTo(4.586f, 19.414f)
                curveTo(4.733f, 19.562f, 4.904f, 19.686f, 5.092f, 19.782f)
                curveTo(5.52f, 20f, 6.08f, 20f, 7.2f, 20f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 20f, 18.48f, 20f, 18.908f, 19.782f)
                curveTo(19.096f, 19.686f, 19.267f, 19.562f, 19.414f, 19.414f)
            }
        }.build()

        return _SquareQuarters!!
    }

@Suppress("ObjectPropertyName")
private var _SquareQuarters: ImageVector? = null
