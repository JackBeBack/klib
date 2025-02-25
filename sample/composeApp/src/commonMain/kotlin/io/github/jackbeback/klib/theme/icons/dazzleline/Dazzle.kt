package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Dazzle: ImageVector
    get() {
        if (_Dazzle != null) {
            return _Dazzle!!
        }
        _Dazzle = ImageVector.Builder(
            name = "Dazzle",
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
                moveTo(12f, 18f)
                verticalLineTo(15.799f)
                horizontalLineTo(5f)
                lineTo(12f, 6f)
                verticalLineTo(8.269f)
                horizontalLineTo(19f)
                lineTo(12f, 18f)
                close()
            }
        }.build()

        return _Dazzle!!
    }

@Suppress("ObjectPropertyName")
private var _Dazzle: ImageVector? = null
