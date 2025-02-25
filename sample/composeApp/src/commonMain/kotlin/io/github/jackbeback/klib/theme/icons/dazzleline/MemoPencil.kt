package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MemoPencil: ImageVector
    get() {
        if (_MemoPencil != null) {
            return _MemoPencil!!
        }
        _MemoPencil = ImageVector.Builder(
            name = "MemoPencil",
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
                moveTo(7.2f, 21f)
                curveTo(6.08f, 21f, 5.52f, 21f, 5.092f, 20.782f)
                curveTo(4.716f, 20.59f, 4.41f, 20.284f, 4.218f, 19.908f)
                curveTo(4f, 19.48f, 4f, 18.92f, 4f, 17.8f)
                verticalLineTo(6.2f)
                curveTo(4f, 5.08f, 4f, 4.52f, 4.218f, 4.092f)
                curveTo(4.41f, 3.716f, 4.716f, 3.41f, 5.092f, 3.218f)
                curveTo(5.52f, 3f, 6.08f, 3f, 7.2f, 3f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 3f, 18.48f, 3f, 18.908f, 3.218f)
                curveTo(19.284f, 3.41f, 19.59f, 3.716f, 19.782f, 4.092f)
                curveTo(20f, 4.52f, 20f, 5.08f, 20f, 6.2f)
                verticalLineTo(7f)
                moveTo(8f, 7f)
                horizontalLineTo(14f)
                moveTo(8f, 15f)
                horizontalLineTo(9f)
                moveTo(8f, 11f)
                horizontalLineTo(12f)
                moveTo(11.195f, 20.895f)
                lineTo(12.51f, 20.635f)
                curveTo(13.22f, 20.494f, 13.574f, 20.424f, 13.905f, 20.295f)
                curveTo(14.199f, 20.181f, 14.478f, 20.032f, 14.736f, 19.852f)
                curveTo(15.028f, 19.649f, 15.284f, 19.393f, 15.795f, 18.882f)
                lineTo(20.943f, 13.733f)
                curveTo(21.631f, 13.046f, 21.631f, 11.932f, 20.943f, 11.244f)
                curveTo(20.256f, 10.557f, 19.142f, 10.557f, 18.455f, 11.244f)
                lineTo(13.218f, 16.481f)
                curveTo(12.739f, 16.96f, 12.499f, 17.2f, 12.306f, 17.471f)
                curveTo(12.134f, 17.712f, 11.99f, 17.972f, 11.875f, 18.245f)
                curveTo(11.746f, 18.552f, 11.669f, 18.882f, 11.514f, 19.542f)
                lineTo(11.195f, 20.895f)
                close()
            }
        }.build()

        return _MemoPencil!!
    }

@Suppress("ObjectPropertyName")
private var _MemoPencil: ImageVector? = null
