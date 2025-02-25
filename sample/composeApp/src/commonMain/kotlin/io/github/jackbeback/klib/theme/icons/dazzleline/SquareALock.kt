package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SquareALock: ImageVector
    get() {
        if (_SquareALock != null) {
            return _SquareALock!!
        }
        _SquareALock = ImageVector.Builder(
            name = "SquareALock",
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
                moveTo(20f, 10.999f)
                verticalLineTo(7.199f)
                curveTo(20f, 6.079f, 20f, 5.519f, 19.782f, 5.091f)
                curveTo(19.59f, 4.715f, 19.284f, 4.409f, 18.908f, 4.217f)
                curveTo(18.48f, 3.999f, 17.92f, 3.999f, 16.8f, 3.999f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 3.999f, 5.52f, 3.999f, 5.092f, 4.217f)
                curveTo(4.716f, 4.409f, 4.41f, 4.715f, 4.218f, 5.091f)
                curveTo(4f, 5.519f, 4f, 6.079f, 4f, 7.199f)
                verticalLineTo(16.799f)
                curveTo(4f, 17.919f, 4f, 18.479f, 4.218f, 18.907f)
                curveTo(4.41f, 19.284f, 4.716f, 19.59f, 5.092f, 19.781f)
                curveTo(5.52f, 19.999f, 6.08f, 19.999f, 7.2f, 19.999f)
                horizontalLineTo(11f)
                moveTo(9.121f, 13f)
                horizontalLineTo(14.882f)
                moveTo(8f, 16f)
                lineTo(10.271f, 9.755f)
                curveTo(10.804f, 8.29f, 11.07f, 7.557f, 11.46f, 7.35f)
                curveTo(11.798f, 7.17f, 12.202f, 7.17f, 12.54f, 7.35f)
                curveTo(12.93f, 7.557f, 13.196f, 8.29f, 13.729f, 9.755f)
                lineTo(14.909f, 13f)
                moveTo(20f, 18.004f)
                verticalLineTo(17f)
                curveTo(20f, 15.895f, 19.105f, 15f, 18f, 15f)
                curveTo(16.895f, 15f, 16f, 15.895f, 16f, 17f)
                verticalLineTo(18.004f)
                moveTo(16.5f, 21f)
                horizontalLineTo(19.5f)
                curveTo(19.966f, 21f, 20.199f, 21f, 20.383f, 20.924f)
                curveTo(20.628f, 20.822f, 20.822f, 20.628f, 20.924f, 20.383f)
                curveTo(21f, 20.199f, 21f, 19.966f, 21f, 19.5f)
                curveTo(21f, 19.034f, 21f, 18.801f, 20.924f, 18.617f)
                curveTo(20.822f, 18.372f, 20.628f, 18.177f, 20.383f, 18.076f)
                curveTo(20.199f, 18f, 19.966f, 18f, 19.5f, 18f)
                horizontalLineTo(16.5f)
                curveTo(16.034f, 18f, 15.801f, 18f, 15.617f, 18.076f)
                curveTo(15.372f, 18.177f, 15.178f, 18.372f, 15.076f, 18.617f)
                curveTo(15f, 18.801f, 15f, 19.034f, 15f, 19.5f)
                curveTo(15f, 19.966f, 15f, 20.199f, 15.076f, 20.383f)
                curveTo(15.178f, 20.628f, 15.372f, 20.822f, 15.617f, 20.924f)
                curveTo(15.801f, 21f, 16.034f, 21f, 16.5f, 21f)
                close()
            }
        }.build()

        return _SquareALock!!
    }

@Suppress("ObjectPropertyName")
private var _SquareALock: ImageVector? = null
