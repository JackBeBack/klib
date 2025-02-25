package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BackwardStep: ImageVector
    get() {
        if (_BackwardStep != null) {
            return _BackwardStep!!
        }
        _BackwardStep = ImageVector.Builder(
            name = "BackwardStep",
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
                moveTo(7f, 5f)
                verticalLineTo(19f)
                moveTo(17f, 7.329f)
                verticalLineTo(16.671f)
                curveTo(17f, 17.737f, 17f, 18.27f, 16.781f, 18.543f)
                curveTo(16.592f, 18.781f, 16.303f, 18.92f, 15.999f, 18.919f)
                curveTo(15.649f, 18.919f, 15.233f, 18.586f, 14.401f, 17.92f)
                lineTo(10.123f, 14.499f)
                curveTo(9.056f, 13.645f, 8.522f, 13.218f, 8.329f, 12.702f)
                curveTo(8.159f, 12.249f, 8.159f, 11.751f, 8.329f, 11.298f)
                curveTo(8.522f, 10.782f, 9.056f, 10.355f, 10.123f, 9.501f)
                lineTo(14.401f, 6.08f)
                curveTo(15.233f, 5.414f, 15.649f, 5.081f, 15.999f, 5.081f)
                curveTo(16.303f, 5.08f, 16.592f, 5.219f, 16.781f, 5.457f)
                curveTo(17f, 5.73f, 17f, 6.263f, 17f, 7.329f)
                close()
            }
        }.build()

        return _BackwardStep!!
    }

@Suppress("ObjectPropertyName")
private var _BackwardStep: ImageVector? = null
