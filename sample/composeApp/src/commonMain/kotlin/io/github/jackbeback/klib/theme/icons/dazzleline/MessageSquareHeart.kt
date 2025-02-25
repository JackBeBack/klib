package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MessageSquareHeart: ImageVector
    get() {
        if (_MessageSquareHeart != null) {
            return _MessageSquareHeart!!
        }
        _MessageSquareHeart = ImageVector.Builder(
            name = "MessageSquareHeart",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.997f, 8.531f)
                curveTo(11.198f, 7.622f, 9.864f, 7.377f, 8.862f, 8.209f)
                curveTo(7.86f, 9.042f, 7.719f, 10.433f, 8.506f, 11.418f)
                curveTo(8.974f, 12.003f, 10.12f, 13.053f, 10.972f, 13.808f)
                curveTo(11.324f, 14.12f, 11.5f, 14.275f, 11.711f, 14.339f)
                curveTo(11.892f, 14.392f, 12.102f, 14.392f, 12.283f, 14.339f)
                curveTo(12.495f, 14.275f, 12.671f, 14.12f, 13.023f, 13.808f)
                curveTo(13.875f, 13.053f, 15.021f, 12.003f, 15.489f, 11.418f)
                curveTo(16.276f, 10.433f, 16.152f, 9.033f, 15.133f, 8.209f)
                curveTo(14.113f, 7.386f, 12.797f, 7.622f, 11.997f, 8.531f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
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
        }.build()

        return _MessageSquareHeart!!
    }

@Suppress("ObjectPropertyName")
private var _MessageSquareHeart: ImageVector? = null
