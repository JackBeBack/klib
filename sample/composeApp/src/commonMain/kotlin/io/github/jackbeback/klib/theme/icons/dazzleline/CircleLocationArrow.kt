package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CircleLocationArrow: ImageVector
    get() {
        if (_CircleLocationArrow != null) {
            return _CircleLocationArrow!!
        }
        _CircleLocationArrow = ImageVector.Builder(
            name = "CircleLocationArrow",
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
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.036f, 12.256f)
                curveTo(7.441f, 12.025f, 7.143f, 11.909f, 7.057f, 11.742f)
                curveTo(6.981f, 11.598f, 6.981f, 11.425f, 7.056f, 11.281f)
                curveTo(7.143f, 11.114f, 7.441f, 10.998f, 8.036f, 10.765f)
                lineTo(14.423f, 8.273f)
                curveTo(14.96f, 8.063f, 15.229f, 7.958f, 15.401f, 8.016f)
                curveTo(15.55f, 8.065f, 15.667f, 8.182f, 15.717f, 8.331f)
                curveTo(15.774f, 8.503f, 15.669f, 8.772f, 15.46f, 9.309f)
                lineTo(12.967f, 15.696f)
                curveTo(12.734f, 16.292f, 12.618f, 16.589f, 12.451f, 16.676f)
                curveTo(12.307f, 16.751f, 12.134f, 16.751f, 11.99f, 16.676f)
                curveTo(11.823f, 16.589f, 11.707f, 16.291f, 11.476f, 15.696f)
                lineTo(10.64f, 13.547f)
                curveTo(10.593f, 13.427f, 10.57f, 13.366f, 10.534f, 13.315f)
                curveTo(10.501f, 13.27f, 10.462f, 13.231f, 10.417f, 13.198f)
                curveTo(10.366f, 13.162f, 10.306f, 13.139f, 10.185f, 13.092f)
                lineTo(8.036f, 12.256f)
                close()
            }
        }.build()

        return _CircleLocationArrow!!
    }

@Suppress("ObjectPropertyName")
private var _CircleLocationArrow: ImageVector? = null
