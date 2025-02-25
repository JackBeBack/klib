package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MobileBolt: ImageVector
    get() {
        if (_MobileBolt != null) {
            return _MobileBolt!!
        }
        _MobileBolt = ImageVector.Builder(
            name = "MobileBolt",
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
                moveTo(12f, 9f)
                lineTo(10f, 12f)
                horizontalLineTo(14f)
                lineTo(12f, 15f)
                moveTo(9.2f, 21f)
                horizontalLineTo(14.8f)
                curveTo(15.92f, 21f, 16.48f, 21f, 16.908f, 20.782f)
                curveTo(17.284f, 20.59f, 17.59f, 20.284f, 17.782f, 19.908f)
                curveTo(18f, 19.48f, 18f, 18.92f, 18f, 17.8f)
                verticalLineTo(6.2f)
                curveTo(18f, 5.08f, 18f, 4.52f, 17.782f, 4.092f)
                curveTo(17.59f, 3.716f, 17.284f, 3.41f, 16.908f, 3.218f)
                curveTo(16.48f, 3f, 15.92f, 3f, 14.8f, 3f)
                horizontalLineTo(9.2f)
                curveTo(8.08f, 3f, 7.52f, 3f, 7.092f, 3.218f)
                curveTo(6.716f, 3.41f, 6.41f, 3.716f, 6.218f, 4.092f)
                curveTo(6f, 4.52f, 6f, 5.08f, 6f, 6.2f)
                verticalLineTo(17.8f)
                curveTo(6f, 18.92f, 6f, 19.48f, 6.218f, 19.908f)
                curveTo(6.41f, 20.284f, 6.716f, 20.59f, 7.092f, 20.782f)
                curveTo(7.52f, 21f, 8.08f, 21f, 9.2f, 21f)
                close()
            }
        }.build()

        return _MobileBolt!!
    }

@Suppress("ObjectPropertyName")
private var _MobileBolt: ImageVector? = null
