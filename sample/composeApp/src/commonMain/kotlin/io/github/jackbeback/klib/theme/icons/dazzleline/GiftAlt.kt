package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GiftAlt: ImageVector
    get() {
        if (_GiftAlt != null) {
            return _GiftAlt!!
        }
        _GiftAlt = ImageVector.Builder(
            name = "GiftAlt",
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
                moveTo(12f, 8f)
                verticalLineTo(21f)
                moveTo(12f, 8f)
                horizontalLineTo(7.5f)
                curveTo(6.837f, 8f, 6.201f, 7.737f, 5.732f, 7.268f)
                curveTo(5.263f, 6.799f, 5f, 6.163f, 5f, 5.5f)
                curveTo(5f, 4.837f, 5.263f, 4.201f, 5.732f, 3.732f)
                curveTo(6.201f, 3.263f, 6.837f, 3f, 7.5f, 3f)
                curveTo(11f, 3f, 12f, 8f, 12f, 8f)
                close()
                moveTo(12f, 8f)
                horizontalLineTo(16.5f)
                curveTo(17.163f, 8f, 17.799f, 7.737f, 18.268f, 7.268f)
                curveTo(18.737f, 6.799f, 19f, 6.163f, 19f, 5.5f)
                curveTo(19f, 4.837f, 18.737f, 4.201f, 18.268f, 3.732f)
                curveTo(17.799f, 3.263f, 17.163f, 3f, 16.5f, 3f)
                curveTo(13f, 3f, 12f, 8f, 12f, 8f)
                close()
                moveTo(3f, 14f)
                horizontalLineTo(21f)
                moveTo(6.2f, 21f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 21f, 19.48f, 21f, 19.908f, 20.782f)
                curveTo(20.284f, 20.59f, 20.59f, 20.284f, 20.782f, 19.908f)
                curveTo(21f, 19.48f, 21f, 18.92f, 21f, 17.8f)
                verticalLineTo(11.2f)
                curveTo(21f, 10.08f, 21f, 9.52f, 20.782f, 9.092f)
                curveTo(20.59f, 8.716f, 20.284f, 8.41f, 19.908f, 8.218f)
                curveTo(19.48f, 8f, 18.92f, 8f, 17.8f, 8f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 8f, 4.52f, 8f, 4.092f, 8.218f)
                curveTo(3.716f, 8.41f, 3.41f, 8.716f, 3.218f, 9.092f)
                curveTo(3f, 9.52f, 3f, 10.08f, 3f, 11.2f)
                verticalLineTo(17.8f)
                curveTo(3f, 18.92f, 3f, 19.48f, 3.218f, 19.908f)
                curveTo(3.41f, 20.284f, 3.716f, 20.59f, 4.092f, 20.782f)
                curveTo(4.52f, 21f, 5.08f, 21f, 6.2f, 21f)
                close()
            }
        }.build()

        return _GiftAlt!!
    }

@Suppress("ObjectPropertyName")
private var _GiftAlt: ImageVector? = null
