package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.InboxAlt1: ImageVector
    get() {
        if (_InboxAlt1 != null) {
            return _InboxAlt1!!
        }
        _InboxAlt1 = ImageVector.Builder(
            name = "InboxAlt1",
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
                moveTo(3f, 12f)
                verticalLineTo(15.8f)
                curveTo(3f, 16.92f, 3f, 17.48f, 3.218f, 17.908f)
                curveTo(3.41f, 18.284f, 3.716f, 18.59f, 4.092f, 18.782f)
                curveTo(4.52f, 19f, 5.08f, 19f, 6.2f, 19f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 19f, 19.48f, 19f, 19.908f, 18.782f)
                curveTo(20.284f, 18.59f, 20.59f, 18.284f, 20.782f, 17.908f)
                curveTo(21f, 17.48f, 21f, 16.92f, 21f, 15.8f)
                verticalLineTo(12f)
                moveTo(3f, 12f)
                horizontalLineTo(6.675f)
                curveTo(7.164f, 12f, 7.408f, 12f, 7.638f, 12.055f)
                curveTo(7.843f, 12.104f, 8.038f, 12.185f, 8.217f, 12.295f)
                curveTo(8.418f, 12.418f, 8.591f, 12.591f, 8.937f, 12.937f)
                lineTo(9.063f, 13.063f)
                curveTo(9.409f, 13.409f, 9.582f, 13.582f, 9.783f, 13.705f)
                curveTo(9.962f, 13.815f, 10.158f, 13.896f, 10.361f, 13.945f)
                curveTo(10.592f, 14f, 10.836f, 14f, 11.325f, 14f)
                horizontalLineTo(12.675f)
                curveTo(13.164f, 14f, 13.408f, 14f, 13.639f, 13.945f)
                curveTo(13.842f, 13.896f, 14.038f, 13.815f, 14.217f, 13.705f)
                curveTo(14.418f, 13.582f, 14.591f, 13.409f, 14.937f, 13.063f)
                lineTo(15.063f, 12.937f)
                curveTo(15.409f, 12.591f, 15.582f, 12.418f, 15.783f, 12.295f)
                curveTo(15.962f, 12.185f, 16.157f, 12.104f, 16.361f, 12.055f)
                curveTo(16.592f, 12f, 16.836f, 12f, 17.326f, 12f)
                horizontalLineTo(21f)
                moveTo(3f, 12f)
                lineTo(5.326f, 6.83f)
                curveTo(5.788f, 5.806f, 6.018f, 5.293f, 6.38f, 4.918f)
                curveTo(6.7f, 4.586f, 7.093f, 4.332f, 7.527f, 4.176f)
                curveTo(8.018f, 4f, 8.58f, 4f, 9.704f, 4f)
                horizontalLineTo(14.296f)
                curveTo(15.42f, 4f, 15.982f, 4f, 16.473f, 4.176f)
                curveTo(16.907f, 4.332f, 17.3f, 4.586f, 17.62f, 4.918f)
                curveTo(17.982f, 5.293f, 18.212f, 5.806f, 18.674f, 6.83f)
                lineTo(21f, 12f)
            }
        }.build()

        return _InboxAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _InboxAlt1: ImageVector? = null
