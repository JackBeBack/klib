package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Notdef: ImageVector
    get() {
        if (_Notdef != null) {
            return _Notdef!!
        }
        _Notdef = ImageVector.Builder(
            name = "Notdef",
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
                moveTo(18.49f, 3.666f)
                curveTo(18.327f, 3.483f, 18.129f, 3.331f, 17.908f, 3.218f)
                curveTo(17.48f, 3f, 16.92f, 3f, 15.8f, 3f)
                horizontalLineTo(8.2f)
                curveTo(7.08f, 3f, 6.52f, 3f, 6.092f, 3.218f)
                curveTo(5.871f, 3.331f, 5.673f, 3.483f, 5.51f, 3.666f)
                moveTo(18.49f, 3.666f)
                curveTo(18.605f, 3.794f, 18.703f, 3.937f, 18.782f, 4.092f)
                curveTo(19f, 4.52f, 19f, 5.08f, 19f, 6.2f)
                verticalLineTo(17.8f)
                curveTo(19f, 18.92f, 19f, 19.48f, 18.782f, 19.908f)
                curveTo(18.702f, 20.065f, 18.602f, 20.21f, 18.486f, 20.339f)
                moveTo(18.49f, 3.666f)
                lineTo(5.514f, 20.339f)
                moveTo(5.51f, 3.666f)
                curveTo(5.395f, 3.794f, 5.297f, 3.937f, 5.218f, 4.092f)
                curveTo(5f, 4.52f, 5f, 5.08f, 5f, 6.2f)
                verticalLineTo(17.8f)
                curveTo(5f, 18.92f, 5f, 19.48f, 5.218f, 19.908f)
                curveTo(5.298f, 20.065f, 5.398f, 20.21f, 5.514f, 20.339f)
                moveTo(5.51f, 3.666f)
                lineTo(18.486f, 20.339f)
                moveTo(5.514f, 20.339f)
                curveTo(5.677f, 20.52f, 5.873f, 20.67f, 6.092f, 20.782f)
                curveTo(6.52f, 21f, 7.08f, 21f, 8.2f, 21f)
                horizontalLineTo(15.8f)
                curveTo(16.92f, 21f, 17.48f, 21f, 17.908f, 20.782f)
                curveTo(18.127f, 20.67f, 18.323f, 20.52f, 18.486f, 20.339f)
            }
        }.build()

        return _Notdef!!
    }

@Suppress("ObjectPropertyName")
private var _Notdef: ImageVector? = null
