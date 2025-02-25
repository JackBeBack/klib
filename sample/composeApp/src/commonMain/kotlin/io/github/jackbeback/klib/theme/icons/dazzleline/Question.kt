package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Question: ImageVector
    get() {
        if (_Question != null) {
            return _Question!!
        }
        _Question = ImageVector.Builder(
            name = "Question",
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
                moveTo(12f, 19f)
                horizontalLineTo(12.01f)
                moveTo(8.217f, 7.697f)
                curveTo(8.758f, 6.128f, 10.247f, 5f, 12f, 5f)
                curveTo(14.209f, 5f, 16f, 6.791f, 16f, 9f)
                curveTo(16f, 10.656f, 14.993f, 12.078f, 13.558f, 12.685f)
                curveTo(12.817f, 12.999f, 12.447f, 13.156f, 12.317f, 13.277f)
                curveTo(12.163f, 13.421f, 12.134f, 13.465f, 12.061f, 13.663f)
                curveTo(12f, 13.83f, 12f, 14.087f, 12f, 14.6f)
                lineTo(12f, 16f)
            }
        }.build()

        return _Question!!
    }

@Suppress("ObjectPropertyName")
private var _Question: ImageVector? = null
