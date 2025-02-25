package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CaretDown: ImageVector
    get() {
        if (_CaretDown != null) {
            return _CaretDown!!
        }
        _CaretDown = ImageVector.Builder(
            name = "CaretDown",
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
                moveTo(16.069f, 9f)
                horizontalLineTo(7.931f)
                curveTo(7.325f, 9f, 7.023f, 9f, 6.882f, 9.12f)
                curveTo(6.761f, 9.224f, 6.696f, 9.38f, 6.709f, 9.539f)
                curveTo(6.723f, 9.723f, 6.937f, 9.937f, 7.366f, 10.366f)
                lineTo(11.434f, 14.434f)
                curveTo(11.632f, 14.632f, 11.731f, 14.731f, 11.845f, 14.768f)
                curveTo(11.946f, 14.801f, 12.054f, 14.801f, 12.154f, 14.768f)
                curveTo(12.269f, 14.731f, 12.368f, 14.632f, 12.566f, 14.434f)
                lineTo(16.634f, 10.366f)
                curveTo(17.063f, 9.937f, 17.277f, 9.723f, 17.291f, 9.539f)
                curveTo(17.304f, 9.38f, 17.239f, 9.224f, 17.118f, 9.12f)
                curveTo(16.977f, 9f, 16.674f, 9f, 16.069f, 9f)
                close()
            }
        }.build()

        return _CaretDown!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDown: ImageVector? = null
