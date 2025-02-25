package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Icicles: ImageVector
    get() {
        if (_Icicles != null) {
            return _Icicles!!
        }
        _Icicles = ImageVector.Builder(
            name = "Icicles",
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
                moveTo(16f, 4f)
                lineTo(18.5f, 20f)
                lineTo(21f, 4f)
                horizontalLineTo(16f)
                close()
                moveTo(16f, 4f)
                lineTo(12f, 4f)
                moveTo(16f, 4f)
                lineTo(14f, 11f)
                lineTo(12f, 4f)
                moveTo(12f, 4f)
                lineTo(8f, 4f)
                moveTo(12f, 4f)
                lineTo(10f, 14f)
                lineTo(8f, 4f)
                moveTo(8f, 4f)
                lineTo(3f, 4f)
                lineTo(5.5f, 11f)
                lineTo(8f, 4f)
                close()
            }
        }.build()

        return _Icicles!!
    }

@Suppress("ObjectPropertyName")
private var _Icicles: ImageVector? = null
