package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Hospitals: ImageVector
    get() {
        if (_Hospitals != null) {
            return _Hospitals!!
        }
        _Hospitals = ImageVector.Builder(
            name = "Hospitals",
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
                moveTo(10.5f, 21f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 21f, 19.48f, 21f, 19.908f, 20.782f)
                curveTo(20.284f, 20.59f, 20.59f, 20.284f, 20.782f, 19.908f)
                curveTo(21f, 19.48f, 21f, 18.92f, 21f, 17.8f)
                verticalLineTo(6.2f)
                curveTo(21f, 5.08f, 21f, 4.52f, 20.782f, 4.092f)
                curveTo(20.59f, 3.716f, 20.284f, 3.41f, 19.908f, 3.218f)
                curveTo(19.48f, 3f, 18.92f, 3f, 17.8f, 3f)
                horizontalLineTo(14f)
                curveTo(13.068f, 3f, 12.602f, 3f, 12.235f, 3.152f)
                curveTo(11.745f, 3.355f, 11.355f, 3.745f, 11.152f, 4.235f)
                curveTo(11f, 4.602f, 11f, 5.068f, 11f, 6f)
                moveTo(3f, 18f)
                horizontalLineTo(12f)
                moveTo(17f, 12f)
                horizontalLineTo(21f)
                moveTo(17f, 8f)
                horizontalLineTo(21f)
                moveTo(8f, 10f)
                verticalLineTo(14f)
                moveTo(6f, 12f)
                horizontalLineTo(10f)
                moveTo(6.2f, 6f)
                horizontalLineTo(9.8f)
                curveTo(10.92f, 6f, 11.48f, 6f, 11.908f, 6.218f)
                curveTo(12.284f, 6.41f, 12.59f, 6.716f, 12.782f, 7.092f)
                curveTo(13f, 7.52f, 13f, 8.08f, 13f, 9.2f)
                verticalLineTo(17.8f)
                curveTo(13f, 18.92f, 13f, 19.48f, 12.782f, 19.908f)
                curveTo(12.59f, 20.284f, 12.284f, 20.59f, 11.908f, 20.782f)
                curveTo(11.48f, 21f, 10.92f, 21f, 9.8f, 21f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 21f, 4.52f, 21f, 4.092f, 20.782f)
                curveTo(3.716f, 20.59f, 3.41f, 20.284f, 3.218f, 19.908f)
                curveTo(3f, 19.48f, 3f, 18.92f, 3f, 17.8f)
                verticalLineTo(9.2f)
                curveTo(3f, 8.08f, 3f, 7.52f, 3.218f, 7.092f)
                curveTo(3.41f, 6.716f, 3.716f, 6.41f, 4.092f, 6.218f)
                curveTo(4.52f, 6f, 5.08f, 6f, 6.2f, 6f)
                close()
            }
        }.build()

        return _Hospitals!!
    }

@Suppress("ObjectPropertyName")
private var _Hospitals: ImageVector? = null
