package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BackwardFast: ImageVector
    get() {
        if (_BackwardFast != null) {
            return _BackwardFast!!
        }
        _BackwardFast = ImageVector.Builder(
            name = "BackwardFast",
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
                moveTo(3f, 5f)
                verticalLineTo(19f)
                moveTo(12f, 7.329f)
                verticalLineTo(16.671f)
                curveTo(12f, 17.737f, 12f, 18.27f, 11.781f, 18.543f)
                curveTo(11.592f, 18.781f, 11.304f, 18.92f, 10.999f, 18.919f)
                curveTo(10.649f, 18.919f, 10.233f, 18.586f, 9.4f, 17.92f)
                lineTo(5.123f, 14.499f)
                curveTo(4.056f, 13.645f, 3.522f, 13.218f, 3.329f, 12.702f)
                curveTo(3.159f, 12.249f, 3.159f, 11.751f, 3.329f, 11.298f)
                curveTo(3.522f, 10.782f, 4.056f, 10.355f, 5.123f, 9.501f)
                lineTo(9.4f, 6.08f)
                curveTo(10.233f, 5.414f, 10.649f, 5.081f, 10.999f, 5.081f)
                curveTo(11.304f, 5.08f, 11.592f, 5.219f, 11.781f, 5.457f)
                curveTo(12f, 5.73f, 12f, 6.263f, 12f, 7.329f)
                close()
                moveTo(21f, 7.329f)
                verticalLineTo(16.671f)
                curveTo(21f, 17.737f, 21f, 18.27f, 20.781f, 18.543f)
                curveTo(20.592f, 18.781f, 20.303f, 18.92f, 19.999f, 18.919f)
                curveTo(19.649f, 18.919f, 19.233f, 18.586f, 18.4f, 17.92f)
                lineTo(14.123f, 14.499f)
                curveTo(13.056f, 13.645f, 12.522f, 13.218f, 12.329f, 12.702f)
                curveTo(12.159f, 12.249f, 12.159f, 11.751f, 12.329f, 11.298f)
                curveTo(12.522f, 10.782f, 13.056f, 10.355f, 14.123f, 9.501f)
                lineTo(18.4f, 6.08f)
                curveTo(19.233f, 5.414f, 19.649f, 5.081f, 19.999f, 5.081f)
                curveTo(20.303f, 5.08f, 20.592f, 5.219f, 20.781f, 5.457f)
                curveTo(21f, 5.73f, 21f, 6.263f, 21f, 7.329f)
                close()
            }
        }.build()

        return _BackwardFast!!
    }

@Suppress("ObjectPropertyName")
private var _BackwardFast: ImageVector? = null
