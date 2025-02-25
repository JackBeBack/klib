package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Snow: ImageVector
    get() {
        if (_Snow != null) {
            return _Snow!!
        }
        _Snow = ImageVector.Builder(
            name = "Snow",
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
                verticalLineTo(21f)
                moveTo(16f, 4f)
                lineTo(12f, 8f)
                lineTo(8.009f, 4f)
                moveTo(8.009f, 20f)
                lineTo(12f, 16f)
                lineTo(16f, 20f)
                moveTo(3f, 12f)
                horizontalLineTo(21f)
                moveTo(4f, 8f)
                lineTo(8.009f, 12f)
                lineTo(4f, 16f)
                moveTo(20f, 16f)
                lineTo(16f, 12f)
                lineTo(20f, 8f)
            }
        }.build()

        return _Snow!!
    }

@Suppress("ObjectPropertyName")
private var _Snow: ImageVector? = null
