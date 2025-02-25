package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MobileSignalOut: ImageVector
    get() {
        if (_MobileSignalOut != null) {
            return _MobileSignalOut!!
        }
        _MobileSignalOut = ImageVector.Builder(
            name = "MobileSignalOut",
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
                moveTo(8f, 18f)
                horizontalLineTo(10f)
                moveTo(15f, 15f)
                verticalLineTo(17.8f)
                curveTo(15f, 18.92f, 15f, 19.48f, 14.782f, 19.908f)
                curveTo(14.59f, 20.284f, 14.284f, 20.59f, 13.908f, 20.782f)
                curveTo(13.48f, 21f, 12.92f, 21f, 11.8f, 21f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 21f, 4.52f, 21f, 4.092f, 20.782f)
                curveTo(3.716f, 20.59f, 3.41f, 20.284f, 3.218f, 19.908f)
                curveTo(3f, 19.48f, 3f, 18.92f, 3f, 17.8f)
                verticalLineTo(6.2f)
                curveTo(3f, 5.08f, 3f, 4.52f, 3.218f, 4.092f)
                curveTo(3.41f, 3.716f, 3.716f, 3.41f, 4.092f, 3.218f)
                curveTo(4.52f, 3f, 5.08f, 3f, 6.2f, 3f)
                horizontalLineTo(9f)
                moveTo(13f, 7.05f)
                curveTo(13.961f, 7.246f, 14.843f, 7.72f, 15.536f, 8.414f)
                curveTo(16.23f, 9.107f, 16.704f, 9.989f, 16.9f, 10.95f)
                moveTo(13f, 10.95f)
                horizontalLineTo(13.01f)
                moveTo(13f, 3f)
                curveTo(15.031f, 3.226f, 16.924f, 4.136f, 18.369f, 5.581f)
                curveTo(19.814f, 7.026f, 20.724f, 8.919f, 20.95f, 10.95f)
            }
        }.build()

        return _MobileSignalOut!!
    }

@Suppress("ObjectPropertyName")
private var _MobileSignalOut: ImageVector? = null
