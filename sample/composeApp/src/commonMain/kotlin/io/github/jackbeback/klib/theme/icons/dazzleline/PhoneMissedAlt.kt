package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PhoneMissedAlt: ImageVector
    get() {
        if (_PhoneMissedAlt != null) {
            return _PhoneMissedAlt!!
        }
        _PhoneMissedAlt = ImageVector.Builder(
            name = "PhoneMissedAlt",
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
                moveTo(20f, 4f)
                lineTo(16.215f, 7.312f)
                curveTo(14.722f, 8.619f, 13.975f, 9.272f, 13.135f, 9.521f)
                curveTo(12.394f, 9.74f, 11.606f, 9.74f, 10.866f, 9.521f)
                curveTo(10.026f, 9.272f, 9.279f, 8.619f, 7.786f, 7.312f)
                lineTo(4f, 4f)
                moveTo(4f, 4f)
                horizontalLineTo(8f)
                moveTo(4f, 4f)
                verticalLineTo(8f)
                moveTo(15.24f, 14.554f)
                lineTo(15.713f, 18.011f)
                curveTo(15.778f, 18.508f, 15.811f, 18.757f, 15.913f, 18.97f)
                curveTo(16.003f, 19.159f, 16.131f, 19.327f, 16.29f, 19.463f)
                curveTo(16.469f, 19.617f, 16.7f, 19.714f, 17.163f, 19.908f)
                lineTo(17.863f, 20.202f)
                curveTo(18.548f, 20.49f, 18.89f, 20.633f, 19.218f, 20.623f)
                curveTo(19.507f, 20.613f, 19.787f, 20.52f, 20.024f, 20.355f)
                curveTo(20.293f, 20.168f, 20.482f, 19.848f, 20.859f, 19.209f)
                lineTo(21.441f, 18.223f)
                curveTo(15.844f, 12.709f, 8.066f, 12.766f, 2.552f, 18.363f)
                lineTo(3.148f, 19.34f)
                curveTo(3.535f, 19.974f, 3.728f, 20.291f, 4f, 20.474f)
                curveTo(4.24f, 20.635f, 4.521f, 20.724f, 4.81f, 20.729f)
                curveTo(5.138f, 20.735f, 5.478f, 20.586f, 6.158f, 20.289f)
                lineTo(6.666f, 20.067f)
                curveTo(7.19f, 19.838f, 7.452f, 19.723f, 7.644f, 19.54f)
                curveTo(7.813f, 19.378f, 7.943f, 19.179f, 8.021f, 18.959f)
                curveTo(8.11f, 18.709f, 8.108f, 18.423f, 8.104f, 17.851f)
                lineTo(8.068f, 14.801f)
            }
        }.build()

        return _PhoneMissedAlt!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneMissedAlt: ImageVector? = null
