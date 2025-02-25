package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.AddressCard: ImageVector
    get() {
        if (_AddressCard != null) {
            return _AddressCard!!
        }
        _AddressCard = ImageVector.Builder(
            name = "AddressCard",
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
                moveTo(18f, 9f)
                horizontalLineTo(14f)
                moveTo(18f, 12f)
                horizontalLineTo(14f)
                moveTo(12f, 15.5f)
                curveTo(11.716f, 14.359f, 10.481f, 13.5f, 9f, 13.5f)
                curveTo(7.519f, 13.5f, 6.284f, 14.359f, 6f, 15.5f)
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
                moveTo(10f, 9.5f)
                curveTo(10f, 10.052f, 9.552f, 10.5f, 9f, 10.5f)
                curveTo(8.448f, 10.5f, 8f, 10.052f, 8f, 9.5f)
                curveTo(8f, 8.948f, 8.448f, 8.5f, 9f, 8.5f)
                curveTo(9.552f, 8.5f, 10f, 8.948f, 10f, 9.5f)
                close()
            }
        }.build()

        return _AddressCard!!
    }

@Suppress("ObjectPropertyName")
private var _AddressCard: ImageVector? = null
