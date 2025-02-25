package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MailOpenAlt1: ImageVector
    get() {
        if (_MailOpenAlt1 != null) {
            return _MailOpenAlt1!!
        }
        _MailOpenAlt1 = ImageVector.Builder(
            name = "MailOpenAlt1",
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
                moveTo(6f, 12f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                moveTo(3.028f, 10f)
                lineTo(10.225f, 14.817f)
                curveTo(10.866f, 15.244f, 11.187f, 15.458f, 11.534f, 15.541f)
                curveTo(11.84f, 15.615f, 12.159f, 15.615f, 12.466f, 15.541f)
                curveTo(12.812f, 15.458f, 13.133f, 15.244f, 13.775f, 14.817f)
                lineTo(20.971f, 10f)
                moveTo(10.298f, 4.069f)
                lineTo(4.498f, 7.711f)
                curveTo(3.951f, 8.055f, 3.678f, 8.227f, 3.479f, 8.459f)
                curveTo(3.304f, 8.664f, 3.172f, 8.903f, 3.091f, 9.161f)
                curveTo(3f, 9.453f, 3f, 9.775f, 3f, 10.421f)
                verticalLineTo(16.8f)
                curveTo(3f, 17.92f, 3f, 18.48f, 3.218f, 18.908f)
                curveTo(3.41f, 19.284f, 3.716f, 19.59f, 4.092f, 19.782f)
                curveTo(4.52f, 20f, 5.08f, 20f, 6.2f, 20f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 20f, 19.48f, 20f, 19.908f, 19.782f)
                curveTo(20.284f, 19.59f, 20.59f, 19.284f, 20.782f, 18.908f)
                curveTo(21f, 18.48f, 21f, 17.92f, 21f, 16.8f)
                verticalLineTo(10.421f)
                curveTo(21f, 9.775f, 21f, 9.453f, 20.909f, 9.161f)
                curveTo(20.828f, 8.903f, 20.696f, 8.664f, 20.521f, 8.459f)
                curveTo(20.322f, 8.227f, 20.049f, 8.055f, 19.502f, 7.711f)
                lineTo(13.702f, 4.069f)
                curveTo(13.085f, 3.681f, 12.776f, 3.487f, 12.445f, 3.412f)
                curveTo(12.152f, 3.345f, 11.848f, 3.345f, 11.555f, 3.412f)
                curveTo(11.224f, 3.487f, 10.915f, 3.681f, 10.298f, 4.069f)
                close()
            }
        }.build()

        return _MailOpenAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _MailOpenAlt1: ImageVector? = null
