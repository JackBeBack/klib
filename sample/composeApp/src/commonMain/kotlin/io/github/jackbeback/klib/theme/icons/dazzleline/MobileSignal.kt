package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MobileSignal: ImageVector
    get() {
        if (_MobileSignal != null) {
            return _MobileSignal!!
        }
        _MobileSignal = ImageVector.Builder(
            name = "MobileSignal",
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
                moveTo(9f, 21f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 21f, 4.52f, 21f, 4.092f, 20.782f)
                curveTo(3.716f, 20.59f, 3.41f, 20.284f, 3.218f, 19.908f)
                curveTo(3f, 19.48f, 3f, 18.92f, 3f, 17.8f)
                verticalLineTo(6.2f)
                curveTo(3f, 5.08f, 3f, 4.52f, 3.218f, 4.092f)
                curveTo(3.41f, 3.716f, 3.716f, 3.41f, 4.092f, 3.218f)
                curveTo(4.52f, 3f, 5.08f, 3f, 6.2f, 3f)
                horizontalLineTo(11.8f)
                curveTo(12.92f, 3f, 13.48f, 3f, 13.908f, 3.218f)
                curveTo(14.284f, 3.41f, 14.59f, 3.716f, 14.782f, 4.092f)
                curveTo(15f, 4.52f, 15f, 5.08f, 15f, 6.2f)
                verticalLineTo(10f)
                moveTo(21f, 21f)
                horizontalLineTo(21.01f)
                moveTo(8f, 6f)
                horizontalLineTo(10f)
                moveTo(17f, 21f)
                curveTo(17f, 18.791f, 18.791f, 17f, 21f, 17f)
                moveTo(13f, 21f)
                curveTo(13f, 16.582f, 16.582f, 13f, 21f, 13f)
            }
        }.build()

        return _MobileSignal!!
    }

@Suppress("ObjectPropertyName")
private var _MobileSignal: ImageVector? = null
