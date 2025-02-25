package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SortUp: ImageVector
    get() {
        if (_SortUp != null) {
            return _SortUp!!
        }
        _SortUp = ImageVector.Builder(
            name = "SortUp",
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
                moveTo(7.931f, 9f)
                horizontalLineTo(16.069f)
                curveTo(16.674f, 9f, 16.977f, 9f, 17.118f, 8.88f)
                curveTo(17.239f, 8.776f, 17.304f, 8.62f, 17.291f, 8.461f)
                curveTo(17.277f, 8.277f, 17.063f, 8.063f, 16.634f, 7.634f)
                lineTo(12.566f, 3.566f)
                curveTo(12.368f, 3.368f, 12.269f, 3.269f, 12.154f, 3.232f)
                curveTo(12.054f, 3.199f, 11.946f, 3.199f, 11.845f, 3.232f)
                curveTo(11.731f, 3.269f, 11.632f, 3.368f, 11.434f, 3.566f)
                lineTo(7.366f, 7.634f)
                curveTo(6.937f, 8.063f, 6.723f, 8.277f, 6.709f, 8.461f)
                curveTo(6.696f, 8.62f, 6.761f, 8.776f, 6.882f, 8.88f)
                curveTo(7.023f, 9f, 7.325f, 9f, 7.931f, 9f)
                close()
            }
        }.build()

        return _SortUp!!
    }

@Suppress("ObjectPropertyName")
private var _SortUp: ImageVector? = null
