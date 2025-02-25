package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Backward: ImageVector
    get() {
        if (_Backward != null) {
            return _Backward!!
        }
        _Backward = ImageVector.Builder(
            name = "Backward",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.655f, 9.876f)
                curveTo(3.748f, 10.602f, 3.294f, 10.965f, 3.13f, 11.404f)
                curveTo(2.985f, 11.788f, 2.985f, 12.212f, 3.13f, 12.596f)
                curveTo(3.294f, 13.035f, 3.748f, 13.398f, 4.655f, 14.124f)
                lineTo(9.401f, 17.92f)
                curveTo(10.233f, 18.586f, 10.649f, 18.919f, 10.999f, 18.919f)
                curveTo(11.304f, 18.92f, 11.592f, 18.781f, 11.782f, 18.543f)
                curveTo(12f, 18.27f, 12f, 17.737f, 12f, 16.671f)
                verticalLineTo(7.329f)
                curveTo(12f, 6.263f, 12f, 5.73f, 11.782f, 5.457f)
                curveTo(11.592f, 5.219f, 11.304f, 5.08f, 10.999f, 5.081f)
                curveTo(10.649f, 5.081f, 10.233f, 5.414f, 9.401f, 6.08f)
                lineTo(4.655f, 9.876f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.124f, 9.501f)
                curveTo(13.056f, 10.355f, 12.522f, 10.782f, 12.329f, 11.298f)
                curveTo(12.159f, 11.751f, 12.159f, 12.249f, 12.329f, 12.701f)
                curveTo(12.522f, 13.217f, 13.056f, 13.645f, 14.124f, 14.499f)
                lineTo(18.401f, 17.92f)
                curveTo(19.233f, 18.586f, 19.649f, 18.919f, 19.999f, 18.919f)
                curveTo(20.304f, 18.92f, 20.592f, 18.781f, 20.782f, 18.543f)
                curveTo(21f, 18.27f, 21f, 17.737f, 21f, 16.671f)
                verticalLineTo(7.329f)
                curveTo(21f, 6.263f, 21f, 5.73f, 20.782f, 5.457f)
                curveTo(20.592f, 5.219f, 20.304f, 5.08f, 19.999f, 5.081f)
                curveTo(19.649f, 5.081f, 19.233f, 5.414f, 18.401f, 6.08f)
                lineTo(14.124f, 9.501f)
                close()
            }
        }.build()

        return _Backward!!
    }

@Suppress("ObjectPropertyName")
private var _Backward: ImageVector? = null
