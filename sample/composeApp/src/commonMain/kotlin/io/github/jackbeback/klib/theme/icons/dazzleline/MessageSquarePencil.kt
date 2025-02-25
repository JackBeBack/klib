package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MessageSquarePencil: ImageVector
    get() {
        if (_MessageSquarePencil != null) {
            return _MessageSquarePencil!!
        }
        _MessageSquarePencil = ImageVector.Builder(
            name = "MessageSquarePencil",
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
                moveTo(3f, 7.2f)
                curveTo(3f, 6.08f, 3f, 5.52f, 3.218f, 5.092f)
                curveTo(3.41f, 4.716f, 3.716f, 4.41f, 4.092f, 4.218f)
                curveTo(4.52f, 4f, 5.08f, 4f, 6.2f, 4f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 4f, 19.48f, 4f, 19.908f, 4.218f)
                curveTo(20.284f, 4.41f, 20.59f, 4.716f, 20.782f, 5.092f)
                curveTo(21f, 5.52f, 21f, 6.08f, 21f, 7.2f)
                verticalLineTo(20f)
                lineTo(17.676f, 18.338f)
                curveTo(17.424f, 18.212f, 17.298f, 18.149f, 17.166f, 18.104f)
                curveTo(17.048f, 18.065f, 16.928f, 18.037f, 16.805f, 18.019f)
                curveTo(16.667f, 18f, 16.526f, 18f, 16.245f, 18f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 18f, 4.52f, 18f, 4.092f, 17.782f)
                curveTo(3.716f, 17.59f, 3.41f, 17.284f, 3.218f, 16.908f)
                curveTo(3f, 16.48f, 3f, 15.92f, 3f, 14.8f)
                verticalLineTo(7.2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.405f, 12.675f)
                curveTo(8.44f, 12.498f, 8.458f, 12.41f, 8.49f, 12.328f)
                curveTo(8.519f, 12.255f, 8.556f, 12.185f, 8.601f, 12.121f)
                curveTo(8.652f, 12.048f, 8.715f, 11.985f, 8.843f, 11.857f)
                lineTo(13f, 7.7f)
                curveTo(13.552f, 7.148f, 14.448f, 7.148f, 15f, 7.7f)
                curveTo(15.552f, 8.252f, 15.552f, 9.148f, 15f, 9.7f)
                lineTo(10.843f, 13.857f)
                curveTo(10.715f, 13.985f, 10.652f, 14.048f, 10.579f, 14.099f)
                curveTo(10.515f, 14.144f, 10.445f, 14.181f, 10.372f, 14.21f)
                curveTo(10.29f, 14.242f, 10.201f, 14.26f, 10.025f, 14.295f)
                lineTo(8f, 14.7f)
                lineTo(8.405f, 12.675f)
                close()
            }
        }.build()

        return _MessageSquarePencil!!
    }

@Suppress("ObjectPropertyName")
private var _MessageSquarePencil: ImageVector? = null
