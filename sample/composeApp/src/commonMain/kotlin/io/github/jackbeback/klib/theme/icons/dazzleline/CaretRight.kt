package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CaretRight: ImageVector
    get() {
        if (_CaretRight != null) {
            return _CaretRight!!
        }
        _CaretRight = ImageVector.Builder(
            name = "CaretRight",
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
                moveTo(9f, 7.931f)
                verticalLineTo(16.069f)
                curveTo(9f, 16.674f, 9f, 16.977f, 9.12f, 17.118f)
                curveTo(9.224f, 17.239f, 9.38f, 17.304f, 9.539f, 17.291f)
                curveTo(9.723f, 17.277f, 9.937f, 17.063f, 10.366f, 16.634f)
                lineTo(14.434f, 12.566f)
                curveTo(14.632f, 12.368f, 14.731f, 12.269f, 14.768f, 12.154f)
                curveTo(14.801f, 12.054f, 14.801f, 11.946f, 14.768f, 11.845f)
                curveTo(14.731f, 11.731f, 14.632f, 11.632f, 14.434f, 11.434f)
                lineTo(10.366f, 7.366f)
                curveTo(9.937f, 6.937f, 9.723f, 6.723f, 9.539f, 6.709f)
                curveTo(9.38f, 6.696f, 9.224f, 6.761f, 9.12f, 6.882f)
                curveTo(9f, 7.023f, 9f, 7.325f, 9f, 7.931f)
                close()
            }
        }.build()

        return _CaretRight!!
    }

@Suppress("ObjectPropertyName")
private var _CaretRight: ImageVector? = null
