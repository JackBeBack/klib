package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BagShopping: ImageVector
    get() {
        if (_BagShopping != null) {
            return _BagShopping!!
        }
        _BagShopping = ImageVector.Builder(
            name = "BagShopping",
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
                moveTo(9f, 11f)
                verticalLineTo(6f)
                curveTo(9f, 4.343f, 10.343f, 3f, 12f, 3f)
                curveTo(13.657f, 3f, 15f, 4.343f, 15f, 6f)
                verticalLineTo(10.967f)
                moveTo(10.4f, 21f)
                horizontalLineTo(13.6f)
                curveTo(15.84f, 21f, 16.96f, 21f, 17.816f, 20.564f)
                curveTo(18.569f, 20.181f, 19.181f, 19.569f, 19.564f, 18.816f)
                curveTo(20f, 17.96f, 20f, 16.84f, 20f, 14.6f)
                verticalLineTo(12.2f)
                curveTo(20f, 11.08f, 20f, 10.52f, 19.782f, 10.092f)
                curveTo(19.59f, 9.716f, 19.284f, 9.41f, 18.908f, 9.218f)
                curveTo(18.48f, 9f, 17.92f, 9f, 16.8f, 9f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 9f, 5.52f, 9f, 5.092f, 9.218f)
                curveTo(4.716f, 9.41f, 4.41f, 9.716f, 4.218f, 10.092f)
                curveTo(4f, 10.52f, 4f, 11.08f, 4f, 12.2f)
                verticalLineTo(14.6f)
                curveTo(4f, 16.84f, 4f, 17.96f, 4.436f, 18.816f)
                curveTo(4.819f, 19.569f, 5.431f, 20.181f, 6.184f, 20.564f)
                curveTo(7.04f, 21f, 8.16f, 21f, 10.4f, 21f)
                close()
            }
        }.build()

        return _BagShopping!!
    }

@Suppress("ObjectPropertyName")
private var _BagShopping: ImageVector? = null
