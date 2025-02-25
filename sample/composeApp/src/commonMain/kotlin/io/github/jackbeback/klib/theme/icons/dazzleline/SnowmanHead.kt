package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SnowmanHead: ImageVector
    get() {
        if (_SnowmanHead != null) {
            return _SnowmanHead!!
        }
        _SnowmanHead = ImageVector.Builder(
            name = "SnowmanHead",
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
                moveTo(6.943f, 11.16f)
                curveTo(5.74f, 12.417f, 5f, 14.122f, 5f, 16f)
                curveTo(5f, 17.959f, 5.804f, 19.729f, 7.101f, 21f)
                horizontalLineTo(16.899f)
                curveTo(18.195f, 19.729f, 19f, 17.959f, 19f, 16f)
                curveTo(19f, 14.121f, 18.26f, 12.415f, 17.055f, 11.158f)
                moveTo(6f, 8f)
                verticalLineTo(4.6f)
                curveTo(6f, 4.04f, 6f, 3.76f, 6.109f, 3.546f)
                curveTo(6.205f, 3.358f, 6.358f, 3.205f, 6.546f, 3.109f)
                curveTo(6.76f, 3f, 7.04f, 3f, 7.6f, 3f)
                horizontalLineTo(16.4f)
                curveTo(16.96f, 3f, 17.24f, 3f, 17.454f, 3.109f)
                curveTo(17.642f, 3.205f, 17.795f, 3.358f, 17.891f, 3.546f)
                curveTo(18f, 3.76f, 18f, 4.04f, 18f, 4.6f)
                verticalLineTo(8f)
                moveTo(9f, 14f)
                horizontalLineTo(9.01f)
                moveTo(15f, 14f)
                horizontalLineTo(15.01f)
                moveTo(12f, 16f)
                verticalLineTo(17f)
                moveTo(4f, 8f)
                horizontalLineTo(20f)
                lineTo(19.729f, 8.812f)
                curveTo(19.467f, 9.599f, 19.336f, 9.992f, 19.093f, 10.283f)
                curveTo(18.878f, 10.54f, 18.602f, 10.739f, 18.291f, 10.861f)
                curveTo(17.938f, 11f, 17.523f, 11f, 16.694f, 11f)
                horizontalLineTo(7.306f)
                curveTo(6.477f, 11f, 6.062f, 11f, 5.71f, 10.861f)
                curveTo(5.398f, 10.739f, 5.122f, 10.54f, 4.907f, 10.283f)
                curveTo(4.664f, 9.992f, 4.533f, 9.599f, 4.271f, 8.812f)
                lineTo(4f, 8f)
                close()
            }
        }.build()

        return _SnowmanHead!!
    }

@Suppress("ObjectPropertyName")
private var _SnowmanHead: ImageVector? = null
