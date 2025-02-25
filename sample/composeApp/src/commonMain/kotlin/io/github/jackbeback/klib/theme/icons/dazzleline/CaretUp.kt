package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CaretUp: ImageVector
    get() {
        if (_CaretUp != null) {
            return _CaretUp!!
        }
        _CaretUp = ImageVector.Builder(
            name = "CaretUp",
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
                moveTo(7.931f, 15f)
                horizontalLineTo(16.069f)
                curveTo(16.674f, 15f, 16.977f, 15f, 17.118f, 14.88f)
                curveTo(17.239f, 14.776f, 17.304f, 14.62f, 17.291f, 14.461f)
                curveTo(17.277f, 14.277f, 17.063f, 14.063f, 16.634f, 13.634f)
                lineTo(12.566f, 9.566f)
                curveTo(12.368f, 9.368f, 12.269f, 9.269f, 12.154f, 9.231f)
                curveTo(12.054f, 9.199f, 11.946f, 9.199f, 11.845f, 9.231f)
                curveTo(11.731f, 9.269f, 11.632f, 9.368f, 11.434f, 9.566f)
                lineTo(7.366f, 13.634f)
                curveTo(6.937f, 14.063f, 6.723f, 14.277f, 6.709f, 14.461f)
                curveTo(6.696f, 14.62f, 6.761f, 14.776f, 6.882f, 14.88f)
                curveTo(7.023f, 15f, 7.325f, 15f, 7.931f, 15f)
                close()
            }
        }.build()

        return _CaretUp!!
    }

@Suppress("ObjectPropertyName")
private var _CaretUp: ImageVector? = null
