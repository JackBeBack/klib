package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SortDown: ImageVector
    get() {
        if (_SortDown != null) {
            return _SortDown!!
        }
        _SortDown = ImageVector.Builder(
            name = "SortDown",
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
                moveTo(16.069f, 15f)
                horizontalLineTo(7.931f)
                curveTo(7.325f, 15f, 7.023f, 15f, 6.882f, 15.12f)
                curveTo(6.761f, 15.224f, 6.696f, 15.38f, 6.709f, 15.539f)
                curveTo(6.723f, 15.723f, 6.937f, 15.937f, 7.366f, 16.366f)
                lineTo(11.434f, 20.434f)
                curveTo(11.632f, 20.632f, 11.731f, 20.731f, 11.845f, 20.768f)
                curveTo(11.946f, 20.801f, 12.054f, 20.801f, 12.154f, 20.768f)
                curveTo(12.269f, 20.731f, 12.368f, 20.632f, 12.566f, 20.434f)
                lineTo(16.634f, 16.366f)
                curveTo(17.063f, 15.937f, 17.277f, 15.723f, 17.291f, 15.539f)
                curveTo(17.304f, 15.38f, 17.239f, 15.224f, 17.118f, 15.12f)
                curveTo(16.977f, 15f, 16.674f, 15f, 16.069f, 15f)
                close()
            }
        }.build()

        return _SortDown!!
    }

@Suppress("ObjectPropertyName")
private var _SortDown: ImageVector? = null
