package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Repeat: ImageVector
    get() {
        if (_Repeat != null) {
            return _Repeat!!
        }
        _Repeat = ImageVector.Builder(
            name = "Repeat",
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
                moveTo(14f, 7f)
                horizontalLineTo(15.999f)
                curveTo(19.313f, 7f, 21.999f, 9.686f, 21.999f, 13f)
                curveTo(21.999f, 16.314f, 19.313f, 19f, 15.999f, 19f)
                horizontalLineTo(8f)
                curveTo(4.686f, 19f, 2f, 16.314f, 2f, 13f)
                curveTo(2f, 9.686f, 4.686f, 7f, 8f, 7f)
                horizontalLineTo(10f)
                moveTo(7f, 4f)
                lineTo(10f, 7f)
                moveTo(10f, 7f)
                lineTo(7f, 10f)
            }
        }.build()

        return _Repeat!!
    }

@Suppress("ObjectPropertyName")
private var _Repeat: ImageVector? = null
