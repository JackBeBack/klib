package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CaretLeft: ImageVector
    get() {
        if (_CaretLeft != null) {
            return _CaretLeft!!
        }
        _CaretLeft = ImageVector.Builder(
            name = "CaretLeft",
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
                moveTo(15f, 16.069f)
                verticalLineTo(7.931f)
                curveTo(15f, 7.325f, 15f, 7.023f, 14.88f, 6.882f)
                curveTo(14.776f, 6.761f, 14.62f, 6.696f, 14.461f, 6.709f)
                curveTo(14.277f, 6.723f, 14.063f, 6.937f, 13.634f, 7.366f)
                lineTo(9.566f, 11.434f)
                curveTo(9.368f, 11.632f, 9.269f, 11.731f, 9.231f, 11.845f)
                curveTo(9.199f, 11.946f, 9.199f, 12.054f, 9.231f, 12.154f)
                curveTo(9.269f, 12.269f, 9.368f, 12.368f, 9.566f, 12.566f)
                lineTo(13.634f, 16.634f)
                curveTo(14.063f, 17.063f, 14.277f, 17.277f, 14.461f, 17.291f)
                curveTo(14.62f, 17.304f, 14.776f, 17.239f, 14.88f, 17.118f)
                curveTo(15f, 16.977f, 15f, 16.674f, 15f, 16.069f)
                close()
            }
        }.build()

        return _CaretLeft!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLeft: ImageVector? = null
