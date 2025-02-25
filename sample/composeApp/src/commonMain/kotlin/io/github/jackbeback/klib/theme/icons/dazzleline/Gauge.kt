package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Gauge: ImageVector
    get() {
        if (_Gauge != null) {
            return _Gauge!!
        }
        _Gauge = ImageVector.Builder(
            name = "Gauge",
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
                moveTo(12f, 13f)
                curveTo(10.895f, 13f, 10f, 13.895f, 10f, 15f)
                curveTo(10f, 16.105f, 10.895f, 17f, 12f, 17f)
                curveTo(13.105f, 17f, 14f, 16.105f, 14f, 15f)
                curveTo(14f, 13.895f, 13.105f, 13f, 12f, 13f)
                close()
                moveTo(12f, 13f)
                verticalLineTo(6f)
                moveTo(8f, 8f)
                horizontalLineTo(8.01f)
                moveTo(16f, 8f)
                horizontalLineTo(16.01f)
                moveTo(18f, 12f)
                horizontalLineTo(18.01f)
                moveTo(6f, 12f)
                horizontalLineTo(6.01f)
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
            }
        }.build()

        return _Gauge!!
    }

@Suppress("ObjectPropertyName")
private var _Gauge: ImageVector? = null
