package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SquarePhoneFlip: ImageVector
    get() {
        if (_SquarePhoneFlip != null) {
            return _SquarePhoneFlip!!
        }
        _SquarePhoneFlip = ImageVector.Builder(
            name = "SquarePhoneFlip",
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
                moveTo(15.275f, 12.352f)
                curveTo(15.935f, 11.153f, 16.3f, 9.729f, 16.3f, 8.149f)
                lineTo(14.991f, 7.822f)
                curveTo(14.642f, 7.734f, 14.282f, 7.918f, 14.149f, 8.252f)
                lineTo(13.576f, 9.684f)
                curveTo(13.481f, 9.921f, 13.519f, 10.191f, 13.676f, 10.392f)
                lineTo(15.275f, 12.352f)
                close()
                moveTo(15.275f, 12.352f)
                curveTo(14.539f, 13.689f, 13.435f, 14.746f, 12.059f, 15.428f)
                moveTo(12.059f, 15.428f)
                curveTo(10.923f, 15.992f, 9.602f, 16.3f, 8.148f, 16.3f)
                lineTo(7.821f, 14.991f)
                curveTo(7.734f, 14.642f, 7.918f, 14.283f, 8.252f, 14.149f)
                lineTo(9.626f, 13.599f)
                curveTo(9.893f, 13.492f, 10.198f, 13.555f, 10.402f, 13.759f)
                lineTo(12.059f, 15.428f)
                close()
                moveTo(7.199f, 3.999f)
                horizontalLineTo(16.799f)
                curveTo(17.919f, 3.999f, 18.479f, 3.999f, 18.907f, 4.217f)
                curveTo(19.283f, 4.409f, 19.589f, 4.715f, 19.781f, 5.091f)
                curveTo(19.999f, 5.519f, 19.999f, 6.079f, 19.999f, 7.199f)
                verticalLineTo(16.799f)
                curveTo(19.999f, 17.919f, 19.999f, 18.479f, 19.781f, 18.907f)
                curveTo(19.589f, 19.284f, 19.283f, 19.59f, 18.907f, 19.781f)
                curveTo(18.479f, 19.999f, 17.919f, 19.999f, 16.799f, 19.999f)
                horizontalLineTo(7.199f)
                curveTo(6.079f, 19.999f, 5.519f, 19.999f, 5.091f, 19.781f)
                curveTo(4.715f, 19.59f, 4.409f, 19.284f, 4.217f, 18.907f)
                curveTo(3.999f, 18.479f, 3.999f, 17.919f, 3.999f, 16.799f)
                verticalLineTo(7.199f)
                curveTo(3.999f, 6.079f, 3.999f, 5.519f, 4.217f, 5.091f)
                curveTo(4.409f, 4.715f, 4.715f, 4.409f, 5.091f, 4.217f)
                curveTo(5.519f, 3.999f, 6.079f, 3.999f, 7.199f, 3.999f)
                close()
            }
        }.build()

        return _SquarePhoneFlip!!
    }

@Suppress("ObjectPropertyName")
private var _SquarePhoneFlip: ImageVector? = null
