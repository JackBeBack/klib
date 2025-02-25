package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.WebcamSlash: ImageVector
    get() {
        if (_WebcamSlash != null) {
            return _WebcamSlash!!
        }
        _WebcamSlash = ImageVector.Builder(
            name = "WebcamSlash",
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
                moveTo(15.7f, 15.944f)
                curveTo(14.626f, 16.613f, 13.358f, 17f, 12f, 17f)
                curveTo(8.134f, 17f, 5f, 13.866f, 5f, 10f)
                curveTo(5f, 8.597f, 5.413f, 7.291f, 6.123f, 6.196f)
                moveTo(18.326f, 13f)
                curveTo(18.758f, 12.091f, 19f, 11.074f, 19f, 10f)
                curveTo(19f, 6.134f, 15.866f, 3f, 12f, 3f)
                curveTo(10.927f, 3f, 9.909f, 3.242f, 9f, 3.674f)
                moveTo(3f, 3f)
                lineTo(21f, 21f)
                moveTo(11.5f, 7.041f)
                curveTo(11.663f, 7.014f, 11.83f, 7f, 12f, 7f)
                curveTo(13.657f, 7f, 15f, 8.343f, 15f, 10f)
                curveTo(15f, 10.17f, 14.986f, 10.337f, 14.959f, 10.5f)
                moveTo(20f, 21f)
                horizontalLineTo(6.958f)
                curveTo(4.744f, 21f, 3.637f, 21f, 3.085f, 20.55f)
                curveTo(2.606f, 20.16f, 2.334f, 19.569f, 2.349f, 18.95f)
                curveTo(2.367f, 18.239f, 3.087f, 17.398f, 4.528f, 15.717f)
                lineTo(6f, 14f)
            }
        }.build()

        return _WebcamSlash!!
    }

@Suppress("ObjectPropertyName")
private var _WebcamSlash: ImageVector? = null
