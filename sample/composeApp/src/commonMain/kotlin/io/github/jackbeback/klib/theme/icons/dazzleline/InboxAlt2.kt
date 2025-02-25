package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.InboxAlt2: ImageVector
    get() {
        if (_InboxAlt2 != null) {
            return _InboxAlt2!!
        }
        _InboxAlt2 = ImageVector.Builder(
            name = "InboxAlt2",
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
                moveTo(3f, 13f)
                horizontalLineTo(6.837f)
                curveTo(7.082f, 13f, 7.204f, 13f, 7.319f, 13.028f)
                curveTo(7.421f, 13.052f, 7.519f, 13.092f, 7.608f, 13.147f)
                curveTo(7.709f, 13.209f, 7.796f, 13.296f, 7.969f, 13.469f)
                lineTo(8.563f, 14.063f)
                curveTo(8.909f, 14.409f, 9.082f, 14.582f, 9.283f, 14.705f)
                curveTo(9.462f, 14.815f, 9.657f, 14.896f, 9.862f, 14.945f)
                curveTo(10.092f, 15f, 10.336f, 15f, 10.825f, 15f)
                horizontalLineTo(13.175f)
                curveTo(13.664f, 15f, 13.908f, 15f, 14.139f, 14.945f)
                curveTo(14.342f, 14.896f, 14.538f, 14.815f, 14.717f, 14.705f)
                curveTo(14.918f, 14.582f, 15.091f, 14.409f, 15.437f, 14.063f)
                lineTo(16.031f, 13.469f)
                curveTo(16.204f, 13.296f, 16.291f, 13.209f, 16.392f, 13.147f)
                curveTo(16.481f, 13.092f, 16.579f, 13.052f, 16.681f, 13.028f)
                curveTo(16.796f, 13f, 16.918f, 13f, 17.163f, 13f)
                horizontalLineTo(21f)
                moveTo(6.2f, 19f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 19f, 19.48f, 19f, 19.908f, 18.782f)
                curveTo(20.284f, 18.59f, 20.59f, 18.284f, 20.782f, 17.908f)
                curveTo(21f, 17.48f, 21f, 16.92f, 21f, 15.8f)
                verticalLineTo(8.2f)
                curveTo(21f, 7.08f, 21f, 6.52f, 20.782f, 6.092f)
                curveTo(20.59f, 5.716f, 20.284f, 5.41f, 19.908f, 5.218f)
                curveTo(19.48f, 5f, 18.92f, 5f, 17.8f, 5f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 5f, 4.52f, 5f, 4.092f, 5.218f)
                curveTo(3.716f, 5.41f, 3.41f, 5.716f, 3.218f, 6.092f)
                curveTo(3f, 6.52f, 3f, 7.08f, 3f, 8.2f)
                verticalLineTo(15.8f)
                curveTo(3f, 16.92f, 3f, 17.48f, 3.218f, 17.908f)
                curveTo(3.41f, 18.284f, 3.716f, 18.59f, 4.092f, 18.782f)
                curveTo(4.52f, 19f, 5.08f, 19f, 6.2f, 19f)
                close()
            }
        }.build()

        return _InboxAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _InboxAlt2: ImageVector? = null
