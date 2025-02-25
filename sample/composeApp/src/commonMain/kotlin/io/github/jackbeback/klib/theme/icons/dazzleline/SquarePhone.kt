package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SquarePhone: ImageVector
    get() {
        if (_SquarePhone != null) {
            return _SquarePhone!!
        }
        _SquarePhone = ImageVector.Builder(
            name = "SquarePhone",
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
                moveTo(8.825f, 12.352f)
                curveTo(8.164f, 11.153f, 7.8f, 9.729f, 7.8f, 8.149f)
                lineTo(9.109f, 7.821f)
                curveTo(9.458f, 7.734f, 9.817f, 7.918f, 9.951f, 8.252f)
                lineTo(10.524f, 9.683f)
                curveTo(10.618f, 9.921f, 10.58f, 10.191f, 10.423f, 10.392f)
                lineTo(8.825f, 12.352f)
                close()
                moveTo(8.825f, 12.352f)
                curveTo(9.561f, 13.689f, 10.665f, 14.745f, 12.041f, 15.428f)
                moveTo(12.041f, 15.428f)
                curveTo(13.177f, 15.991f, 14.498f, 16.3f, 15.951f, 16.3f)
                lineTo(16.278f, 14.991f)
                curveTo(16.365f, 14.642f, 16.181f, 14.282f, 15.848f, 14.149f)
                lineTo(14.473f, 13.599f)
                curveTo(14.206f, 13.492f, 13.901f, 13.555f, 13.698f, 13.758f)
                lineTo(12.041f, 15.428f)
                close()
                moveTo(7.199f, 3.999f)
                horizontalLineTo(16.799f)
                curveTo(17.919f, 3.999f, 18.479f, 3.999f, 18.907f, 4.217f)
                curveTo(19.283f, 4.409f, 19.589f, 4.715f, 19.781f, 5.091f)
                curveTo(19.999f, 5.519f, 19.999f, 6.079f, 19.999f, 7.199f)
                verticalLineTo(16.799f)
                curveTo(19.999f, 17.919f, 19.999f, 18.479f, 19.781f, 18.907f)
                curveTo(19.589f, 19.283f, 19.283f, 19.589f, 18.907f, 19.781f)
                curveTo(18.479f, 19.999f, 17.919f, 19.999f, 16.799f, 19.999f)
                horizontalLineTo(7.199f)
                curveTo(6.079f, 19.999f, 5.519f, 19.999f, 5.091f, 19.781f)
                curveTo(4.715f, 19.589f, 4.409f, 19.283f, 4.217f, 18.907f)
                curveTo(3.999f, 18.479f, 3.999f, 17.919f, 3.999f, 16.799f)
                verticalLineTo(7.199f)
                curveTo(3.999f, 6.079f, 3.999f, 5.519f, 4.217f, 5.091f)
                curveTo(4.409f, 4.715f, 4.715f, 4.409f, 5.091f, 4.217f)
                curveTo(5.519f, 3.999f, 6.079f, 3.999f, 7.199f, 3.999f)
                close()
            }
        }.build()

        return _SquarePhone!!
    }

@Suppress("ObjectPropertyName")
private var _SquarePhone: ImageVector? = null
