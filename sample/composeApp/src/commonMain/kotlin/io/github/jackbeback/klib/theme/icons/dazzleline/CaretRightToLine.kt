package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CaretRightToLine: ImageVector
    get() {
        if (_CaretRightToLine != null) {
            return _CaretRightToLine!!
        }
        _CaretRightToLine = ImageVector.Builder(
            name = "CaretRightToLine",
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
                moveTo(19f, 20f)
                verticalLineTo(4f)
                moveTo(5f, 16.671f)
                verticalLineTo(7.329f)
                curveTo(5f, 6.263f, 5f, 5.73f, 5.218f, 5.457f)
                curveTo(5.408f, 5.219f, 5.697f, 5.08f, 6.001f, 5.081f)
                curveTo(6.351f, 5.081f, 6.767f, 5.414f, 7.6f, 6.08f)
                lineTo(13.438f, 10.751f)
                curveTo(13.972f, 11.178f, 14.239f, 11.391f, 14.336f, 11.649f)
                curveTo(14.42f, 11.875f, 14.42f, 12.125f, 14.336f, 12.351f)
                curveTo(14.239f, 12.609f, 13.972f, 12.822f, 13.438f, 13.249f)
                lineTo(7.6f, 17.92f)
                curveTo(6.767f, 18.586f, 6.351f, 18.919f, 6.001f, 18.919f)
                curveTo(5.697f, 18.92f, 5.408f, 18.781f, 5.218f, 18.543f)
                curveTo(5f, 18.27f, 5f, 17.737f, 5f, 16.671f)
                close()
            }
        }.build()

        return _CaretRightToLine!!
    }

@Suppress("ObjectPropertyName")
private var _CaretRightToLine: ImageVector? = null
