package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BagsShopping: ImageVector
    get() {
        if (_BagsShopping != null) {
            return _BagsShopping!!
        }
        _BagsShopping = ImageVector.Builder(
            name = "BagsShopping",
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
                moveTo(18f, 15f)
                curveTo(18f, 16.657f, 16.657f, 18f, 15f, 18f)
                curveTo(13.343f, 18f, 12f, 16.657f, 12f, 15f)
                moveTo(4f, 18f)
                curveTo(2.895f, 18f, 2f, 17.105f, 2f, 16f)
                verticalLineTo(10.2f)
                curveTo(2f, 9.08f, 2f, 8.52f, 2.218f, 8.092f)
                curveTo(2.41f, 7.716f, 2.716f, 7.41f, 3.092f, 7.218f)
                curveTo(3.52f, 7f, 4.08f, 7f, 5.2f, 7f)
                horizontalLineTo(16f)
                curveTo(16.828f, 7f, 17.5f, 7.672f, 17.5f, 8.5f)
                moveTo(7f, 7f)
                verticalLineTo(6f)
                curveTo(7f, 4.343f, 8.343f, 3f, 10f, 3f)
                curveTo(11.657f, 3f, 13f, 4.343f, 13f, 6f)
                verticalLineTo(6.975f)
                moveTo(10.4f, 21f)
                horizontalLineTo(19.6f)
                curveTo(20.44f, 21f, 20.86f, 21f, 21.181f, 20.837f)
                curveTo(21.463f, 20.693f, 21.693f, 20.463f, 21.837f, 20.181f)
                curveTo(22f, 19.86f, 22f, 19.44f, 22f, 18.6f)
                verticalLineTo(14.4f)
                curveTo(22f, 13.56f, 22f, 13.14f, 21.837f, 12.819f)
                curveTo(21.693f, 12.537f, 21.463f, 12.307f, 21.181f, 12.163f)
                curveTo(20.86f, 12f, 20.44f, 12f, 19.6f, 12f)
                horizontalLineTo(10.4f)
                curveTo(9.56f, 12f, 9.14f, 12f, 8.819f, 12.163f)
                curveTo(8.537f, 12.307f, 8.307f, 12.537f, 8.163f, 12.819f)
                curveTo(8f, 13.14f, 8f, 13.56f, 8f, 14.4f)
                verticalLineTo(18.6f)
                curveTo(8f, 19.44f, 8f, 19.86f, 8.163f, 20.181f)
                curveTo(8.307f, 20.463f, 8.537f, 20.693f, 8.819f, 20.837f)
                curveTo(9.14f, 21f, 9.56f, 21f, 10.4f, 21f)
                close()
            }
        }.build()

        return _BagsShopping!!
    }

@Suppress("ObjectPropertyName")
private var _BagsShopping: ImageVector? = null
