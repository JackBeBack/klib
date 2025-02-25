package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Loader: ImageVector
    get() {
        if (_Loader != null) {
            return _Loader!!
        }
        _Loader = ImageVector.Builder(
            name = "Loader",
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
                moveTo(12f, 3f)
                verticalLineTo(6f)
                moveTo(12f, 18f)
                verticalLineTo(21f)
                moveTo(6f, 12f)
                horizontalLineTo(3f)
                moveTo(21f, 12f)
                horizontalLineTo(18f)
                moveTo(5.637f, 5.637f)
                lineTo(7.76f, 7.76f)
                moveTo(16.242f, 16.242f)
                lineTo(18.363f, 18.363f)
                moveTo(18.365f, 5.635f)
                lineTo(16.244f, 7.756f)
                moveTo(7.758f, 16.242f)
                lineTo(5.635f, 18.365f)
            }
        }.build()

        return _Loader!!
    }

@Suppress("ObjectPropertyName")
private var _Loader: ImageVector? = null
