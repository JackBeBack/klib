package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Kerning: ImageVector
    get() {
        if (_Kerning != null) {
            return _Kerning!!
        }
        _Kerning = ImageVector.Builder(
            name = "Kerning",
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
                moveTo(2f, 7f)
                lineTo(6f, 17f)
                lineTo(10f, 7f)
                moveTo(14f, 17f)
                lineTo(18f, 7f)
                lineTo(22f, 17f)
                moveTo(14.8f, 15f)
                horizontalLineTo(21.2f)
                moveTo(8.5f, 21f)
                lineTo(15.5f, 3f)
            }
        }.build()

        return _Kerning!!
    }

@Suppress("ObjectPropertyName")
private var _Kerning: ImageVector? = null
