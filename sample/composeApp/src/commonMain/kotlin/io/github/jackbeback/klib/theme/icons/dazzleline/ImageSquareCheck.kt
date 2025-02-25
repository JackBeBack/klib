package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ImageSquareCheck: ImageVector
    get() {
        if (_ImageSquareCheck != null) {
            return _ImageSquareCheck!!
        }
        _ImageSquareCheck = ImageVector.Builder(
            name = "ImageSquareCheck",
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
                moveTo(14.265f, 15.938f)
                lineTo(12.547f, 14.235f)
                curveTo(11.758f, 13.452f, 11.363f, 13.061f, 10.909f, 12.914f)
                curveTo(10.509f, 12.785f, 10.079f, 12.785f, 9.679f, 12.914f)
                curveTo(9.225f, 13.061f, 8.83f, 13.452f, 8.041f, 14.235f)
                lineTo(4.042f, 18.262f)
                moveTo(14.265f, 15.938f)
                lineTo(14.606f, 15.599f)
                curveTo(15.412f, 14.8f, 15.815f, 14.4f, 16.277f, 14.255f)
                curveTo(16.684f, 14.126f, 17.121f, 14.131f, 17.524f, 14.269f)
                curveTo(17.983f, 14.425f, 18.377f, 14.834f, 19.164f, 15.651f)
                lineTo(20f, 16.5f)
                moveTo(14.265f, 15.938f)
                lineTo(18.22f, 19.963f)
                moveTo(11f, 4f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 4f, 5.52f, 4f, 5.092f, 4.218f)
                curveTo(4.716f, 4.41f, 4.41f, 4.716f, 4.218f, 5.092f)
                curveTo(4f, 5.52f, 4f, 6.08f, 4f, 7.2f)
                verticalLineTo(16.8f)
                curveTo(4f, 17.447f, 4f, 17.907f, 4.042f, 18.262f)
                moveTo(4.042f, 18.262f)
                curveTo(4.073f, 18.523f, 4.126f, 18.727f, 4.218f, 18.908f)
                curveTo(4.41f, 19.284f, 4.716f, 19.59f, 5.092f, 19.782f)
                curveTo(5.52f, 20f, 6.08f, 20f, 7.2f, 20f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 20f, 18.48f, 20f, 18.908f, 19.782f)
                curveTo(19.284f, 19.59f, 19.59f, 19.284f, 19.782f, 18.908f)
                curveTo(20f, 18.48f, 20f, 17.92f, 20f, 16.8f)
                verticalLineTo(13f)
                moveTo(15f, 5.286f)
                lineTo(16.8f, 7f)
                lineTo(21f, 3f)
            }
        }.build()

        return _ImageSquareCheck!!
    }

@Suppress("ObjectPropertyName")
private var _ImageSquareCheck: ImageVector? = null
