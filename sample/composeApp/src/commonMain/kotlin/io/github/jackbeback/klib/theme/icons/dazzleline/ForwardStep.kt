package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ForwardStep: ImageVector
    get() {
        if (_ForwardStep != null) {
            return _ForwardStep!!
        }
        _ForwardStep = ImageVector.Builder(
            name = "ForwardStep",
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
                moveTo(17f, 5f)
                verticalLineTo(19f)
                moveTo(7f, 7.329f)
                verticalLineTo(16.671f)
                curveTo(7f, 17.737f, 7f, 18.27f, 7.218f, 18.543f)
                curveTo(7.408f, 18.781f, 7.697f, 18.92f, 8.001f, 18.919f)
                curveTo(8.351f, 18.919f, 8.767f, 18.586f, 9.6f, 17.92f)
                lineTo(13.877f, 14.499f)
                curveTo(14.944f, 13.645f, 15.478f, 13.218f, 15.671f, 12.702f)
                curveTo(15.841f, 12.249f, 15.841f, 11.751f, 15.671f, 11.298f)
                curveTo(15.478f, 10.782f, 14.944f, 10.355f, 13.877f, 9.501f)
                lineTo(9.6f, 6.08f)
                curveTo(8.767f, 5.414f, 8.351f, 5.081f, 8.001f, 5.081f)
                curveTo(7.697f, 5.08f, 7.408f, 5.219f, 7.218f, 5.457f)
                curveTo(7f, 5.73f, 7f, 6.263f, 7f, 7.329f)
                close()
            }
        }.build()

        return _ForwardStep!!
    }

@Suppress("ObjectPropertyName")
private var _ForwardStep: ImageVector? = null
