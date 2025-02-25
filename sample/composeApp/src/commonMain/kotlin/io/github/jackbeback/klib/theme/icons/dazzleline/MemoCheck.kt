package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MemoCheck: ImageVector
    get() {
        if (_MemoCheck != null) {
            return _MemoCheck!!
        }
        _MemoCheck = ImageVector.Builder(
            name = "MemoCheck",
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
                moveTo(8f, 7f)
                horizontalLineTo(12f)
                moveTo(15f, 15f)
                horizontalLineTo(16f)
                moveTo(8f, 11f)
                horizontalLineTo(16f)
                moveTo(8f, 16f)
                lineTo(9f, 17f)
                lineTo(11f, 15f)
                moveTo(7.2f, 21f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 21f, 18.48f, 21f, 18.908f, 20.782f)
                curveTo(19.284f, 20.59f, 19.59f, 20.284f, 19.782f, 19.908f)
                curveTo(20f, 19.48f, 20f, 18.92f, 20f, 17.8f)
                verticalLineTo(6.2f)
                curveTo(20f, 5.08f, 20f, 4.52f, 19.782f, 4.092f)
                curveTo(19.59f, 3.716f, 19.284f, 3.41f, 18.908f, 3.218f)
                curveTo(18.48f, 3f, 17.92f, 3f, 16.8f, 3f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 3f, 5.52f, 3f, 5.092f, 3.218f)
                curveTo(4.716f, 3.41f, 4.41f, 3.716f, 4.218f, 4.092f)
                curveTo(4f, 4.52f, 4f, 5.08f, 4f, 6.2f)
                verticalLineTo(17.8f)
                curveTo(4f, 18.92f, 4f, 19.48f, 4.218f, 19.908f)
                curveTo(4.41f, 20.284f, 4.716f, 20.59f, 5.092f, 20.782f)
                curveTo(5.52f, 21f, 6.08f, 21f, 7.2f, 21f)
                close()
            }
        }.build()

        return _MemoCheck!!
    }

@Suppress("ObjectPropertyName")
private var _MemoCheck: ImageVector? = null
