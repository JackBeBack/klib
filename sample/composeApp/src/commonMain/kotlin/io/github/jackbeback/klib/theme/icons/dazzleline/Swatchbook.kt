package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Swatchbook: ImageVector
    get() {
        if (_Swatchbook != null) {
            return _Swatchbook!!
        }
        _Swatchbook = ImageVector.Builder(
            name = "Swatchbook",
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
                moveTo(8f, 21f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 21f, 19.48f, 21f, 19.908f, 20.782f)
                curveTo(20.284f, 20.59f, 20.59f, 20.284f, 20.782f, 19.908f)
                curveTo(21f, 19.48f, 21f, 18.92f, 21f, 17.8f)
                verticalLineTo(16.2f)
                curveTo(21f, 15.08f, 21f, 14.52f, 20.782f, 14.092f)
                curveTo(20.59f, 13.716f, 20.284f, 13.41f, 19.908f, 13.218f)
                curveTo(19.48f, 13f, 18.92f, 13f, 17.8f, 13f)
                horizontalLineTo(17.657f)
                moveTo(11f, 8.343f)
                lineTo(13.273f, 6.07f)
                curveTo(14.065f, 5.278f, 14.461f, 4.882f, 14.917f, 4.734f)
                curveTo(15.319f, 4.603f, 15.752f, 4.603f, 16.154f, 4.734f)
                curveTo(16.61f, 4.882f, 17.006f, 5.278f, 17.798f, 6.07f)
                lineTo(18.93f, 7.202f)
                curveTo(19.722f, 7.994f, 20.118f, 8.39f, 20.266f, 8.846f)
                curveTo(20.397f, 9.248f, 20.397f, 9.681f, 20.266f, 10.083f)
                curveTo(20.118f, 10.539f, 19.722f, 10.935f, 18.93f, 11.727f)
                lineTo(17.657f, 13f)
                moveTo(11f, 8.343f)
                verticalLineTo(6.2f)
                curveTo(11f, 5.08f, 11f, 4.52f, 10.782f, 4.092f)
                curveTo(10.59f, 3.716f, 10.284f, 3.41f, 9.908f, 3.218f)
                curveTo(9.48f, 3f, 8.92f, 3f, 7.8f, 3f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 3f, 4.52f, 3f, 4.092f, 3.218f)
                curveTo(3.716f, 3.41f, 3.41f, 3.716f, 3.218f, 4.092f)
                curveTo(3f, 4.52f, 3f, 5.08f, 3f, 6.2f)
                verticalLineTo(17.8f)
                curveTo(3f, 18.92f, 3f, 19.48f, 3.218f, 19.908f)
                curveTo(3.41f, 20.284f, 3.716f, 20.59f, 4.092f, 20.782f)
                curveTo(4.52f, 21f, 5.08f, 21f, 6.2f, 21f)
                horizontalLineTo(7.8f)
                curveTo(8.92f, 21f, 9.48f, 21f, 9.908f, 20.782f)
                curveTo(10.284f, 20.59f, 10.59f, 20.284f, 10.782f, 19.908f)
                curveTo(10.793f, 19.887f, 10.803f, 19.866f, 10.812f, 19.844f)
                moveTo(11f, 8.343f)
                verticalLineTo(17.8f)
                curveTo(11f, 18.866f, 11f, 19.424f, 10.812f, 19.844f)
                moveTo(17.657f, 13f)
                lineTo(10.812f, 19.844f)
                moveTo(7f, 17f)
                horizontalLineTo(7.01f)
            }
        }.build()

        return _Swatchbook!!
    }

@Suppress("ObjectPropertyName")
private var _Swatchbook: ImageVector? = null
