package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ClapperboardPlay: ImageVector
    get() {
        if (_ClapperboardPlay != null) {
            return _ClapperboardPlay!!
        }
        _ClapperboardPlay = ImageVector.Builder(
            name = "ClapperboardPlay",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 9f)
                horizontalLineTo(9.5f)
                moveTo(21f, 9f)
                horizontalLineTo(9.5f)
                moveTo(9.5f, 9f)
                lineTo(14.5f, 4f)
                moveTo(14.5f, 4f)
                horizontalLineTo(17.8f)
                curveTo(18.847f, 4f, 19.404f, 4f, 19.822f, 4.178f)
                moveTo(14.5f, 4f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 4f, 4.52f, 4f, 4.092f, 4.218f)
                curveTo(3.716f, 4.41f, 3.41f, 4.716f, 3.218f, 5.092f)
                curveTo(3f, 5.52f, 3f, 6.08f, 3f, 7.2f)
                verticalLineTo(16.8f)
                curveTo(3f, 17.92f, 3f, 18.48f, 3.218f, 18.908f)
                curveTo(3.41f, 19.284f, 3.716f, 19.59f, 4.092f, 19.782f)
                curveTo(4.52f, 20f, 5.08f, 20f, 6.2f, 20f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 20f, 19.48f, 20f, 19.908f, 19.782f)
                curveTo(20.284f, 19.59f, 20.59f, 19.284f, 20.782f, 18.908f)
                curveTo(21f, 18.48f, 21f, 17.92f, 21f, 16.8f)
                verticalLineTo(7.2f)
                curveTo(21f, 6.08f, 21f, 5.52f, 20.782f, 5.092f)
                curveTo(20.59f, 4.716f, 20.284f, 4.41f, 19.908f, 4.218f)
                curveTo(19.88f, 4.204f, 19.851f, 4.19f, 19.822f, 4.178f)
                moveTo(9f, 4f)
                lineTo(4f, 9f)
                moveTo(15f, 9f)
                lineTo(19.822f, 4.178f)
                moveTo(15f, 14.5f)
                lineTo(10f, 17.5f)
                verticalLineTo(11.5f)
                lineTo(15f, 14.5f)
                close()
            }
        }.build()

        return _ClapperboardPlay!!
    }

@Suppress("ObjectPropertyName")
private var _ClapperboardPlay: ImageVector? = null
