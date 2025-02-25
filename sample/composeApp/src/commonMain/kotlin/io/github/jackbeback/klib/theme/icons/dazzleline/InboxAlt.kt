package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.InboxAlt: ImageVector
    get() {
        if (_InboxAlt != null) {
            return _InboxAlt!!
        }
        _InboxAlt = ImageVector.Builder(
            name = "InboxAlt",
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
                moveTo(5f, 12f)
                verticalLineTo(7.2f)
                curveTo(5f, 6.08f, 5f, 5.52f, 5.218f, 5.092f)
                curveTo(5.41f, 4.716f, 5.716f, 4.41f, 6.092f, 4.218f)
                curveTo(6.52f, 4f, 7.08f, 4f, 8.2f, 4f)
                horizontalLineTo(15.8f)
                curveTo(16.92f, 4f, 17.48f, 4f, 17.908f, 4.218f)
                curveTo(18.284f, 4.41f, 18.59f, 4.716f, 18.782f, 5.092f)
                curveTo(19f, 5.52f, 19f, 6.08f, 19f, 7.2f)
                verticalLineTo(12f)
                moveTo(3f, 12f)
                verticalLineTo(16.8f)
                curveTo(3f, 17.92f, 3f, 18.48f, 3.218f, 18.908f)
                curveTo(3.41f, 19.284f, 3.716f, 19.59f, 4.092f, 19.782f)
                curveTo(4.52f, 20f, 5.08f, 20f, 6.2f, 20f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 20f, 19.48f, 20f, 19.908f, 19.782f)
                curveTo(20.284f, 19.59f, 20.59f, 19.284f, 20.782f, 18.908f)
                curveTo(21f, 18.48f, 21f, 17.92f, 21f, 16.8f)
                verticalLineTo(12f)
                horizontalLineTo(17.326f)
                curveTo(16.836f, 12f, 16.592f, 12f, 16.361f, 12.055f)
                curveTo(16.157f, 12.104f, 15.962f, 12.185f, 15.783f, 12.295f)
                curveTo(15.582f, 12.418f, 15.409f, 12.591f, 15.063f, 12.937f)
                lineTo(14.937f, 13.063f)
                curveTo(14.591f, 13.409f, 14.418f, 13.582f, 14.217f, 13.705f)
                curveTo(14.038f, 13.815f, 13.842f, 13.896f, 13.639f, 13.945f)
                curveTo(13.408f, 14f, 13.164f, 14f, 12.675f, 14f)
                horizontalLineTo(11.325f)
                curveTo(10.836f, 14f, 10.592f, 14f, 10.361f, 13.945f)
                curveTo(10.158f, 13.896f, 9.962f, 13.815f, 9.783f, 13.705f)
                curveTo(9.582f, 13.582f, 9.409f, 13.409f, 9.063f, 13.063f)
                lineTo(8.937f, 12.937f)
                curveTo(8.591f, 12.591f, 8.418f, 12.418f, 8.217f, 12.295f)
                curveTo(8.038f, 12.185f, 7.843f, 12.104f, 7.638f, 12.055f)
                curveTo(7.408f, 12f, 7.164f, 12f, 6.675f, 12f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _InboxAlt!!
    }

@Suppress("ObjectPropertyName")
private var _InboxAlt: ImageVector? = null
