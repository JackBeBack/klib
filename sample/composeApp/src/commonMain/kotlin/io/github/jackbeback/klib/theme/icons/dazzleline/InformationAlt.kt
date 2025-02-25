package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.InformationAlt: ImageVector
    get() {
        if (_InformationAlt != null) {
            return _InformationAlt!!
        }
        _InformationAlt = ImageVector.Builder(
            name = "InformationAlt",
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
                moveTo(12f, 4f)
                horizontalLineTo(12.01f)
                moveTo(12.01f, 10f)
                lineTo(12f, 20f)
            }
        }.build()

        return _InformationAlt!!
    }

@Suppress("ObjectPropertyName")
private var _InformationAlt: ImageVector? = null
