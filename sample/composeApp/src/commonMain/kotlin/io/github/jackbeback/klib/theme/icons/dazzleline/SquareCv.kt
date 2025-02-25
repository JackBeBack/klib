package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SquareCv: ImageVector
    get() {
        if (_SquareCv != null) {
            return _SquareCv!!
        }
        _SquareCv = ImageVector.Builder(
            name = "SquareCv",
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
                moveTo(13f, 9f)
                lineTo(15f, 15f)
                lineTo(17f, 9f)
                moveTo(10f, 15f)
                curveTo(9.068f, 15f, 8.602f, 15f, 8.235f, 14.848f)
                curveTo(7.745f, 14.645f, 7.355f, 14.255f, 7.152f, 13.765f)
                curveTo(7f, 13.398f, 7f, 12.932f, 7f, 12f)
                curveTo(7f, 11.068f, 7f, 10.602f, 7.152f, 10.235f)
                curveTo(7.355f, 9.745f, 7.745f, 9.355f, 8.235f, 9.152f)
                curveTo(8.602f, 9f, 9.068f, 9f, 10f, 9f)
                moveTo(7.2f, 20f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 20f, 18.48f, 20f, 18.908f, 19.782f)
                curveTo(19.284f, 19.59f, 19.59f, 19.284f, 19.782f, 18.908f)
                curveTo(20f, 18.48f, 20f, 17.92f, 20f, 16.8f)
                verticalLineTo(7.2f)
                curveTo(20f, 6.08f, 20f, 5.52f, 19.782f, 5.092f)
                curveTo(19.59f, 4.716f, 19.284f, 4.41f, 18.908f, 4.218f)
                curveTo(18.48f, 4f, 17.92f, 4f, 16.8f, 4f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 4f, 5.52f, 4f, 5.092f, 4.218f)
                curveTo(4.716f, 4.41f, 4.41f, 4.716f, 4.218f, 5.092f)
                curveTo(4f, 5.52f, 4f, 6.08f, 4f, 7.2f)
                verticalLineTo(16.8f)
                curveTo(4f, 17.92f, 4f, 18.48f, 4.218f, 18.908f)
                curveTo(4.41f, 19.284f, 4.716f, 19.59f, 5.092f, 19.782f)
                curveTo(5.52f, 20f, 6.08f, 20f, 7.2f, 20f)
                close()
            }
        }.build()

        return _SquareCv!!
    }

@Suppress("ObjectPropertyName")
private var _SquareCv: ImageVector? = null
