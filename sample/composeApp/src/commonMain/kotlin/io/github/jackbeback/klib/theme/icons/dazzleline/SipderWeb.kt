package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SipderWeb: ImageVector
    get() {
        if (_SipderWeb != null) {
            return _SipderWeb!!
        }
        _SipderWeb = ImageVector.Builder(
            name = "SipderWeb",
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
                moveTo(2f, 12f)
                curveTo(2.316f, 12.276f, 2.473f, 12.414f, 2.623f, 12.553f)
                curveTo(4.739f, 14.517f, 6.197f, 17.087f, 6.796f, 19.91f)
                curveTo(6.838f, 20.11f, 6.876f, 20.317f, 6.951f, 20.729f)
                lineTo(7f, 21f)
                moveTo(2f, 12f)
                curveTo(2.316f, 11.724f, 2.473f, 11.586f, 2.623f, 11.447f)
                curveTo(4.739f, 9.483f, 6.197f, 6.913f, 6.796f, 4.09f)
                curveTo(6.838f, 3.89f, 6.876f, 3.683f, 6.951f, 3.271f)
                lineTo(7f, 3f)
                moveTo(2f, 12f)
                horizontalLineTo(22f)
                moveTo(7f, 3f)
                curveTo(10.21f, 4.284f, 13.79f, 4.284f, 17f, 3f)
                moveTo(7f, 3f)
                lineTo(17f, 21f)
                moveTo(17f, 3f)
                lineTo(17.049f, 3.271f)
                curveTo(17.124f, 3.683f, 17.162f, 3.89f, 17.204f, 4.09f)
                curveTo(17.803f, 6.913f, 19.261f, 9.483f, 21.377f, 11.447f)
                curveTo(21.527f, 11.586f, 21.684f, 11.724f, 22f, 12f)
                moveTo(17f, 3f)
                lineTo(7f, 21f)
                moveTo(22f, 12f)
                curveTo(21.684f, 12.276f, 21.527f, 12.414f, 21.377f, 12.553f)
                curveTo(19.261f, 14.517f, 17.803f, 17.087f, 17.204f, 19.91f)
                curveTo(17.162f, 20.11f, 17.124f, 20.317f, 17.049f, 20.729f)
                lineTo(17f, 21f)
                moveTo(17f, 21f)
                curveTo(13.79f, 19.716f, 10.21f, 19.716f, 7f, 21f)
                moveTo(7f, 12f)
                curveTo(8.073f, 13.289f, 8.902f, 14.763f, 9.448f, 16.349f)
                lineTo(9.5f, 16.5f)
                curveTo(11.15f, 16.17f, 12.85f, 16.17f, 14.5f, 16.5f)
                lineTo(14.552f, 16.349f)
                curveTo(15.098f, 14.763f, 15.927f, 13.289f, 17f, 12f)
                curveTo(15.927f, 10.711f, 15.098f, 9.237f, 14.552f, 7.651f)
                lineTo(14.5f, 7.5f)
                curveTo(12.85f, 7.83f, 11.15f, 7.83f, 9.5f, 7.5f)
                lineTo(9.448f, 7.651f)
                curveTo(8.902f, 9.237f, 8.073f, 10.711f, 7f, 12f)
                close()
            }
        }.build()

        return _SipderWeb!!
    }

@Suppress("ObjectPropertyName")
private var _SipderWeb: ImageVector? = null
