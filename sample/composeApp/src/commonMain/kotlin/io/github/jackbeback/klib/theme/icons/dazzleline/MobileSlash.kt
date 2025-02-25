package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MobileSlash: ImageVector
    get() {
        if (_MobileSlash != null) {
            return _MobileSlash!!
        }
        _MobileSlash = ImageVector.Builder(
            name = "MobileSlash",
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
                moveTo(3f, 3f)
                lineTo(21f, 21f)
                moveTo(12f, 18f)
                horizontalLineTo(12.01f)
                moveTo(6f, 6f)
                verticalLineTo(17.8f)
                curveTo(6f, 18.92f, 6f, 19.48f, 6.218f, 19.908f)
                curveTo(6.41f, 20.284f, 6.716f, 20.59f, 7.092f, 20.782f)
                curveTo(7.52f, 21f, 8.08f, 21f, 9.2f, 21f)
                horizontalLineTo(15f)
                curveTo(15.932f, 21f, 16.398f, 21f, 16.765f, 20.848f)
                curveTo(17.255f, 20.645f, 17.645f, 20.255f, 17.848f, 19.765f)
                curveTo(18f, 19.398f, 18f, 18.932f, 18f, 18f)
                moveTo(8.65f, 3f)
                horizontalLineTo(14.8f)
                curveTo(15.92f, 3f, 16.48f, 3f, 16.908f, 3.218f)
                curveTo(17.284f, 3.41f, 17.59f, 3.716f, 17.782f, 4.092f)
                curveTo(18f, 4.52f, 18f, 5.08f, 18f, 6.2f)
                verticalLineTo(12.35f)
            }
        }.build()

        return _MobileSlash!!
    }

@Suppress("ObjectPropertyName")
private var _MobileSlash: ImageVector? = null
