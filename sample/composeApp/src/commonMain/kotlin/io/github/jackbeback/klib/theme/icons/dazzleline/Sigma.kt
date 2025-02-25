package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Sigma: ImageVector
    get() {
        if (_Sigma != null) {
            return _Sigma!!
        }
        _Sigma = ImageVector.Builder(
            name = "Sigma",
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
                moveTo(19f, 6f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                lineTo(14f, 12f)
                lineTo(5f, 21f)
                horizontalLineTo(19f)
                verticalLineTo(18f)
            }
        }.build()

        return _Sigma!!
    }

@Suppress("ObjectPropertyName")
private var _Sigma: ImageVector? = null
