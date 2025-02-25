package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CaretLeftToLine: ImageVector
    get() {
        if (_CaretLeftToLine != null) {
            return _CaretLeftToLine!!
        }
        _CaretLeftToLine = ImageVector.Builder(
            name = "CaretLeftToLine",
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
                moveTo(5f, 4f)
                verticalLineTo(20f)
                moveTo(19f, 7.329f)
                verticalLineTo(16.671f)
                curveTo(19f, 17.737f, 19f, 18.27f, 18.781f, 18.543f)
                curveTo(18.592f, 18.781f, 18.303f, 18.92f, 17.999f, 18.919f)
                curveTo(17.649f, 18.919f, 17.233f, 18.586f, 16.4f, 17.92f)
                lineTo(10.562f, 13.249f)
                curveTo(10.028f, 12.822f, 9.761f, 12.609f, 9.664f, 12.351f)
                curveTo(9.58f, 12.125f, 9.58f, 11.875f, 9.664f, 11.649f)
                curveTo(9.761f, 11.391f, 10.028f, 11.178f, 10.562f, 10.751f)
                lineTo(16.4f, 6.08f)
                curveTo(17.233f, 5.414f, 17.649f, 5.081f, 17.999f, 5.081f)
                curveTo(18.303f, 5.08f, 18.592f, 5.219f, 18.781f, 5.457f)
                curveTo(19f, 5.73f, 19f, 6.263f, 19f, 7.329f)
                close()
            }
        }.build()

        return _CaretLeftToLine!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLeftToLine: ImageVector? = null
